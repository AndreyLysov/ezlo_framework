package com.ezlo.automation.framework.model.ezlo;

import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.Objects;

import static com.ezlo.automation.framework.generators.EzloDataGenerator.getDateTime;

@Entity(value = "ezlos", noClassnameStored = true)
public class EzlosData {

    @Id
    @Expose
    protected ObjectId id;
    @Expose
    private boolean autoBackupDone;
    @Expose
    private boolean autoFirmwareUpdate;
    @Expose
    private String connId;
    @Expose
    private boolean deleted;
    @Expose
    private String description;
    @Expose
    private boolean disabled;
    @Expose
    private String disconnected_at;
    @Expose
    private String ezlo_connected_at;
    @Expose
    private String firmware;
    @Expose
    private String imageId;
    @Expose
    private boolean locked;
    @Expose
    @Embedded
    private EzloProps properties;
    @Expose
    private boolean registered;
    @Expose
    private String serial;
    @Expose
    private String serial_hash;
    @Expose
    private boolean shouldBeCleaned;
    @Expose
    private String company;
    @Expose
    private String owner;

    public EzlosData withAutoBackupDone(boolean autoBackupDone) {
        this.autoBackupDone = autoBackupDone;
        return this;
    }

    public EzlosData withAutoFirmwareUpdate(boolean autoFirmwareUpdate) {
        this.autoFirmwareUpdate = autoFirmwareUpdate;
        return this;
    }

    public EzlosData withConnId(String connId) {
        this.connId = connId;
        return this;
    }

    public EzlosData withDeleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public EzlosData withDescription(String description) {
        this.description = description;
        return this;
    }

    public EzlosData withDisabled(boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    public EzlosData withDisconnectedAt(String disconnected_at) {
        if (disconnected_at.equals("")) this.disconnected_at = getDateTime("Y-MM-dd HH:MM:ss.SSSSSS");
        else this.disconnected_at = disconnected_at;
        return this;
    }

    public EzlosData withEzloConnectedAt(String ezlo_connected_at) {
        if (ezlo_connected_at.equals("")) this.ezlo_connected_at = getDateTime("Y-MM-dd HH:MM:ss.SSSSSS");
        else this.ezlo_connected_at = ezlo_connected_at;
        return this;
    }

    public EzlosData withFirmware(String firmware) {
        this.firmware = firmware;
        return this;
    }

    public EzlosData withProperties(EzloProps properties) {
        this.properties = properties;
        return this;
    }

    public EzlosData withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public EzlosData withLocked(boolean locked) {
        this.locked = locked;
        return this;
    }

    public EzlosData withRegistered(boolean registered) {
        this.registered = registered;
        return this;
    }

    public EzlosData withSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public EzlosData withSerialHash(String serial_hash) {
        this.serial_hash = serial_hash;
        return this;
    }

    public EzlosData withCompany(String company) {
        this.company = company;
        return this;
    }

    public EzlosData withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public EzlosData withShouldBeCleaned(boolean shouldBeCleaned) {
        this.shouldBeCleaned = shouldBeCleaned;
        return this;
    }

    public boolean isAutoBackupDone() {
        return autoBackupDone;
    }

    public boolean isAutoFirmwareUpdate() {
        return autoFirmwareUpdate;
    }

    public String getConnId() {
        return connId;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public String getDisconnected_at() {
        return disconnected_at;
    }

    public String getEzlo_connected_at() {
        return ezlo_connected_at;
    }

    public String getImageId() {
        return imageId;
    }

    public String getFirmware() {
        return firmware;
    }

    public boolean isLocked() {
        return locked;
    }

    public EzloProps getProperties() {
        return properties;
    }

    public boolean isRegistered() {
        return registered;
    }

    public String getSerial() {
        return serial;
    }

    public String getCompany() {
        return company;
    }

    public boolean isShouldBeCleaned() {
        return shouldBeCleaned;
    }

    public String getOwner() {
        return owner;
    }

    public String getSerialHash() {
        return serial_hash;
    }

    @Override
    public String toString() {
        return "EzloData{" +
                ", autoBackupDone=" + autoBackupDone +
                ", autoFirmwareUpdate=" + autoFirmwareUpdate +
                ", connId=" + connId +
                ", deleted=" + deleted +
                ", description=" + description +
                ", disabled=" + disabled +
                ", disconnected_at=" + disconnected_at +
                ", ezlo_connected_at=" + ezlo_connected_at +
                ", firmware=" + firmware +
                ", imageId=" + imageId +
                ", locked=" + locked +
                ", registered=" + registered +
                ", serial=" + serial +
                ", serial_hash=" + serial_hash +
                ", shouldBeCleaned=" + shouldBeCleaned +
                ", company=" + company +
                ", owner=" + owner +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EzlosData that = (EzlosData) obj;
        return Objects.equals(autoBackupDone, that.autoBackupDone) &&
                Objects.equals(autoFirmwareUpdate, that.autoFirmwareUpdate) &&
                Objects.equals(connId, that.connId) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(description, that.description) &&
                Objects.equals(disabled, that.disabled) &&
                Objects.equals(disconnected_at, that.disconnected_at) &&
                Objects.equals(ezlo_connected_at, that.ezlo_connected_at) &&
                Objects.equals(firmware, that.firmware) &&
                Objects.equals(imageId, that.imageId) &&
                Objects.equals(locked, that.locked) &&
                Objects.equals(registered, that.registered) &&
                Objects.equals(serial, that.serial) &&
                Objects.equals(serial_hash, that.serial_hash) &&
                Objects.equals(shouldBeCleaned, that.shouldBeCleaned) &&
                Objects.equals(company, that.company) &&
                Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, autoBackupDone, autoFirmwareUpdate, connId,
                deleted, description, disabled, disconnected_at, ezlo_connected_at,
                firmware, imageId, locked, registered, serial,
                serial_hash, shouldBeCleaned, company, owner);
    }

    @Embedded
    public static class EzloProps {
        @Expose
        private String ezloColor = "";
        @Embedded
        @Expose
        private EzloLocationData ezloLocation;

        public EzloProps() {
        }

        public String getEzloColor() {
            return ezloColor;
        }

        public EzloLocationData getEzloLocation() {
            return ezloLocation;
        }

        public EzloProps withEzloColor(String ezloColor) {
            this.ezloColor = ezloColor;
            return this;
        }

        public EzloProps withEzloLocation(EzloLocationData ezloLocation) {
            this.ezloLocation = ezloLocation;
            return this;
        }

    }
}
