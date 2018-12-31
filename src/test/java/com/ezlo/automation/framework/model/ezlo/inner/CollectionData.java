package com.ezlo.automation.framework.model.ezlo.inner;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class CollectionData {
    
    @Expose
    private String collectionName;
    @Expose
    private String data;
    @Expose
    private String uncompressedLength;

    public CollectionData withCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    public CollectionData withData(String data) {
        this.data = data;
        return this;
    }

    public CollectionData withUncompressedLength(String uncompressedLength) {
        this.uncompressedLength = uncompressedLength;
        return this;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public String getData() {
        return data;
    }

    public String getUncompressedLength() {
        return uncompressedLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CollectionData)) return false;
        CollectionData that = (CollectionData) o;
        return Objects.equals(collectionName, that.collectionName) &&
                Objects.equals(data, that.data) &&
                Objects.equals(uncompressedLength, that.uncompressedLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectionName, data, uncompressedLength);
    }

    @Override
    public String toString() {
        return "CollectionData{" +
                "collectionName='" + collectionName + '\'' +
                ", data='" + data + '\'' +
                ", uncompressedLength='" + uncompressedLength + '\'' +
                '}';
    }
}
