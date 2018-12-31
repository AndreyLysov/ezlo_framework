package com.ezlo.automation.framework.model.ezlo.inner;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class ArgData {

    @Expose
    private String dataItem;
    @Expose
    private String value;

    public ArgData withDataItem(String dataItem) {
        this.dataItem = dataItem;
        return this;
    }

    public ArgData withValue(String value) {
        this.value = value;
        return this;
    }

    public String getDataItem() {
        return dataItem;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArgData)) return false;
        ArgData argData = (ArgData) o;
        return Objects.equals(dataItem, argData.dataItem) &&
                Objects.equals(value, argData.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataItem, value);
    }

    @Override
    public String toString() {
        return "ArgData{" +
                "dataItem='" + dataItem + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
