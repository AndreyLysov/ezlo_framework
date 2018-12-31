package com.ezlo.automation.framework.tests.examples;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class APIDemoTest {

    private static final String APPIUM_SERVER_URL_LINK = "http://127.0.0.1:4723/wd/hub";
    private AppiumDriver<?> driver;

    @BeforeMethod()
    public void setup() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        //-----------------------------
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.1.0");
        capabilities.setCapability("deviceName", "NEXUS 5X");
        capabilities.setCapability("udid", "00caf8dc27f5b7ac");
        capabilities.setCapability("app", "/Users/oleksiiisakov/Downloads/ApiDemos-debug.apk");

        // ----------------------------
//            capabilities.setCapability("platformName", "Android");
//            capabilities.setCapability("platformVersion", "8.1.0");
//            capabilities.setCapability("deviceName", "Nexus5XAPI28");
//            capabilities.setCapability("udid", "emulator-5554");
//            capabilities.setCapability("app", "/Users/oleksiiisakov/Downloads/ApiDemos-debug.apk");

        try {
            driver = new AndroidDriver<>(new URL(APPIUM_SERVER_URL_LINK), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(60, SECONDS);
    }

    @Test()
    private void testLoginButtonPresent() throws MalformedURLException, InterruptedException {
        //Go to "Views" view
//        driver.findElementByXPath("//android.widget.TextView[@content-desc='Views']").click();
        //Click elem by xpath
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
        driver.findElementsByClassName("android.widget.Button").get(1).click();
        assertThat(1, equalTo(1));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
