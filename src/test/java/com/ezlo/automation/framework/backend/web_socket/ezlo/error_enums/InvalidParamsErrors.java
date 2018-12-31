package com.ezlo.automation.framework.backend.web_socket.ezlo.error_enums;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum InvalidParamsErrors {
    SERIAL_TOO_SHORT("rpc.params.tooshort.serial", "Serial too short"),
    PASSWORD_IS_TOO_SHORT("rpc.params.tooshort.password", "Password is too short"),
    KEY_IS_EMPTY("rpc.params.empty.key", "Key is empty"),
    TOKEN_EMPTY("rpc.params.empty.token", "Token empty"),
    HASH_IS_EMPTY("rpc.params.empty.hash", "Hash is empty"),
    ID_IS_EMPTY("rpc.params.empty.id", "id is empty"),
    PARENT_ID_IS_EMPTY("rpc.params.empty.parent_id", "parent_id is empty"),
    MESSAGE_HAS_EMPTY_METHOD("rpc.params.empty.method", "Message has empty method"),
    WRONG_UNIT_AVAILABLE_UNITS("rpc.params.unknown.temperatureUnits", "Wrong unit, available units: F or C"),
    UNKNOWN_CONDITION_FILTER("rpc.params.unknown.condition_filter", "Unknown condition filter"),
    WRONG_PARAMS("rpc.params.invalid", "Wrong params"),
    EMPTY_FIELD("rpc.params.empty", "Empty field");

    private static final Map<String, String> mMap = Collections.unmodifiableMap(initializeMapping());
    private final String errorCode;
    private final String errorMsg;

    InvalidParamsErrors(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    private static Map<String, String> initializeMapping() {
        Map<String, String> mMap = new HashMap<String, String>();
        for (InvalidParamsErrors s : InvalidParamsErrors.values()) {
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
