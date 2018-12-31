package com.ezlo.automation.framework.model.ezlo.data;

import com.ezlo.automation.framework.model.ezlo.inner.DataField;
import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity(value = "pendingLog", noClassnameStored = true)
public class PandingLogData {

    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    @Embedded
    private Set<DataField> data;
    @Expose
    private Date created;
    @Expose
    private String error;

    public PandingLogData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public PandingLogData withData(Set<DataField> data) {
        this.data = data;
        return this;
    }

    public PandingLogData withCreated(Date created) {
        this.created = created;
        return this;
    }

    public PandingLogData withError(String error) {
        this.error = error;
        return this;
    }

    public ObjectId getId() { return id; }

    public Set<DataField> getData() { return data; }

    public Date getCreated() { return created; }

    public String getError() { return error; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PandingLogData)) return false;
        PandingLogData that = (PandingLogData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(data, that.data) &&
                Objects.equals(created, that.created) &&
                Objects.equals(error, that.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
                data,
                created,
                error);
    }

    @Override
    public String toString() {
        return "PandingLogData{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", created=" + created +
                ", error=" + error +
                '}';
    }
}

