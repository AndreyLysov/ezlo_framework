package com.ezlo.automation.framework.backend.web_socket.ezlo.methods.logout;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class BodyLogoutUserData {

    @Expose
    private String sender;
    @Expose
    private String uiType;
    @Expose
    private String deviceId;

    public BodyLogoutUserData withSender(String sender) {
        this.sender = sender;
        return this;
    }

    public BodyLogoutUserData withUiType(String uiType) {
        this.uiType = uiType;
        return this;
    }

    public BodyLogoutUserData withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public String getSender() {
        return sender;
    }

    public String getUiType() {
        return uiType;
    }

    public String getDeviceId() {
        return deviceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BodyLogoutUserData)) return false;
        BodyLogoutUserData that = (BodyLogoutUserData) o;
        return Objects.equals(sender, that.sender) &&
                Objects.equals(uiType, that.uiType) &&
                Objects.equals(deviceId, that.deviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, uiType, deviceId);
    }

    @Override
    public String toString() {
        return "BodyLogoutUserData{" +
                "sender='" + sender + '\'' +
                ", uiType='" + uiType + '\'' +
                ", deviceId='" + deviceId + '\'' +
                '}';
    }
}
