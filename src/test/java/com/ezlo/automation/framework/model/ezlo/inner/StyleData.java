package com.ezlo.automation.framework.model.ezlo.inner;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class StyleData {

    @Expose
    private String dataType;

    public StyleData withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    public String getDataType() {
        return dataType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StyleData)) return false;
        StyleData styleData = (StyleData) o;
        return Objects.equals(dataType, styleData.dataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataType);
    }

    @Override
    public String toString() {
        return "StyleData{" +
                "dataType='" + dataType + '\'' +
                '}';
    }
}
