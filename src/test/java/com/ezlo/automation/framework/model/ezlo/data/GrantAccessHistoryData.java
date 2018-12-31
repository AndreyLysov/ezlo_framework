package com.ezlo.automation.framework.model.ezlo.data;

import com.ezlo.automation.framework.model.ezlo.inner.LogData;
import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Date;
import java.util.List;
import java.util.Objects;


@Entity(value = "grantAccessHistory", noClassnameStored = true)
public class GrantAccessHistoryData {

    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    private String accessType;
    @Expose
    private String clientName;
    @Expose
    private Date created;
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
    private Date updated;
    @Expose
    private String grantAccessId;

    public GrantAccessHistoryData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public GrantAccessHistoryData withAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }

    public GrantAccessHistoryData withClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    public GrantAccessHistoryData withCreated(Date created) {
        this.created = created;
        return this;
    }

    public GrantAccessHistoryData withEmail(String email) {
        this.email = email;
        return this;
    }

    public GrantAccessHistoryData withLastToken(String lastToken) {
        this.lastToken = lastToken;
        return this;
    }

    public GrantAccessHistoryData withLogs(List<LogData> logs) {
        this.logs = logs;
        return this;
    }

    public GrantAccessHistoryData withNote(String note) {
        this.note = note;
        return this;
    }

    public GrantAccessHistoryData withSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public GrantAccessHistoryData withStatus(String status) {
        this.status = status;
        return this;
    }

    public GrantAccessHistoryData withUpdated(Date updated) {
        this.updated = updated;
        return this;
    }

    public GrantAccessHistoryData withGrantAccessId(String grantAccessId) {
        this.grantAccessId = grantAccessId;
        return this;
    }

    public ObjectId getId() { return id; }

    public String getAccessType() { return accessType; }

    public String getClientName() { return clientName; }

    public Date getCreated() { return created; }

    public String getEmail() { return email; }

    public String getLastToken() { return lastToken; }

    public List<LogData> getLogs() { return logs; }

    public String getNote() { return note; }

    public String getSerial() { return serial; }

    public String getStatus() { return status; }

    public Date getUpdated() { return updated; }

    public String getGrantAccessId() { return grantAccessId; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GrantAccessHistoryData)) return false;
        GrantAccessHistoryData that = (GrantAccessHistoryData) o;
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
                Objects.equals(updated, that.updated) &&
                Objects.equals(grantAccessId, that.grantAccessId);
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
                updated,
                grantAccessId);
    }

    @Override
    public String toString() {
        return "GrantAccessHistoryData{" +
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
                ", grantAccessId=" + grantAccessId +
                '}';
    }
}
