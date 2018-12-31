package com.ezlo.automation.framework.model.ezlo.inner.backup_inner_classes;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class DB_HA_SubDevicesFavouriteData {

    @Expose
    private String data;
    @Expose
    private String md5;
    @Expose
    private String name;
    @Expose
    private String uncompressedLength;

    public DB_HA_SubDevicesFavouriteData withData(String data) {
        this.data = data;
        return this;
    }

    public DB_HA_SubDevicesFavouriteData withMd5(String md5) {
        this.md5 = md5;
        return this;
    }

    public DB_HA_SubDevicesFavouriteData withName(String name) {
        this.name = name;
        return this;
    }

    public DB_HA_SubDevicesFavouriteData withUncompressedLength(String uncompressedLength) {
        this.uncompressedLength = uncompressedLength;
        return this;
    }

    public String getData() {
        return data;
    }

    public String getMd5() {
        return md5;
    }

    public String getName() {
        return name;
    }

    public String getUncompressedLength() {
        return uncompressedLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DB_HA_SubDevicesFavouriteData)) return false;
        DB_HA_SubDevicesFavouriteData that = (DB_HA_SubDevicesFavouriteData) o;
        return Objects.equals(data, that.data) &&
                Objects.equals(md5, that.md5) &&
                Objects.equals(name, that.name) &&
                Objects.equals(uncompressedLength, that.uncompressedLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, md5, name, uncompressedLength);
    }

    @Override
    public String toString() {
        return "DB_HA_SubServicesFavouriteData{" +
                "data='" + data + '\'' +
                ", md5='" + md5 + '\'' +
                ", name='" + name + '\'' +
                ", uncompressedLength='" + uncompressedLength + '\'' +
                '}';
    }
}
