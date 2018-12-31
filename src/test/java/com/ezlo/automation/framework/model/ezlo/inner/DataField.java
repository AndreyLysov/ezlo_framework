package com.ezlo.automation.framework.model.ezlo.inner;

import com.google.gson.annotations.Expose;
import org.mongodb.morphia.annotations.Property;

import java.util.Objects;

public class DataField {

    @Expose
    @Property("device_id")
    private String deviceId;
    @Expose
    private String method;
    @Expose
    private String serial;
    @Expose
    private Integer sid;
    @Expose
    private String type;
    @Expose
    private Boolean value;

    public DataField withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public DataField withMethod(String method) {
        this.method = method;
        return this;
    }

    public DataField withSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public DataField withSid(Integer sid) {
        this.sid = sid;
        return this;
    }

    public DataField withLogoutDate(String type) {
        this.type = type;
        return this;
    }

    public DataField withValue(Boolean value) {
        this.value = value;
        return this;
    }

    public String getDeviceId() { return deviceId; }

    public String getMethod() { return method; }

    public String getSerial() { return serial; }

    public Integer getSid() { return sid; }

    public String getType() { return type; }

    public Boolean getValue() { return value; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DataField)) return false;
        DataField that = (DataField) o;
        return Objects.equals(deviceId, that.deviceId) &&
                Objects.equals(method, that.method) &&
                Objects.equals(serial, that.serial) &&
                Objects.equals(sid, that.sid) &&
                Objects.equals(type, that.type) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, method, serial, sid, type, value);
    }

    @Override
    public String toString() {
        return "DataField{" +
                "deviceId='" + deviceId + '\'' +
                ", method='" + method + '\'' +
                ", serial='" + serial + '\'' +
                ", sid='" + sid + '\'' +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}