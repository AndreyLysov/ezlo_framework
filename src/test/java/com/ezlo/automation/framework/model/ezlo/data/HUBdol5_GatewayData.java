package com.ezlo.automation.framework.model.ezlo.data;

import com.ezlo.automation.framework.model.ezlo.inner.DeviceData;
import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.List;
import java.util.Objects;

public class HUBdol5_GatewayData {

    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    private String description;
    @Expose
    @Embedded
    private List<DeviceData> devices;
    @Expose
    private String gatewayIdl;
    @Expose
    private Boolean replicate;

    public HUBdol5_GatewayData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public HUBdol5_GatewayData withDescription(String description) {
        this.description = description;
        return this;
    }

    public HUBdol5_GatewayData withDevices(List<DeviceData> devices) {
        this.devices = devices;
        return this;
    }

    public HUBdol5_GatewayData withGatewayIdl(String gatewayIdl) {
        this.gatewayIdl = gatewayIdl;
        return this;
    }

    public HUBdol5_GatewayData withReplicate(Boolean replicate) {
        this.replicate = replicate;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public List<DeviceData> getDevices() {
        return devices;
    }

    public String getGatewayIdl() {
        return gatewayIdl;
    }

    public Boolean getReplicate() {
        return replicate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HUBdol5_GatewayData)) return false;
        HUBdol5_GatewayData that = (HUBdol5_GatewayData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(description, that.description) &&
                Objects.equals(devices, that.devices) &&
                Objects.equals(gatewayIdl, that.gatewayIdl) &&
                Objects.equals(replicate, that.replicate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, devices, gatewayIdl, replicate);
    }

    @Override
    public String toString() {
        return "HUBdol5_FatewayData{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", devices=" + devices +
                ", gatewayIdl='" + gatewayIdl + '\'' +
                ", replicate=" + replicate +
                '}';
    }
}
