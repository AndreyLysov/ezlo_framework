package com.ezlo.automation.framework.backend.rest.mios.methods.login;

import java.util.Objects;

public class LoginUserResponse {
    private int code;
    private LoginUserData loginUserData;

    public int getCode() {
        return code;
    }

    public LoginUserData getLoginUserData() {
        return loginUserData;
    }

    public LoginUserResponse withCode(int code) {
        this.code = code;
        return this;
    }

    public LoginUserResponse withLoginUserData(LoginUserData loginUserData) {
        this.loginUserData = loginUserData;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginUserResponse that = (LoginUserResponse) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(loginUserData, that.loginUserData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, loginUserData);
    }
}
