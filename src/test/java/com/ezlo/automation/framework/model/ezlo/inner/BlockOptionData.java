package com.ezlo.automation.framework.model.ezlo.inner;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class BlockOptionData {

    @Expose
    private String actionName;
    @Expose
    private MethodData method;
    @Expose
    private String blockType;

    public BlockOptionData withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    public BlockOptionData withMethod(MethodData method){
        this.method = method;
        return this;
    }

    public BlockOptionData withBlockType(String blockType) {
        this.blockType = blockType;
        return this;
    }

    public MethodData getMethod() {
        return method;
    }

    public String getActionName() {
        return actionName;
    }

    public String getBlockType() {
        return blockType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BlockOptionData)) return false;
        BlockOptionData that = (BlockOptionData) o;
        return Objects.equals(actionName, that.actionName) &&
                Objects.equals(method, that.method) &&
                Objects.equals(blockType, that.blockType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionName, method, blockType);
    }

    @Override
    public String toString() {
        return "BlockOptionData{" +
                "actionName='" + actionName + '\'' +
                ", method=" + method +
                ", blockType='" + blockType + '\'' +
                '}';
    }
}
