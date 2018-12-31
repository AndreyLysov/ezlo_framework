package com.ezlo.automation.framework.model.ezlo.inner;

import com.google.gson.annotations.Expose;

import java.util.List;
import java.util.Objects;

public class BaseData {
    
    @Expose
    private List<CollectionData> collections;
    @Expose
    private String dbName;

    public BaseData withCollections(List<CollectionData> collections) {
        this.collections = collections;
        return this;
    }

    public BaseData withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    public List<CollectionData> getCollections() {
        return collections;
    }

    public String getDbName() {
        return dbName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseData)) return false;
        BaseData baseData = (BaseData) o;
        return Objects.equals(collections, baseData.collections) &&
                Objects.equals(dbName, baseData.dbName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collections, dbName);
    }

    @Override
    public String toString() {
        return "BaseData{" +
                "collections=" + collections +
                ", dbName='" + dbName + '\'' +
                '}';
    }
}
