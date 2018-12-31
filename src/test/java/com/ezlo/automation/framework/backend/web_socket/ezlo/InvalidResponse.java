package com.ezlo.automation.framework.backend.web_socket.ezlo;

import com.google.gson.annotations.Expose;
import com.google.gson.internal.LinkedTreeMap;

import java.util.Objects;

public class InvalidResponse implements Cloneable{

    @Expose
    private String id;
    @Expose
    private ErrorData error;
    @Expose
    private LinkedTreeMap<String, Object> result = new LinkedTreeMap<>();

    public InvalidResponse withId(String id) {
        this.id = id;
        return this;
    }

    public InvalidResponse withError(ErrorData error) {
        this.error = error;
        return this;
    }

    public String getId() {
        return id;
    }

    public ErrorData getError() {
        return error;
    }

    public Object getResult() {
        return result;
    }

    @Override
    public InvalidResponse clone() {
        try {
            return (InvalidResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvalidResponse)) return false;
        InvalidResponse that = (InvalidResponse) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(error, that.error) &&
                Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, error, result);
    }

    @Override
    public String toString() {
        return "InvalidResponse{" +
                "id='" + id + '\'' +
                ", error=" + error +
                ", result=" + result +
                '}';
    }
}
