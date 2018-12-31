package com.ezlo.automation.framework.model.ezlo.inner;

import org.mongodb.morphia.annotations.Embedded;

import java.util.Objects;

public class UserData {

    private String email;
    private Boolean isOwner;
    private String profile;
    @Embedded
    private PermissionData permission;

    public UserData withEmail(String email) {
        this.email = email;
        return this;
    }

    public UserData withOwner(Boolean owner) {
        isOwner = owner;
        return this;
    }

    public UserData withProfile(String profile) {
        this.profile = profile;
        return this;
    }

    public UserData withPermission(PermissionData permission) {
        this.permission = permission;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getOwner() {
        return isOwner;
    }

    public String getProfile() {
        return profile;
    }

    public PermissionData getPermission() {
        return permission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserData)) return false;
        UserData userData = (UserData) o;
        return Objects.equals(email, userData.email) &&
                Objects.equals(isOwner, userData.isOwner) &&
                Objects.equals(profile, userData.profile) &&
                Objects.equals(permission, userData.permission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, isOwner, profile, permission);
    }

    @Override
    public String toString() {
        return "UserData{" +
                "email='" + email + '\'' +
                ", isOwner=" + isOwner +
                ", profile='" + profile + '\'' +
                ", permission=" + permission +
                '}';
    }
}
