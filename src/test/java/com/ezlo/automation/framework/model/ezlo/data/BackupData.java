package com.ezlo.automation.framework.model.ezlo.data;

import com.ezlo.automation.framework.model.ezlo.inner.NmaData;
import com.ezlo.automation.framework.model.ezlo.inner.backup_inner_classes.*;
import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Objects;

@Entity(value = "backups", noClassnameStored = true)
public class BackupData {

    @Id
    @Expose
    @Property("_id")
    private ObjectId _id;
    @Expose
    @Embedded
    private DB_ACL_PermissionData DB_ACL_permission;
    @Expose
    @Embedded
    private DB_DB_VersionData DB_DB_versions;
    @Expose
    @Embedded
    private DB_EzloPropertyData DB_Ezlo_property;
    @Expose
    @Embedded
    private DB_HA_CacheData DB_HA_cache;
    @Expose
    @Embedded
    private DB_HA_DataItemData DB_HA_dataitems;
    @Expose
    @Embedded
    private DB_HA_DeviceData DB_HA_devices;
    @Expose
    @Embedded
    private DB_HA_FavouriteData DB_HA_favourites;
    @Expose
    @Embedded
    private DB_HA_GatewayCustomData DB_HA_gatewayCustomData;
    @Expose
    @Embedded
    private DB_HA_GatewayData DB_HA_gateways;
    @Expose
    @Embedded
    private DB_HA_ItemData DB_HA_items;
    @Expose
    @Embedded
    private DB_HA_ZwavePreferenceData DB_HA_zwavePreferences;
    @Expose
    @Embedded
    private DB_RuleData DB_Rules_rules;
    @Expose
    @Embedded
    private DB_UI_PageOrderData DB_UI_PageOrder;
    @Expose
    @Embedded
    private DB_UI_PageViewData DB_UI_PageView;
    @Expose
    @Embedded
    private DB_UI_PageData DB_UI_pages;
    @Expose
    @Embedded
    private STICK_EnvmData STICK_envm;
    @Expose
    @Embedded
    private STICK_HomeIdData STICK_homeId;
    @Expose
    @Embedded
    private STICK_ZddxData STICK_zddx;
    @Expose
    private String date;
    @Expose
    private String description;
    @Expose
    private Boolean isAutoBackup;
    @Expose
    @Embedded
    private NmaData nmaData;
    @Expose
    private String serial;
    @Expose
    private Integer version;

    public BackupData with_id(ObjectId _id) {
        this._id = _id;
        return this;
    }

    public BackupData withDB_ACL_permission(DB_ACL_PermissionData DB_ACL_permission) {
        this.DB_ACL_permission = DB_ACL_permission;
        return this;
    }

    public BackupData withDB_DB_versions(DB_DB_VersionData DB_DB_versions) {
        this.DB_DB_versions = DB_DB_versions;
        return this;
    }

    public BackupData withDB_Ezlo_property(DB_EzloPropertyData DB_Ezlo_property) {
        this.DB_Ezlo_property = DB_Ezlo_property;
        return this;
    }

    public BackupData withDB_HA_cache(DB_HA_CacheData DB_HA_cache) {
        this.DB_HA_cache = DB_HA_cache;
        return this;
    }

    public BackupData withDB_HA_dataitems(DB_HA_DataItemData DB_HA_dataitems) {
        this.DB_HA_dataitems = DB_HA_dataitems;
        return this;
    }

    public BackupData withDB_HA_devices(DB_HA_DeviceData DB_HA_devices) {
        this.DB_HA_devices = DB_HA_devices;
        return this;
    }

    public BackupData withDB_HA_favourites(DB_HA_FavouriteData DB_HA_favourites) {
        this.DB_HA_favourites = DB_HA_favourites;
        return this;
    }

    public BackupData withDB_HA_gatewayCustomData(DB_HA_GatewayCustomData DB_HA_gatewayCustomData) {
        this.DB_HA_gatewayCustomData = DB_HA_gatewayCustomData;
        return this;
    }

    public BackupData withDB_HA_gateways(DB_HA_GatewayData DB_HA_gateways) {
        this.DB_HA_gateways = DB_HA_gateways;
        return this;
    }

