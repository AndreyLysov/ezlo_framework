package com.ezlo.automation.framework.pages.ocs;

import com.ezlo.automation.framework.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OCSMainPage extends BasePage {
    private String urlPostfixMain = "customer/list";
    @FindBy(xpath = "//h2[contains(text(),'Customers')]")
    private WebElement titleOcsMain;
    @FindBy(xpath = "//div[contains(@class,'userName')]")
    private WebElement txtUserName;

    protected void getSignUpPage() {
        getPage(urlPostfixMain);
    }

    protected String getUserNameFromUI() {
        return txtUserName.getText();
    }

}
