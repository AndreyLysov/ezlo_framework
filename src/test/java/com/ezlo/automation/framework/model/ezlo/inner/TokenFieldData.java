package com.ezlo.automation.framework.model.ezlo.inner;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class TokenFieldData {
    
    @Expose
    private String login;
    @Expose
    private String time;
    @Expose
    private Boolean used;
    @Expose
    private String serial;

    public TokenFieldData withLogin(String login) {
        this.login = login;
        return this;
    }

    public TokenFieldData withTime(String time) {
        this.time = time;
        return this;
    }

    public TokenFieldData withUsed(Boolean used) {
        this.used = used;
        return this;
    }

    public TokenFieldData withSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public String getTime() {
        return time;
    }

    public Boolean getUsed() {
        return used;
    }

    public String getSerial() {
        return serial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TokenFieldData)) return false;
        TokenFieldData that = (TokenFieldData) o;
        return Objects.equals(login, that.login) &&
                Objects.equals(time, that.time) &&
                Objects.equals(used, that.used) &&
                Objects.equals(serial, that.serial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, time, used, serial);
    }

    @Override
    public String toString() {
        return "TokenFieldData{" +
                "login='" + login + '\'' +
                ", time='" + time + '\'' +
                ", used=" + used +
                ", serial='" + serial + '\'' +
                '}';
    }
}
