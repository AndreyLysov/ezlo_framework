package com.ezlo.automation.framework.driver_factory;

import com.ezlo.automation.framework.pages.null_web_element.NullWebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.util.List;
import java.util.Set;

public class Web extends Driver {
    private static RemoteWebDriver driver;
    private static Actions actions;

    public static Web getWeb() {
        if (driver == null) {
            driver = DriverFactory.getWebDriver();
            actions = new Actions(driver);
            return new Web();
        } else
            return new Web();
    }

    @Override
    public void click(WebElement element) {
        actions.click(element).build().perform();
    }

    @Override
    public void click(By target) {
        actions.click(driver.findElement(target)).build().perform();
    }

    @Override
    public void get(String url) {
        driver.get(url);
    }

    @Override
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        try {
            return driver.findElement(by);
        } catch (NoSuchElementException e) {
            return NullWebElement.NULL();
        }
    }

    @Override
    public String getPageSource() {
        return driver.getPageSource();
    }

    @Override
    public void close() {
        driver.close();
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return driver.getScreenshotAs(outputType);
    }

    @Override
    public void quit() {
        driver.quit();
        driver = null;
    }

    @Override
    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
        return driver.getWindowHandle();
    }

    @Override
    public TargetLocator switchTo() {
        return driver.switchTo();
    }

    @Override
    public Navigation navigate() {
        return driver.navigate();
    }

    @Override
    public Options manage() {
        return driver.manage();
    }

    @Override
    public void type(WebElement element, String text) {
        click(element);
        if (text != null) {
            if (!text.equals(element.getAttribute("value"))) {
                element.clear();
                element.sendKeys(text);
            }
        }
    }

    @Override
    public void attach(WebElement element, File file) {
        if (file != null) {
            element.sendKeys(file.getAbsolutePath());
        }
    }

    @Override
    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    @Override
    public void selectItem(WebElement element, String item) {
        element.click();
        click(By.xpath(String.format("//div[contains(text(), '%s')]", item)));
    }


}
