package com.ezlo.automation.framework.pages;

import com.ezlo.automation.framework.common_baby.Constants;
import com.ezlo.automation.framework.driver_factory.Driver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage{
    protected static Driver driver;
    private static WebDriverWait wait;
    protected Logger log = Logger.getLogger(this.getClass().getSimpleName());

    public BasePage() {
        String platform = System.getProperty("platform", "nonUI");
        // todo - @OleksiiIsakov: In a case if we are going to use an API functionality it should not be init a driver at all
        // should be discussed to rearrange framework architecture with new vision:
        /*
        app
        |_ ui
            |_ admin (ocs, oem, cloud admin)
                |_ helpers
            |_ client (nma, mms, vera, zlink, ezlo, oemVendors)
                |_ helpers (general for both mob and ui)
        |_ api
            |_ rest
                |_ helpers
            |_ ws
                |_ helpers
        |_ performance
            |_ helpers
        */
        if (driver != null) {
            if (platform.equals("web")) {
                PageFactory.initElements(driver, this);
            } else if (platform.equals("mob")) {
                PageFactory.initElements(
                        new AppiumFieldDecorator(
                                driver
//                                , Duration.ofSeconds(30)
                        )
                        , this);
            }
        }
        if (!(platform.equals("mob") || platform.equals("web"))) {
            System.getProperties().setProperty("platform", "nonUI");
        }
    }

    private static WebDriverWait getWait() {
        if (wait == null) {
            wait = new WebDriverWait(driver, Constants.INT_MOB_TIMEOUT);
        }
        return wait;
    }

    protected void getPage(String urlPostfix) {
        driver.get(String.format(Constants.getProperties().getProperty("baseUrl"), urlPostfix));
    }
}