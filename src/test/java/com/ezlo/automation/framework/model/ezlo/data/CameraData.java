package com.ezlo.automation.framework.model.ezlo.data;

import com.ezlo.automation.framework.model.ezlo.inner.FTPData;
import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Objects;

@Entity(value = "cameras", noClassnameStored = true)
public class CameraData {

    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    private Boolean armed;
    @Expose
    private String cameraId;
    @Expose
    private String cameraName;
    @Expose
    private String cameraUrl;
    @Expose
    private String created;
    @Expose
    @Property("created_utc")
    private String createdUtc;
    @Expose
    private FTPData ftp;
    @Expose
    private String networkType;
    @Expose
    private String ownerId;
    @Expose
    private String password;
    @Expose
    private String roomId;
    @Expose
    private String userName;

    public CameraData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public CameraData withArmed(Boolean armed) {
        this.armed = armed;
        return this;
    }

    public CameraData withCameraId(String cameraId) {
        this.cameraId = cameraId;
        return this;
    }

    public CameraData withCameraName(String cameraName) {
        this.cameraName = cameraName;
        return this;
    }

    public CameraData withCameraUrl(String cameraUrl) {
        this.cameraUrl = cameraUrl;
        return this;
    }

    public CameraData withCreated(String created) {
        this.created = created;
        return this;
    }

    public CameraData withCreatedUtc(String createdUtc) {
        this.createdUtc = createdUtc;
        return this;
    }

    public CameraData withFtp(FTPData ftp) {
        this.ftp = ftp;
        return this;
    }

    public CameraData withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    public CameraData withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public CameraData withPassword(String password) {
        this.password = password;
        return this;
    }

    public CameraData withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }

    public CameraData withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public Boolean getArmed() {
        return armed;
    }

    public String getCameraId() {
        return cameraId;
    }

    public String getCameraName() {
        return cameraName;
    }

    public String getCameraUrl() {
        return cameraUrl;
    }

    public String getCreated() {
        return created;
    }

    public String getCreatedUtc() {
        return createdUtc;
    }

    public FTPData getFtp() {
        return ftp;
    }

    public String getNetworkType() {
        return networkType;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getPassword() {
        return password;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CameraData)) return false;
        CameraData that = (CameraData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(armed, that.armed) &&
                Objects.equals(cameraId, that.cameraId) &&
                Objects.equals(cameraName, that.cameraName) &&
                Objects.equals(cameraUrl, that.cameraUrl) &&
                Objects.equals(created, that.created) &&
                Objects.equals(createdUtc, that.createdUtc) &&
                Objects.equals(ftp, that.ftp) &&
                Objects.equals(networkType, that.networkType) &&
                Objects.equals(ownerId, that.ownerId) &&
                Objects.equals(password, that.password) &&
                Objects.equals(roomId, that.roomId) &&
                Objects.equals(userName, that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, armed, cameraId, cameraName, cameraUrl, created, createdUtc, ftp, networkType, ownerId, password, roomId, userName);
    }

    @Override
    public String toString() {
        return "CameraData{" +
                "id=" + id +
                ", armed=" + armed +
                ", cameraId='" + cameraId + '\'' +
                ", cameraName='" + cameraName + '\'' +
                ", cameraUrl='" + cameraUrl + '\'' +
                ", created='" + created + '\'' +
                ", createdUtc='" + createdUtc + '\'' +
                ", ftp=" + ftp +
                ", networkType='" + networkType + '\'' +
                ", ownerId='" + ownerId + '\'' +
                ", password='" + password + '\'' +
                ", roomId='" + roomId + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
