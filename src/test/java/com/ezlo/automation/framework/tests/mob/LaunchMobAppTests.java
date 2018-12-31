package com.ezlo.automation.framework.tests.mob;

import com.ezlo.automation.framework.generators.PortalDataSupplier;
import com.ezlo.automation.framework.model.ezlo.UserData;
import com.ezlo.automation.framework.tests.BaseMobTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LaunchMobAppTests extends BaseMobTest {

    private UserData user = PortalDataSupplier.generateValidUser();

    @BeforeMethod(alwaysRun = true)
    public void insertUser() {
        app.nosql().addItem(user);
    }

    @AfterMethod()
    public void deleteUser() {
        app.nosql().deleteItem(user);
    }

    @Test(groups = {
            "acceptance"
            , "ezlo"
            , "zlink"
            , "ios"
            , "android"
    })
    public void testLaunchApp() {
        assertThat(app
                        .signIn()
                        .getSingInButtonText()
                        .toLowerCase()                        // Content should be generified for demo proposes the origin content does not matter,
                        .replaceAll(" ", "")   // it depends on the platform and app vendor provider
                , equalTo("login"));
    }
}
