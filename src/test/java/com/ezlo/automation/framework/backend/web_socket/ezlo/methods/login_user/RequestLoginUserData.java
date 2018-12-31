package com.ezlo.automation.framework.backend.web_socket.ezlo.methods.login_user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class RequestLoginUserData implements Cloneable {

    @Expose
    private String method;
    @Expose
    private String id;
    @Expose
    @SerializedName("params")
    private ReqBodyLoginUserData paramsLoginUser;

    public ReqBodyLoginUserData getParams() {
        return paramsLoginUser;
    }

    public RequestLoginUserData withLoginUserData(ReqBodyLoginUserData loginUser) {
        this.paramsLoginUser = loginUser;
        return this;
    }

    public RequestLoginUserData withId(String id) {
        this.id = id;
        return this;
    }

    public RequestLoginUserData withMethod(String method) {
        this.method = method;
        return this;
    }

    public String getId() {
        return id;
    }

    public String getMethod() {
        return method;
    }

    @Override
    public RequestLoginUserData clone() {
        try {
            return (RequestLoginUserData) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "RequestLoginUserData{" +
                "paramsLoginUser=" + paramsLoginUser +
                ", method='" + method + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RequestLoginUserData)) return false;
        RequestLoginUserData that = (RequestLoginUserData) o;
        return Objects.equals(method, that.method) &&
                Objects.equals(id, that.id) &&
                Objects.equals(paramsLoginUser, that.paramsLoginUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, id, paramsLoginUser);
    }
}