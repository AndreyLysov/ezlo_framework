package com.ezlo.automation.framework.model.ezlo.data;

import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.List;
import java.util.Objects;

@Entity(value = "ezloOrder", noClassnameStored = true)
public class EzloOrderData {
    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    private String user;
    @Expose
    private List<String> serials;

    public EzloOrderData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public EzloOrderData withUser(String user) {
        this.user = user;
        return this;
    }

    public EzloOrderData withSerials(List<String> serials) {
        this.serials = serials;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public List<String> getSerials() {
        return serials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EzloOrderData)) return false;
        EzloOrderData that = (EzloOrderData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(user, that.user) &&
                Objects.equals(serials, that.serials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, serials);
    }

    @Override
    public String toString() {
        return "EzloOrderData{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", serials=" + serials +
                '}';
    }
}
