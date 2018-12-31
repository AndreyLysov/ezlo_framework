package com.ezlo.automation.framework.model.ocs.data;

import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "accounts")
public class AccountData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String email;

    private String phone;

    private String skype;

    @Transient
    private String password;

    @Column(name = "password")
    private String pswHash;

    @Column(name = "\"isVerified\"")
    private boolean isVerified;

    @Column(name = "\"verifyToken\"")
    private String verifyToken;

    @Column(name = "\"verifyExpires\"")
    private Timestamp verifyExpires;

    @Column(name = "\"resetToken\"")
    private String resetToken;

    @Column(name = "\"resetExpires\"")
    private Timestamp resetExpires;

    @Column(name = "\"lastSeen\"")
    private Timestamp lastSeen;

    private String avatar;

    private String role;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_status_id")
    private UserStatusData userStatusId;

    @Column(name = "\"companyAtRegistration\"")
    private String companyAtRegistration;

    private String position;

    @Column(name = "\"approvedByAdmin\"")
    private boolean approvedByAdmin;

    @Column(name = "\"isOnline\"")
    private boolean isOnline;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
    private Set<AccountRoleData> accountRoles;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private CompanyData company;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "assignee")
    private Set<TicketData> tickets;

    public AccountData withName(String name){
        this.name = name;
        return this;
    }

    public AccountData withEmail(String email) {
        this.email = email;
        return this;
    }

    public AccountData withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public AccountData withSkype(String skype) {
        this.skype = skype;
        return this;
    }

    public AccountData withPassword(String password) {
        this.password = password;
        this.pswHash = BCrypt.hashpw(password, BCrypt.gensalt());
        return this;
    }

    public AccountData withVerified(boolean verified) {
        isVerified = verified;
        return this;
    }

    public AccountData withVerifyToken(String verifyToken) {
        this.verifyToken = verifyToken;
        return this;
    }

    public AccountData withVerifyExpires(Timestamp verifyExpires) {
        this.verifyExpires = verifyExpires;
        return this;
    }

    public AccountData withResetToken(String resetToken) {
        this.resetToken = resetToken;
        return this;
    }

    public AccountData withResetExpires(Timestamp resetExpires) {
        this.resetExpires = resetExpires;
        return this;
    }

    public AccountData withLastSeen(Timestamp lastSeen) {
        this.lastSeen = lastSeen;
        return this;
    }

    public AccountData withAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public AccountData withRole(String role) {
        this.role = role;
        return this;
    }

    public AccountData withCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public AccountData withUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public AccountData withUserStatusId(UserStatusData userStatusId) {
        this.userStatusId = userStatusId;
        return this;
    }

    public AccountData withCompanyAtRegistration(String companyAtRegistration) {
        this.companyAtRegistration = companyAtRegistration;
        return this;
    }

    public AccountData withPosition(String position) {
        this.position = position;
        return this;
    }

    public AccountData withApprovedByAdmin(boolean approvedByAdmin) {
        this.approvedByAdmin = approvedByAdmin;
        return this;
    }

    public AccountData withOnline(boolean online) {
        isOnline = online;
        return this;
    }

    public AccountData withAccountRoles(Set<AccountRoleData> accountRoles) {
        this.accountRoles = accountRoles;
        return this;
    }

    public AccountData withCompany(CompanyData company){
        this.company = company;
        return this;
    }

    public AccountData withTickets(Set<TicketData> tickets){
        this.tickets = tickets;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSkype() {
        return skype;
    }

    public String getPassword() {
        return password;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public String getVerifyToken() {
        return verifyToken;
    }

    public Timestamp getVerifyExpires() {
        return verifyExpires;
    }

    public String getResetToken() {
        return resetToken;
    }

    public Timestamp getResetExpires() {
        return resetExpires;
    }

    public Timestamp getLastSeen() {
        return lastSeen;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getRole() {
        return role;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public UserStatusData getUserStatusId() {
        return userStatusId;
    }

    public String getCompanyAtRegistration() {
        return companyAtRegistration;
    }

    public String getPosition() {
        return position;
    }

    public boolean isApprovedByAdmin() {
        return approvedByAdmin;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public Set<AccountRoleData> getAccountRoles() {
        return accountRoles;
    }

    public CompanyData getCompany() {
        return company;
    }

    public Set<TicketData> getTickets() {
        return tickets;
    }

    public AccountData() {
        createdAt = new Timestamp(new Date().getTime());
        updatedAt = new Timestamp(new Date().getTime());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountData)) return false;
        AccountData that = (AccountData) o;
        return id == that.id &&
                isVerified == that.isVerified &&
                approvedByAdmin == that.approvedByAdmin &&
                isOnline == that.isOnline &&
                Objects.equals(name, that.name) &&
                Objects.equals(email, that.email) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(skype, that.skype) &&
                Objects.equals(verifyToken, that.verifyToken) &&
                Objects.equals(verifyExpires, that.verifyExpires) &&
                Objects.equals(resetToken, that.resetToken) &&
                Objects.equals(resetExpires, that.resetExpires) &&
                Objects.equals(lastSeen, that.lastSeen) &&
                Objects.equals(avatar, that.avatar) &&
                Objects.equals(role, that.role) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(companyAtRegistration, that.companyAtRegistration) &&
                Objects.equals(position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, phone, skype, isVerified, verifyToken, verifyExpires, resetToken, resetExpires, lastSeen, avatar, role, createdAt, updatedAt, companyAtRegistration, position, approvedByAdmin, isOnline);
    }

    @Override
    public String toString() {
        return "AccountData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", skype='" + skype + '\'' +
                ", password='" + password + '\'' +
                ", pswHash='" + pswHash + '\'' +
                ", isVerified=" + isVerified +
                ", verifyToken='" + verifyToken + '\'' +
                ", verifyExpires=" + verifyExpires +
                ", resetToken='" + resetToken + '\'' +
                ", resetExpires=" + resetExpires +
                ", lastSeen=" + lastSeen +
                ", avatar='" + avatar + '\'' +
                ", role='" + role + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", companyAtRegistration='" + companyAtRegistration + '\'' +
                ", position='" + position + '\'' +
                ", approvedByAdmin=" + approvedByAdmin +
                ", isOnline=" + isOnline +
                '}';
    }
}
