package com.ezlo.automation.framework.common_baby.issue_tracker;


import com.atlassian.httpclient.api.ResponseTransformationException;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.JiraRestClientFactory;
import com.atlassian.jira.rest.client.api.SearchRestClient;
import com.atlassian.jira.rest.client.api.domain.*;
import com.atlassian.jira.rest.client.api.domain.input.ComplexIssueInputFieldValue;
import com.atlassian.jira.rest.client.api.domain.input.FieldInput;
import com.atlassian.jira.rest.client.api.domain.input.IssueInput;
import com.atlassian.jira.rest.client.api.domain.input.TransitionInput;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;
import com.atlassian.util.concurrent.Promise;
import com.google.common.collect.ImmutableList;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.log4j.Logger;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static com.ezlo.automation.framework.generators.EzloDataGenerator.getDateTime;
import static com.ezlo.automation.framework.tests.unit.jira.JiraUtilTest.STR_DATE_TIME_FORMAT_PATTERN;

public class JiraUtil {
    private static final String STR_JIRA_USER = "test.automation";
    private static final String STR_JIRA_URL = "https://jira.mios.com/"; // https://ezloproject.atlassian.net/";
    private static final String STR_JIRA_PASS = "eZLO2018!";
    private static JiraRestClient restClient;

    static {
        URI jiraServerUri = URI.create(STR_JIRA_URL);
        JiraRestClientFactory factory = new AsynchronousJiraRestClientFactory();
        restClient = factory.createWithBasicHttpAuthentication(jiraServerUri, STR_JIRA_USER, STR_JIRA_PASS);
    }

    private Logger log = Logger.getLogger(this.getClass().getSimpleName());
    private Issue issue;
    private String STR_COMMENT_FROM_CODE = String.format("DateTime: %s | User: %s| Add:  comment from AUTOMATION TEST."
            , getDateTime(STR_DATE_TIME_FORMAT_PATTERN)
            , STR_JIRA_USER
    );

    public JiraRestClient getRestClient() {
        return restClient;
    }

    public Issue getJiraIssue(String issueKey) {
        try {
            return restClient.getIssueClient().getIssue(issueKey).claim();
        } catch (ResponseTransformationException e) {
            log.warn(String.format("Issue %s is not existed!", issueKey));
        }
        return null;
    }

    public String getIssueStatus(String issueKey) {
        issue = restClient.getIssueClient().getIssue(issueKey).claim();
        return issue.getStatus().getName();
    }

    public BasicIssue createJiraIssue(IssueInput issue) {
        return restClient.getIssueClient().createIssue(issue).claim();
    }

    public void reopenIssue(String issueKey) {
        putIssueToReopened(issueKey);
    }

    public void startDevIssue(String issueKey) {
        // let's check either this issue is already estimated
        if (!getJiraIssue(issueKey).getStatus().getName().equals(JiraIssueStatus.OPEN.toString()) &&
                !getJiraIssue(issueKey).getStatus().getName().equals(JiraIssueStatus.REOPENED.toString())) {
            throw getNotImplementedException(issueKey);
        }
        putIssueToStartDev(issueKey);
    }

    public void codeReviewIssue(String issueKey, String reason) {
        if (!getJiraIssue(issueKey).getStatus().getName().equals(JiraIssueStatus.IN_PROGRESS.getStatusName())) {
            throw getNotImplementedException(issueKey);
        }
        putIssueToCodeReview(issueKey);
    }

    public void resolveIssue(String issueKey, String reason) {
        if (!getJiraIssue(issueKey).getStatus().getName().equals(JiraIssueStatus.IN_REVIEW.getStatusName())) {
            throw getNotImplementedException(issueKey);
        }
        putIssueToResolved(issueKey, reason);
    }

    public void readyForQaIssue(String issueKey) {
        if (!getJiraIssue(issueKey).getStatus().getName().equals(JiraIssueStatus.RESOLVED.getStatusName())) {
            throw getNotImplementedException(issueKey);
        }
        putIssueToReadyForQa(issueKey);
    }

    public void startQaIssue(String issueKey) {
        if (!getJiraIssue(issueKey).getStatus().getName().equals(JiraIssueStatus.READY_FOR_QA.getStatusName())) {
            throw getNotImplementedException(issueKey);
        }
        putIssueToStartQa(issueKey);
    }

    public void closeIssue(String issueKey) {
        String issueName = getJiraIssue(issueKey).getStatus().getName();
        if (!(issueName.equals(JiraIssueStatus.VERIFIED.toString())
                || issueName.equals(JiraIssueStatus.OPEN.toString())
                || issueName.equals(JiraIssueStatus.REOPENED.toString()))
        ) {
            throw getNotImplementedException(issueKey);
        }
        // let's check either this issue is already preprocessed
        putIssueToClose(issueKey);
    }

