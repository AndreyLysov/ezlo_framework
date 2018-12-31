package com.ezlo.automation.framework.tests.unit.db;

import com.ezlo.automation.framework.generators.PortalDataSupplier;
import com.ezlo.automation.framework.model.ezlo.EzlosData;
import com.ezlo.automation.framework.model.ezlo.UserData;
import com.ezlo.automation.framework.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.stream.Collectors;

import static java.lang.String.format;

public class NoSQLUnitTest extends BaseTest {

    @DataProvider
    public Iterator<Object[]> withValidUsers() {
        return PortalDataSupplier.generateUsers(3)
                .stream()
                .map((g) -> new Object[]{g})
                .collect(
                        Collectors
                                .toList())
                .iterator();
    }

    @DataProvider
    public Iterator<Object[]> withValidEzlos() {
        return PortalDataSupplier.generateEzlos(3)
                .stream()
                .map((g) -> new Object[]{g})
                .collect(
                        Collectors
                                .toList())
                .iterator();
    }

    @Test(dataProvider = "withValidEzlos")
    public void testDeleteEzlosFromMongo(EzlosData ezlo) {
        //@BeforeMethod
        System.out.println("before: " + app.nosql().ezlos().size());
        app.nosql().addItem(ezlo);
        System.out.println("after adding: " + app.nosql().ezlos().size());
        // delete Ezlo
        app.nosql().deleteItem(ezlo);
        System.out.println("after deleting: " + app.nosql().ezlos().size());
        Assert.assertFalse(app.nosql().isExist(ezlo),
                format("Ezlo '%s' wasn't deleted!", ezlo));
    }

    @Test(dataProvider = "withValidUsers")
    public void testDeleteUsersFromMongo(UserData user) {
//        @BeforeTest
        app.nosql().addItem(user);
        // delete user
        app.nosql().deleteItem(user);
        Assert.assertFalse(app.nosql().isExist(user),
                format("User '%s' wasn't deleted!", user));
    }

    @Test
    public void testTableContentPrinting() {
        app.nosql().FWUC_TemplateIOSes().forEach(System.out::println);
        app.nosql().ezlos().forEach(System.out::println);
    }
}
