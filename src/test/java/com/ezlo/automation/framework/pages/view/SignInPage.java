package com.ezlo.automation.framework.pages.view;

import com.ezlo.automation.framework.model.ezlo.UserData;
import com.ezlo.automation.framework.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignInPage extends BasePage {
    private static final String STR_BUTTON_SIGN_IN_XPATHS =
            "//android.widget.Button[@content-desc='test_login_button'] | " + //
                    " //XCUIElementTypeButton[@name='LOGIN']";
    private static final String STR_INPUT_EMAIL_XPATHS =
            "//*[1]/android.widget.FrameLayout/android.widget.EditText | " +
                    "//*[1]/XCUIElementTypeOther/XCUIElementTypeTextField";
    private static final String STR_INPUT_PASS_XPATHS =
            "//*[2]/android.widget.FrameLayout/android.widget.EditText | " +
                    "//*[1]/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField";
    private static final String STR_BUTTON_SIGN_UP_XPATHS =
            "//android.widget.Button[@content-desc='test_login_button'] | " +
                    "//XCUIElementTypeButton[@name='Don't have an account? SIGN UP']";
    private static final String STR_IMG_LOGO_XPATHS =
            "//android.widget.ImageView | " +
                    "//XCUIElementTypeImage[@name='pic_eZLO']";
    private static final String STR_LINK_FORGOT_PASS_XPATHS =
            "//android.widget.LinearLayout/android.widget.TextView | " +
                    "//XCUIElementTypeButton[@name='I FORGOT MY PASSWORD']";
    
    @FindBy(xpath = STR_IMG_LOGO_XPATHS)
    private WebElement imgLogo;
    @FindBy(xpath = STR_INPUT_EMAIL_XPATHS)
    private WebElement inputEmail;
    @FindBy(xpath = STR_INPUT_PASS_XPATHS)
    private WebElement inputPassword;
    @FindBy(xpath = STR_LINK_FORGOT_PASS_XPATHS)
    private WebElement btnForgotPass;
    @FindBy(xpath = STR_BUTTON_SIGN_IN_XPATHS)
    private WebElement btnSignIn;
    @FindBy(xpath = STR_BUTTON_SIGN_UP_XPATHS)
    private WebElement btnSignUp;

    protected String getLogoNameByAttribute() {
        return imgLogo.getAttribute("name");
    }

    protected String getSignInButtonTextByGetText() {
        return btnSignIn.getText();
    }

    protected void submitForm() {
        btnSignIn.click();
    }

    protected void fillForm(UserData user) {
        typeEmailToForm(user.getEmail());
        typePasswordToForm(user.getPassword());
    }

    private void typeEmailToForm(String email) {
        driver.type(inputEmail, email);
    }

    private void typePasswordToForm(String password) {
        driver.type(inputPassword, password);
    }
}
