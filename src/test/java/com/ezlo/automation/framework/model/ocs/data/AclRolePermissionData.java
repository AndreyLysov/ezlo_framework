package com.ezlo.automation.framework.model.ocs.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "acl_roles_permissions")
public class AclRolePermissionData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "action_id")
    private int actionId;

    @Column(name = "role_id")
    private int roleId;

    private boolean allowed;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    public AclRolePermissionData withActionId(int actionId) {
        this.actionId = actionId;
        return this;
    }

    public AclRolePermissionData withRoleId(int roleId) {
        this.roleId = roleId;
        return this;
    }

    public AclRolePermissionData withAllowed(boolean allowed) {
        this.allowed = allowed;
        return this;
    }

    public AclRolePermissionData withCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public AclRolePermissionData withUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public int getId() {
        return id;
    }

    public int getActionId() {
        return actionId;
    }

    public int getRoleId() {
        return roleId;
    }

    public boolean isAllowed() {
        return allowed;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AclRolePermissionData)) return false;
        AclRolePermissionData that = (AclRolePermissionData) o;
        return id == that.id &&
                actionId == that.actionId &&
                roleId == that.roleId &&
                allowed == that.allowed &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, actionId, roleId, allowed, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "AclRolePermissionData{" +
                "id=" + id +
                ", actionId=" + actionId +
                ", roleId=" + roleId +
                ", allowed=" + allowed +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
