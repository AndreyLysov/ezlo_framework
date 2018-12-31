package com.ezlo.automation.framework.pages.ocs;

import com.ezlo.automation.framework.model.ezlo.CustomerData;
import com.ezlo.automation.framework.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OCSCustomerForm extends BasePage {
    @FindBy(xpath = "//div[starts-with(@id, 'nmaServer-Selectnmaserver')]")
    private WebElement ddlSelectNMAServer;
    @FindBy(name = "name")
    private WebElement inputName;
    @FindBy(name = "email")
    private WebElement inputEmail;
    @FindBy(name = "phone")
    private WebElement inputPhone;
    @FindBy(name = "address")
    private WebElement inputAddress;
    @FindBy(name = "password")
    private WebElement inputPassword;
    @FindBy(name = "confirmPassword")
    private WebElement inputConfirmPassword;
    @FindBy(xpath = "//div[contains(@class,'customer-add-clear')]/button")
    private WebElement btnClearValues;
    @FindBy(xpath = "//span[text()='Add new Customer']/../..")
    private WebElement btnAddNewCustomer;

    private void selectNMAServer(String server) {
        driver.selectItem(ddlSelectNMAServer, server);
    }

    private void enterName(String name) {
        driver.type(inputName, name);
    }

    private void enterEmail(String email) {
        driver.type(inputEmail, email);
    }

    private void enterPhone(String phone) {
        driver.type(inputPhone, phone);
    }

    private void enterAddress(String address) {
        driver.type(inputAddress, address);
    }

    private void enterPassword(String password) {
        driver.type(inputPassword, password);
    }

    private void enterConfirmPassword(String confirmPassword) {
        driver.type(inputConfirmPassword, confirmPassword);
    }

    private void pressAddNewCustomer() {
        driver.click(btnAddNewCustomer);
    }

    protected void clickAddNewCustomerButton() {
        driver.click(btnAddNewCustomer);
    }

    protected void fillCustomerCreationForm(CustomerData customer) {
        enterName(customer.getName());
        enterEmail(customer.getEmail());
        enterPhone(customer.getPhone());
        enterAddress(customer.getAddress());
        enterPassword(customer.getPassword());
        enterConfirmPassword(customer.getConfirmPassword());
        selectNMAServer(customer.getServerName());
        pressAddNewCustomer();
    }
}
