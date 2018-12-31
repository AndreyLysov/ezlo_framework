package com.ezlo.automation.framework.helpers.ocs;

import com.ezlo.automation.framework.pages.ocs.OCSForgotPasswordPage;

public class OCSForgotPasswordHelper extends OCSForgotPasswordPage {

    public String getSendEmailButtonUIText() {
        return getSendEmailButtonTextFromPage();
    }

    public String getPageUITitle() {
        return getForgotPassTitle();
    }

    public void goTo() {
        getForgotPassPage();
    }

}
