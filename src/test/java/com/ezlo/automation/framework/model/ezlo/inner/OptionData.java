package com.ezlo.automation.framework.model.ezlo.inner;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class OptionData {

    @Expose
    private String text;
    @Expose
    private Integer value;

    public OptionData withText(String text) {
        this.text = text;
        return this;
    }

    public OptionData withValue(Integer value) {
        this.value = value;
        return this;
    }

    public String getText() {
        return text;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OptionData)) return false;
        OptionData that = (OptionData) o;
        return Objects.equals(text, that.text) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, value);
    }

    @Override
    public String toString() {
        return "OptionData{" +
                "text='" + text + '\'' +
                ", value=" + value +
                '}';
    }
}
