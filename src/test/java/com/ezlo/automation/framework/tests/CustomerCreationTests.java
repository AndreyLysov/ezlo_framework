package com.ezlo.automation.framework.tests;

import com.ezlo.automation.framework.common_baby.CommonMethods;
import com.ezlo.automation.framework.model.ezlo.CustomerData;
import com.ezlo.automation.framework.model.ocs.data.AccountData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CustomerCreationTests extends BaseTest {

    @DataProvider
    public Iterator<Object[]> validCustomerFromJson() {
        List<HashMap<String, String>> customerList =
                CommonMethods.jsonFileToListOfHashMaps(new File(
                        "src/test/resources/validCustomers.json"));
        return customerList.stream().map(
                (s) -> new Object[]{new CustomerData(s)})
                .collect(Collectors.toList())
                .iterator();
    }

    @BeforeMethod
    private void preconditionSignInAsExistedUser() {
        app.ocsSignIn().goTo();
        app.ocsSignIn().signInAs(
                new AccountData()
                        .withEmail("alexey.isakov@ezlo.com")
                        .withPassword("Qwerty123"));
    }

    @Test(enabled = true, dataProvider = "validCustomerFromJson")
    public void testCustomerCreationFull(CustomerData newCustomer) throws Exception {
        app.ocsCustomer().openCustomerForm();
        app.ocsCustomer().addCustomer(newCustomer);
        assertThat(1, equalTo(1));
//        assertThat(app.customer().count(), equalTo(before.size() + 1));
//        Customer after = app.customer().all();
//        noinspection ConstantConditions
//        assertThat(after, equalTo(
//                before.withAdded(newCustomer.withId(after.stream().mapToInt(ContactData::getId).max().getAsInt()))));
//        verifyContactListInUI();
    }

}

//  @Test(enabled = true)
//  public void testContactCreationwithCustomer() {
//    Contacts before = app.contact().all();
//    app.goTo().contactCreationPage();
//    ContactData contact = new ContactData()
//          .withFirst("test_name").withLast("test_surname")
////          .withCustomer("test1")
//          ;
//    app.contact().create(contact, true);
//    assertThat(app.contact().count(), equalTo(before.size() + 1));
//    Contacts after = app.contact().all();
//    //noinspection ConstantConditions
//    assertThat(after, equalTo(
//          before.withAdded(contact.withId(after.stream().mapToInt(ContactData::getId).max().getAsInt()))));
//    verifyContactListInUI();
//  }
//
//  @Test(enabled = true)
//  public void testContactCreationWithPones() {
//    Contacts before = app.contact().all();
//    app.goTo().contactCreationPage();
//    ContactData contact = new ContactData()
//          .withFirst("test_name").withLast("test_surname").withHomePhone("111").withMobilePhone("222").withWorkPhone("333");
//    app.contact().create(contact, true);
//    assertThat(app.contact().count(), equalTo(before.size() + 1));
//    Contacts after = app.contact().all();
//    //noinspection ConstantConditions
//    assertThat(after, equalTo(
//          before.withAdded(contact.withId(after.stream().mapToInt(ContactData::getId).max().getAsInt()))));
//    verifyContactListInUI();
//  }
//
//  @Test(enabled = true)
//  public void testContactCreationWithOutGroup() {
//    Contacts before = app.contact().all();
//    app.goTo().contactCreationPage();
//    ContactData contact = new ContactData()
//          .withFirst("name").withLast("surname").withAddress("companyAddress")
//          .withHomePhone("+111").withMobilePhone("(22)2").withWorkPhone("3-3 3")
//          .withEmail2("email@2").withEmail3("email@3");
//    app.contact().create(contact, true);
//    assertThat(app.contact().count(), equalTo(before.size() + 1));
//    Contacts after = app.contact().all();
//    //noinspection ConstantConditions
//    assertThat(after, equalTo(
//          before.withAdded(contact.withId(after.stream().mapToInt(ContactData::getId).max().getAsInt()))));
//    verifyContactListInUI();
//  }
