package com.ezlo.automation.framework.driver_factory;

import com.ezlo.automation.framework.pages.null_web_element.NullWebElement;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.List;

public class Mob extends Driver {

    private static AppiumDriver driver;
    private static Actions actions;

    public static Mob getMob() {
        if (driver == null) {
            driver = DriverFactory.getMobDriver();
            actions = new Actions(driver);
            return new Mob();
        } else
            return new Mob();
    }

    @Override
    public void type(WebElement element, String text) {
        element.click();
        if (text != null) {
            element.clear();
            element.sendKeys(text);
            driver.hideKeyboard();
        }
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return driver.getScreenshotAs(outputType);
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
        //TODO @OleksiiIsakov - please implement as you need
    }

    @Override
    public void click(WebElement element) {
        element.click();
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
    public void quit() {
        driver.quit();
        driver = null;
    }
}
