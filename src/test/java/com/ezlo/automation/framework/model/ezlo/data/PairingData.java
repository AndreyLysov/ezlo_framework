package com.ezlo.automation.framework.model.ezlo.data;

import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Objects;

@Entity(value = "pairing", noClassnameStored = true)
public class PairingData {

    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    private String clientName;
    @Expose
    private String created;
    @Expose
    private String deviceId;
    @Expose
    private String email;
    @Expose
    private String serial;
    @Expose
    private String status;
    @Expose
    private String updated;

    public PairingData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public PairingData withClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    public PairingData withCreated(String created) {
        this.created = created;
        return this;
    }

    public PairingData withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public PairingData withEmail(String email) {
        this.email = email;
        return this;
    }

    public PairingData withSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public PairingData withStatus(String status) {
        this.status = status;
        return this;
    }

    public PairingData withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    public ObjectId getId() { return id; }

    public String getClientName() { return clientName; }

    public String getCreated() { return created; }

    public String getDeviceId() { return deviceId; }

    public String getEmail() { return email; }

    public String getSerial() { return serial; }

    public String getStatus() { return status; }

    public String getUpdated() { return updated; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PairingData)) return false;
        PairingData that = (PairingData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(clientName, that.clientName) &&
                Objects.equals(created, that.created) &&
                Objects.equals(deviceId, that.deviceId) &&
                Objects.equals(email, that.email) &&
                Objects.equals(serial, that.serial) &&
                Objects.equals(status, that.status) &&
                Objects.equals(updated, that.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
                clientName,
                created,
                deviceId,
                email,
                serial,
                status,
                updated);
    }

    @Override
    public String toString() {
        return "PairingData{" +
                "id=" + id +
                ", clientName='" + clientName + '\'' +
                ", created=" + created +
                ", deviceId=" + deviceId +
                ", email=" + email +
                ", serial=" + serial +
                ", status=" + status +
                ", updated=" + updated +
                '}';
    }
}