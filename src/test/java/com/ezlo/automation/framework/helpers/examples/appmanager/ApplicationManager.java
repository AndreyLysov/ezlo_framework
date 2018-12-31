/*
package com.ezlo.automation.framework.appmanager;

import com.sun.deploy.config.OSType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private final Properties properties;
    protected WebDriver wd;

    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private CustomerHelper customerHelper;
    private String browser;
    private String osSensitiveBinaryPath;

    public ApplicationManager(String browser) {
        this.browser = browser;
        properties = new Properties();
    }

    public void init() throws IOException {
        String target = System.getProperty("target", "local");
        properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
        if (OSType.isWin()) {
            osSensitiveBinaryPath = "drivers/win/%s.exe";
        } else if (OSType.isMac()) {
            osSensitiveBinaryPath = "drivers/mac/%s";
        } else {
            osSensitiveBinaryPath = "drivers/unix/%s";
        }
        final String webDriverPath;
        switch (browser) {
            case BrowserType.FIREFOX:
                webDriverPath = String.format(osSensitiveBinaryPath, "geckodriver");
                System.setProperty("webdriver.gecko.driver", webDriverPath);
                wd = new FirefoxDriver();
                break;
            case BrowserType.CHROME:
                webDriverPath = String.format(osSensitiveBinaryPath, "chromedriver");
                System.setProperty("webdriver.chrome.driver", webDriverPath);
                wd = new ChromeDriver();
                break;
            case BrowserType.IE:
                webDriverPath = String.format(osSensitiveBinaryPath, "IEDriverServer");
                System.setProperty("webdriver.ie.driver", webDriverPath);
                wd = new InternetExplorerDriver();
                break;
            case BrowserType.EDGE:
                webDriverPath = String.format(osSensitiveBinaryPath, "MicrosoftWebDriver");
                System.setProperty("webdriver.edge.driver", webDriverPath);
                wd = new EdgeDriver();
                break;
            case BrowserType.SAFARI:
                webDriverPath = String.format(osSensitiveBinaryPath, "safaridriver");
                System.setProperty("webdriver.safari.driver", webDriverPath);
                wd = new SafariDriver();
                break;
        }
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.get(properties.getProperty("web.baseUrl"));
        sessionHelper = new SessionHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        customerHelper = new CustomerHelper(wd);
        sessionHelper.loginToWebApp(properties.getProperty("web.loginAdmin"), properties.getProperty("web.loginPassword"));
    }

    public void stop() {
        wd.close();
    }

    public SessionHelper sessionHelper() {
        return sessionHelper;
    }

    public CustomerHelper customer() {
        return customerHelper;
    }

    public NavigationHelper goTo() {
        return navigationHelper;
    }
}
*/
