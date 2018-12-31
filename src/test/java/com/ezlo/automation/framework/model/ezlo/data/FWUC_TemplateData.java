package com.ezlo.automation.framework.model.ezlo.data;

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

@Entity(value = "FWUC_templates", noClassnameStored = true)
public class FWUC_TemplateData {
    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    private String name;
    @Embedded
    @Expose
    private List<StyleData> styles;
    @Embedded
    @Expose
    private List<TemplateData> templates;

    public FWUC_TemplateData() {
    }

    public FWUC_TemplateData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public FWUC_TemplateData withName(String name) {
        this.name = name;
        return this;
    }

    public FWUC_TemplateData withStyles(List<StyleData> styles) {
        this.styles = styles;
        return this;
    }

    public FWUC_TemplateData withTemplates(List<TemplateData> templates) {
        this.templates = templates;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<StyleData> getStyles() {
        return styles;
    }

    public List<TemplateData> getTemplates() {
        return templates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FWUC_TemplateData)) return false;
        FWUC_TemplateData that = (FWUC_TemplateData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(styles, that.styles) &&
                Objects.equals(templates, that.templates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, styles, templates);
    }

    @Override
    public String toString() {
        return "FWUC_TemplateData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", styles=" + styles +
                ", templates=" + templates +
                '}';
    }
}
