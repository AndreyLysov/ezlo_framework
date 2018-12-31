package com.ezlo.automation.framework.tests.unit.jira;

import com.atlassian.jira.rest.client.api.domain.BasicIssue;
import com.atlassian.jira.rest.client.api.domain.input.IssueInput;
import com.atlassian.jira.rest.client.api.domain.input.IssueInputBuilder;
import com.ezlo.automation.framework.common_baby.issue_tracker.JiraFieldSelectValues;
import com.ezlo.automation.framework.common_baby.issue_tracker.JiraIssueStatus;
import com.ezlo.automation.framework.common_baby.issue_tracker.JiraIssueTypes;
import com.ezlo.automation.framework.common_baby.issue_tracker.JiraUtil;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.logging.Logger;

import static com.ezlo.automation.framework.generators.EzloDataGenerator.getDateTime;


public class JiraUtilTest {
    public static final String STR_DATE_TIME_FORMAT_PATTERN = "YYYY-MM-DD HH:MM:SSS";
    private static final String STR_JIRA_PROJECT_KEY = "EQAT";
    private static final String STR_ISSUE_KEY_UNDER_TEST = String.format("%s-%s", STR_JIRA_PROJECT_KEY, "54");
    private Logger log = Logger.getLogger(this.getClass().getSimpleName());
    private JiraUtil jira = new JiraUtil();

    @BeforeClass(alwaysRun = true)
    public void ensureIssueIsOpenedOrReopened(){
        if (!jira.getIssueStatus(STR_ISSUE_KEY_UNDER_TEST).equals(JiraIssueStatus.REOPENED.getStatusName())) {
            jira.reopenIssue(STR_ISSUE_KEY_UNDER_TEST);
            log.info(getLogInfoMsg());
        }
    }

    @Test
    public void testGetJiraConnection() {
        Assert.assertNotNull(jira.getRestClient(), "Jira connection is: null.");
        log.info(String.format("Jira connection is: %s.", true));
    }

    @Test
    public void testGetStatus() {
        String issueStatus = jira.getJiraIssue(STR_ISSUE_KEY_UNDER_TEST).getStatus().getName();
        Assert.assertNotNull(issueStatus);
        log.info(getLogInfoMsg());
    }

    @Test
    public void testPrintIssueListByProject() {
        String jqlQuery = String.format("project = %s", STR_JIRA_PROJECT_KEY);
        HashSet<String> searchFields = new HashSet<String>();
        jira.printIssueList(jqlQuery, searchFields);
    }

    @Test
    public void testMoveToStartDev() {
        jira.startDevIssue(STR_ISSUE_KEY_UNDER_TEST);
        Assert.assertEquals(JiraIssueStatus.IN_PROGRESS.getStatusName(), jira.getIssueStatus(STR_ISSUE_KEY_UNDER_TEST));
        log.info(getLogInfoMsg());
    }

    @Test(
            dependsOnMethods = {
                    "testMoveToStartDev"
            }
    )
    public void testMoveToCodeReview() {
        jira.codeReviewIssue(STR_ISSUE_KEY_UNDER_TEST,
                JiraFieldSelectValues.CANNOT_REPRODUCE_ID_5.getFieldSelectValue());
        Assert.assertEquals(JiraIssueStatus.IN_REVIEW.getStatusName(), jira.getIssueStatus(STR_ISSUE_KEY_UNDER_TEST));
        log.info(getLogInfoMsg());
    }

    @Test(
            dependsOnMethods = {
                    "testMoveToStartDev",
                    "testMoveToCodeReview"
            }
    )
    public void testMoveToResolve() {
        jira.resolveIssue(STR_ISSUE_KEY_UNDER_TEST, JiraFieldSelectValues.CANNOT_REPRODUCE_ID_5.getFieldSelectValue());
        Assert.assertEquals(JiraIssueStatus.RESOLVED.getStatusName(), jira.getIssueStatus(STR_ISSUE_KEY_UNDER_TEST));
        log.info(getLogInfoMsg());
    }

    @Test(
            dependsOnMethods = {
                    "testMoveToStartDev"
                    , "testMoveToCodeReview"
                    , "testMoveToResolve"
            }
    )
    public void testMoveToReadyForQA() {
        jira.readyForQaIssue(STR_ISSUE_KEY_UNDER_TEST);
        Assert.assertEquals(JiraIssueStatus.READY_FOR_QA.getStatusName(),
                jira.getIssueStatus(STR_ISSUE_KEY_UNDER_TEST));
        log.info(getLogInfoMsg());
    }

    @Test(
            dependsOnMethods = {
                    "testMoveToStartDev"
                    , "testMoveToCodeReview"
                    , "testMoveToResolve"
                    , "testMoveToReadyForQA"
            }
    )
    public void testMoveToStartQA() {
        jira.startQaIssue(STR_ISSUE_KEY_UNDER_TEST);
        Assert.assertEquals(JiraIssueStatus.QA_IN_PROGRESS.getStatusName(),
                jira.getIssueStatus(STR_ISSUE_KEY_UNDER_TEST));
        log.info(getLogInfoMsg());
    }

    @Test(
            dependsOnMethods = {
                    "testMoveToStartDev"
                    , "testMoveToCodeReview"
                    , "testMoveToResolve"
                    , "testMoveToReadyForQA"
                    , "testMoveToStartQA"
            }
    )
    public void testMoveToVerify() {
        jira.verifyIssue(STR_ISSUE_KEY_UNDER_TEST);
        Assert.assertEquals(JiraIssueStatus.VERIFIED.getStatusName(), jira.getIssueStatus(STR_ISSUE_KEY_UNDER_TEST));
        log.info(getLogInfoMsg());
    }

    @Test(
            dependsOnMethods = {
                    "testMoveToStartDev"
                    , "testMoveToCodeReview"
                    , "testMoveToResolve"
                    , "testMoveToReadyForQA"
                    , "testMoveToStartQA"
                    , "testMoveToVerify"
            }
    )
    public void testMoveToClose() {
        jira.closeIssue(STR_ISSUE_KEY_UNDER_TEST);
        Assert.assertEquals(JiraIssueStatus.CLOSED.getStatusName(), jira.getIssueStatus(STR_ISSUE_KEY_UNDER_TEST));
        log.info(getLogInfoMsg());
    }

    private void testAddJiraIssues() {
        //  Issue data
        IssueInputBuilder iib = new IssueInputBuilder(STR_JIRA_PROJECT_KEY, JiraIssueTypes.BUG.getTypeId());
        String now = getDateTime(STR_DATE_TIME_FORMAT_PATTERN);
        iib.setSummary(String.format("Test Summary %s", now));
        iib.setDescription(String.format("Test Description %s", now));
        IssueInput issue = iib.build();
        BasicIssue createdIssue = jira.createJiraIssue(issue);
        Assert.assertNotNull(createdIssue);
        log.info(getLogInfoMsg());
    }

    private String getLogInfoMsg() {
        return String.format("%s issue status is %s.", STR_ISSUE_KEY_UNDER_TEST,
                jira.getIssueStatus(STR_ISSUE_KEY_UNDER_TEST));
    }
}
