package com.ezlo.automation.framework.model.ezlo.inner;

import org.mongodb.morphia.annotations.Embedded;

import java.util.List;
import java.util.Objects;

public class NmaData {

    private String description;
    private String imageId;
    private String owner;
    @Embedded
    private PropertyData property;
    @Embedded
    private List<UserData> users;
    private String serial;
    private Integer version;

    public NmaData withDescription(String description) {
        this.description = description;
        return this;
    }

    public NmaData withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public NmaData withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public NmaData withProperty(PropertyData property) {
        this.property = property;
        return this;
    }

    public NmaData withUsers(List<UserData> users) {
        this.users = users;
        return this;
    }

    public NmaData withSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public NmaData withVersion(Integer version) {
        this.version = version;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public String getImageId() {
        return imageId;
    }

    public String getOwner() {
        return owner;
    }

    public PropertyData getProperty() {
        return property;
    }

    public List<UserData> getUsers() {
        return users;
    }

    public String getSerial() {
        return serial;
    }

    public Integer getVersion() {
        return version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NmaData)) return false;
        NmaData nmaData = (NmaData) o;
        return Objects.equals(description, nmaData.description) &&
                Objects.equals(imageId, nmaData.imageId) &&
                Objects.equals(owner, nmaData.owner) &&
                Objects.equals(property, nmaData.property) &&
                Objects.equals(users, nmaData.users) &&
                Objects.equals(serial, nmaData.serial) &&
                Objects.equals(version, nmaData.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, imageId, owner, property, users, serial, version);
    }

    @Override
    public String toString() {
        return "NmaData{" +
                "description='" + description + '\'' +
                ", imageId='" + imageId + '\'' +
                ", owner='" + owner + '\'' +
                ", property=" + property +
                ", users=" + users +
                ", serial='" + serial + '\'' +
                ", version=" + version +
                '}';
    }
}
