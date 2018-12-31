package com.ezlo.automation.framework.pages.ocs;

import com.ezlo.automation.framework.model.ocs.data.AccountData;
import com.ezlo.automation.framework.pages.BasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OCSSignInPage extends BasePage {

    private String urlPostfixSignIn = "user/signin";
    @FindBy(xpath = "//*[contains(@class,'logoPlaceholder')]")
    private WebElement logo;
    @FindBy(xpath = "//h2[contains(text(),'Sign In')]")
    private WebElement titleSignIn;
    @FindBy(name = "email")
    private WebElement inputEmail;
    @FindBy(xpath = "//div[@class='signin-email']/div[last()]")
    private WebElement errorEmail;
    @FindBy(xpath = "//div[@class='signin-password']/div[last()]")
    private WebElement errorPassword;
    @FindBy(name = "password")
    private WebElement inputPassword;
    @FindBy(xpath = "//*[contains(@class,'signin-submit')]/button | //*/button")
    private WebElement btnSignIn;
    @FindBy(xpath = "//*[contains(@class,'clear')]/button | //*/div[2]/button")
    private WebElement btnClearValues;
    @FindBy(xpath = "//a[contains(@class,'signin-link')] | //*/a[1]")
    private WebElement lnkSignUp;
    @FindBy(xpath = "//a[contains(@class,'forgot-pwd-link')] | //*/a[2]")
    private WebElement lnkForgotPassword;

    protected void getSignInPage() {
        getPage(urlPostfixSignIn);
    }

    protected String getPageURLText() {
        return driver.getCurrentUrl();
    }

    protected String getPageForgotPassButtonText() {
        return lnkForgotPassword.getText();
    }

    protected String getPageSignUpButtonText() {
        return lnkSignUp.getText();
    }

    protected String getPageClearValuesButtonText() {
        return btnClearValues.getText();
    }

    protected String getPageSignInButtonText() {
        return btnSignIn.getText();
    }

    protected String getPagePassNameAttribute() {
        return inputPassword.getAttribute("name");
    }

    protected String getPageEmailNameAttribute() {
        return inputEmail.getAttribute("name");
    }

    protected String getPageLogoText() {
        return logo.getText();
    }

    protected String getPageTitleText() {
        return titleSignIn.getText();
    }

    protected void typeEmailToForm(String email) {
        driver.type(inputEmail, email);
    }

    protected void typePasswordToForm(String password) {
        driver.type(inputPassword, password);
    }

    protected void clickSignInButton() {
        driver.click(btnSignIn);
    }

    private String getErrorFromUI(WebElement element) {
        try {
            if (element.isEnabled() && element.isDisplayed()) {
                return element.getAttribute("textContent");
            }
        } catch (Exception ignored) {
        }
        return "";
    }

    protected String getEmailErrorFromUI() {
        return getErrorFromUI(errorEmail);
    }

    protected String getPasswordErrorFromUI() {
        return getErrorFromUI(errorPassword);
    }

    //TODO - Need to implement common method 'isClickable' for all web elements.
    protected boolean signInIsClickable() {
        try {
            return btnSignIn.isEnabled();
        } catch (NoSuchElementException ex) {
            log.error("Element should not be able to click in UI. " + ex.getMessage());
            return false;
        }
    }

    protected void fillForm(AccountData user) {
        typeEmailToForm(user.getEmail());
        typePasswordToForm(user.getPassword());
    }

    protected void clickClearValuesButton() {
        driver.click(btnClearValues);
    }

    protected String getPasswordContent() {
        return inputPassword.getAttribute("defaultValue");
    }

    protected String getEmailContent() {
        return inputEmail.getAttribute("defaultValue");
    }

    protected void clickSignUpButton() {
        driver.click(lnkSignUp);
    }

    protected void clickForgotPasswordButton() {
        driver.click(lnkForgotPassword);
    }
}
