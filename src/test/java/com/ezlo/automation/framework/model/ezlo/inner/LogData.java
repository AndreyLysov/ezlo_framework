package com.ezlo.automation.framework.model.ezlo.inner;

import com.google.gson.annotations.Expose;
import java.util.Objects;

public class LogData {

    @Expose
    private String ip;
    @Expose
    private String loginDate;
    @Expose
    private String connId;
    @Expose
    private String logoutDate;

    public LogData withIp(String ip) {
        this.ip = ip;
        return this;
    }
    public LogData withLoginDate(String loginDate) {
        this.loginDate = loginDate;
        return this;
    }
    public LogData withConnId(String connId) {
        this.connId = connId;
        return this;
    }
    public LogData withLogoutDate(String logoutDate) {
        this.logoutDate = logoutDate;
        return this;
    }

    public String getIp() { return ip; }

    public String getLoginDate() { return loginDate; }

    public String getConnId() { return connId; }

    public String getLogoutDate() { return logoutDate; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogData)) return false;
        LogData that = (LogData) o;
        return Objects.equals(ip, that.ip) &&
                Objects.equals(loginDate, that.loginDate) &&
                Objects.equals(connId, that.connId) &&
                Objects.equals(logoutDate, that.logoutDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, loginDate, connId, logoutDate);
    }

    @Override
    public String toString() {
        return "LogData{" +
                "ip='" + ip + '\'' +
                ", loginDate='" + loginDate + '\'' +
                ", connId='" + connId + '\'' +
                ", logoutDate='" + logoutDate + '\'' +
                '}';
    }
}