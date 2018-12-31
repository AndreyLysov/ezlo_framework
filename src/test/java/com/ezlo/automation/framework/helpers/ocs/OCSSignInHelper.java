package com.ezlo.automation.framework.helpers.ocs;

import com.ezlo.automation.framework.model.ocs.data.AccountData;
import com.ezlo.automation.framework.pages.ocs.OCSSignInPage;

public class OCSSignInHelper extends OCSSignInPage {

    public void fillFormWith(AccountData user) {
        fillForm(user);
    }

    public void signInAs(AccountData user) {
        fillForm(user);
        clickSignInButton();
    }

    public void fillEmail(AccountData user) {
        typeEmailToForm(user.getEmail());
    }

    public void fillPassword(AccountData user) {
        typePasswordToForm(user.getPassword());
    }

    public String whichEmailErrorIsDisplayed() {
        return getEmailErrorFromUI();
    }

    public String whichPasswordErrorIsDisplayed() {
        return getPasswordErrorFromUI();
    }

    public boolean signInButtonIsClickable() {
        return signInIsClickable();
    }

    public void clearValues() {
        clickClearValuesButton();
    }

    public boolean isPasswordContentEmpty() {
        return getPasswordContent().equals("");
    }

    public boolean isEmailContentEmpty() {
        return getEmailContent().equals("");
    }

    public void clickSignUp() {
        clickSignUpButton();
    }

    public void clickForgotPassword() {
        clickForgotPasswordButton();
    }

    public String getPageUITitle() {
        return getPageTitleText();
    }

    public String getPageUILogo() {
        return getPageLogoText();
    }

    public String getPageUIEmail() {
        return getPageEmailNameAttribute();
    }

    public String getPageUIPass() {
        return getPagePassNameAttribute();
    }

    public String getPageUISignIn() {
        return getPageSignInButtonText();
    }

    public String getPageUIClearValues() {
        return getPageClearValuesButtonText();
    }

    public String getPageUISignUp() {
        return getPageSignUpButtonText();
    }

    public String getPageUIForgotPass() {
        return getPageForgotPassButtonText();
    }

    public String getPageURL() {
        return getPageURLText();
    }

    public void goTo() {
        getSignInPage();
    }
}
