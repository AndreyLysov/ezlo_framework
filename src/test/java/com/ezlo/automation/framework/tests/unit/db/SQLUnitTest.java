package com.ezlo.automation.framework.tests.unit.db;

import com.ezlo.automation.framework.generators.OCSDataSupplier;
import com.ezlo.automation.framework.model.ocs.collections.Accounts;
import com.ezlo.automation.framework.model.ocs.data.AccountData;
import com.ezlo.automation.framework.model.ocs.data.CompanyData;
import com.ezlo.automation.framework.model.ocs.data.UserStatusData;
import com.ezlo.automation.framework.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SQLUnitTest extends BaseTest {

    private Accounts before;
    private UserStatusData userStatus = app.sql().getValidUserStatus();
    private CompanyData company;

    @BeforeMethod
    public void beforeMethod() {
        before = app.sql().accounts();
        company = OCSDataSupplier.generateValidCompany(userStatus);
        app.sql().addItem(company);
    }

    @AfterMethod
    public void afterMethod() {
        app.sql().cleanDB();
    }

    @Test
    public void testAddAccount() {
        AccountData account = OCSDataSupplier.generateValidAccount(company, userStatus);
        app.sql().addItem(account);
        Assert.assertEquals(before.withAdded(account), app.sql().accounts());
    }

    @Test
    public void testModifyAccount() {
        AccountData account = OCSDataSupplier.generateValidAccount(company, userStatus);
        app.sql().addItem(account);
        account.withPosition("modified position");
        app.sql().update(account);
        Assert.assertEquals(before.withAdded(account), app.sql().accounts());

    }

    @Test
    public void testAdd100Accounts() {
        Accounts accounts = OCSDataSupplier.generateAccounts(100, userStatus, company);
        app.sql().addItems(new ArrayList<>(accounts));
        before.addAll(accounts);
        Assert.assertEquals(before, app.sql().accounts());
    }
}
