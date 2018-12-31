package com.ezlo.automation.framework.driver_factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;

public abstract class Driver extends RemoteWebDriver {

    public abstract void type(WebElement element, String text);

    public abstract void attach(WebElement element, File file);

    public abstract boolean isElementPresent(By locator);

    public abstract void selectItem(WebElement element, String item);

    public abstract void click(WebElement element);

    public abstract void click(By target);
}
