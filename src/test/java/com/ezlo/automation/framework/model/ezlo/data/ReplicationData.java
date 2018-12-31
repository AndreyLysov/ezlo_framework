package com.ezlo.automation.framework.model.ezlo.data;

import com.ezlo.automation.framework.model.ezlo.inner.backup_inner_classes.*;
import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Objects;

@Entity(value = "replications", noClassnameStored = true)
public class ReplicationData {

    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    private String serial;
    @Expose
    @Embedded
    @Property("DB_ACL_permission")
    private DB_ACL_PermissionData dbAclPermission;
    @Expose
    @Embedded
    @Property("DB_DB_versions")
    private DB_DB_VersionData dbDbVersion;
    @Expose
    @Embedded
    @Property("DB_Ezlo_property")
    private DB_EzloPropertyData dbEzloProperty;
    @Expose
    @Embedded
    @Property("DB_HA_cache")
    private DB_HA_CacheData dbHaCache;
    @Expose
    @Embedded
    @Property("DB_HA_dataitems")
    private DB_HA_DataItemData dbHaDataItem;
    @Expose
    @Embedded
    @Property("DB_HA_devices")
    private DB_HA_DeviceData dbHaDevice;
    @Expose
    @Embedded
    @Property("DB_HA_gatewayCustomData")
    private DB_HA_GatewayCustomData dbHaGatewayCustom;
    @Expose
    @Embedded
    @Property("DB_HA_gateways")
    private DB_HA_GatewayData dbHaGateway;
    @Expose
    @Embedded
    @Property("DB_HA_items")
    private DB_HA_ItemData dbHaItem;
    @Expose
    @Embedded
    @Property("DB_HA_zwavePreferences")
    private DB_HA_ZwavePreferenceData dbHaZwavePreference;
    @Expose
    @Embedded
    @Property("DB_Rules_rules")
    private DB_RuleData dbRule;
    @Expose
    @Embedded
    @Property("DB_UI_pages")
    private DB_UI_PageData dbUiPage;
    @Expose
    @Embedded
    @Property("STICK_envm")
    private STICK_EnvmData stickEnvm;
    @Expose
    @Embedded
    @Property("STICK_homeId")
    private STICK_HomeIdData stickHomeId;
    @Expose
    @Embedded
    @Property("STICK_zddx")
    private STICK_ZddxData stickZddx;
    @Expose
    private String date;
    @Expose
    private String description;
    @Expose
    private Boolean partial;
    @Expose
    private Integer version;
    @Expose
    @Embedded
    @Property("DB_HA_favourites")
    private DB_HA_FavouriteData dbHaFavourite;
    @Expose
    @Embedded
    @Property("DB_UI_PageOrder")
    private DB_UI_PageOrderData dbUiPageOrder;
    @Expose
    @Embedded
    @Property("DB_UI_PageView")
    private DB_UI_PageViewData dbUiPageView;
    @Expose
    @Embedded
    @Property("DB_HA_subDevicesFavourites")
    private DB_HA_SubDevicesFavouriteData dbHaSubServicesFavourite;

    public ReplicationData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public ReplicationData withSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public ReplicationData withDbAclPermission(DB_ACL_PermissionData dbAclPermission) {
        this.dbAclPermission = dbAclPermission;
        return this;
    }

    public ReplicationData withDbDbVersion(DB_DB_VersionData dbDbVersion) {
        this.dbDbVersion = dbDbVersion;
        return this;
    }

    public ReplicationData withDbEzloProperty(DB_EzloPropertyData dbEzloProperty) {
        this.dbEzloProperty = dbEzloProperty;
        return this;
    }

    public ReplicationData withDbHaCache(DB_HA_CacheData dbHaCache) {
        this.dbHaCache = dbHaCache;
        return this;
    }

    public ReplicationData withDbHaDataItem(DB_HA_DataItemData dbHaDataItem) {
        this.dbHaDataItem = dbHaDataItem;
        return this;
    }