    public BackupData withDB_HA_items(DB_HA_ItemData DB_HA_items) {
        this.DB_HA_items = DB_HA_items;
        return this;
    }

    public BackupData withDB_HA_zwavePreferences(DB_HA_ZwavePreferenceData DB_HA_zwavePreferences) {
        this.DB_HA_zwavePreferences = DB_HA_zwavePreferences;
        return this;
    }

    public BackupData withDB_Rules_rules(DB_RuleData DB_Rules_rules) {
        this.DB_Rules_rules = DB_Rules_rules;
        return this;
    }

    public BackupData withDB_UI_PageOrder(DB_UI_PageOrderData DB_UI_PageOrder) {
        this.DB_UI_PageOrder = DB_UI_PageOrder;
        return this;
    }

    public BackupData withDB_UI_PageView(DB_UI_PageViewData DB_UI_PageView) {
        this.DB_UI_PageView = DB_UI_PageView;
        return this;
    }

    public BackupData withDB_UI_pages(DB_UI_PageData DB_UI_pages) {
        this.DB_UI_pages = DB_UI_pages;
        return this;
    }

    public BackupData withSTICK_envm(STICK_EnvmData STICK_envm) {
        this.STICK_envm = STICK_envm;
        return this;
    }

    public BackupData withSTICK_homeId(STICK_HomeIdData STICK_homeId) {
        this.STICK_homeId = STICK_homeId;
        return this;
    }

    public BackupData withSTICK_zddx(STICK_ZddxData STICK_zddx) {
        this.STICK_zddx = STICK_zddx;
        return this;
    }

    public BackupData withDate(String date) {
        this.date = date;
        return this;
    }

    public BackupData withDescription(String description) {
        this.description = description;
        return this;
    }

    public BackupData withAutoBackup(Boolean autoBackup) {
        isAutoBackup = autoBackup;
        return this;
    }

    public BackupData withNmaData(NmaData nmaData) {
        this.nmaData = nmaData;
        return this;
    }

    public BackupData withSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public BackupData withVersion(Integer version) {
        this.version = version;
        return this;
    }

    public ObjectId get_id() {
        return _id;
    }

    public DB_ACL_PermissionData getDB_ACL_permission() {
        return DB_ACL_permission;
    }

    public DB_DB_VersionData getDB_DB_versions() {
        return DB_DB_versions;
    }

    public DB_EzloPropertyData getDB_Ezlo_property() {
        return DB_Ezlo_property;
    }

    public DB_HA_CacheData getDB_HA_cache() {
        return DB_HA_cache;
    }

    public DB_HA_DataItemData getDB_HA_dataitems() {
        return DB_HA_dataitems;
    }

    public DB_HA_DeviceData getDB_HA_devices() {
        return DB_HA_devices;
    }

    public DB_HA_FavouriteData getDB_HA_favourites() {
        return DB_HA_favourites;
    }

    public DB_HA_GatewayCustomData getDB_HA_gatewayCustomData() {
        return DB_HA_gatewayCustomData;
    }

    public DB_HA_GatewayData getDB_HA_gateways() {
        return DB_HA_gateways;
    }

    public DB_HA_ItemData getDB_HA_items() {
        return DB_HA_items;
    }

    public DB_HA_ZwavePreferenceData getDB_HA_zwavePreferences() {
        return DB_HA_zwavePreferences;
    }

    public DB_RuleData getDB_Rules_rules() {
        return DB_Rules_rules;
    }

    public DB_UI_PageOrderData getDB_UI_PageOrder() {
        return DB_UI_PageOrder;
    }

    public DB_UI_PageViewData getDB_UI_PageView() {
        return DB_UI_PageView;
    }

    public DB_UI_PageData getDB_UI_pages() {
        return DB_UI_pages;
    }

    public STICK_EnvmData getSTICK_envm() {
        return STICK_envm;
    }

    public STICK_HomeIdData getSTICK_homeId() {
        return STICK_homeId;
    }

