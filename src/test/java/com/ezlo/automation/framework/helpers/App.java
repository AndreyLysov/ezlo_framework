package com.ezlo.automation.framework.helpers;

import com.ezlo.automation.framework.common_baby.issue_tracker.JiraUtil;
import com.ezlo.automation.framework.helpers.mob.SelectHubHelper;
import com.ezlo.automation.framework.helpers.mob.SignInHelper;
import com.ezlo.automation.framework.helpers.ocs.*;

public class App {
    private BaseHelper base;
    private JiraUtil jiraUtil;
    private SQLDBHelper sql;
    private NoSQLDBHelper nosql;
    private OCSMainHelper ocsMain;
    private OCSCustomerHelper ocsCustomer;
    private OCSSignUpHelper ocsSignUp;
    private OCSForgotPasswordHelper ocsForgotPassword;
    private OCSSignInHelper ocsSignIn;
    private SignInHelper signIn;
    private SelectHubHelper selectHub;
    private WebSocketHelper webSocket;
    private RestHelper restHelper;

    public SelectHubHelper selectHub() {
        if (selectHub == null) {
            selectHub = new SelectHubHelper();
        }
        return selectHub;
    }

    public JiraUtil jiraUtil() {
        if (jiraUtil == null) {
            jiraUtil = new JiraUtil();
        }
        return jiraUtil;
    }

    public OCSSignInHelper ocsSignIn() {
        return ocsSignIn == null ? ocsSignIn = new OCSSignInHelper() : ocsSignIn;
    }

    public OCSSignUpHelper ocsSignUp() {
        return ocsSignUp == null ? ocsSignUp = new OCSSignUpHelper() : ocsSignUp;
    }

    public OCSForgotPasswordHelper ocsForgotPassword() {
        return ocsForgotPassword == null ? ocsForgotPassword = new OCSForgotPasswordHelper() : ocsForgotPassword;
    }

    public BaseHelper base() {
        return base == null ? base = new BaseHelper() : base;
    }

    public OCSMainHelper ocsMain() {
        return ocsMain == null ? ocsMain = new OCSMainHelper() : ocsMain;
    }

    public OCSCustomerHelper ocsCustomer() {
        return ocsCustomer == null ? ocsCustomer = new OCSCustomerHelper() : ocsCustomer;
    }

    public SignInHelper signIn() {
        return signIn == null ? signIn = new SignInHelper() : signIn;
    }

    public SQLDBHelper sql() {
        return sql == null ? sql = new SQLDBHelper() : sql;
    }

    public NoSQLDBHelper nosql() {
        return nosql == null ? nosql = new NoSQLDBHelper() : nosql;
    }

    public WebSocketHelper webSocket() {
        return (webSocket == null || webSocket.isClosed()) ? webSocket = new WebSocketHelper() : webSocket;
    }

    public RestHelper rest() {
        return restHelper == null ? restHelper = new RestHelper() : restHelper;
    }
}