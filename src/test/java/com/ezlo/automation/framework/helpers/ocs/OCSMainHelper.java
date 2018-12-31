package com.ezlo.automation.framework.helpers.ocs;

import com.ezlo.automation.framework.pages.ocs.OCSMainPage;

public class OCSMainHelper extends OCSMainPage {

    public void goTo() {
        getSignUpPage();
    }

    public String getSignedInName() {
        return getUserNameFromUI();
    }

}
