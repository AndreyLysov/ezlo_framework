package com.ezlo.automation.framework.tests.mob;

import com.ezlo.automation.framework.generators.PortalDataSupplier;
import com.ezlo.automation.framework.model.ezlo.UserData;
import com.ezlo.automation.framework.tests.BaseMobTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.ezlo.automation.framework.common_baby.Constants.STR_PASS_TEST_AUTOMATION;
import static org.testng.Assert.assertTrue;

public class SingInMobAppTests extends BaseMobTest {

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
    public void testSignInWithGeneratedUser() {
        log.info("[userData]: " + user.toString());
        app.signIn().submitFormWithUser(user);
        assertTrue(app.selectHub().isDisplayed());
    }

    @Test(groups = {
            "acceptance"
            , "ezlo"
            , "zlink"
            , "ios"
            , "android"
    })
    public void testSignInWithExistedUser() {
        UserData user = new UserData()
                .withEmail("test.automation@ezlo.com")
                .withPassword(STR_PASS_TEST_AUTOMATION);
        app.signIn().submitFormWithUser(user);
        assertTrue(app.selectHub().isDisplayed());
    }
}
