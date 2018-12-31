package com.ezlo.automation.framework.driver_factory;

import com.ezlo.automation.framework.common_baby.AppiumUtil;
import com.ezlo.automation.framework.common_baby.CommonMethods;
import com.ezlo.automation.framework.common_baby.Constants;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.exec.OS;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static java.util.concurrent.TimeUnit.SECONDS;

public class DriverFactory {
    public static Driver driver;
    private static RemoteWebDriver webDriver;
    private static AppiumDriver appiumDriver;

    static RemoteWebDriver getWebDriver() {
        boolean isFamilyMac = OS.isFamilyMac();
        String target = System.getProperty("target", "local");
        if (target.equals("local")) {
            String osSensitiveBinaryPath;
            if (isFamilyMac) {
                osSensitiveBinaryPath = "drivers/mac/%s";
            } else {
                if (OS.isFamilyWindows()) {
                    osSensitiveBinaryPath = "drivers/win/%s.exe";
                } else {
                    osSensitiveBinaryPath = "drivers/unix/%s";
                }
            }

            String webDriverPath;
            switch (System.getProperty("browser", "chrome")) {
                case BrowserType.FIREFOX:
                    webDriverPath = String.format(osSensitiveBinaryPath, "geckodriver");
                    System.setProperty("webdriver.gecko.driver", webDriverPath);
                    webDriver = new FirefoxDriver();
                    break;
                case BrowserType.CHROME:
                    webDriverPath = String.format(osSensitiveBinaryPath, "chromedriver");
                    System.setProperty("webdriver.chrome.driver", webDriverPath);
                    webDriver = new ChromeDriver();
                    break;
                case BrowserType.IE:
                    webDriverPath = String.format(osSensitiveBinaryPath, "IEDriverServer");
                    System.setProperty("webdriver.ie.driver", webDriverPath);
                    webDriver = new InternetExplorerDriver();
                    break;
                case BrowserType.EDGE:
                    webDriverPath = String.format(osSensitiveBinaryPath, "MicrosoftWebDriver");
                    System.setProperty("webdriver.edge.driver", webDriverPath);
                    webDriver = new EdgeDriver();
                    break;
                case BrowserType.SAFARI:
                    webDriverPath = String.format(osSensitiveBinaryPath, "safaridriver");
                    System.setProperty("webdriver.safari.driver", webDriverPath);
                    webDriver = new SafariDriver();
                    break;
            }
        } else if (target.equals("jenkins")) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setBrowserName(System.getProperty("browser"));
            caps.setPlatform(Platform.fromString(System.getProperty("os", "LINUX")));
            try {
                webDriver = new RemoteWebDriver(
                        new URL(String
                                .format("http://%s:%s/wd/hub"
                                        , Constants.STR_SELENIUM_SERVER_IP
                                        , Constants.STR_SELENIUM_SERVER_PORT)
                        )
                        , caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        webDriver.manage().timeouts().implicitlyWait(Constants.INT_WEB_TIMEOUT, SECONDS);
        if (!isFamilyMac)
            webDriver.manage().window().maximize();
        return webDriver;
    }

    private static DesiredCapabilities setCapabilities() {

        DesiredCapabilities caps = new DesiredCapabilities();
        String platform = Constants.getProperties().getProperty("platform");

        if (platform.equalsIgnoreCase("web")) {
            caps.setCapability("platformName", Constants.getProperties());      // Windows...
            caps.setCapability("platformVersion", Constants.getProperties());   // 10, 8.1,7
            caps.setCapability("browserName", Constants.getProperties());       // Chrome

//            probable capabilities
//            caps.setCapability("version", Constants.getProperties());           // browser version
//            caps.setCapability("resolution", Constants.getProperties());        // 1366x768
//            caps.setCapability("location", Constants.getProperties());          // US East

        } else {
            caps.merge(
                    new DesiredCapabilities(
                            CommonMethods.jsonFileToListOfHashMaps(new File(System
                                    .getProperties()
                                    .getProperty("deviceCaps")))
                                    .get(0)
                    )
            );
            if (platform.equalsIgnoreCase("meb")) {
                caps.setCapability("browserName", "");          // Chrome, Safari
            } else {
                caps.merge(new DesiredCapabilities(
                        CommonMethods.jsonFileToListOfHashMaps(new File(System
                                .getProperties()
                                .getProperty("appCaps")))
                                .get(0)));
            }
        }

        return caps;
    }


    static AppiumDriver getMobDriver() {
        DesiredCapabilities caps = new DesiredCapabilities(
                CommonMethods.jsonFileToListOfHashMaps(new File(System
                        .getProperties()
                        .getProperty("deviceCaps")))
                        .get(0));

        if (System.getProperties().getProperty("appCaps") != null) {    //mobile native app
            caps.merge(new DesiredCapabilities(
                    CommonMethods.jsonFileToListOfHashMaps(new File(System
                            .getProperties()
                            .getProperty("appCaps")))
                            .get(0)));
        }
        //TODO - @OleksiiIsakov - please optimize setting mobile browser
        else
            caps.setBrowserName(System.getProperty("browserName", "chrome"));    //mobile web app
        // Zlink app of dev version is required to allow access to multimedia on device,
        // terning this capability to true will disable it
        // todo - OleksiiIsakov: Add allowPopups to the build.gradle file
        if (System.getProperties().getProperty("allowPopups", null) == null) {
            caps.setCapability("autoGrantPermissions", true);
        }
        //todo - OleksiiIsakov: Implement behavior for cases when the autoGrantPermissions to false is required
        appiumDriver = new AppiumDriver(AppiumUtil.appiumServerUrl, caps);
        appiumDriver.manage().timeouts().implicitlyWait(Constants.INT_MOB_TIMEOUT, SECONDS);
        return appiumDriver;
    }

    public static AppiumDriver getAppiumDriver(){

        return null;
    }

    public static Driver getDriver() {
        return System.getProperty("platform").equals("web")
                ? Web.getWeb()
                : System.getProperty("platform").equals("mob")
                ? Mob.getMob()
                : null;
    }
}