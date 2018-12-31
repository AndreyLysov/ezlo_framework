package com.ezlo.automation.framework.helpers.examples.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SessionHelper extends HelperBase {

    private static final String BTN_SIGNIN_SUBMIT =
            "//*[@class='button__button___1DAiI signin-submit'] /button";
    private static final String BTN_CLEAR_VALUES =
            "//div[@class='button__button___1DAiI signin-clear']/button";
    private static final String LNK_SIGN_UP =
            "//a[@class='toolbar__btnToolbar___1xTcf signin-link']";
    private static final String LNK_SIGN_FORGOT_PASSWORD =
            "//a[@class='toolbar__btnToolbar___1xTcf forgot-pwd-link']']";

    //todo - need to remove indexes from locators below after adding unique ids
    private static final String WRN_ENTER_EMAIL =
            "//*[@id='form__signIn']/div[1]/div[3]";
    private static final String WRN_ENTER_PASSWORD =
            "//*[@id='form__signIn']/div[2]/div[3]";

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void loginToWebApp(String username, String password) {
        enterEmail(username);
        enterPassword(password);
        clickSignIn();
    }

    public void enterEmail(String email) {
        log.info("Filling in email: " + email);
        type(By.name("email"), email);
    }

    public void enterPassword(String password) {
        log.info("Filling in ocs.db.pass: " + password);
        type(By.name("ocs.db.pass"), password);
    }

    public void clickSignIn() {
        log.info("Clicking sign in button");
        click(By.xpath(BTN_SIGNIN_SUBMIT));
    }

    public void goToSignUpForm() {
        click(By.xpath(LNK_SIGN_UP));
    }

    public void goToForgetPasswordForm() {
        click(By.xpath(LNK_SIGN_FORGOT_PASSWORD));
    }

    public void cleanUpFields() {
        click(By.xpath(BTN_CLEAR_VALUES));
    }

    public void enterEmailWarningIsDisplayed() {
        Assert.assertTrue(wd.findElement(By.xpath(WRN_ENTER_EMAIL)).isDisplayed()
                , "Enter email warning is not displayed");
    }

    public void enterPasswordWarningIsDisplayed() {
        Assert.assertTrue(wd.findElement(By.xpath(WRN_ENTER_PASSWORD)).isDisplayed()
                , "Enter ocs.db.pass warning is not displayed");
    }
}