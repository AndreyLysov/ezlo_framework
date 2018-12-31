package com.ezlo.automation.framework.model.ezlo.inner;

import com.google.gson.annotations.Expose;

import java.util.List;
import java.util.Objects;

public class FieldData {

    @Expose
    private List<String> dataItemFilters;
    @Expose
    private List<OptionData> options;
    @Expose
    private String name;
    @Expose
    private String type;
    @Expose
    private Boolean visibility;
    @Expose
    private String renderrer;
    @Expose
    private Integer value;
    @Expose
    private String deviceName;
    @Expose
    private String instanceTitle;

    public FieldData withDataItemFilters(List<String> dataItemFilters) {
        this.dataItemFilters = dataItemFilters;
        return this;
    }

    public FieldData withOptions(List<OptionData> options) {
        this.options = options;
        return this;
    }

    public FieldData withName(String name) {
        this.name = name;
        return this;
    }

    public FieldData withType(String type) {
        this.type = type;
        return this;
    }

    public FieldData withVisibility(Boolean visibility) {
        this.visibility = visibility;
        return this;
    }

    public FieldData withRenderrer(String renderrer) {
        this.renderrer = renderrer;
        return this;
    }

    public FieldData withValue(Integer value) {
        this.value = value;
        return this;
    }

    public FieldData withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    public FieldData withInstanceTitle(String instanceTitle) {
        this.instanceTitle = instanceTitle;
        return this;
    }

    public List<String> getDataItemFilters() {
        return dataItemFilters;
    }

    public List<OptionData> getOptions() {
        return options;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Boolean getVisibility() {
        return visibility;
    }

    public String getRenderrer() {
        return renderrer;
    }

    public Integer getValue() {
        return value;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getInstanceTitle() {
        return instanceTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FieldData)) return false;
        FieldData fieldData = (FieldData) o;
        return Objects.equals(dataItemFilters, fieldData.dataItemFilters) &&
                Objects.equals(options, fieldData.options) &&
                Objects.equals(name, fieldData.name) &&
                Objects.equals(type, fieldData.type) &&
                Objects.equals(visibility, fieldData.visibility) &&
                Objects.equals(renderrer, fieldData.renderrer) &&
                Objects.equals(value, fieldData.value) &&
                Objects.equals(deviceName, fieldData.deviceName) &&
                Objects.equals(instanceTitle, fieldData.instanceTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataItemFilters, options, name, type, visibility, renderrer, value, deviceName, instanceTitle);
    }

    @Override
    public String toString() {
        return "FieldData{" +
                "dataItemFilters=" + dataItemFilters +
                ", options=" + options +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", visibility=" + visibility +
                ", renderrer='" + renderrer + '\'' +
                ", value=" + value +
                ", deviceName='" + deviceName + '\'' +
                ", instanceTitle='" + instanceTitle + '\'' +
                '}';
    }
}
