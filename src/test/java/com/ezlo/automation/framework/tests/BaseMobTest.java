package com.ezlo.automation.framework.tests;

import com.ezlo.automation.framework.common_baby.AppiumUtil;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseMobTest extends BaseTest {

    @BeforeSuite
    public void runAppuimServer() {
        AppiumUtil.startServer();
        log.info("[Framework] - Appium server started.");
    }

    @AfterSuite
    public void stopAppuimServer() {
        if (AppiumUtil.isAlive()){
            AppiumUtil.stopServer();
            log.info("[Framework] - Appium server stopped.");
        }
    }
}
