package com.ezlo.automation.framework.model.ocs.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "roles")
public class RoleData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String label;

    @Column(name = "\"createdAt\"")
    private Timestamp createdAt;

    @Column(name = "\"updatedAt\"")
    private Timestamp updatedAt;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
    private Set<AccountRoleData> accountRoles;

    public RoleData() {
        updatedAt = new Timestamp(new Date().getTime());
        createdAt = new Timestamp(new Date().getTime());
    }

    public RoleData(HashMap<String, String> role) {
        this.id = Integer.parseInt(role.get("id"));
        this.name = role.get("name");
        this.label = role.get("label");
    }

    public RoleData withName(String name) {
        this.name = name;
        return this;
    }

    public RoleData withLabel(String label) {
        this.label = label;
        return this;
    }

    public RoleData withCreateAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public RoleData withUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public RoleData withAccountRole(AccountRoleData accountRole){
        this.accountRoles = accountRoles;
        return this;
    }

    public Set<AccountRoleData> getAccountRoles() {
        return accountRoles;
    }

    public String getName() {
        return name;
    }

    public String getLabel() {
        return label;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoleData)) return false;
        RoleData roleData = (RoleData) o;
        return id == roleData.id &&
                Objects.equals(name, roleData.name) &&
                Objects.equals(label, roleData.label) &&
                Objects.equals(createdAt, roleData.createdAt) &&
                Objects.equals(updatedAt, roleData.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, label, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "RoleData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", label='" + label + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}