    public void verifyIssue(String issueKey) {
        if (!getJiraIssue(issueKey).getStatus().getName().equals(JiraIssueStatus.QA_IN_PROGRESS.getStatusName())) {
            throw getNotImplementedException(issueKey);
        }
        putIssueToVerified(issueKey);
    }

    public void watchIssue(String issueKey) {
        makeIssueWatched(issueKey);
    }

    public void unWatchIssue(String issueKey) {
        makeIssueUnwatched(issueKey);
    }

    public void voteIssue(String issueKey) {
        makeIssueVoted(issueKey);
    }

    public void unVoteIssue(String issueKey) {
        makeIssueUnvoted(issueKey);
    }

    public void printIssueList(String jqlQuery, HashSet<String> searchFields) {
        printIssueListByJql(jqlQuery, searchFields);
    }

    private String getIssueUrlLink(String issueId) {
        if (issue == null) {
            issue = getJiraIssue(issueId);
        }
        return STR_JIRA_URL + "browse/" + issue.getKey();
    }

    private Transition getTransitionByName(Iterable<Transition> transitions, String status) {
        return StreamSupport
                .stream(transitions.spliterator(), false)
                .filter(s -> s.getName().equals(status))
                .collect(Collectors.toList())
                .get(0);
    }

    private String getWarningByStatus(Object issueKey) {
        return String.format("\nWARNING: %s issue is already has status - %s!", issueKey,
                issue.getStatus().getDescription());
    }

    private String getErrorMsg(String issueKey) {
        return String.format("\nERROR: %s is not pre-processed yet." +
                "\nPlease, visit %s and update it manually!", issueKey, getIssueUrlLink(issueKey));
    }

    private NotImplementedException getNotImplementedException(String issueKey) {
        return new NotImplementedException(getErrorMsg(issueKey));
    }

    private void putIssueToStartDev(String issueKey) {
        if (getJiraIssue(issueKey).getStatus().getName().equals(JiraIssueStatus.IN_PROGRESS.getStatusName())) {
            log.warn(getWarningByStatus(issueKey));
        } else {
            // now let's Start Dev on this issue
            processTransactionTo(null, JiraFlowActions.START_DEV.getActionName());
        }
    }

    private void putIssueToCodeReview(String issueKey) {
        if (getJiraIssue(issueKey).getStatus().getName().equals(JiraIssueStatus.IN_REVIEW.getStatusName())) {
            log.warn(getWarningByStatus(issueKey));
        } else {
            // process issue to state Code Review
            processTransactionTo(null, JiraFlowActions.CODE_REVIEW.getActionName());
        }
    }

    private void putIssueToResolved(String issueKey, String reason) {
        if (getJiraIssue(issueKey).getStatus().getName().equals(JiraIssueStatus.RESOLVED.getStatusName())) {
            log.warn(getWarningByStatus(issueKey));
        } else {
            // create input data fields for resolve form page
            ImmutableList<FieldInput> fieldInputs = ImmutableList.of(new FieldInput("resolution",
                    ComplexIssueInputFieldValue.with("id", "5")));
            // process issue to state Resolve
            processTransactionTo(fieldInputs, JiraFlowActions.RESOLVE.getActionName());
        }
    }

    private void putIssueToReadyForQa(String issueKey) {
        if (getJiraIssue(issueKey).getStatus().getName().equals(JiraIssueStatus.READY_FOR_QA.getStatusName())) {
            log.warn(getWarningByStatus(issueKey));
        } else {
            // process issue to state Ready for QA
            processTransactionTo(null, JiraFlowActions.READY_FOR_QA.getActionName());
        }
    }

    private void putIssueToStartQa(String issueKey) {
        if (getJiraIssue(issueKey).getStatus().getName().equals(JiraIssueStatus.QA_IN_PROGRESS.toString())) {
            log.warn(getWarningByStatus(issueKey));
        } else {
            // process issue to state QA in Progress
            processTransactionTo(null, JiraFlowActions.START_QA.getActionName());
        }
    }

    private void putIssueToVerified(String issueKey) {
        if (getJiraIssue(issueKey).getStatus().getName().equals(JiraIssueStatus.VERIFIED.toString())) {
            log.warn(getWarningByStatus(issueKey));
        } else {
            // process issue to state Verified
            processTransactionTo(null, JiraFlowActions.VERIFY.getActionName());
        }
    }

