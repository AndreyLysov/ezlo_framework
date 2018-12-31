package com.ezlo.automation.framework.backend.web_socket.ezlo.methods.login_user;

import com.ezlo.automation.framework.backend.web_socket.ezlo.ErrorData;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class ValidResponseLoginUserData {

    @Expose
    private ErrorData error;
    @Expose
    private String id;
    @Expose
    @SerializedName("result")
    private LoginUserResultData resultLoginUser;

    public LoginUserResultData getResult() {
        return resultLoginUser;
    }

    public String getId() {
        return id;
    }

    public ValidResponseLoginUserData withResult(LoginUserResultData loginUser) {
        this.resultLoginUser = loginUser;
        return this;
    }

    public ValidResponseLoginUserData withId(String id) {
        this.id = id;
        return this;
    }

    public ValidResponseLoginUserData withError(ErrorData error) {
        this.error = error;
        return this;
    }

    @Override
    public String toString() {
        return "ValidRespLoginUserData{" +
                ", error=" + error +
                ", id='" + id + '\'' +
                "resultLoginUser=" + resultLoginUser +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof ValidResponseLoginUserData))
            return false;
        ValidResponseLoginUserData that = (ValidResponseLoginUserData) o;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultLoginUser);
    }
}