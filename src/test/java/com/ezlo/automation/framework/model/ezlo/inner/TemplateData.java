package com.ezlo.automation.framework.model.ezlo.inner;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class TemplateData {

    @Expose
    private String dataType;
    @Expose
    private Integer id;

    public TemplateData withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    public TemplateData withId(Integer id) {
        this.id = id;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TemplateData)) return false;
        TemplateData that = (TemplateData) o;
        return Objects.equals(dataType, that.dataType) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataType, id);
    }

    @Override
    public String toString() {
        return "TemplateData{" +
                "dataType='" + dataType + '\'' +
                ", id=" + id +
                '}';
    }
}
