package com.ezlo.automation.framework.backend.rest.mios.methods.add_NMA_device;

import java.util.Objects;

public class SyncEZLOData {

    private String ezloSerial;
    private String macAddress;
    private String secret;

    public SyncEZLOData withEzloSerial(String ezloSerial) {
        this.ezloSerial = ezloSerial;
        return this;
    }

    public SyncEZLOData withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    public SyncEZLOData withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    public String getEzloSerial() {
        return ezloSerial;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public String getSecret() {
        return secret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SyncEZLOData)) return false;
        SyncEZLOData that = (SyncEZLOData) o;
        return Objects.equals(ezloSerial, that.ezloSerial) &&
                Objects.equals(macAddress, that.macAddress) &&
                Objects.equals(secret, that.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ezloSerial, macAddress, secret);
    }

    @Override
    public String toString() {
        return "SyncEZLORequest{" +
                "ezloSerial='" + ezloSerial + '\'' +
                ", macAddress='" + macAddress + '\'' +
                ", secret='" + secret + '\'' +
                '}';
    }
}
