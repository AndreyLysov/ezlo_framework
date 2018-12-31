package com.ezlo.automation.framework.model.ezlo.data;

import com.google.gson.annotations.Expose;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Objects;

@Entity(value = "cameras", noClassnameStored = true)
public class DeletedUserData {
    @Id
    @Expose
    @Property("_id")
    private String id;
    @Expose
    private String address;
    @Expose
    private String appType;
    @Expose
    private Boolean blocked;
    @Expose
    private String company;
    @Expose
    private Boolean confirmed;
    @Expose
    private String created;
    @Expose
    private String creator;
    @Expose
    private Boolean deleted;
    @Expose
    private String deletedAt;
    @Expose
    private String email;
    @Expose
    private Boolean enabled;
    @Expose
    private String md5Hash;
    @Expose
    private String name;
    @Expose
    private String phone;
    @Expose
    private String phone2;
    @Expose
    private String skype;
    @Expose
    private String updated;

    public DeletedUserData withId(String id) {
        this.id = id;
        return this;
    }

    public DeletedUserData withAddress(String address) {
        this.address = address;
        return this;
    }

    public DeletedUserData withAppType(String appType) {
        this.appType = appType;
        return this;
    }

    public DeletedUserData withBlocked(Boolean blocked) {
        this.blocked = blocked;
        return this;
    }

    public DeletedUserData withCompany(String company) {
        this.company = company;
        return this;
    }

    public DeletedUserData withConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
        return this;
    }

    public DeletedUserData withCreated(String created) {
        this.created = created;
        return this;
    }

    public DeletedUserData withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    public DeletedUserData withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public DeletedUserData withDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
        return this;
    }

    public DeletedUserData withEmail(String email) {
        this.email = email;
        return this;
    }

    public DeletedUserData withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public DeletedUserData withMd5Hash(String md5Hash) {
        this.md5Hash = md5Hash;
        return this;
    }

    public DeletedUserData withName(String name) {
        this.name = name;
        return this;
    }

    public DeletedUserData withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public DeletedUserData withPhone2(String phone2) {
        this.phone2 = phone2;
        return this;
    }

    public DeletedUserData withSkype(String skype) {
        this.skype = skype;
        return this;
    }

    public DeletedUserData withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getAppType() {
        return appType;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public String getCompany() {
        return company;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public String getCreated() {
        return created;
    }

    public String getCreator() {
        return creator;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public String getMd5Hash() {
        return md5Hash;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public String getSkype() {
        return skype;
    }

    public String getUpdated() {
        return updated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeletedUserData)) return false;
        DeletedUserData that = (DeletedUserData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(address, that.address) &&
                Objects.equals(appType, that.appType) &&
                Objects.equals(blocked, that.blocked) &&
                Objects.equals(company, that.company) &&
                Objects.equals(confirmed, that.confirmed) &&
                Objects.equals(created, that.created) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(deletedAt, that.deletedAt) &&
                Objects.equals(email, that.email) &&
                Objects.equals(enabled, that.enabled) &&
                Objects.equals(md5Hash, that.md5Hash) &&
                Objects.equals(name, that.name) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(phone2, that.phone2) &&
                Objects.equals(skype, that.skype) &&
                Objects.equals(updated, that.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, appType, blocked, company, confirmed, created, creator, deleted, deletedAt, email, enabled, md5Hash, name, phone, phone2, skype, updated);
    }

    @Override
    public String toString() {
        return "DeletedUserData{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", appType='" + appType + '\'' +
                ", blocked=" + blocked +
                ", company='" + company + '\'' +
                ", confirmed=" + confirmed +
                ", created='" + created + '\'' +
                ", creator='" + creator + '\'' +
                ", deleted=" + deleted +
                ", deletedAt='" + deletedAt + '\'' +
                ", email='" + email + '\'' +
                ", enabled=" + enabled +
                ", md5Hash='" + md5Hash + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", skype='" + skype + '\'' +
                ", updated='" + updated + '\'' +
                '}';
    }
}