    private void putIssueToClose(String issueKey) {
        if (getJiraIssue(issueKey).getStatus().getName().toUpperCase().equals(JiraIssueStatus.CLOSED.toString())) {
            log.warn(getWarningByStatus(issueKey));
        } else {
            if (getJiraIssue(issueKey).getStatus().getName().toUpperCase().equals(JiraIssueStatus.OPEN.toString())
                    ||getJiraIssue(issueKey).getStatus().getName().toUpperCase().equals(JiraIssueStatus.REOPENED.toString())){
                // let's preprocess issue
                processTransactionTo(null, JiraFlowActions.START_DEV.getActionName());
            }
            ImmutableList<FieldInput> fieldInputs = ImmutableList.of(new FieldInput("resolution",
                    ComplexIssueInputFieldValue.with("value", "5")));
            // now let's close issue
            processTransactionTo(fieldInputs, JiraFlowActions.CLOSE.getActionName());
        }
    }

    private void putIssueToReopened(String issueKey) {
        if (getJiraIssue(issueKey).getStatus().getName().toUpperCase().equals(JiraIssueStatus.REOPENED.toString())) {
            log.warn(getWarningByStatus(issueKey));
        } else {
            // now let's reopen issue
            processTransactionTo(null, JiraFlowActions.REOPEN.getActionName());
        }
    }

    private void makeIssueWatched(String issueKey) {
        issue = getJiraIssue(issueKey);
        // now let's watch it
        if (Objects.requireNonNull(issue.getWatchers()).isWatching()) {
            restClient.getIssueClient().watch(issue.getWatchers().getSelf()).claim();
        } else {
            log.warn(String.format("Issue %s is already watched by current user!", issueKey));
        }
    }

    private void makeIssueUnwatched(String issueKey) {
        issue = getJiraIssue(issueKey);
        // now let's watch it
        if (Objects.requireNonNull(issue.getWatchers()).isWatching()) {
            restClient.getIssueClient().unwatch(issue.getWatchers().getSelf()).claim();
        } else {
            log.warn(String.format("Issue %s is already Unwatched by current user!", issueKey));
        }
    }

    private void makeIssueVoted(String issueKey) {
        issue = getJiraIssue(issueKey);
        // now let's vote for it
        if (!Objects.requireNonNull(issue.getVotes()).hasVoted()) {
            restClient.getIssueClient().vote(issue.getVotesUri()).claim();
        } else {
            log.warn(String.format("Issue %s is already voted by current user!", issueKey));
        }
    }

    private void makeIssueUnvoted(String issueKey) {
        issue = getJiraIssue(issueKey);
        // now let's vote for it
        if (Objects.requireNonNull(issue.getVotes()).hasVoted()) {
            restClient.getIssueClient().unvote(issue.getVotesUri()).claim();
        } else {
            log.warn(String.format("Issue %s is already unvoted by current user!", issueKey));
        }
    }

    private void printIssueListByJql(String jqlQuery, HashSet<String> searchFields) {
        SearchRestClient searchRestClient = restClient.getSearchClient();
        Integer startIndex = 1;
        Integer maxPerQuery = 100;
        ArrayList<Issue> issuesList = new ArrayList<>();
        while (true) {
            Promise<SearchResult> searchResult = searchRestClient.searchJql(jqlQuery, maxPerQuery, startIndex,
                    searchFields);
            SearchResult results = searchResult.claim();
            StreamSupport
                    .stream(results.getIssues()
                            .spliterator(), false)
                    .forEach(s -> issuesList.add(s));
            if (startIndex >= results.getTotal()) {
                break;
            }
            startIndex += maxPerQuery;
        }
        issuesList
                .forEach(s -> log.info(String.format("Issue:{ID=%s, Type=%s, Priority=%s, Summary=%s}",
                        s.getKey(), s.getIssueType().getName(), Objects.requireNonNull(s.getPriority()).getName(),
                        s.getSummary())));
    }

    private void processTransactionTo(ImmutableList<FieldInput> fieldInputs, String actionName) {
        TransitionInput transitionInput;
        final Iterable<Transition> transitions =
                restClient.getIssueClient().getTransitions(issue.getTransitionsUri()).claim();
        final Transition currentTransition = getTransitionByName(transitions,
                actionName);
        if (fieldInputs == null) {
            transitionInput = new TransitionInput(
                    currentTransition.getId()
                    , Comment.valueOf(STR_COMMENT_FROM_CODE));
        } else {
            transitionInput = new TransitionInput(
                    currentTransition.getId()
                    //  , fieldInputs
                    , Comment.valueOf(STR_COMMENT_FROM_CODE));
        }
        restClient.getIssueClient().transition(issue.getTransitionsUri(), transitionInput).claim();
    }
}
