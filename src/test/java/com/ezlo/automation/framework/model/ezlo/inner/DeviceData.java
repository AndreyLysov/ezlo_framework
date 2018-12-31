package com.ezlo.automation.framework.model.ezlo.inner;

import com.google.gson.annotations.Expose;
import org.mongodb.morphia.annotations.Embedded;

import java.util.List;
import java.util.Objects;

public class DeviceData {

    @Expose
    private String uID;
    @Expose
    private Integer address;
    @Expose
    private Integer basicType;
    @Expose
    private String deviceName;
    @Expose
    private Integer deviceType;
    @Expose
    private Integer genericType;
    @Expose
    @Embedded
    private List<ItemData> items;
    @Expose
    private Integer manufactureId;
    @Expose
    private String pageId;
    @Expose
    private Integer productId;
    @Expose
    private Integer productType;
    @Expose
    private Integer pwState;
    @Expose
    private Integer specificType;
    @Expose
    private Integer type;

    public DeviceData withuID(String uID) {
        this.uID = uID;
        return this;
    }

    public DeviceData withAddress(Integer address) {
        this.address = address;
        return this;
    }

    public DeviceData withBasicType(Integer basicType) {
        this.basicType = basicType;
        return this;
    }

    public DeviceData withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    public DeviceData withDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    public DeviceData withGenericType(Integer genericType) {
        this.genericType = genericType;
        return this;
    }

    public DeviceData withItems(List<ItemData> items) {
        this.items = items;
        return this;
    }

    public DeviceData withManufactureId(Integer manufactureId) {
        this.manufactureId = manufactureId;
        return this;
    }

    public DeviceData withPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }

    public DeviceData withProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    public DeviceData withProductType(Integer productType) {
        this.productType = productType;
        return this;
    }

    public DeviceData withPwState(Integer pwState) {
        this.pwState = pwState;
        return this;
    }

    public DeviceData withSpecificType(Integer specificType) {
        this.specificType = specificType;
        return this;
    }

    public DeviceData withType(Integer type) {
        this.type = type;
        return this;
    }

    public String getuID() {
        return uID;
    }

    public Integer getAddress() {
        return address;
    }

    public Integer getBasicType() {
        return basicType;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public Integer getGenericType() {
        return genericType;
    }

    public List<ItemData> getItems() {
        return items;
    }

    public Integer getManufactureId() {
        return manufactureId;
    }

    public String getPageId() {
        return pageId;
    }

    public Integer getProductId() {
        return productId;
    }

    public Integer getProductType() {
        return productType;
    }

    public Integer getPwState() {
        return pwState;
    }

    public Integer getSpecificType() {
        return specificType;
    }

    public Integer getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeviceData)) return false;
        DeviceData that = (DeviceData) o;
        return Objects.equals(uID, that.uID) &&
                Objects.equals(address, that.address) &&
                Objects.equals(basicType, that.basicType) &&
                Objects.equals(deviceName, that.deviceName) &&
                Objects.equals(deviceType, that.deviceType) &&
                Objects.equals(genericType, that.genericType) &&
                Objects.equals(items, that.items) &&
                Objects.equals(manufactureId, that.manufactureId) &&
                Objects.equals(pageId, that.pageId) &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(productType, that.productType) &&
                Objects.equals(pwState, that.pwState) &&
                Objects.equals(specificType, that.specificType) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uID, address, basicType, deviceName, deviceType, genericType, items, manufactureId, pageId, productId, productType, pwState, specificType, type);
    }

    @Override
    public String toString() {
        return "DeviceData{" +
                "uID='" + uID + '\'' +
                ", address=" + address +
                ", basicType=" + basicType +
                ", deviceName='" + deviceName + '\'' +
                ", deviceType=" + deviceType +
                ", genericType=" + genericType +
                ", items=" + items +
                ", manufactureId=" + manufactureId +
                ", pageId='" + pageId + '\'' +
                ", productId=" + productId +
                ", productType=" + productType +
                ", pwState=" + pwState +
                ", specificType=" + specificType +
                ", type=" + type +
                '}';
    }
}
