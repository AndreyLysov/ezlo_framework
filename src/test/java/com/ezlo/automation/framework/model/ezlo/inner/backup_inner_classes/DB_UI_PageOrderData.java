package com.ezlo.automation.framework.model.ezlo.inner.backup_inner_classes;

import java.util.Objects;

public class DB_UI_PageOrderData {

    private String data;
    private String md5;
    private String name;
    private String uncompressedLength;

    public DB_UI_PageOrderData withData(String data){
        this.data = data;
        return this;
    }

    public DB_UI_PageOrderData withMd5(String md5){
        this.md5 = md5;
        return this;
    }

    public DB_UI_PageOrderData withName(String name){
        this.name = name;
        return this;
    }

    public DB_UI_PageOrderData withUncompressedLength(String uncompressedLength){
        this.uncompressedLength = uncompressedLength;
        return this;
    }

    public String getData() {
        return data;
    }

    public String getMd5() {
        return md5;
    }

    public String getName() {
        return name;
    }

    public String getUncompressedLength() {
        return uncompressedLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DB_UI_PageOrderData)) return false;
        DB_UI_PageOrderData that = (DB_UI_PageOrderData) o;
        return Objects.equals(data, that.data) &&
                Objects.equals(md5, that.md5) &&
                Objects.equals(name, that.name) &&
                Objects.equals(uncompressedLength, that.uncompressedLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, md5, name, uncompressedLength);
    }

    @Override
    public String toString() {
        return "DB_ACL_PermissionData{" +
                "data='" + data + '\'' +
                ", md5='" + md5 + '\'' +
                ", name='" + name + '\'' +
                ", uncompressedLength='" + uncompressedLength + '\'' +
                '}';
    }
}
