package com.ezlo.automation.framework.model.ezlo.data;

import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Date;
import java.util.Objects;

@Entity(value = "OCS_logTraces", noClassnameStored = true)
public class OCS_LogTraceData {

    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    private String name;
    @Expose
    private String sender;
    @Expose
    private String serial;
    @Expose
    private Date startTime;
    @Expose
    private Integer time;
    @Expose
    private Boolean uploaded;
    @Expose
    private String url;

    public OCS_LogTraceData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public OCS_LogTraceData withName(String name) {
        this.name = name;
        return this;
    }

    public OCS_LogTraceData withSender(String sender) {
        this.sender = sender;
        return this;
    }

    public OCS_LogTraceData withSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public OCS_LogTraceData withStartTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }

    public OCS_LogTraceData withTime(Integer time) {
        this.time = time;
        return this;
    }

    public OCS_LogTraceData withUploaded(Boolean uploaded) {
        this.uploaded = uploaded;
        return this;
    }

    public OCS_LogTraceData withUrl(String url) {
        this.url = url;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSender() {
        return sender;
    }

    public String getSerial() {
        return serial;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Integer getTime() {
        return time;
    }

    public Boolean getUploaded() {
        return uploaded;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OCS_LogTraceData)) return false;
        OCS_LogTraceData that = (OCS_LogTraceData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(sender, that.sender) &&
                Objects.equals(serial, that.serial) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(time, that.time) &&
                Objects.equals(uploaded, that.uploaded) &&
                Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sender, serial, startTime, time, uploaded, url);
    }

    @Override
    public String toString() {
        return "OCS_LogTraceData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sender='" + sender + '\'' +
                ", serial='" + serial + '\'' +
                ", startTime=" + startTime +
                ", time=" + time +
                ", uploaded=" + uploaded +
                ", url='" + url + '\'' +
                '}';
    }
}
