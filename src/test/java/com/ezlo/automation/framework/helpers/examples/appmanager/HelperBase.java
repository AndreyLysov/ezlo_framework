package com.ezlo.automation.framework.helpers.examples.appmanager;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class HelperBase {

    protected WebDriver wd;
    protected Actions actions;
    Logger log = Logger.getLogger(this.getClass().getSimpleName());

    public HelperBase(WebDriver wd) {
        this.wd = wd;
        this.actions = new Actions(wd);
    }

    protected void type(By locator, String text) {
        click(locator);
        if (text != null) {
            String existingText = wd.findElement(locator).getAttribute("value");
            if (!text.equals(existingText)) {
                wd.findElement(locator).clear();
                wd.findElement(locator).sendKeys(text);
            }
        }
    }

    protected void click(By locator) {
        actions.click(wd.findElement(locator)).build().perform();
    }

    protected void attach(By locator, File file) {
        if (file != null) {
            wd.findElement(locator).sendKeys(file.getAbsolutePath());
        }
    }

    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    protected boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    protected void selectItem(String locator, String item) {
        click(By.xpath(locator));
        String s = String.format("//div[contains(text(), '%s')]", item);
        click(By.xpath(s));
    }
}