package com.ezlo.automation.framework.model.ezlo.inner;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class DeviceTypeData {

    @Expose
    private Integer manufacturerId;
    @Expose
    private Integer manufacturerProductId;
    @Expose
    private Integer manufacturerProductType;

    public DeviceTypeData withManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
        return this;
    }

    public DeviceTypeData withManufacturerProductId(Integer manufacturerProductId) {
        this.manufacturerProductId = manufacturerProductId;
        return this;
    }

    public DeviceTypeData withManufacturerProductType(Integer manufacturerProductType) {
        this.manufacturerProductType = manufacturerProductType;
        return this;
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public Integer getManufacturerProductId() {
        return manufacturerProductId;
    }

    public Integer getManufacturerProductType() {
        return manufacturerProductType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeviceTypeData)) return false;
        DeviceTypeData that = (DeviceTypeData) o;
        return Objects.equals(manufacturerId, that.manufacturerId) &&
                Objects.equals(manufacturerProductId, that.manufacturerProductId) &&
                Objects.equals(manufacturerProductType, that.manufacturerProductType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturerId, manufacturerProductId, manufacturerProductType);
    }

    @Override
    public String toString() {
        return "DeviceType{" +
                "manufacturerId=" + manufacturerId +
                ", manufacturerProductId=" + manufacturerProductId +
                ", manufacturerProductType=" + manufacturerProductType +
                '}';
    }
}
