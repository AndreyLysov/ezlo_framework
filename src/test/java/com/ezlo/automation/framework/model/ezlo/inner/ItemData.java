package com.ezlo.automation.framework.model.ezlo.inner;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class ItemData {

    @Expose
    private String id;
    @Expose
    private String label;
    @Expose
    private String name;
    @Expose
    private Integer type;
    @Expose
    private Integer value;

    public ItemData withId(String id) {
        this.id = id;
        return this;
    }

    public ItemData withLabel(String label) {
        this.label = label;
        return this;
    }

    public ItemData withName(String name) {
        this.name = name;
        return this;
    }

    public ItemData withType(Integer type) {
        this.type = type;
        return this;
    }

    public ItemData withValue(Integer value) {
        this.value = value;
        return this;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public String getName() {
        return name;
    }

    public Integer getType() {
        return type;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemData)) return false;
        ItemData itemData = (ItemData) o;
        return Objects.equals(id, itemData.id) &&
                Objects.equals(label, itemData.label) &&
                Objects.equals(name, itemData.name) &&
                Objects.equals(type, itemData.type) &&
                Objects.equals(value, itemData.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, name, type, value);
    }

    @Override
    public String toString() {
        return "ItemData{" +
                "id='" + id + '\'' +
                ", label='" + label + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", value=" + value +
                '}';
    }
}
