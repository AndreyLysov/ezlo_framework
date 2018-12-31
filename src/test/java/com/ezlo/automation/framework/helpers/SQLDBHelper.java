package com.ezlo.automation.framework.helpers;

import com.ezlo.automation.framework.common_baby.Constants;
import com.ezlo.automation.framework.model.ocs.collections.Accounts;
import com.ezlo.automation.framework.model.ocs.collections.Roles;
import com.ezlo.automation.framework.model.ocs.collections.UserStatuses;
import com.ezlo.automation.framework.model.ocs.data.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.String.format;

public class SQLDBHelper {

    private static Transaction transaction;
    private static Session session;
    private static SessionFactory sessionFactory;

    private String[] roleList = {
            "Super admin",
            "System admin",
            "L1 Support",
            "L2 Support"
    };

    private static void initConnection() {
        sessionFactory = new Configuration()
                .configure(Constants.getProperties()
                        .getProperty("hibernateSettings"))
                .configure(Constants.getProperties()
                        .getProperty("mappingResource"))
                .buildSessionFactory();
    }

    private void deleteScript(Object entity) {
        openSession();
        session.createQuery(
                format("delete from %s",
                        entity.getClass().getSimpleName()))
                .executeUpdate();
        session.close();
    }

    private void deleteScript(Object entity, String conditions) {
        openSession();
        session.createQuery(
                format(
                        "delete from %s where %s",
                        entity.getClass().getSimpleName(),
                        conditions))
                .executeUpdate();
        session.close();
    }

    private static void openSession() {
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }

    private void closeSession() {
        transaction.commit();
        session.close();
    }

    public SQLDBHelper() {
        initConnection();
    }

    public Roles roles() {
        openSession();
        Roles roles = new Roles(
                session
                        .createQuery("from RoleData")
                        .list());
        session.close();
        return roles;
    }

    public Accounts accounts() {
        openSession();
        Accounts accounts = new
                Accounts(
                session
                        .createQuery("from AccountData")
                        .list());
        session.close();
        return accounts;
    }

    public UserStatuses userStatuses() {
        openSession();
        UserStatuses userStatuses = new UserStatuses(
                session
                        .createQuery("from UserStatusData")
                        .list());
        session.close();
        return userStatuses;
    }

    public void addItem(Object obj) {
        openSession();
        session.save(obj);
        closeSession();
    }

    public void removeItem(Object obj) {
        openSession();
        session.delete(obj);
        closeSession();
    }

    private void cleanRoles() {
        deleteScript(new RoleData(), format("label not in (%s)",
                stringListToQuotedString(Arrays.asList(roleList))
                )
        );
    }

    private void cleanAccounts() {
        deleteScript(new AccountData(), format("email != '%s'", Constants.STR_OCS_SYSTEM_ADMIN_EMAIL));
    }

    private void cleanCompany() {
        deleteScript(new CompanyData());
    }

    private void cleanCompanyNMAs() {
        deleteScript(new CompanyNmaData());
    }

    private void cleanCountryNMA() {
        deleteScript(new CountryNmaData());
    }

    private void cleanHubsNMAs() {
        deleteScript(new HubNmaData());
    }

    private void cleanNMAs() {
        deleteScript(new NmaData());
    }

    private void cleanRequests() {
        deleteScript(new RequestSqlData());
    }

    private void cleanTickets() {
        deleteScript(new TicketData());
    }

    public void cleanDB() {
        cleanTickets();
        cleanAccounts();
        cleanCompany();
        cleanNMAs();
        cleanCompanyNMAs();
        cleanCountryNMA();
        cleanHubsNMAs();
        cleanRequests();
    }

    public UserStatusData getValidUserStatus() {
        return userStatuses()
                .stream()
                .filter(s -> s.getName().equals("Enabled"))
                .findFirst()
                .get();
    }

    public RoleData getValidRole() {
        return roles()
                .stream()
                .filter(s -> s.getName().equals("SuperAdmin"))
                .findFirst()
                .get();
    }

    public void addItems(Collection<Object> objs) {
        openSession();
        objs
                .forEach(s -> session.save(s));
        closeSession();
    }

    private String stringListToQuotedString(List<String> list) {
        return list.stream()
                .map(StringUtils::quote)
                .collect(Collectors.joining(", "));
    }

    public void update(Object obj) {
        openSession();
        session.update(obj);
        closeSession();
    }

    public void linkAccountToRole(AccountData account, RoleData role) {
        openSession();
        session.save(new AccountRoleData()
                .withAccount(account)
                .withRole(role));
        closeSession();
    }
}