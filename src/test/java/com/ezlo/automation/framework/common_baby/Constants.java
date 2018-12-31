package com.ezlo.automation.framework.common_baby;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Constants {
    static final String STR_APPIUM_STARTED_ON_SUCCESS_MSG =
            "Appium REST http interface listener started on";
    static final String STR_APPIUM_SERVER_IP = "127.0.0.1";
    public static final String STR_SELENIUM_SERVER_IP = "192.168.11.134";
    public static final String STR_SELENIUM_SERVER_PORT = "4444";
    static final  String STR_APPIUM_SERVER_LOG_PATH = "logs/appium/server.log";
    public static final long INT_WEB_TIMEOUT = 10;
    public static final long INT_MOB_TIMEOUT = 15;
    public static final String STR_EMAIL_TEST_AUTOMATION = "test.automation@ezlo.com";
    public static final String STR_PASS_TEST_AUTOMATION = "eZLO2018!";
    public static final String STR_DEFAULT_PHONE_OPERATOR_CODE = "+38066";
    public static final String STR_OCS_SYSTEM_ADMIN_EMAIL = "admin@de.de";
    public static final String STR_SHA1_KEY = "oZ7QE6LcLJp6fiWzdqZc";
    public static final String STR_MMS_DEBUG_KEY = "1542029290379-1282dd74aee34779bdb015776230fb2c";
    public static final String STR_VERA_LOGIN_USERNAME = "qatest017";
    public static final String STR_VERA_LOGIN_PASSWORD = "Default123!";
    private static Properties properties = new Properties();

    public static Properties getProperties() {
        if (properties.isEmpty()) {
            try {
                properties
                        .load(
                                new FileReader(
                                        new File(
                                                System.getProperty("appProps")
                                        )));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;
    }
}