    public ReplicationData withDbHaDevice(DB_HA_DeviceData dbHaDevice) {
        this.dbHaDevice = dbHaDevice;
        return this;
    }

    public ReplicationData withDbHaGatewayCustom(DB_HA_GatewayCustomData dbHaGatewayCustom) {
        this.dbHaGatewayCustom = dbHaGatewayCustom;
        return this;
    }

    public ReplicationData withDbHaGateway(DB_HA_GatewayData dbHaGateway) {
        this.dbHaGateway = dbHaGateway;
        return this;
    }

    public ReplicationData withDbHaItem(DB_HA_ItemData dbHaItem) {
        this.dbHaItem = dbHaItem;
        return this;
    }

    public ReplicationData withDbHaZwavePreference(DB_HA_ZwavePreferenceData dbHaZwavePreference) {
        this.dbHaZwavePreference = dbHaZwavePreference;
        return this;
    }

    public ReplicationData withDbRule(DB_RuleData dbRule) {
        this.dbRule = dbRule;
        return this;
    }

    public ReplicationData withDbUiPage(DB_UI_PageData dbUiPage) {
        this.dbUiPage = dbUiPage;
        return this;
    }

    public ReplicationData withStickEnvm(STICK_EnvmData stickEnvm) {
        this.stickEnvm = stickEnvm;
        return this;
    }

    public ReplicationData withStickHomeId(STICK_HomeIdData stickHomeId) {
        this.stickHomeId = stickHomeId;
        return this;
    }

    public ReplicationData withStickZddx(STICK_ZddxData stickZddx) {
        this.stickZddx = stickZddx;
        return this;
    }

    public ReplicationData withDate(String date) {
        this.date = date;
        return this;
    }

    public ReplicationData withDescription(String description) {
        this.description = description;
        return this;
    }

    public ReplicationData withPartial(Boolean partial) {
        this.partial = partial;
        return this;
    }

    public ReplicationData withVersion(Integer version) {
        this.version = version;
        return this;
    }

    public ReplicationData withDbHaFavourite(DB_HA_FavouriteData dbHaFavourite) {
        this.dbHaFavourite = dbHaFavourite;
        return this;
    }

    public ReplicationData withDbUiPageOrder(DB_UI_PageOrderData dbUiPageOrder) {
        this.dbUiPageOrder = dbUiPageOrder;
        return this;
    }

    public ReplicationData withDbUiPageView(DB_UI_PageViewData dbUiPageView) {
        this.dbUiPageView = dbUiPageView;
        return this;
    }

