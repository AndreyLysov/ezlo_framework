package com.ezlo.automation.framework.helpers.mob;

import com.ezlo.automation.framework.model.ezlo.UserData;
import com.ezlo.automation.framework.pages.view.SignInPage;

public class SignInHelper extends SignInPage {

    public String getSingInButtonText() {
        return getSignInButtonTextByGetText();
    }

    public String getLogoName() {
        return getLogoNameByAttribute();
    }

    private void fillFormWith(UserData user) {
        fillForm(user);
    }

    public void submitFormWithUser(UserData user) {
        fillFormWith(user);
        submitForm();
    }
}
