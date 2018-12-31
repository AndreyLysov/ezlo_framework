package com.ezlo.automation.framework.backend.web_socket.ezlo.error_enums;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum InternalErrors {

    BAD_USER_DATA("nma.user.baddata", "Bad user data"),
    TOKEN_CREATION_ERROR("nma.token.internal", "Token creation error"),
    KEY_GENERATION_ERROR("nma.key.internal", "Key generation error"),
    COMPRESS_ERROR("ezlo.backup.internal.compress", "Compress error"),
    DATA_SAVE_ERROR("ezlo.securechip.internal", "Data save error"),
    MAIL_SENDING_ERROR("mail.sending.error", "Mail sedning error"),
    INTERNAL_OPERATION_ERROR("internal.operation.error", "Internal operation error"),
    INTERNAL_UNHANDLED_EXCEPTION_ERROR("internal.unhandled.error", "Internal unhandled error"),
    LENGTHY_ASYNC_OPERATION_ERROR("lengthy.async.operation.error", "Lengthy async operation error"),
    UNCANCELANBLE_OPERATION_IS_IN_PROGRESS("cannot.cancel.important.operation", "Cannot cancel important operation");

    private static final Map<String, String> mMap = Collections.unmodifiableMap(initializeMapping());
    private final String errorData;
    private final String errorMsg;

    InternalErrors(String errorData, String errorMsg) {
        this.errorData = errorData;
        this.errorMsg = errorMsg;
    }

    public static String getMsgByCode(String errorCode) {
        if (mMap.containsKey(errorCode)) {
            return mMap.get(errorCode);
        }
        return null;
    }

    private static Map<String, String> initializeMapping() {
        Map<String, String> mMap = new HashMap<String, String>();
        for (InternalErrors s : InternalErrors.values()) {
            mMap.put(s.errorData, s.errorMsg);
        }
        return mMap;
    }

    public String getErrorData() {
        return errorData;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
