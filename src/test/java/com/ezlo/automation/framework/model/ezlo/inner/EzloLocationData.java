package com.ezlo.automation.framework.model.ezlo.inner;

import java.util.Objects;

public class EzloLocationData {

    private Integer timeOffset;

    public EzloLocationData withTimeOffset(Integer timeOffset) {
        this.timeOffset = timeOffset;
        return this;
    }

    public Integer getTimeOffset() {
        return timeOffset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EzloLocationData)) return false;
        EzloLocationData that = (EzloLocationData) o;
        return Objects.equals(timeOffset, that.timeOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeOffset);
    }

    @Override
    public String toString() {
        return "EzloLocationData{" +
                "timeOffset=" + timeOffset +
                '}';
    }
}
