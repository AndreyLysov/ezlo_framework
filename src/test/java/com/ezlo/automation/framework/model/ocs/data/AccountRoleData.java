package com.ezlo.automation.framework.model.ocs.data;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "account_roles")
public class AccountRoleData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private RoleData role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private AccountData account;

    @Column(name = "\"createdAt\'")
    private Timestamp createdAt;

    @Column(name = "\"updatedAt\'")
    private Timestamp updatedAt;

    public AccountRoleData() {
        updatedAt = new Timestamp(new Date().getTime());
        createdAt = new Timestamp(new Date().getTime());
    }

    public AccountRoleData withRole(RoleData role) {
        this.role = role;
        return this;
    }

    public AccountRoleData withAccount(AccountData account) {
        this.account = account;
        return this;
    }

    public AccountRoleData withCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public AccountRoleData withUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public int getId() {
        return id;
    }

    public RoleData getRole() {
        return role;
    }

    public AccountData getAccount() {
        return account;
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
        if (!(o instanceof AccountRoleData)) return false;
        AccountRoleData that = (AccountRoleData) o;
        return id == that.id &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "AccountRoleData{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
