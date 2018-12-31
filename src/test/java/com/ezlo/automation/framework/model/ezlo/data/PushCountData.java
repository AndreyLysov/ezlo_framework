package com.ezlo.automation.framework.model.ezlo.data;

import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Objects;

@Entity(value = "pushCount", noClassnameStored = true)
public class PushCountData {

    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    private String email;
    @Expose
    private String type;
    @Expose
    private Integer count;

    public PushCountData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public PushCountData withEmail(String email) {
        this.email = email;
        return this;
    }

    public PushCountData withType(String type) {
        this.type = type;
        return this;
    }

    public PushCountData withCount(Integer count) {
        this.count = count;
        return this;
    }

    public ObjectId getId() { return id; }

    public String getEmail() { return email; }

    public String getType() { return type; }

    public Integer getCount() { return count; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PushCountData)) return false;
        PushCountData that = (PushCountData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(email, that.email) &&
                Objects.equals(type, that.type) &&
                Objects.equals(count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
                email,
                type,
                count);
    }

    @Override
    public String toString() {
        return "PushCountData{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", type=" + type +
                ", count=" + count +
                '}';
    }
}
