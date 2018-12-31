package com.ezlo.automation.framework.helpers.ocs;

import com.ezlo.automation.framework.model.ezlo.CustomerData;
import com.ezlo.automation.framework.pages.ocs.OCSCustomerForm;

public class OCSCustomerHelper extends OCSCustomerForm {

    public void openCustomerForm() {
        clickAddNewCustomerButton();
    }

    public void addCustomer(CustomerData customer) {
        fillCustomerCreationForm(customer);
    }
}
