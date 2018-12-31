package com.ezlo.automation.framework.backend.web_socket.ezlo.methods.logout;

import com.ezlo.automation.framework.backend.web_socket.ezlo.methods.login_user.ReqBodyLoginUserData;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class RequestLogoutUserData implements Cloneable {

    @Expose
    private String method;
    @Expose
    private String id;
    @Expose
    @SerializedName("params")
    private BodyLogoutUserData paramsLogoutUser;

    public RequestLogoutUserData withParamsLogoutUser(BodyLogoutUserData paramsLogoutUser) {
        this.paramsLogoutUser = paramsLogoutUser;
        return this;
    }

    public RequestLogoutUserData withParamsLogoutUserFromLoginUser(ReqBodyLoginUserData loginUserData) {
        this.paramsLogoutUser = new BodyLogoutUserData()
                .withDeviceId(loginUserData.getDeviceId())
                .withSender(loginUserData.getEmail())
                .withUiType(loginUserData.getUiType());
        return this;
    }

    public RequestLogoutUserData withMethod(String method) {
        this.method = method;
        return this;
    }

    public RequestLogoutUserData withId(String id) {
        this.id = id;
        return this;
    }

    public BodyLogoutUserData getParamsLogoutUser() {
        return paramsLogoutUser;
    }

    public String getMethod() {
        return method;
    }

    public String getId() {
        return id;
    }

    @Override
    public RequestLogoutUserData clone() {
        try {
            return (RequestLogoutUserData) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RequestLogoutUserData)) return false;
        RequestLogoutUserData that = (RequestLogoutUserData) o;
        return Objects.equals(paramsLogoutUser, that.paramsLogoutUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramsLogoutUser);
    }

    @Override
    public String toString() {
        return "RequesLogoutUserData{" +
                "paramsLogoutUser=" + paramsLogoutUser +
                ", method='" + method + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
