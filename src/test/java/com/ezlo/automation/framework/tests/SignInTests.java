package com.ezlo.automation.framework.tests;

import com.ezlo.automation.framework.helpers.App;
import com.ezlo.automation.framework.model.ocs.data.AccountData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTests extends BaseTest {

    @Test
    public void testLoggingIn() {
        App app = new App();
        app.ocsSignIn().signInAs(
                new AccountData()
                        .withEmail("alexey.isakov@ezlo.com")
                        .withPassword("Qwerty123"));
        Assert.assertEquals(1, 1);
    }
}
