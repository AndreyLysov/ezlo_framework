package com.ezlo.automation.framework.tests.web.ocs;

import com.ezlo.automation.framework.common_baby.Constants;
import com.ezlo.automation.framework.model.ocs.data.AccountData;
import com.ezlo.automation.framework.tests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SignInTestsDebug extends BaseTest {

    public static final String STR_SIGN_IN_LABEL = "SIGN IN";
    public static final String STR_PASS_LABEL = "password";
    public static final String STR_EMAIL_LABEL = "email";
    public static final String STR_CLEAN_VALUES_LABEL = "CLEAR VALUES";
    public static final String STR_SIGN_UP_LABEL = "Sign up";
    public static final String STR_FORGOT_PASS_LABEL = "Forgot password";
    private static final String STR_ERROR_MSG_EMAIL_LESS_THAN_8_CHARS = "Email must be 8 or more characters.";
    private static final String STR_ERROR_MSG_INVALID_EMAIL = "Email is invalid.";
    private static final String STR_ERROR_MSG_PASS_LESS_THEN_8_CHARS = "Password must be contain 8 or " +
            "more letters upper and lower case, numbers and symbols.";
    private static final String STR_ERROR_MSG_PASS_EMPTY = "";
    private static final String STR_SIGN_IN_TITLE = "Authentication - Sign In";
    private static final String STR_SIGN_UP_TITLE = "Authentication - Sign Up";
    private static final String STR_FORGOT_PASS_TITLE = "Authentication - Send Forgot Password Email";
    private static final String STR_SIGNIN_FORM_POSTFIX_URL = "/user/signin";

    @BeforeMethod(alwaysRun = true)
    public void goToPage() {
        app.ocsSignIn().goTo();
    }

    @Test(description = "Jenkins_Debug", groups = {"functional"})
    public void testSignInAsValidUser() {
        AccountData user = new AccountData()
                .withName("Test Automation")
                .withEmail(Constants.STR_EMAIL_TEST_AUTOMATION)
                .withPassword(Constants.STR_PASS_TEST_AUTOMATION);
        app.ocsSignIn().signInAs(user);
        assertThat(app.ocsMain().getSignedInName(), equalTo(user.getName()));
    }

}
