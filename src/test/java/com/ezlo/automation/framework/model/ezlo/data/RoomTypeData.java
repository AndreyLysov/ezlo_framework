package com.ezlo.automation.framework.model.ezlo.data;

import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Objects;

@Entity(value = "roomTypes", noClassnameStored = true)
public class RoomTypeData {
    
    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    private String typeName;
    @Expose
    private String imageId;

    public RoomTypeData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public RoomTypeData withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    public RoomTypeData withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public String getTypeName() {
        return typeName;
    }

    public String getImageId() {
        return imageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoomTypeData)) return false;
        RoomTypeData that = (RoomTypeData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(typeName, that.typeName) &&
                Objects.equals(imageId, that.imageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typeName, imageId);
    }

    @Override
    public String toString() {
        return "RoomTypeData{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", imageId='" + imageId + '\'' +
                '}';
    }
}
