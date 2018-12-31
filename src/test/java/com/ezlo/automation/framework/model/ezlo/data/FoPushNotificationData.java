package com.ezlo.automation.framework.model.ezlo.data;

import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Objects;

@Entity(value = "foPushNotifications", noClassnameStored = true)
public class FoPushNotificationData {
    
    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    private String email;
    @Expose
    private String itemId;
    @Expose
    private String serial;
    @Expose
    private Boolean allow;

    public FoPushNotificationData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public FoPushNotificationData withEmail(String email) {
        this.email = email;
        return this;
    }

    public FoPushNotificationData withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    public FoPushNotificationData withSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public FoPushNotificationData withAllow(Boolean allow) {
        this.allow = allow;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getItemId() {
        return itemId;
    }

    public String getSerial() {
        return serial;
    }

    public Boolean getAllow() {
        return allow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FoPushNotificationData)) return false;
        FoPushNotificationData that = (FoPushNotificationData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(email, that.email) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(serial, that.serial) &&
                Objects.equals(allow, that.allow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, itemId, serial, allow);
    }

    @Override
    public String toString() {
        return "FoPushNotificationData{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", itemId='" + itemId + '\'' +
                ", serial='" + serial + '\'' +
                ", allow=" + allow +
                '}';
    }
}
