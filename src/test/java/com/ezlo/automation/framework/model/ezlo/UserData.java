package com.ezlo.automation.framework.model.ezlo;

import com.ezlo.automation.framework.common_baby.CommonMethods;
import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.Objects;

import static com.ezlo.automation.framework.generators.EzloDataGenerator.getDateTime;


@Entity(value = "users", noClassnameStored = true)
public class UserData {
    @Id
    @Expose
    protected ObjectId id;
    @Expose
    private String name;
    @Expose
    private String email;
    @Expose
    private String created;
    @Expose
    private String updated;
    @Expose
    private String creator;
    @Expose
    private boolean blocked;
    @Expose
    private boolean deleted;
    @Expose
    private String md5hash;
    @Expose
    private String locale;
    @Expose
    private String address;
    @Expose
    private String imageId;
    @Expose
    private String resetTime;
    @Expose
    private String password;
    @Expose
    private String confirmPassword;
    @Expose
    private String phone;
    @Expose
    private String skype;
    @Expose
    private String company;
    @Expose
    private String position;

    public UserData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public UserData withName(String name) {
        this.name = name;
        return this;
    }

    public UserData withEmail(String email) {
        this.email = email;
        return this;
    }

    public UserData withCreated(String created) {
        this.created = created.isEmpty()
                ? getDateTime("Y-MM-dd HH:mm:ss.SSSSSS")
                : created;
        return this;
    }

    public UserData withUpdated(String updated) {
        this.updated = updated.isEmpty()
                ? getDateTime("Y-MM-dd HH:mm:ss.SSSSSS")
                : updated;
        return this;
    }

    public UserData withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    public UserData withBlocked(boolean blocked) {
        this.blocked = blocked;
        return this;
    }

    public UserData withDeleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public UserData withMd5hash(String pass) {
        this.md5hash = CommonMethods.md5Hash(this.email + pass);
        return this;
    }

    public UserData withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    public UserData withAddress(String address) {
        this.address = address;
        return this;
    }

    public UserData withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public UserData withResetTime(String resetTime) {
        this.resetTime = resetTime;
        return this;
    }

    public UserData withPassword(String password) {
        this.password = password;
        return this;
    }

    public UserData withConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    public UserData withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserData withSkype(String skype) {
        this.skype = skype;
        return this;
    }

    public UserData withCompany(String company) {
        this.company = company;
        return this;
    }

    public UserData withPosition(String position) {
        this.position = position;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCreated() {
        return created;
    }

    public String getUpdated() {
        return updated;
    }

    public String getCreator() {
        return creator;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public String getMd5hash() {
        return md5hash;
    }

    public String getLocale() {
        return locale;
    }

    public String getAddress() {
        return address;
    }

    public String getImageId() {
        return imageId;
    }

    public String getsetTime() {
        return resetTime;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String getPhone() {
        return phone;
    }

    public String getSkype() {
        return skype;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserData)) return false;
        UserData userData = (UserData) o;
        return blocked == userData.blocked &&
                deleted == userData.deleted &&
                Objects.equals(id, userData.id) &&
                Objects.equals(name, userData.name) &&
                Objects.equals(email, userData.email) &&
                Objects.equals(created, userData.created) &&
                Objects.equals(updated, userData.updated) &&
                Objects.equals(creator, userData.creator) &&
                Objects.equals(md5hash, userData.md5hash) &&
                Objects.equals(locale, userData.locale) &&
                Objects.equals(address, userData.address) &&
                Objects.equals(imageId, userData.imageId) &&
                Objects.equals(resetTime, userData.resetTime) &&
                Objects.equals(password, userData.password) &&
                Objects.equals(confirmPassword, userData.confirmPassword) &&
                Objects.equals(phone, userData.phone) &&
                Objects.equals(skype, userData.skype) &&
                Objects.equals(company, userData.company) &&
                Objects.equals(position, userData.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, created, updated, creator, blocked, deleted, md5hash, locale, address, imageId, resetTime, password, confirmPassword, phone, skype, company, position);
    }

    @Override
    public String toString() {
        return "UserData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", created='" + created + '\'' +
                ", updated='" + updated + '\'' +
                ", creator='" + creator + '\'' +
                ", blocked=" + blocked +
                ", deleted=" + deleted +
                ", md5hash='" + md5hash + '\'' +
                ", locale='" + locale + '\'' +
                ", address='" + address + '\'' +
                ", imageId='" + imageId + '\'' +
                ", resetTime='" + resetTime + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", phone='" + phone + '\'' +
                ", skype='" + skype + '\'' +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
