package com.ezlo.automation.framework.backend.web_socket.ezlo.methods;

public enum UiType {
    DESKTOP("Desktop"),
    WEB("Web"),
    iOS("iOS"),
    ANDROID("Android");

    private String uiType;

    UiType(String uiType) {
        this.uiType = uiType;
    }

    public String getUiType() {
        return uiType;
    }
}
