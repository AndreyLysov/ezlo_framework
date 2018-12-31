package com.ezlo.automation.framework.model.ocs.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "companies")
public class CompanyData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String address;

    @Column(name = "admin_contact")
    private String adminContact;

    private String logo;

    @Column(name = "users_count")
    private Integer usersCount;

    @Column(name = "ezlos_count")
    private Integer ezlosCount;

    @Column(name = "customers_count")
    private Integer customersCount;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "\"partnerAdmin\'")
    private boolean partnerAdmin;

    @Column(name = "\"companyAdmin\'")
    private boolean companyAdmin;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
    private Set<AccountData> accounts;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_status_id")
    private UserStatusData userStatus;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "companyId")
    private Set<CompanyNmaData> companyNmas;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "companyId")
    private Set<TicketData> tickets;

    public CompanyData() {
        createdAt = new Timestamp(new Date().getTime());
        updatedAt = new Timestamp(new Date().getTime());
    }

    public CompanyData withName(String name) {
        this.name = name;
        return this;
    }

    public CompanyData withAddress(String address) {
        this.address = address;
        return this;
    }

    public CompanyData withAdminContact(String adminContact) {
        this.adminContact = adminContact;
        return this;
    }

    public CompanyData withLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public CompanyData withUsersCount(Integer usersCount) {
        this.usersCount = usersCount;
        return this;
    }

    public CompanyData withEzlosCount(Integer ezlosCount) {
        this.ezlosCount = ezlosCount;
        return this;
    }

    public CompanyData withCustomersCount(Integer customersCount) {
        this.customersCount = customersCount;
        return this;
    }

    public CompanyData withCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public CompanyData withUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public CompanyData withIsPartnerAdmin(boolean partnerAdmin) {
        this.partnerAdmin = partnerAdmin;
        return this;
    }

    public CompanyData withCompanyAdmin(boolean companyAdmin) {
        this.companyAdmin = companyAdmin;
        return this;
    }

    public CompanyData withAccounts(Set<AccountData> accounts){
        this.accounts = accounts;
        return this;
    }

    public CompanyData withUserStatus(UserStatusData userStatus){
        this.userStatus = userStatus;
        return this;
    }

    public CompanyData withCompanyNmas(Set<CompanyNmaData> companyNmas){
        this.companyNmas = companyNmas;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAdminContact() {
        return adminContact;
    }

    public String getLogo() {
        return logo;
    }

    public Integer getUsersCount() {
        return usersCount;
    }

    public Integer getEzlosCount() {
        return ezlosCount;
    }

    public Integer getCustomersCount() {
        return customersCount;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public boolean isPartnerAdmin() {
        return partnerAdmin;
    }

    public boolean isCompanyAdmin() {
        return companyAdmin;
    }

    public Set<AccountData> getAccounts() {
        return accounts;
    }

    public UserStatusData getUserStatus() {
        return userStatus;
    }

    public Set<CompanyNmaData> getCompanyNmas() {
        return companyNmas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompanyData)) return false;
        CompanyData that = (CompanyData) o;
        return id == that.id &&
                partnerAdmin == that.partnerAdmin &&
                companyAdmin == that.companyAdmin &&
                Objects.equals(name, that.name) &&
                Objects.equals(address, that.address) &&
                Objects.equals(adminContact, that.adminContact) &&
                Objects.equals(logo, that.logo) &&
                Objects.equals(usersCount, that.usersCount) &&
                Objects.equals(ezlosCount, that.ezlosCount) &&
                Objects.equals(customersCount, that.customersCount) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, adminContact, logo, usersCount, ezlosCount, customersCount, createdAt, updatedAt, partnerAdmin, companyAdmin);
    }

    @Override
    public String toString() {
        return "CompanyData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", adminContact='" + adminContact + '\'' +
                ", logo='" + logo + '\'' +
                ", usersCount=" + usersCount +
                ", ezlosCount=" + ezlosCount +
                ", customersCount=" + customersCount +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", partnerAdmin=" + partnerAdmin +
                ", companyAdmin=" + companyAdmin +
                '}';
    }
}

