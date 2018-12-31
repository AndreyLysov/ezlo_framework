package com.ezlo.automation.framework.model.ocs.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "requests")
public class RequestSqlData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "from_nma")
    private String fromNma;

    @Column(name = "customer_email")
    private String customerEmail;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_skype")
    private String customerSkype;

    @Column(name = "customer_phone")
    private String customerPhone;

    @Column(name = "hub_type")
    private String hubType;

    private String subject;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id")
    private TicketStatusData statusId;

    @Column(name = "\"createdAt\"")
    private Timestamp createdAt;

    @Column(name = "\"updatedAt\"")
    private Timestamp updatedAt;

    public RequestSqlData withFromNma(String fromNma) {
        this.fromNma = fromNma;
        return this;
    }

    public RequestSqlData withCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    public RequestSqlData withCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public RequestSqlData withCustomerSkype(String customerSkype) {
        this.customerSkype = customerSkype;
        return this;
    }

    public RequestSqlData withCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
        return this;
    }

    public RequestSqlData withHubType(String hubType) {
        this.hubType = hubType;
        return this;
    }

    public RequestSqlData withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public RequestSqlData withDescription(String description) {
        this.description = description;
        return this;
    }

    public RequestSqlData withStatusId(TicketStatusData statusId) {
        this.statusId = statusId;
        return this;
    }

    public RequestSqlData withCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public RequestSqlData withUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getFromNma() {
        return fromNma;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerSkype() {
        return customerSkype;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public String getHubType() {
        return hubType;
    }

    public String getSubject() {
        return subject;
    }

    public String getDescription() {
        return description;
    }

    public TicketStatusData getStatusId() {
        return statusId;
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
        if (!(o instanceof RequestSqlData)) return false;
        RequestSqlData that = (RequestSqlData) o;
        return id == that.id &&
                Objects.equals(fromNma, that.fromNma) &&
                Objects.equals(customerEmail, that.customerEmail) &&
                Objects.equals(customerName, that.customerName) &&
                Objects.equals(customerSkype, that.customerSkype) &&
                Objects.equals(customerPhone, that.customerPhone) &&
                Objects.equals(hubType, that.hubType) &&
                Objects.equals(subject, that.subject) &&
                Objects.equals(description, that.description) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fromNma, customerEmail, customerName, customerSkype, customerPhone, hubType, subject, description, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "RequestSqlData{" +
                "id=" + id +
                ", fromNma='" + fromNma + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerSkype='" + customerSkype + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", hubType='" + hubType + '\'' +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