    public STICK_ZddxData getSTICK_zddx() {
        return STICK_zddx;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getAutoBackup() {
        return isAutoBackup;
    }

    public NmaData getNmaData() {
        return nmaData;
    }

    public String getSerial() {
        return serial;
    }

    public Integer getVersion() {
        return version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BackupData)) return false;
        BackupData that = (BackupData) o;
        return Objects.equals(_id, that._id) &&
                Objects.equals(DB_ACL_permission, that.DB_ACL_permission) &&
                Objects.equals(DB_DB_versions, that.DB_DB_versions) &&
                Objects.equals(DB_Ezlo_property, that.DB_Ezlo_property) &&
                Objects.equals(DB_HA_cache, that.DB_HA_cache) &&
                Objects.equals(DB_HA_dataitems, that.DB_HA_dataitems) &&
                Objects.equals(DB_HA_devices, that.DB_HA_devices) &&
                Objects.equals(DB_HA_favourites, that.DB_HA_favourites) &&
                Objects.equals(DB_HA_gatewayCustomData, that.DB_HA_gatewayCustomData) &&
                Objects.equals(DB_HA_gateways, that.DB_HA_gateways) &&
                Objects.equals(DB_HA_items, that.DB_HA_items) &&
                Objects.equals(DB_HA_zwavePreferences, that.DB_HA_zwavePreferences) &&
                Objects.equals(DB_Rules_rules, that.DB_Rules_rules) &&
                Objects.equals(DB_UI_PageOrder, that.DB_UI_PageOrder) &&
                Objects.equals(DB_UI_PageView, that.DB_UI_PageView) &&
                Objects.equals(DB_UI_pages, that.DB_UI_pages) &&
                Objects.equals(STICK_envm, that.STICK_envm) &&
                Objects.equals(STICK_homeId, that.STICK_homeId) &&
                Objects.equals(STICK_zddx, that.STICK_zddx) &&
                Objects.equals(date, that.date) &&
                Objects.equals(description, that.description) &&
                Objects.equals(isAutoBackup, that.isAutoBackup) &&
                Objects.equals(nmaData, that.nmaData) &&
                Objects.equals(serial, that.serial) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_id, DB_ACL_permission, DB_DB_versions, DB_Ezlo_property, DB_HA_cache, DB_HA_dataitems, DB_HA_devices, DB_HA_favourites, DB_HA_gatewayCustomData, DB_HA_gateways, DB_HA_items, DB_HA_zwavePreferences, DB_Rules_rules, DB_UI_PageOrder, DB_UI_PageView, DB_UI_pages, STICK_envm, STICK_homeId, STICK_zddx, date, description, isAutoBackup, nmaData, serial, version);
    }

    @Override
    public String toString() {
        return "BackupData{" +
                "_id=" + _id +
                ", DB_ACL_permission=" + DB_ACL_permission +
                ", DB_DB_versions=" + DB_DB_versions +
                ", DB_Ezlo_property=" + DB_Ezlo_property +
                ", DB_HA_cache=" + DB_HA_cache +
                ", DB_HA_dataitems=" + DB_HA_dataitems +
                ", DB_HA_devices=" + DB_HA_devices +
                ", DB_HA_favourites=" + DB_HA_favourites +
                ", DB_HA_gatewayCustomData=" + DB_HA_gatewayCustomData +
                ", DB_HA_gateways=" + DB_HA_gateways +
                ", DB_HA_items=" + DB_HA_items +
                ", DB_HA_zwavePreferences=" + DB_HA_zwavePreferences +
                ", DB_Rules_rules=" + DB_Rules_rules +
                ", DB_UI_PageOrder=" + DB_UI_PageOrder +
                ", DB_UI_PageView=" + DB_UI_PageView +
                ", DB_UI_pages=" + DB_UI_pages +
                ", STICK_envm=" + STICK_envm +
                ", STICK_homeId=" + STICK_homeId +
                ", STICK_zddx=" + STICK_zddx +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", isAutoBackup=" + isAutoBackup +
                ", nmaData=" + nmaData +
                ", serial='" + serial + '\'' +
                ", version=" + version +
                '}';
    }
}
