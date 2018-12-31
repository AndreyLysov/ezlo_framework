package com.ezlo.automation.framework.model.ezlo.inner;

import org.mongodb.morphia.annotations.Embedded;

import java.util.Objects;

public class PropertyData {
    
    private String ezloColor;
    @Embedded
    private EzloLocationData ezloLocation;

    public PropertyData withEzloColor(String ezloColor) {
        this.ezloColor = ezloColor;
        return this;
    }

    public PropertyData withEzloLocation(EzloLocationData ezloLocation) {
        this.ezloLocation = ezloLocation;
        return this;
    }

    public String getEzloColor() {
        return ezloColor;
    }

    public EzloLocationData getEzloLocation() {
        return ezloLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PropertyData)) return false;
        PropertyData that = (PropertyData) o;
        return Objects.equals(ezloColor, that.ezloColor) &&
                Objects.equals(ezloLocation, that.ezloLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ezloColor, ezloLocation);
    }

    @Override
    public String toString() {
        return "PropertyData{" +
                "ezloColor='" + ezloColor + '\'' +
                ", ezloLocation=" + ezloLocation +
                '}';
    }
}
