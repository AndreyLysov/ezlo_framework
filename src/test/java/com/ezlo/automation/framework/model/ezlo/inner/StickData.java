package com.ezlo.automation.framework.model.ezlo.inner;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class StickData {

    @Expose
    private String envm;
    @Expose
    private String flash;
    @Expose
    private String homeId;
    @Expose
    private String nvr;
    @Expose
    private String zddx;
    @Expose
    private String zddxSize;

    public StickData withEnvm(String envm) {
        this.envm = envm;
        return this;
    }

    public StickData withFlash(String flash) {
        this.flash = flash;
        return this;
    }

    public StickData withHomeId(String homeId) {
        this.homeId = homeId;
        return this;
    }

    public StickData withNvr(String nvr) {
        this.nvr = nvr;
        return this;
    }

    public StickData withZddx(String zddx) {
        this.zddx = zddx;
        return this;
    }

    public StickData withZddxSize(String zddxSize) {
        this.zddxSize = zddxSize;
        return this;
    }

    public String getEnvm() {
        return envm;
    }

    public String getFlash() {
        return flash;
    }

    public String getHomeId() {
        return homeId;
    }

    public String getNvr() {
        return nvr;
    }

    public String getZddx() {
        return zddx;
    }

    public String getZddxSize() {
        return zddxSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StickData)) return false;
        StickData stickData = (StickData) o;
        return Objects.equals(envm, stickData.envm) &&
                Objects.equals(flash, stickData.flash) &&
                Objects.equals(homeId, stickData.homeId) &&
                Objects.equals(nvr, stickData.nvr) &&
                Objects.equals(zddx, stickData.zddx) &&
                Objects.equals(zddxSize, stickData.zddxSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envm, flash, homeId, nvr, zddx, zddxSize);
    }

    @Override
    public String toString() {
        return "StickData{" +
                "envm='" + envm + '\'' +
                ", flash='" + flash + '\'' +
                ", homeId='" + homeId + '\'' +
                ", nvr='" + nvr + '\'' +
                ", zddx='" + zddx + '\'' +
                ", zddxSize='" + zddxSize + '\'' +
                '}';
    }
}
