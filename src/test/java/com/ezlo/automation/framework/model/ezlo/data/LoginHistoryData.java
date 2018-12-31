package com.ezlo.automation.framework.model.ezlo.data;

import com.ezlo.automation.framework.model.ezlo.inner.HistoryData;
import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.List;
import java.util.Objects;

@Entity(value = "loginHistory", noClassnameStored = true)
public class LoginHistoryData {

    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    private String name;
    @Expose
    private String user;
    @Expose
    @Embedded
    private List<HistoryData> history;

    public LoginHistoryData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public LoginHistoryData withName(String name) {
        this.name = name;
        return this;
    }

    public LoginHistoryData withUser(String user) {
        this.user = user;
        return this;
    }

    public LoginHistoryData withHistory(List<HistoryData> history) {
        this.history = history;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUser() {
        return user;
    }

    public List<HistoryData> getHistory() {
        return history;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoginHistoryData)) return false;
        LoginHistoryData that = (LoginHistoryData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(user, that.user) &&
                Objects.equals(history, that.history);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
                name,
                user,
                history);
    }

    @Override
    public String toString() {
        return "LoginHistoryData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user=" + user +
                ", history=" + history +
                '}';
    }
}
