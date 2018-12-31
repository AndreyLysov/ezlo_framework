package com.ezlo.automation.framework.model.ezlo.inner;

import java.util.Objects;

public class PermissionData {
    
    private String devices;
    private String ezlo;
    private String rules;
    private String ui;
    private String users;

    public PermissionData withDevices(String devices) {
        this.devices = devices;
        return this;
    }

    public PermissionData withEzlo(String ezlo) {
        this.ezlo = ezlo;
        return this;
    }

    public PermissionData withRules(String rules) {
        this.rules = rules;
        return this;
    }

    public PermissionData withUi(String ui) {
        this.ui = ui;
        return this;
    }

    public PermissionData withUsers(String users) {
        this.users = users;
        return this;
    }

    public String getDevices() {
        return devices;
    }

    public String getEzlo() {
        return ezlo;
    }

    public String getRules() {
        return rules;
    }

    public String getUi() {
        return ui;
    }

    public String getUsers() {
        return users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PermissionData)) return false;
        PermissionData that = (PermissionData) o;
        return Objects.equals(devices, that.devices) &&
                Objects.equals(ezlo, that.ezlo) &&
                Objects.equals(rules, that.rules) &&
                Objects.equals(ui, that.ui) &&
                Objects.equals(users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(devices, ezlo, rules, ui, users);
    }

    @Override
    public String toString() {
        return "PermissionData{" +
                "devices='" + devices + '\'' +
                ", ezlo='" + ezlo + '\'' +
                ", rules='" + rules + '\'' +
                ", ui='" + ui + '\'' +
                ", users='" + users + '\'' +
                '}';
    }
}
