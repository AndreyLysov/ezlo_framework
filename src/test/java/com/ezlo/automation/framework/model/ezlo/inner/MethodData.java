package com.ezlo.automation.framework.model.ezlo.inner;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class MethodData {

    @Expose
    private ArgData args;
    @Expose
    private String name;

    public MethodData withArgs(ArgData args) {
        this.args = args;
        return this;
    }

    public MethodData withName(String name) {
        this.name = name;
        return this;
    }

    public ArgData getArgs() {
        return args;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MethodData)) return false;
        MethodData that = (MethodData) o;
        return Objects.equals(args, that.args) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(args, name);
    }

    @Override
    public String toString() {
        return "MethodData{" +
                "args=" + args +
                ", name='" + name + '\'' +
                '}';
    }
}
