package com.ezlo.automation.framework.model.ezlo.inner;

import com.google.gson.annotations.Expose;
import org.mongodb.morphia.annotations.Property;

import java.util.List;
import java.util.Objects;

public class ThenData {

    @Expose
    @Property("blockOptions")
    private BlockOptionData blockOption;
    @Expose
    private String blockType;
    @Expose
    private List<FieldData> fields;
    @Expose
    private String group;
    @Expose
    private String name;
    @Expose
    @Property("text_template")
    private String textTemplate;
    @Expose
    private Integer version;

    public ThenData withBlockOption(BlockOptionData blockOption) {
        this.blockOption = blockOption;
        return this;
    }

    public ThenData withBlockType(String blockType) {
        this.blockType = blockType;
        return this;
    }

    public ThenData withFields(List<FieldData> fields) {
        this.fields = fields;
        return this;
    }

    public ThenData withGroup(String group) {
        this.group = group;
        return this;
    }

    public ThenData withName(String name) {
        this.name = name;
        return this;
    }

    public ThenData withTextTemplate(String textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }

    public ThenData withVersion(Integer version) {
        this.version = version;
        return this;
    }

    public BlockOptionData getBlockOption() {
        return blockOption;
    }

    public String getBlockType() {
        return blockType;
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
        if (!(o instanceof ThenData)) return false;
        ThenData thenData = (ThenData) o;
        return Objects.equals(blockOption, thenData.blockOption) &&
                Objects.equals(blockType, thenData.blockType) &&
                Objects.equals(fields, thenData.fields) &&
                Objects.equals(group, thenData.group) &&
                Objects.equals(name, thenData.name) &&
                Objects.equals(textTemplate, thenData.textTemplate) &&
                Objects.equals(version, thenData.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockOption, blockType, fields, group, name, textTemplate, version);
    }

    @Override
    public String toString() {
        return "ThenData{" +
                "blockOption=" + blockOption +
                ", blockType='" + blockType + '\'' +
                ", fields=" + fields +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", textTemplate='" + textTemplate + '\'' +
                ", version=" + version +
                '}';
    }
}
