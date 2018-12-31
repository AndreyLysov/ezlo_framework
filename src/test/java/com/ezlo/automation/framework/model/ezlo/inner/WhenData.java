package com.ezlo.automation.framework.model.ezlo.inner;

import com.google.gson.annotations.Expose;
import org.mongodb.morphia.annotations.Property;

import java.util.List;
import java.util.Objects;

public class WhenData {

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
    @Expose
    private Boolean trigger;

    public WhenData withBlockOption(BlockOptionData blockOption) {
        this.blockOption = blockOption;
        return this;
    }

    public WhenData withBlockType(String blockType) {
        this.blockType = blockType;
        return this;
    }

    public WhenData withFields(List<FieldData> fields) {
        this.fields = fields;
        return this;
    }

    public WhenData withGroup(String group) {
        this.group = group;
        return this;
    }

    public WhenData withName(String name) {
        this.name = name;
        return this;
    }

    public WhenData withTextTemplate(String textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }

    public WhenData withVersion(Integer version) {
        this.version = version;
        return this;
    }

    public WhenData withTrigger(Boolean trigger) {
        this.trigger = trigger;
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

    public Boolean getTrigger() {
        return trigger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WhenData)) return false;
        WhenData whenData = (WhenData) o;
        return Objects.equals(blockOption, whenData.blockOption) &&
                Objects.equals(blockType, whenData.blockType) &&
                Objects.equals(fields, whenData.fields) &&
                Objects.equals(group, whenData.group) &&
                Objects.equals(name, whenData.name) &&
                Objects.equals(textTemplate, whenData.textTemplate) &&
                Objects.equals(version, whenData.version) &&
                Objects.equals(trigger, whenData.trigger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockOption, blockType, fields, group, name, textTemplate, version, trigger);
    }

    @Override
    public String toString() {
        return "WhenData{" +
                "blockOption=" + blockOption +
                ", blockType='" + blockType + '\'' +
                ", fields=" + fields +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", textTemplate='" + textTemplate + '\'' +
                ", version=" + version +
                ", trigger=" + trigger +
                '}';
    }
}