    public ReplicationData withDbHaSubServicesFavourite(DB_HA_SubDevicesFavouriteData dbHaSubServicesFavourite) {
        this.dbHaSubServicesFavourite = dbHaSubServicesFavourite;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public String getSerial() {
        return serial;
    }

    public DB_ACL_PermissionData getDbAclPermission() {
        return dbAclPermission;
    }

    public DB_DB_VersionData getDbDbVersion() {
        return dbDbVersion;
    }

    public DB_EzloPropertyData getDbEzloProperty() {
        return dbEzloProperty;
    }

    public DB_HA_CacheData getDbHaCache() {
        return dbHaCache;
    }

    public DB_HA_DataItemData getDbHaDataItem() {
        return dbHaDataItem;
    }

    public DB_HA_DeviceData getDbHaDevice() {
        return dbHaDevice;
    }

    public DB_HA_GatewayCustomData getDbHaGatewayCustom() {
        return dbHaGatewayCustom;
    }

    public DB_HA_GatewayData getDbHaGateway() {
        return dbHaGateway;
    }

    public DB_HA_ItemData getDbHaItem() {
        return dbHaItem;
    }

    public DB_HA_ZwavePreferenceData getDbHaZwavePreference() {
        return dbHaZwavePreference;
    }

    public DB_RuleData getDbRule() {
        return dbRule;
    }

    public DB_UI_PageData getDbUiPage() {
        return dbUiPage;
    }

    public STICK_EnvmData getStickEnvm() {
        return stickEnvm;
    }

    public STICK_HomeIdData getStickHomeId() {
        return stickHomeId;
    }

    public STICK_ZddxData getStickZddx() {
        return stickZddx;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getPartial() {
        return partial;
    }

    public Integer getVersion() {
        return version;
    }

    public DB_HA_FavouriteData getDbHaFavourite() {
        return dbHaFavourite;
    }

    public DB_UI_PageOrderData getDbUiPageOrder() {
        return dbUiPageOrder;
    }

    public DB_UI_PageViewData getDbUiPageView() {
        return dbUiPageView;
    }

    public DB_HA_SubDevicesFavouriteData getDbHaSubServicesFavourite() {
        return dbHaSubServicesFavourite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReplicationData)) return false;
        ReplicationData that = (ReplicationData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(serial, that.serial) &&
                Objects.equals(dbAclPermission, that.dbAclPermission) &&
                Objects.equals(dbDbVersion, that.dbDbVersion) &&
                Objects.equals(dbEzloProperty, that.dbEzloProperty) &&
                Objects.equals(dbHaCache, that.dbHaCache) &&
                Objects.equals(dbHaDataItem, that.dbHaDataItem) &&
                Objects.equals(dbHaDevice, that.dbHaDevice) &&
                Objects.equals(dbHaGatewayCustom, that.dbHaGatewayCustom) &&
                Objects.equals(dbHaGateway, that.dbHaGateway) &&
                Objects.equals(dbHaItem, that.dbHaItem) &&
                Objects.equals(dbHaZwavePreference, that.dbHaZwavePreference) &&
                Objects.equals(dbRule, that.dbRule) &&
                Objects.equals(dbUiPage, that.dbUiPage) &&
                Objects.equals(stickEnvm, that.stickEnvm) &&
                Objects.equals(stickHomeId, that.stickHomeId) &&
                Objects.equals(stickZddx, that.stickZddx) &&
                Objects.equals(date, that.date) &&
                Objects.equals(description, that.description) &&
                Objects.equals(partial, that.partial) &&
                Objects.equals(version, that.version) &&
                Objects.equals(dbHaFavourite, that.dbHaFavourite) &&
                Objects.equals(dbUiPageOrder, that.dbUiPageOrder) &&
                Objects.equals(dbUiPageView, that.dbUiPageView) &&
                Objects.equals(dbHaSubServicesFavourite, that.dbHaSubServicesFavourite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serial, dbAclPermission, dbDbVersion, dbEzloProperty, dbHaCache, dbHaDataItem, dbHaDevice, dbHaGatewayCustom, dbHaGateway, dbHaItem, dbHaZwavePreference, dbRule, dbUiPage, stickEnvm, stickHomeId, stickZddx, date, description, partial, version, dbHaFavourite, dbUiPageOrder, dbUiPageView, dbHaSubServicesFavourite);
    }

    @Override
    public String toString() {
        return "ReplicationData{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                ", dbAclPermission=" + dbAclPermission +
                ", dbDbVersion=" + dbDbVersion +
                ", dbEzloProperty=" + dbEzloProperty +
                ", dbHaCache=" + dbHaCache +
                ", dbHaDataItem=" + dbHaDataItem +
                ", dbHaDevice=" + dbHaDevice +
                ", dbHaGatewayCustom=" + dbHaGatewayCustom +
                ", dbHaGateway=" + dbHaGateway +
                ", dbHaItem=" + dbHaItem +
                ", dbHaZwavePreference=" + dbHaZwavePreference +
                ", dbRule=" + dbRule +
                ", dbUiPage=" + dbUiPage +
                ", stickEnvm=" + stickEnvm +
                ", stickHomeId=" + stickHomeId +
                ", stickZddx=" + stickZddx +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", partial=" + partial +
                ", version=" + version +
                ", dbHaFavourite=" + dbHaFavourite +
                ", dbUiPageOrder=" + dbUiPageOrder +
                ", dbUiPageView=" + dbUiPageView +
                ", dbHaSubServicesFavourite=" + dbHaSubServicesFavourite +
                '}';
    }
}
