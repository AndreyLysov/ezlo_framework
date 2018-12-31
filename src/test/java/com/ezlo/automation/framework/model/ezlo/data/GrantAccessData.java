package com.ezlo.automation.framework.model.ezlo.data;

import com.ezlo.automation.framework.model.ezlo.inner.LogData;
import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.List;
import java.util.Objects;

@Entity(value = "grantAccess", noClassnameStored = true)
public class GrantAccessData {

    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    private String accessType;
    @Expose
    private String clientName;
    @Expose
    private String created;
    @Expose
    private String email;
    @Expose
    private String lastToken;
    @Expose
    @Embedded
    private List<LogData> logs;
    @Expose
    private String note;
    @Expose
    private String serial;
    @Expose
    private String status;
    @Expose
    private String updated;

    public GrantAccessData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public GrantAccessData withAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }

    public GrantAccessData withClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    public GrantAccessData withCreated(String created) {
        this.created = created;
        return this;
    }

    public GrantAccessData withEmail(String email) {
        this.email = email;
        return this;
    }

    public GrantAccessData withLastToken(String lastToken) {
        this.lastToken = lastToken;
        return this;
    }

    public GrantAccessData withLogs(List<LogData> logs) {
        this.logs = logs;
        return this;
    }

    public GrantAccessData withNote(String note) {
        this.note = note;
        return this;
    }

    public GrantAccessData withSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public GrantAccessData withStatus(String status) {
        this.status = status;
        return this;
    }

    public GrantAccessData withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public String getAccessType() {
        return accessType;
    }

    public String getClientName() {
        return clientName;
    }

    public String getCreated() {
        return created;
    }

    public String getEmail() {
        return email;
    }

    public String getLastToken() {
        return lastToken;
    }

    public List<LogData> getLogs() {
        return logs;
    }

    public String getNote() {
        return note;
    }

    public String getSerial() {
        return serial;
    }

    public String getStatus() {
        return status;
    }

    public String getUpdated() {
        return updated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GrantAccessData)) return false;
        GrantAccessData that = (GrantAccessData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(accessType, that.accessType) &&
                Objects.equals(clientName, that.clientName) &&
                Objects.equals(created, that.created) &&
                Objects.equals(email, that.email) &&
                Objects.equals(lastToken, that.lastToken) &&
                Objects.equals(logs, that.logs) &&
                Objects.equals(note, that.note) &&
                Objects.equals(serial, that.serial) &&
                Objects.equals(status, that.status) &&
                Objects.equals(updated, that.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
                accessType,
                clientName,
                created,
                email,
                lastToken,
                logs,
                note,
                serial,
                status,
                updated);
    }

    @Override
    public String toString() {
        return "GrantAccessData{" +
                "id=" + id +
                ", accessType='" + accessType + '\'' +
                ", clientName=" + clientName +
                ", created=" + created +
                ", email=" + email +
                ", lastToken=" + lastToken +
                ", logs=" + logs +
                ", note=" + note +
                ", serial=" + serial +
                ", status=" + status +
                ", updated=" + updated +
                '}';
    }
}
