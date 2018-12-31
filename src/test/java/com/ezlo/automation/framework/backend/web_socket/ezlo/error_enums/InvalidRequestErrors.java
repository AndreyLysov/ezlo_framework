package com.ezlo.automation.framework.backend.web_socket.ezlo.error_enums;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum InvalidRequestErrors {

    BAD_REQUEST_HASH_NOT_EXISTS("rpc.params.notfound.hash", "Bad request, hash not exists"),
    BAD_PARAMS("rpc.params.notfound", "Bad params"),
    UNEXPECTED_REQUEST("rpc.method.unexpected", "Unexpected request");

    private static final Map<String, String> mMap = Collections.unmodifiableMap(initializeMapping());
    private final String errorCode;
    private final String errorMsg;

    InvalidRequestErrors(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    private static Map<String, String> initializeMapping() {
        Map<String, String> mMap = new HashMap<String, String>();
        for (InvalidRequestErrors s : InvalidRequestErrors.values()) {
            mMap.put(s.errorCode, s.errorMsg);
        }
        return mMap;
    }

    public String getErrorData() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
