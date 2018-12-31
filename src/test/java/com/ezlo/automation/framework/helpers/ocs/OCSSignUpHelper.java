package com.ezlo.automation.framework.helpers.ocs;

import com.ezlo.automation.framework.pages.ocs.OCSSignUpPage;

public class OCSSignUpHelper extends OCSSignUpPage {

    public String getPageUITitle() {
        return getPageTitleText();
    }

    public String isOnPage() {
        return isPageLoaded();
    }

    public void goTo() {
        getSignUpPage();
    }

}
