package com.ezlo.automation.framework.model.ezlo.data;

import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Objects;

@Entity(value = "pushNotifications", noClassnameStored = true)
public class PushNotificationData {

    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    private String email;
    @Expose
    private String serial;
    @Expose
    private String deviceId;
    @Expose
    private Integer method;
    @Expose
    private String instanceId;
    @Expose
    private Boolean allow;

    public PushNotificationData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public PushNotificationData withEmail(String email) {
        this.email = email;
        return this;
    }

    public PushNotificationData withSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public PushNotificationData withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public PushNotificationData withMethod(Integer method) {
        this.method = method;
        return this;
    }

    public PushNotificationData withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public PushNotificationData withAllow(Boolean allow) {
        this.allow = allow;
        return this;
    }

    public ObjectId getId() { return id; }

    public String getEmail() { return email; }

    public String getSerial() { return serial; }

    public String getDeviceId() { return deviceId; }

    public Integer getMethod() { return method; }

    public String getInstanceId() { return instanceId; }

    public Boolean getAllow() { return allow; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PushNotificationData)) return false;
        PushNotificationData that = (PushNotificationData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(email, that.email) &&
                Objects.equals(serial, that.serial) &&
                Objects.equals(deviceId, that.deviceId) &&
                Objects.equals(method, that.method) &&
                Objects.equals(instanceId, that.instanceId) &&
                Objects.equals(allow, that.allow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
                email,
                serial,
                deviceId,
                method,
                instanceId,
                allow);
    }

    @Override
    public String toString() {
        return "PushNotificationData{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", serial=" + serial +
                ", deviceId=" + deviceId +
                ", method=" + method +
                ", instanceId=" + instanceId +
                ", allow=" + allow +
                '}';
    }
}
