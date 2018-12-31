package com.ezlo.automation.framework.pages.ocs;

import com.ezlo.automation.framework.pages.BasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OCSSignUpPage extends BasePage {

    private String urlPostfixSignUp = "user/signup";
    @FindBy(xpath = "//*[contains(@class,'signup-submit')]/button")
    private WebElement btnSignUp;
    @FindBy(xpath = "//h2[contains(text(),'Sign Up')]")
    private WebElement titleSignUp;

    protected String isPageLoaded() {
        return titleSignUp.getText();
    }

    protected String getPageTitleText() {
        return titleSignUp.getText();
    }

    protected void clickSignInButton() {
        driver.click(btnSignUp);
    }

    protected boolean isClickable() {
        try {
            return btnSignUp.isEnabled();
        } catch (NoSuchElementException ex) {
            log.error("Element should not be able to click in UI. " + ex.getMessage());
        }
        return false;
    }

    protected void getSignUpPage() {
        getPage(urlPostfixSignUp);
    }
}
