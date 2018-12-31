package com.ezlo.automation.framework.model.ezlo.inner;

import com.google.gson.annotations.Expose;
import java.util.Objects;

public class HistoryData {

    @Expose
    private String authorization;
    @Expose
    private String time;

    public HistoryData withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public HistoryData withTime(String time) {
        this.time = time;
        return this;
    }

    public String getAuthorization() { return authorization; }

    public String getTime() { return time; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HistoryData)) return false;
        HistoryData that = (HistoryData) o;
        return Objects.equals(authorization, that.authorization) &&
                Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization, time);
    }

    @Override
    public String toString() {
        return "ArgData{" +
                "authorization='" + authorization + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}