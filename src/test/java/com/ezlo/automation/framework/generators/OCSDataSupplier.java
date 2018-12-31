package com.ezlo.automation.framework.generators;

import com.ezlo.automation.framework.model.ocs.collections.*;
import com.ezlo.automation.framework.model.ocs.data.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.ezlo.automation.framework.common_baby.CommonMethods.getPhoneString;
import static com.ezlo.automation.framework.common_baby.CommonMethods.randIntOfNow;
import static com.ezlo.automation.framework.common_baby.Constants.STR_DEFAULT_PHONE_OPERATOR_CODE;
import static java.lang.String.format;

public class OCSDataSupplier {

    //Keep in mind that you have 4 predefined roles in DB
    public static Roles generateRoles(int count) {
        return new Roles(Stream
                .generate(
                        () -> new RoleData()
                                .withName(format("role_name%d", randIntOfNow()))
                                .withLabel(format("role label %d", randIntOfNow())))
                .limit(count)
                .collect(Collectors.toList()));
    }

    //Keep in mind that you have 1 predefined account with email: admin@de.de, password: 12312312 and linked to 'system admin' role
    public static Accounts generateAccounts(
            int count, UserStatusData userStatus, CompanyData company) {
        return new Accounts(Stream
                .generate(
                        () -> new AccountData()
                                .withName(format("account name %d", randIntOfNow()))
                                .withEmail(format("email%d@domain.com", randIntOfNow()))
                                .withPhone(getPhoneString(STR_DEFAULT_PHONE_OPERATOR_CODE))
                                .withSkype(format("skype%d", randIntOfNow()))
                                .withPassword("TestAutomation")
                                .withVerified(true)
                                .withUserStatusId(userStatus)
                                .withApprovedByAdmin(true)
                                .withCompanyAtRegistration("ezlo automation framework")
                                .withPosition("test position")
                                .withCompany(company))
                .limit(count)
                .collect(Collectors.toList()));
    }

    public static AccountData generateValidAccount(CompanyData company, UserStatusData userStatus) {
        return new AccountData()
                .withName(format("account name %d", randIntOfNow()))
                .withEmail(format("email%d@domain.com", randIntOfNow()))
                .withPhone(getPhoneString(STR_DEFAULT_PHONE_OPERATOR_CODE))
                .withSkype(format("skype%d", randIntOfNow()))
                .withPassword("TestAutomation")
                .withVerified(true)
                .withUserStatusId(userStatus)
                .withApprovedByAdmin(true)
                .withCompanyAtRegistration(company.getName())
                .withPosition("test position")
                .withCompany(company);
    }

    public static Companies generateCompanies(
            int count, UserStatusData userStatus) {
        return new Companies(Stream
                .generate(
                        () -> new CompanyData()
                                .withName(format("company name %d", randIntOfNow()))
                                .withAddress(format("address: %d", randIntOfNow()))
                                .withAdminContact(format("admin contact %d", randIntOfNow()))
                                .withLogo(null)
                                .withUsersCount(0)
                                .withEzlosCount(0)
                                .withCustomersCount(0)
                                .withUserStatus(userStatus)
                                .withCompanyAdmin(false))
                .limit(count)
                .collect(Collectors.toList()));
    }

    public static CompanyNMAs generateCompanyNMAs(
            int count, CompanyData company, NmaData nma) {
        return new CompanyNMAs(Stream
                .generate(
                        () -> new CompanyNmaData()
                                .withCompanyId(company)
                                .withNmaId(nma))
                .limit(count)
                .collect(Collectors.toList()));
    }

    public static CountryNMAs generateCountryNMA(
            int count, CountryData country, NmaData nma) {
        return new CountryNMAs(Stream
                .generate(
                        () -> new CountryNmaData()
                                .withCountryId(country)
                                .withNmaId(nma))
                .limit(count)
                .collect(Collectors.toList()));
    }

    public static HubNMAs generateHubNMA(
            int count, NmaData nma) {
        return new HubNMAs(Stream
                .generate(
                        () -> new HubNmaData()
                                .withSerial(format("serial %d", randIntOfNow()))
                                .withNmaID(nma))
                .limit(count)
                .collect(Collectors.toList()));
    }

    public static NMAs generateNMAs(int count) {
        return new NMAs(System.getProperties().stringPropertyNames().stream()
                .filter(s ->
                        s.toLowerCase()
                                .startsWith("nmaserverurl"))
                .map(s -> new NmaData()
                        .withName(format("NMA name %d", randIntOfNow()))
                        .withUri(System.getProperty(s))
                        .withKey(format("key %d", randIntOfNow()))
                        .withUsername(format("user name %d", randIntOfNow()))
                        .withPassword("TestAutomation")
                        .withSender(format("admin%d@ezlo.com", randIntOfNow()))
                        .withDev(false)
                        .withMapColor("yellow")
                        .withEnabled(true))
                .collect(Collectors.toList()));
    }

    public static CompanyData generateValidCompany(UserStatusData userStatus) {
        return new CompanyData()
                .withName(format("company name %d", randIntOfNow()))
                .withAddress(format("address: %d", randIntOfNow()))
                .withAdminContact(format("admin contact %d", randIntOfNow()))
                .withLogo(null)
                .withUsersCount(0)
                .withEzlosCount(0)
                .withCustomersCount(0)
                .withUserStatus(userStatus)
                .withCompanyAdmin(false);
    }

    public static NmaData generateValidNMA() {
        return System.getProperties()
                .stringPropertyNames()
                .stream()
                .filter(s ->
                        s.toLowerCase()
                                .startsWith("nmaserverurl"))
                .map(s -> new NmaData()
                        .withName(format("NMA name %d", randIntOfNow()))
                        .withUri(System.getProperty(s))
                        .withKey(format("key %d", randIntOfNow()))
                        .withUsername(format("user name %d", randIntOfNow()))
                        .withPassword("TestAutomation")
                        .withSender(format("admin%d@ezlo.com", randIntOfNow()))
                        .withDev(false)
                        .withMapColor("yellow")
                        .withEnabled(true))
                .collect(Collectors.toList())
                .stream()
                .findFirst()
                .get();
    }
}
