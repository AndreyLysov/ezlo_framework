package com.ezlo.automation.framework.model.ezlo.data;

import com.ezlo.automation.framework.model.ezlo.inner.BlockOptionData;
import com.ezlo.automation.framework.model.ezlo.inner.FieldData;
import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.List;
import java.util.Objects;

@Entity(value = "FWUC_blocks", noClassnameStored = true)
public class FWUC_BlockData {
    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    @Embedded
    private BlockOptionData blockOption;
    @Expose
    @Embedded
    private List<FieldData> fields;
    @Expose
    private String group;
    @Expose
    private String name;
    @Expose
    private String textTemplate;
    @Expose
    private Integer version;

    public FWUC_BlockData setId(ObjectId id) {
        this.id = id;
        return this;
    }

    public FWUC_BlockData setBlockOption(BlockOptionData blockOption) {
        this.blockOption = blockOption;
        return this;
    }

    public FWUC_BlockData setFields(List<FieldData> fields) {
        this.fields = fields;
        return this;
    }

    public FWUC_BlockData setGroup(String group) {
        this.group = group;
        return this;
    }

    public FWUC_BlockData setName(String name) {
        this.name = name;
        return this;
    }

    public FWUC_BlockData setTextTemplate(String textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }

    public FWUC_BlockData setVersion(Integer version) {
        this.version = version;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public BlockOptionData getBlockOption() {
        return blockOption;
    }

    public List<FieldData> getFields() {
        return fields;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public String getTextTemplate() {
        return textTemplate;
    }

    public Integer getVersion() {
        return version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FWUC_BlockData)) return false;
        FWUC_BlockData that = (FWUC_BlockData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(blockOption, that.blockOption) &&
                Objects.equals(fields, that.fields) &&
                Objects.equals(group, that.group) &&
                Objects.equals(name, that.name) &&
                Objects.equals(textTemplate, that.textTemplate) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, blockOption, fields, group, name, textTemplate, version);
    }

    @Override
    public String toString() {
        return "FWUC_BlockData{" +
                "id=" + id +
                ", blockOption=" + blockOption +
                ", fields=" + fields +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", textTemplate='" + textTemplate + '\'' +
                ", version=" + version +
                '}';
    }
}