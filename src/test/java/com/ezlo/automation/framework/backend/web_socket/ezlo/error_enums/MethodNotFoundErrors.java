package com.ezlo.automation.framework.backend.web_socket.ezlo.error_enums;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum MethodNotFoundErrors {

    UNKNOWN_METHOD("rpc.method.notfound", "Unknown method");

    private static final Map<String, String> mMap = Collections.unmodifiableMap(initializeMapping());
    private final String errorCode;
    private final String errorMsg;

    MethodNotFoundErrors(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    private static Map<String, String> initializeMapping() {
        Map<String, String> mMap = new HashMap<String, String>();
        for (MethodNotFoundErrors s : MethodNotFoundErrors.values()) {
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
