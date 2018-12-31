package com.ezlo.automation.framework.common_baby;

import com.ezlo.automation.framework.common_baby.issue_tracker.JiraIssue;
import com.ezlo.automation.framework.common_baby.issue_tracker.JiraIssueStatus;
import com.ezlo.automation.framework.driver_factory.Driver;
import com.ezlo.automation.framework.helpers.App;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.testng.*;

public class MyTestListener implements ITestListener, IInvokedMethodListener {

    @Attachment(value = "{0}", type = "text/plain")
    private static String saveTextLog(String message) {
        return message;
    }

    @Attachment(value = "HTML Page source", type = "text/html")
    private static String saveHTMLPage(String html) {
        return html;
    }

    @Attachment(value = "XML Page source", type = "text/xml")
    private static String saveXMLPage(String pageSource) {
        return pageSource;
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    private byte[] saveScreenshot(Driver driver) {
        return driver.getScreenshotAs(OutputType.BYTES);
    }

    @Override
    public void afterInvocation(IInvokedMethod invokedMethod, ITestResult result) {
        App app = (App) result.getTestContext().getAttribute("app");
        JiraIssue issue =
                invokedMethod.getTestMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraIssue.class);
        // TODO - ?: Add handler for the case when the issue is reproducible on a specific platform or environment
        if (issue != null) {
            String strOpen = JiraIssueStatus.OPEN.toString();
            String strReopen = JiraIssueStatus.REOPENED.toString();
            String strIssueStatus = app.jiraUtil().getIssueStatus(issue.value()).toUpperCase();
            if (strOpen.equals(strIssueStatus) ||
                    strReopen.equals(strIssueStatus)) {
                switch (result.getStatus()) {
                    case ITestResult.FAILURE:
                        // no need to fail as we might have expected this already.
                        result.setStatus(ITestResult.SKIP);
                        break;
                    case ITestResult.SUCCESS:
                        // It is a good news. We should close this issue.
                        app.jiraUtil().closeIssue(issue.value());
                        break;
                    default: // default clause should be the last one      
                        break;
                }
            }
            //TODO opposite case for reopen already existed issue
            String strClosed = JiraIssueStatus.CLOSED.toString();
            if (strClosed.equals(strIssueStatus)) {
                switch (result.getStatus()) {
                    case ITestResult.FAILURE:
                        // It is a bad news. We should reopen this issue.
                        app.jiraUtil().reopenIssue(issue.value());
                        break;
                    case ITestResult.SUCCESS:
                        // It is a good news. We should do nothing.
                        break;
                    default:
                        // default clause should be the last one      
                        break;
                }
            }
        }
    }

    @Override
    public void beforeInvocation(IInvokedMethod invokedMethod, ITestResult result) {
        // TODO - ?: https://dzone.com/articles/how-to-automatically-skip-tests-based-on-defects-s
    }

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {
        App app = (App) result.getTestContext().getAttribute("app");
        Driver driver = app.base().getDriver();
        if (driver != null) {
            saveScreenshot(driver);
            if (System.getProperty("appCaps") != null) {
                saveXMLPage(driver.getPageSource());
                saveTextLog("App connects to the NMA server: " + Constants.getProperties().getProperty("nmaUri"));
            } else {
                saveHTMLPage(driver.getPageSource());
                saveTextLog("Expected stage URL: " + Constants.getProperties().getProperty("baseUrl") + "\n"
                        + "Actual stage URL: " + driver.getCurrentUrl());
            }
        }
        saveTextLog(result.getThrowable().toString());
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
