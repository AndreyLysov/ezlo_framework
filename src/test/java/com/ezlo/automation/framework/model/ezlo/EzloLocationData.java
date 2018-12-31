package com.ezlo.automation.framework.model.ezlo;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class EzloLocationData {
    @Expose
    private Integer dstOffset;  // 3600
    @Expose
    private Double latitude;    // 46.1234567890123
    @Expose
    private Double longitude;   // 98.1234567890123
    @Expose
    private Integer rawOffset;  // 7200
    @Expose
    private Integer timeOffset; //
    @Expose
    private String timeZoneId;

    public EzloLocationData() {

    }

    public Integer getDstOffset() {
        return dstOffset;
    }

    public Integer getRawOffset() {
        return rawOffset;
    }

    public String getTimeZoneId() {
        return timeZoneId;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Integer getTimeOffset() {
        return timeOffset;
    }

    public EzloLocationData withDstOffset(Integer dstOffset) {
        this.dstOffset = dstOffset;
        return this;
    }

    public EzloLocationData withLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public EzloLocationData withLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    public EzloLocationData withRawOffset(Integer rawOffset) {
        this.rawOffset = rawOffset;
        return this;
    }

    public EzloLocationData withTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
        return this;
    }

    public EzloLocationData withTimeOffset(Integer timeOffset) {
        this.timeOffset = timeOffset;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof EzloLocationData))
            return false;
        EzloLocationData that = (EzloLocationData) o;
        return Objects.equals(dstOffset, that.dstOffset) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(rawOffset, that.rawOffset) &&
                Objects.equals(timeOffset, that.timeOffset) &&
                Objects.equals(timeZoneId, that.timeZoneId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dstOffset, latitude, longitude, rawOffset, timeOffset, timeZoneId);
    }

    @Override
    public String toString() {
        return "EzloLocationData{" +
                "dstOffset=" + dstOffset +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", rawOffset=" + rawOffset +
                ", timeOffset=" + timeOffset +
                ", timeZoneId='" + timeZoneId + '\'' +
                '}';
    }
}