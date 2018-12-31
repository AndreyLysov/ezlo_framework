package com.ezlo.automation.framework.helpers;

import com.ezlo.automation.framework.driver_factory.Driver;
import com.ezlo.automation.framework.driver_factory.DriverFactory;
import com.ezlo.automation.framework.pages.BasePage;

public class BaseHelper extends BasePage {

    public void startApp() {
        driver = DriverFactory.getDriver();
        if (driver != null) {
            log.info("[Framework] - Driver is opened.");
        }
    }

    public void stopApp() {
        if (driver != null) {
            driver.quit();
            log.info("[Framework] - Driver is closed.");
        }
    }

    public Driver getDriver() {
        return driver;
    }
}
