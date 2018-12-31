package com.ezlo.automation.framework.backend.web_socket.ezlo.error_enums;

public enum ErrorCodes {
    // Note(s) from web docs : http://192.168.10.128/ui/errors/#errors
    // Name         Code            Note(s)
    TRANSPORT_ERROR(-32300),        // looks like unused
    SYSTEM_ERROR(-32400),        // looks like unused
    APPLICATION_ERROR(-32500),
    INVALID_REQUEST(-32600),
    METHOD_NOT_FOUND(-32601),
    INVALID_PARAMS(-32602),
    INTERNAL_ERROR(-32603),
    PARSE_ERROR(-32700);        // looks like unused

    private Integer code;

    ErrorCodes(Integer code) {
        this.code = code;
    }

    public Integer getErrorCode() {
        return code;
    }
}
