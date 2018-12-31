package com.ezlo.automation.framework.tests.unit.drivers.mob;

import com.ezlo.automation.framework.tests.BaseMobTest;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LaunchMobAppByAppiumDriverTests extends BaseMobTest {

    @Test(groups = {
            "ios"
            , "android"
    })
    public void testLaunchApp() {
        assertThat(app
                        .signIn()
                        .getSingInButtonText()
                        .toLowerCase()
                        .replace(" ", "")
                , equalTo("login")
        );
    }
}
