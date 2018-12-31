package com.ezlo.automation.framework.common_baby.rest_api;

public enum ResponseCodes {

    CONTINUE(100),
    SWITCH_PROTOCOL(101),
    PROCESSING(102),
    OK(200),
    CREATED(201),
    ACCEPTED(202),
    NON_AUTH_INFO(203),
    NO_CONTENT(204),
    MULTIPLE_CHOICES(300),
    MOVED_PERMANENTLY(302),
    BAD_REQUEST(400),
    UNAUTHORIZED(401),
    PAYMENY_REQUIRED(402),
    FORBIDDEN(403),
    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(500),
    NOT_IMPLEMENTED(501),
    BAD_GATEWAY(502),
    SERVICE_UNAVAILABLE(503),
    GATEWAY_TIMEOUT(504);

    private Integer code;

    ResponseCodes(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
