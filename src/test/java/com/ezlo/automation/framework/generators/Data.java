package com.ezlo.automation.framework.generators;

import com.ezlo.automation.framework.backend.web_socket.ezlo.methods.UiType;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// todo - @OleksiiIsakov - We should discuss either this class need or not.
public class Data {
    private static final List<String> ARR_LST_INVALID_GENERAL = Arrays
            .asList("!@#$%^&*()"
                    , "null"
                    , "1234567890"
                    , "-1"
                    , "<!--#exec cmd=\"ls\" -->"
                    , "<!--#exec cmd=\"cd /root/dir/\">"
                    , "<!--#echo var=\"DATE_LOCAL\" -->"
            );
    private static final String STR_TEST_DATA_VALID_EZLO_LOCATION_JSON = "src/test/resources/validEzloLocation.json";
    private static List<String> invalidEmails = Arrays.asList("email@domain.", "email.@.com", "emaildomain.com.ua",
            "@domain.com", "email@domain.com.", "email@domain.com.ua.", "email@", "@");
    // validHashes should be generated from email and pass
    private static List<String> invalidHashes = ARR_LST_INVALID_GENERAL;
    private static List<String> invalidDeviceIds = ARR_LST_INVALID_GENERAL;
    private static List<String> validUiTypes = Stream
            .of(UiType.WEB, UiType.DESKTOP, UiType.ANDROID, UiType.iOS)
            .map(String::valueOf)
            .collect(Collectors.toList());
    private static List<String> invalidUITypes = ARR_LST_INVALID_GENERAL;
    private static List<String> invalidPushTokens = ARR_LST_INVALID_GENERAL;
    private static List<String> invalidOemVendors = ARR_LST_INVALID_GENERAL;
    private static List<String> invalidLocales = ARR_LST_INVALID_GENERAL;
    private static List<String> validEmails = Collections.singletonList("test.automation@ezlo.com");

    public static List<String> getValidUiType() {
        return validUiTypes;
    }

    public static List<String> getValidEmails() {
        return validEmails;
    }

    public static List<String> getInvalidEmails() {
        return invalidEmails;
    }

    public static List<String> getInvalidHashes() {
        return invalidHashes;
    }

    public static List<String> getInvalidDeviceIds() {
        return invalidDeviceIds;
    }

    public static List<String> getInvalidUiType() {
        return invalidUITypes;
    }

    public static List<String> getInvalidPushTokens() {
        return invalidPushTokens;
    }

    public static List<String> getInvalidOemVendor() {
        return invalidOemVendors;
    }

    public static List<String> getInvalidLocale() {
        return invalidLocales;
    }
}
