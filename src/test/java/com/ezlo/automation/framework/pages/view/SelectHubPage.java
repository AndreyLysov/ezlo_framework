package com.ezlo.automation.framework.pages.view;

import com.ezlo.automation.framework.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SelectHubPage extends BasePage {

    private static final String STR_MENU_BURGER_XPATHS =
            "//android.widget.ImageButton | " +
                    "//XCUIElementTypeButton[@name='navBar menu']";
    private static final String STR_TITLE_SELECT_HUB_XPATHS =
            "//android.view.ViewGroup/android.widget.TextView | " +
                    "//XCUIElementTypeStaticText[@name='Select hub']";
    private static final String STR_HUBS_LIST_XPATHS =
            "//android.support.v7.widget.RecyclerView/* | " +
                    " //XCUIElementTypeTable/*";
    private static final String STR_TITLE_BOTTOM_PANEL_XPATHS =
            "//android.widget.RelativeLayout/android.widget.TextView | " +
                    "//XCUIElementTypeStaticText[@name='Autoconnect to nearest hub\']";
    private static final String STR_TOGGLE_BUTTON_BOTTOM_PANEL_XPATHS =
            "//android.widget.ToggleButton | " +
                    "//XCUIElementTypeOther[2]/XCUIElementTypeImage_";
    @FindBy(xpath = STR_MENU_BURGER_XPATHS)
    private WebElement menuBurger;
    @FindBy(xpath = STR_TITLE_SELECT_HUB_XPATHS)
    private WebElement titleSelectHub;
    @FindBy(xpath = STR_HUBS_LIST_XPATHS)
    private List<WebElement> lstHubs;
    @FindBy(xpath = STR_TITLE_BOTTOM_PANEL_XPATHS)
    private WebElement titleBottomPanel;
    @FindBy(xpath = STR_TOGGLE_BUTTON_BOTTOM_PANEL_XPATHS)
    private WebElement tglBtnBottomPanel;

    protected WebElement getHubByIndex(Integer hubIndex) {
        return lstHubs.get(hubIndex);
    }

    protected String getBottomPanelText() {
        return titleBottomPanel.getText();
    }

    protected Boolean isPageDisplayed() {
        return menuBurger.isDisplayed();
    }

    // todo - @OleksiiIsakov - Investigate behavior: locator is present in inspection view by does not in runtime
    protected String getPageTitle() {
        return titleSelectHub.getText();
    }

    protected void turnOnTogButton() {
        if (!tglBtnBottomPanel.getAttribute("checked").equals("true")) {tglBtnBottomPanel.click();}
    }

    protected void turnOffTogButton() {
        if (!tglBtnBottomPanel.getAttribute("checked").equals("false")) {tglBtnBottomPanel.click();}
    }

    private void addNewHub() {
        lstHubs.get(lstHubs.size() - 1).click();
    }
}
