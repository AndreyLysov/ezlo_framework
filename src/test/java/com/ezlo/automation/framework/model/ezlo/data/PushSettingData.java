package com.ezlo.automation.framework.model.ezlo.data;

import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Objects;

@Entity(value = "pushSettings", noClassnameStored = true)
public class PushSettingData {
    
    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    private String email;
    @Expose
    private String serial;
    @Expose
    private Boolean global;
    @Expose
    private Boolean alarms;

    public PushSettingData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public PushSettingData withEmail(String email) {
        this.email = email;
        return this;
    }

    public PushSettingData withSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public PushSettingData withGlobal(Boolean global) {
        this.global = global;
        return this;
    }

    public PushSettingData withAlarms(Boolean alarms) {
        this.alarms = alarms;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getSerial() {
        return serial;
    }

    public Boolean getGlobal() {
        return global;
    }

    public Boolean getAlarms() {
        return alarms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PushSettingData)) return false;
        PushSettingData that = (PushSettingData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(email, that.email) &&
                Objects.equals(serial, that.serial) &&
                Objects.equals(global, that.global) &&
                Objects.equals(alarms, that.alarms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, serial, global, alarms);
    }

    @Override
    public String toString() {
        return "PushSettingData{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", serial='" + serial + '\'' +
                ", global=" + global +
                ", alarms=" + alarms +
                '}';
    }
}
