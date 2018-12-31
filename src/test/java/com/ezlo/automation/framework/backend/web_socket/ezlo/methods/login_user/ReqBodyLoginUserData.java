package com.ezlo.automation.framework.backend.web_socket.ezlo.methods.login_user;

import com.ezlo.automation.framework.backend.web_socket.ezlo.methods.UiType;
import com.google.gson.annotations.Expose;

import java.util.Objects;

import static java.lang.String.format;

//todo - @andrey.lysov - need to rename this class to BodyLoginUserData when changes will be merged into default branch
public class ReqBodyLoginUserData {
    @Expose
    private String email; // Mandatory
    @Expose
    private String hash;  // Mandatory, MD5 hash function of email and pass
    @Expose
    private String locale; // pair like en_US uk_UA ru_UA
    @Expose
    private String uiType;  // Web Android iOS Desktop // TODO - @OleksiiIsakov: Add entities to MongoDB table
    // Mob uiType only
    @Expose
    private String deviceId;    // TODO - @OleksiiIsakov: Add entities to MongoDB table
    @Expose
    private String pushToken;   // TODO - @OleksiiIsakov: Generate in runtime according to the session
    @Expose
    private String oemVendor;

    private void fillMobFields() {
        // TODO - @OleksiiIsakov: add relations from mob user and uiType for all fields
        Object withOut = "forDEBUG_";
        this.deviceId = format("%sdeviceId", withOut);
        this.pushToken = format("%spushToken", withOut);
        this.oemVendor = format("%soemVendor", withOut);
    }

    public String getEmail() {
        return email;
    }

    public String getHash() {
        return hash;
    }

    public String getUiType() {
        return uiType;
    }

    public String getLocale() {
        return locale;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getPushToken() {
        return pushToken;
    }

    public String getOemVendor() {
        return oemVendor;
    }

    public ReqBodyLoginUserData withEmail(String email) {
        this.email = email;
        return this;
    }

    public ReqBodyLoginUserData withHash(String hash) {
        this.hash = hash;
        return this;
    }

    public ReqBodyLoginUserData withUiType(UiType uiType){
        return withUiType(uiType.getUiType());
    }

    public ReqBodyLoginUserData withUiType(String uiType) {
        this.uiType = uiType;
        if (uiType.equals(UiType.ANDROID.getUiType()) || uiType.equals(UiType.iOS.getUiType())) {
            fillMobFields();
        }
        return this;
    }

    public ReqBodyLoginUserData withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    public ReqBodyLoginUserData withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public ReqBodyLoginUserData withPushToken(String pushToken) {
        this.pushToken = pushToken;
        return this;
    }

    public ReqBodyLoginUserData withOemVendor(String oemVendor) {
        this.oemVendor = oemVendor;
        return this;
    }

    @Override
    public String toString() {
        return "ReqBodyLoginUserData{" +
                ", email='" + email + '\'' +
                ", hash='" + hash + '\'' +
                ", locale='" + locale + '\'' +
                ", uiType='" + uiType + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", pushToken='" + pushToken + '\'' +
                ", oemVendor='" + oemVendor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof ReqBodyLoginUserData))
            return false;
        ReqBodyLoginUserData that = (ReqBodyLoginUserData) o;
        return Objects.equals(email, that.email) &&
                Objects.equals(hash, that.hash) &&
                Objects.equals(locale, that.locale) &&
                Objects.equals(uiType, that.uiType) &&
                Objects.equals(deviceId, that.deviceId) &&
                Objects.equals(pushToken, that.pushToken) &&
                Objects.equals(oemVendor, that.oemVendor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, hash, locale, uiType, deviceId, pushToken, oemVendor);
    }

    public ReqBodyLoginUserData withMobFields() {
        fillMobFields();
        return this;
    }
}
