package com.ezlo.automation.framework.helpers.examples.appmanager;

import com.ezlo.automation.framework.model.ezlo.CustomerData;
import com.ezlo.automation.framework.model.ezlo.Customers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerHelper extends HelperBase {

    private static final String BTN_ADD_NEW_CUSTOMER = "//span[text()='Add new Customer']/../..";

    private static final String DDL_SERVER_NAME_LOCATOR =
            "//div[starts-with(@id, 'nmaServer-Selectnmaserver')]";///div[1]/div[2]
    private static final String TXT_FILTER_BY_NAME =
            "//input[starts-with(@id, 'undefined-Nameemailorphone-undefined')]";
    private static final String TXT_FILTER_BY_COMPANY =
            "//input[starts-with(@id, undefined-Company-undefined')]";
    private static final String TXT_FILTER_BY_CONTACT_ADDRESS =
            "//input[starts-with(@id, undefined-Address-undefined')]";
    private static final String BTN_RESET_FILTERS =
            "//span[starts-with(@class, 'list__resetAll___2MmNn list')]";
    //TODO - need to change xpathes for buttons below when divs will be linked to unique classnames
    private static final String BTN_SUBMIT_CUSTOMER_CREATION = "//form/div[8]/div[2]/button";
    private static final String BTN_CLEAR_VALUES = "//form/div[8]/div[1]/button";
    private Customers customerCache = null;

    public CustomerHelper(WebDriver wd) {
        super(wd);
    }

    private void initCustomerModification() {
        click(By.cssSelector(""));
    }

    private void initCustomerCreation() {

        //TODO - @xxx The clicking button event is not worked after loading the page during ~2 sec
        // temporary solution for waiting till the element becomes to be clickable
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        click(By.xpath(BTN_ADD_NEW_CUSTOMER));
    }

    private void fillCustomerForm(CustomerData customer) {
        type(By.name("name"), customer.getName());
        type(By.name("name"), customer.getName());
        type(By.name("email"), customer.getEmail());
        type(By.name("phone"), customer.getPhone());
        type(By.name("address"), customer.getAddress());
        type(By.name("ocs.db.pass"), customer.getPassword());
        type(By.name("confirmPassword"), customer.getConfirmPassword());
        selectServer(DDL_SERVER_NAME_LOCATOR, customer.getServerName());
    }


    private void selectServer(String locator, String serverName) {
        selectItem(locator, serverName);
    }


    public void create(CustomerData customer) {
        initCustomerCreation();
        fillCustomerForm(customer);
        submitCustomerCreation();
        customerCache = null;
    }

    public void enterCustomerNameFilter(String customerName) {
        type(By.id(TXT_FILTER_BY_NAME), customerName);
    }

    public void submitCustomerCreation() {
        click(By.xpath(BTN_SUBMIT_CUSTOMER_CREATION));
    }

//  private void initCustomerModificationById(int id) {
////    WebElement checkbox = wd.findElement(By.cssSelector(String.format("input[value='%s']", id)));
////    WebElement row = checkbox.findElement(By.xpath("./../.."));
////    List<WebElement> cells = row.findElements(By.tagName("td"));
////    cells.get(7).findElement(By.tagName("a")).click();
//  }

//  private void initContactDetailsPageById(int id) {
////    WebElement checkbox = wd.findElement(By.cssSelector(String.format("input[value='%s']", id)));
////    WebElement row = checkbox.findElement(By.xpath("./../.."));
////    List<WebElement> cells = row.findElements(By.tagName("td"));
////    cells.get(6).findElement(By.tagName("a")).click();
//  }
    //    private void selectContactById(int id) {
//        click(By.cssSelector(String.format("input[value='%s']", id)));
//    }
//    private void selectString(String month, String locator) {
//        new Select(wd.findElement(By.name(locator))).selectByVisibleText(month);
//    }
//
//    private void selectInt(Integer numeral, String locator) {
//        new Select(wd.findElement(By.name(locator))).selectByVisibleText(String.valueOf(numeral));
//    }
//    public void modify(ContactData contact, boolean creation) {
////        selectContactById(contact.getId());
////        initContactModification();
////        fillContactForm(contact, creation);
////        submitContactModification();
////        contactCache = null;
////        returnToHomePage();
//    }

//    public void delete(ContactData contact) {
////        selectContactById(contact.getId());
////        initContactModification();
////        contactCache = null;
////        submitContactDeletion();
//    }


//    public void submitContactModification() {
////        click(By.name("update"));
//    }

//    public void submitContactDeletion() {
////        click(By.cssSelector("input[value=\"Delete\"]"));
//    }

//    private void submitContactAddToGroup() {
////        click(By.name("add"));
//    }

//    public void returnToHomePage() {
//        click(By.cssSelector("#nav > ul > li:nth-child(1) > a"));
//    }

//    public int count() {
////        return wd.findElements(By.name("selected[]")).size();
//    }

//    public Contacts all() {
////        if (contactCache != null) {
////            return new Contacts(contactCache);
////        }
////        contactCache = new Contacts();
////        List<WebElement> rows = wd.findElements(By.name("entry"));
////        for (WebElement row : rows) {
////            List<WebElement> cells = row.findElements(By.tagName("td"));
////            int id = Integer.parseInt(cells.get(0).findElement(By.tagName("input")).getAttribute("value"));
////            String surname = cells.get(1).getText();
////            String name = cells.get(2).getText();
////            String companyAddress = cells.get(3).getText();
////            String allPhones = cells.get(5).getText();
//////      System.out.println(allPhones);
////            String allEmails = cells.get(4).getText();
////            contactCache.add(new ContactData()
////                    .withId(id).withFirst(name)
////                    .withLast(surname)
////                    .withAddress(companyAddress)
////                    .withAllPhones(allPhones)
////                    .withAllEmails(allEmails));
////        }
////        return new Contacts(contactCache);
//    }

//    public ContactData infoFromEditForm(ContactData contact) {
//        initContactModificationById(contact.getId());
//        String name = wd.findElement(By.name("firstname")).getAttribute("value");
//        String middleName = wd.findElement(By.name("middlename")).getAttribute("value");
//        String surname = wd.findElement(By.name("lastname")).getAttribute("value");
//        String nickName = wd.findElement(By.name("nickname")).getAttribute("value");
//        String title = wd.findElement(By.name("title")).getAttribute("value");
//        String company = wd.findElement(By.name("company")).getAttribute("value");
//        String address = wd.findElement(By.name("address")).getAttribute("value");
//        String home = wd.findElement(By.name("home")).getAttribute("value");
//        String mobile = wd.findElement(By.name("mobile")).getAttribute("value");
//        String work = wd.findElement(By.name("work")).getAttribute("value");
//        String fax = wd.findElement(By.name("fax")).getAttribute("value");
//        String email = wd.findElement(By.name("email")).getAttribute("value");
//        String email2 = wd.findElement(By.name("email2")).getAttribute("value");
//        String email3 = wd.findElement(By.name("email3")).getAttribute("value");
//        String homePage = wd.findElement(By.name("homepage")).getAttribute("value");
//        Integer bDay = Integer.parseInt(wd.findElement(By.name("bday")).getAttribute("value"));
//        String bMonth = wd.findElement(By.name("bmonth")).getAttribute("value");
//        Integer bYear = Integer.parseInt(wd.findElement(By.name("byear")).getAttribute("value"));
//        Integer aDay = Integer.parseInt(wd.findElement(By.name("aday")).getAttribute("value"));
//        String aMonth = wd.findElement(By.name("amonth")).getAttribute("value");
//        Integer aYear = Integer.parseInt(wd.findElement(By.name("ayear")).getAttribute("value"));
//        String hAddress = wd.findElement(By.name("address2")).getAttribute("value");
//        String hPhone = wd.findElement(By.name("phone2")).getAttribute("value");
//        String notes = wd.findElement(By.name("notes")).getAttribute("value");
//
//        wd.navigate().back();
//        return new ContactData().withId(contact.getId())
//                .withFirst(name).withMiddle(middleName).withLast(surname)
//                .withNick(nickName).withTitle(title).withCompany(company).withAddress(address)
//                .withHomePhone(home).withMobilePhone(mobile).withWorkPhone(work).withFax(fax)
//                .withEmail(email).withEmail2(email2).withEmail3(email3).withHomePage(homePage)
//                .withBDay(bDay).withBMonth(bMonth).withBYear(bYear)
//                .withADay(aDay).withAMonth(aMonth).withAYear(aYear)
//                .withHomeAddress(hAddress)
//                .withHomePhoneNum(hPhone)
//                .withNotes(notes);
//    }
//
//    public ContactData infoFromDetailsPage(ContactData contact) {
//        initContactDetailsPageById(contact.getId());
//        String details = wd.findElement(By.id("content")).getAttribute("innerText");//innerText
//        System.out.println("details: \n" + details);
//        //Contact details
//        String name = null;
//        String middleName = null;
//        String surname = null;
//        String nickName = null;
//        String title = null;
//        String company = null;
//        String address = null;
//        //
//        String home = null;
//        String mobile = null;
//        String work = null;
//        String fax = null;
//        //
//        String email = null;
//        String email2 = null;
//        String email3 = null;
//        String homePage = null;
//        //
//        String dOB = null;
//        String anniversary = null;
//        String hAddress = null;
//        String hPhone = null;
//        String notes = null;
//        String group = null;
//
//        // Details getting
//        String[] dataSet = details.split("\t");
//        String[] rows = dataSet[0].replace("\n", "\n ").split("\n");
//        if (rows[0].split(" ").length > 2) {
//            name = rows[0].split(" ")[0];
//            middleName = rows[0].split(" ")[1];
//            surname = rows[0].split(" ")[2];
//        } else if (rows[0].split(" ").length > 1) {
//            if (contact.getFirstName().length() != 0 && contact.getLastName().length() != 0) {
//                name = rows[0].split(" ")[0];
//                surname = rows[0].split(" ")[1];
//            } else if (contact.getFirstName().length() != 0 && contact.getLastName().length() == 0) {
//                name = rows[0].split(" ")[0];
//                middleName = rows[0].split(" ")[1];
//            } else if (contact.getLastName().length() != 0) {
//                middleName = rows[0].split(" ")[0];
//                surname = rows[0].split(" ")[1];
//            }
//        } else if (contact.getFirstName().length() != 0) {
//            name = rows[0];
//        } else if (contact.getLastName().length() != 0) {
//            surname = rows[0];
//        } else {
//            middleName = rows[0];
//        }
//        nickName = rows[1];  //System.out.println("nick " + nickName);
//        title = rows[2];
//        company = rows[3];
//        address = rows[4];
////emptyRow = rows[5];
//        home = rows[6];
//        mobile = rows[7];
//        work = rows[8];
//        fax = rows[9];
////emptyRow = rows[10];
//        email = rows[11];
//        email2 = rows[12];
//        email3 = rows[13];
//        homePage = rows[14];
////emptyRow = rows[15];
//        dOB = rows[16];
//        anniversary = rows[17];
////emptyRow = rows[18];
//        hAddress = rows[19];
////emptyRow = rows[20];
//        hPhone = rows[21];
////emptyRow = rows[22];
//        notes = rows[23];
////emptyRow = rows[24];
////emptyRow = rows[25];
//        group = rows[26].split(": ")[1];
//
//        wd.navigate().back();
//        return new ContactData().withId(contact.getId())
//                .withFirst(name).withMiddle(middleName).withLast(surname)
//                .withNick(nickName).withTitle(title).withCompany(company).withAddress(address)
//                .withHomePhone(home).withMobilePhone(mobile).withWorkPhone(work).withFax(fax)
//                .withEmail(email).withEmail2(email2).withEmail3(email3).withHomePage(homePage)
//                .withBirthDate(dOB).withAnniversaryDate(anniversary)
//                .withHomeAddress(hAddress)
//                .withHomePhoneNum(hPhone)
//                .withNotes(notes)
//                .inGroups(new GroupData().withName(group));
//    }
//
//    public void addToGroup(ContactData contact, GroupData group) {
//        selectContactById(contact.getId());
//        selectServer(group.getName(), "to_group");
//        submitContactAddToGroup();
//        returnToHomePage();
//    }
//
//    public boolean isThereAContact() {
//        return isElementPresent(By.cssSelector("#maintable > tbody > tr:nth-child(2) > td:nth-child(8) > a > img"));
//    }

    //
//  private Contacts contactWithPhoneCache = null;
////  public Contacts allWithPhones() {
////    if (contactWithPhoneCache != null) {
////      return new Contacts(contactWithPhoneCache);
////    }
////    List<WebElement> rows = wd.findElements(By.name("entry"));
////    for (WebElement row : rows) {
////      List<WebElement> cells = row.findElements(By.tagName("td"));
////      int id = Integer.parseInt(cells.get(0).findElement(By.tagName("input")).getAttribute("value"));
////      String surname = cells.get(1).getText();
////      String name = cells.get(2).getText();
////      String[] phones = cells.get(5).getText().split("\n");
////      contactWithPhoneCache.add(new ContactData()
////            .withId(id)
////            .withFirst(name)
////            .withLast(surname)
////            .withHomePhone(phones[0])
////            .withMobilePhone(phones[1])
////            .withWorkPhone(phones[2]));
////    }
////    return new Contacts(contactWithPhoneCache);
////  }

}
