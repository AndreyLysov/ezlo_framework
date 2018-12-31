package com.ezlo.automation.framework.model.ezlo.data;

import com.ezlo.automation.framework.model.ezlo.inner.DeviceTypeData;
import com.ezlo.automation.framework.model.ezlo.inner.StyleData;
import com.ezlo.automation.framework.model.ezlo.inner.TemplateData;
import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.List;
import java.util.Objects;

@Entity(value = "FWUC_templates_ios", noClassnameStored = true)
public class FWUC_TemplateIOSData {
    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    @Embedded
    private DeviceTypeData deviceTypeData;
    @Expose
    private String name;
    @Expose
    @Embedded
    private List<StyleData> styles;
    @Expose
    @Embedded
    private List<TemplateData> temapltes;

    public FWUC_TemplateIOSData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public FWUC_TemplateIOSData withDeviceType(DeviceTypeData deviceTypeData) {
        this.deviceTypeData = deviceTypeData;
        return this;
    }

    public FWUC_TemplateIOSData withName(String name) {
        this.name = name;
        return this;
    }

    public FWUC_TemplateIOSData withStyles(List<StyleData> styles) {
        this.styles = styles;
        return this;
    }

    public FWUC_TemplateIOSData withTemapltes(List<TemplateData> temapltes) {
        this.temapltes = temapltes;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public DeviceTypeData getDeviceTypeData() {
        return deviceTypeData;
    }

    public String getName() {
        return name;
    }

    public List<StyleData> getStyles() {
        return styles;
    }

    public List<TemplateData> getTemapltes() {
        return temapltes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FWUC_TemplateIOSData)) return false;
        FWUC_TemplateIOSData that = (FWUC_TemplateIOSData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(deviceTypeData, that.deviceTypeData) &&
                Objects.equals(name, that.name) &&
                Objects.equals(styles, that.styles) &&
                Objects.equals(temapltes, that.temapltes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deviceTypeData, name, styles, temapltes);
    }

    @Override
    public String toString() {
        return "FWUC_TemplateAndroidData{" +
                "id=" + id +
                ", deviceType=" + deviceTypeData +
                ", name='" + name + '\'' +
                ", styles=" + styles +
                ", temapltes=" + temapltes +
                '}';
    }
}
