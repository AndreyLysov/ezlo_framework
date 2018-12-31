package com.ezlo.automation.framework.model.ocs.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "user_statuses")
public class UserStatusData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "\"createdAt\"")
    private Timestamp createdAt;

    @Column(name = "\"updatedAt\"")
    private Timestamp updatedAt;

    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userStatus")
    private Set<CompanyData> companies;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userStatusId")
    private Set<AccountData> accounts;

    public UserStatusData withName(String name) {
        this.name = name;
        return this;
    }

    public UserStatusData withCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public UserStatusData withUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public UserStatusData withCompanies(Set<CompanyData> companies){
        this.companies = companies;
        return this;
    }

    public UserStatusData withAccounts(Set<AccountData> accounts){
        this.accounts = accounts;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public Set<CompanyData> getCompanies() {
        return companies;
    }

    public Set<AccountData> getAccounts() {
        return accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserStatusData)) return false;
        UserStatusData that = (UserStatusData) o;
        return id == that.id &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, updatedAt, name);
    }

    @Override
    public String toString() {
        return "UserStatusData{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", name='" + name + '\'' +
                '}';
    }
}
