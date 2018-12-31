package com.ezlo.automation.framework.model.ezlo.data;

import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Objects;

@Entity(value = "replicationSettings", noClassnameStored = true)
public class ReplicationSettingData {
    
    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    private String serial;
    @Expose
    private Boolean replicationStarted;

    public ReplicationSettingData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public ReplicationSettingData withSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public ReplicationSettingData withReplicationStarted(Boolean replicationStarted) {
        this.replicationStarted = replicationStarted;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public String getSerial() {
        return serial;
    }

    public Boolean getReplicationStarted() {
        return replicationStarted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReplicationSettingData)) return false;
        ReplicationSettingData that = (ReplicationSettingData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(serial, that.serial) &&
                Objects.equals(replicationStarted, that.replicationStarted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serial, replicationStarted);
    }

    @Override
    public String toString() {
        return "ReplicationSettingData{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                ", replicationStarted=" + replicationStarted +
                '}';
    }
}
