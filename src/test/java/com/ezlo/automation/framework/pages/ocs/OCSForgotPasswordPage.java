package com.ezlo.automation.framework.pages.ocs;

import com.ezlo.automation.framework.pages.BasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OCSForgotPasswordPage extends BasePage {

    private String urlForgotPass = "user/forgotpwdsendemail";
    @FindBy(xpath = "//*/form/div[2]/div[1]/button") ////span[text()='Send email']/../..
    private WebElement btnSendEmail;
    @FindBy(xpath = "//h2[contains(text(),'Send Forgot Password Email')]")
    private WebElement titleForgotPass;

    protected void getForgotPassPage() {
        getPage(urlForgotPass);
    }

    protected String getForgotPassTitle() {
        return titleForgotPass.getText();
    }

    protected void clickSignInButton() {
        driver.click(btnSendEmail);
    }

    protected String getSendEmailButtonTextFromPage() {
        return btnSendEmail.getText();
    }

    protected boolean isClickable() {
        try {
            return btnSendEmail.isEnabled();
        } catch (NoSuchElementException ex) {
            log.error("Element should not be able to click in UI. " + ex.getMessage());
        }
        return false;
    }
}
