package com.ezlo.automation.framework.tests.web.ocs;

import com.ezlo.automation.framework.common_baby.Constants;
import com.ezlo.automation.framework.common_baby.issue_tracker.JiraIssue;
import com.ezlo.automation.framework.model.ocs.data.AccountData;
import com.ezlo.automation.framework.tests.BaseTest;
import io.qameta.allure.Issue;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SignInTests extends BaseTest {

    private static final String STR_SIGN_IN_LABEL = "SIGN IN";
    private static final String STR_PASS_LABEL = "password";
    private static final String STR_EMAIL_LABEL = "email";
    private static final String STR_CLEAN_VALUES_LABEL = "CLEAR VALUES";
    private static final String STR_SIGN_UP_LABEL = "Sign up";
    private static final String STR_FORGOT_PASS_LABEL = "Forgot password";
    private static final String STR_ERROR_MSG_EMAIL_LESS_THAN_8_CHARS = "Email must be at least 8 up to 256 characters long";
    private static final String STR_ERROR_MSG_INVALID_EMAIL = "Email is invalid.";
    private static final String STR_ERROR_MSG_PASS_LESS_THEN_8_CHARS = "Password must be contain 8 or " +
            "more letters upper and lower case, numbers and symbols.";
    private static final String STR_ERROR_MSG_PASS_EMPTY = "";
    private static final String STR_SIGN_IN_TITLE = "Authentication - Sign In";
    private static final String STR_SIGN_UP_TITLE = "Authentication - Sign Up";
    private static final String STR_FORGOT_PASS_TITLE = "Authentication - Send Forgot Password Email";
    private static final String STR_SIGNIN_FORM_POSTFIX_URL = "/user/signin";

    @BeforeMethod(alwaysRun=true)
    public void goToPage() {
        app.ocsSignIn().goTo();
    }

    @Test(description = "test::id-0000020::automated", groups = {"acceptance"})
    public void testVerifyFormContent() {
        //Check the page title
        assertThat(app.ocsSignIn().getPageUILogo(), equalTo(""));
        //Check the logo holder
        assertThat(app.ocsSignIn().getPageUITitle(), equalTo(STR_SIGN_IN_TITLE));
        //Check the Email input
        assertThat(app.ocsSignIn().getPageUIEmail(), equalTo(STR_EMAIL_LABEL));
        //Check the Password input
        assertThat(app.ocsSignIn().getPageUIPass(), equalTo(STR_PASS_LABEL));
        //Check the Sign In button
        assertThat(app.ocsSignIn().getPageUISignIn().toLowerCase(), equalTo(STR_SIGN_IN_LABEL.toLowerCase()));
        //Check the Clear Values button
        assertThat(app.ocsSignIn().getPageUIClearValues().toLowerCase(), equalTo(STR_CLEAN_VALUES_LABEL.toLowerCase()));
        //Check the Sign Up button
        assertThat(app.ocsSignIn().getPageUISignUp(), equalTo(STR_SIGN_UP_LABEL));
        //Check the Forgot Password button
        assertThat(app.ocsSignIn().getPageUIForgotPass(), equalTo(STR_FORGOT_PASS_LABEL));
        //Check the page ocs.base.url
        assertTrue(app.ocsSignIn().getPageURL().endsWith(STR_SIGNIN_FORM_POSTFIX_URL));
    }

    @Test(description = "test::id-0000001::automated", groups = {"functional"})
    public void testEmailErrorIfEmptyChars() {
        AccountData user = new AccountData();
        app.ocsSignIn().fillEmail(user);
        app.ocsSignIn().fillPassword(user);
        assertThat(app.ocsSignIn().whichEmailErrorIsDisplayed(), equalTo(STR_ERROR_MSG_EMAIL_LESS_THAN_8_CHARS));
    }

    @Test(description = "test::id-0000002::automated", groups = {"functional"})
    public void testEmailErrorIfLessThen8Chars() {
        AccountData user = new AccountData()
                .withEmail("email");
        app.ocsSignIn().fillEmail(user);
        app.ocsSignIn().fillPassword(user);
        assertThat(app.ocsSignIn().whichEmailErrorIsDisplayed(), equalTo(STR_ERROR_MSG_EMAIL_LESS_THAN_8_CHARS));
    }

    @Test(description = "test::id-0000003::automated", groups = {"functional"})
    public void testEmailErrorIfExact8Chars() {
        AccountData user = new AccountData()
                .withEmail("email678");
        app.ocsSignIn().fillEmail(user);
        app.ocsSignIn().fillPassword(user);
        assertThat(app.ocsSignIn().whichEmailErrorIsDisplayed(), equalTo(STR_ERROR_MSG_INVALID_EMAIL));
    }

    @Issue("EQAT-12")
    @JiraIssue("EQAT-12")
    @Test(description = "test::id-0000004::automated::FAILED", groups = {"functional"})
    public void testEmailErrorIfGreaterThen8Chars() {
        AccountData user = new AccountData()
                .withEmail("email67890email67890email67890email67890email67890email67890email67890email67890" +
                        "email67890email67890email67890");
        app.ocsSignIn().fillPassword(user);
        app.ocsSignIn().fillEmail(user);
        assertThat(app.ocsSignIn().whichEmailErrorIsDisplayed(), equalTo(STR_ERROR_MSG_INVALID_EMAIL));
    }

    @Test(description = "test::id-0000005::automated", groups = {"functional"})
    public void testPasswordEmptyChars() {
        AccountData user = new AccountData()
                .withEmail("")
                .withPassword("");
        app.ocsSignIn().fillPassword(user);
        app.ocsSignIn().fillEmail(user);
        assertThat(app.ocsSignIn().whichPasswordErrorIsDisplayed(), equalTo(STR_ERROR_MSG_PASS_LESS_THEN_8_CHARS));
    }

    @Test(description = "test::id-0000006::automated", groups = {"functional"})
    public void testPasswordLessThen8Chars() {
        AccountData user = new AccountData()
                .withPassword("pass");
        app.ocsSignIn().fillPassword(user);
        app.ocsSignIn().fillEmail(user);
        assertThat(app.ocsSignIn().whichPasswordErrorIsDisplayed(), equalTo(STR_ERROR_MSG_PASS_LESS_THEN_8_CHARS));
    }

    @Test(description = "test::id-0000007::automated", groups = {"functional"})
    public void testPasswordExact8Chars() {
        AccountData user = new AccountData()
                .withPassword(STR_PASS_LABEL);
        app.ocsSignIn().fillPassword(user);
        app.ocsSignIn().fillEmail(user);
        assertThat(app.ocsSignIn().whichPasswordErrorIsDisplayed(), equalTo(STR_ERROR_MSG_PASS_EMPTY));
    }

    @Test(description = "test::id-0000008::automated", groups = {"functional"})
    public void testPasswordGreaterThen8Chars() {
        AccountData user = new AccountData()
                .withPassword("password1234567890");
        app.ocsSignIn().fillPassword(user);
        app.ocsSignIn().fillEmail(user);
        assertThat(app.ocsSignIn().whichPasswordErrorIsDisplayed(), equalTo(STR_ERROR_MSG_PASS_EMPTY));
    }

    @Test(description = "test::id-0000009::automated", groups = {"functional"})
    public void testSignInAsInValidUserEmptyAll() {
        AccountData user = new AccountData();
        app.ocsSignIn().fillFormWith(user);
        assertFalse(app.ocsSignIn().signInButtonIsClickable());
    }

    @Test(description = "test::id-0000010::automated", groups = {"functional"})
    public void testSignInAsInValidUserEmptyEmail() {
        AccountData user = new AccountData()
                .withPassword("password123");
        app.ocsSignIn().signInAs(user);
        assertFalse(app.ocsSignIn().signInButtonIsClickable());
    }

    @Test(description = "test::id-0000011::automated", groups = {"functional"})
    public void testSignInAsInValidUserEmptyPassword() {
        AccountData user = new AccountData()
                .withEmail("email1234");
        app.ocsSignIn().fillFormWith(user);
        assertFalse(app.ocsSignIn().signInButtonIsClickable());
    }

    @Test(description = "test::id-0000012::automated", groups = {"functional"})
    public void testSignInAsValidUser() {
        AccountData user = new AccountData()
                .withName("Test Automation")
                .withEmail(Constants.STR_EMAIL_TEST_AUTOMATION)
                .withPassword(Constants.STR_PASS_TEST_AUTOMATION);
        app.ocsSignIn().signInAs(user);
        assertThat(app.ocsMain().getSignedInName(), equalTo(user.getName()));
    }

    @Test(description = "test::id-0000013::automated", groups = {"functional"})
    public void testClearValuesInValidUserEmptyAll() {
        AccountData user = new AccountData();
        app.ocsSignIn().fillFormWith(user);
        app.ocsSignIn().clearValues();
        assertTrue(app.ocsSignIn().isEmailContentEmpty());
        assertTrue(app.ocsSignIn().isPasswordContentEmpty());
    }

    @Test(description = "test::id-0000014::automated", groups = {"functional"})
    public void testClearValuesInValidUserEmptyEmail() {
        AccountData user = new AccountData()
                .withPassword("password123");
        app.ocsSignIn().fillFormWith(user);
        app.ocsSignIn().clearValues();
        assertTrue(app.ocsSignIn().isEmailContentEmpty());
        assertTrue(app.ocsSignIn().isPasswordContentEmpty());
    }

//    @Issue("OCS-476")
//    @JiraIssue("OCS-476")
    @Test(description = "test::id-0000015::automated::FAILED", groups = {"functional"})
    public void testClearValuesInValidUserEmptyPassword() {
        AccountData user = new AccountData()
                .withEmail("email1234");
        app.ocsSignIn().fillFormWith(user);
        app.ocsSignIn().clearValues();
        assertTrue(app.ocsSignIn().isEmailContentEmpty());
        assertTrue(app.ocsSignIn().isPasswordContentEmpty());
    }

    @Test(description = "test::id-0000016::automated", groups = {"functional"})
    public void testClearValuesValidUser() {
        AccountData user = new AccountData()
                .withEmail("email1234")
                .withPassword("password123");
        app.ocsSignIn().fillFormWith(user);
        app.ocsSignIn().clearValues();
        assertTrue(app.ocsSignIn().isEmailContentEmpty());
        assertTrue(app.ocsSignIn().isPasswordContentEmpty());
    }

    @Test(description = "test::id-0000018:automated:FAILED:FF", groups = {"functional"})
    public void testGoToSignUp() {
        app.ocsSignIn().clickSignUp();
        assertThat(app.ocsSignUp().isOnPage(), equalTo(STR_SIGN_UP_TITLE));
    }

    @Test(description = "test::id-0000019::automated", groups = {"functional"})
    public void testForgotPassword() {
        app.ocsSignIn().clickForgotPassword();
        assertThat(app.ocsForgotPassword().getPageUITitle(), equalTo(STR_FORGOT_PASS_TITLE));
    }

//    @Issue("OCS-477")
//    @JiraIssue("OCS-477")
    @Test(description = "test::id-0000017::automated::FAILED", groups = {"end2end"})
    public void testIsSignInDisabledAfterCleanValues() {
        app.ocsSignIn().clearValues();
        app.ocsSignIn().clearValues();
        assertFalse(app.ocsSignIn().signInButtonIsClickable());
    }
}
