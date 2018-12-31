package com.ezlo.automation.framework.model.ocs.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tickets")
public class TicketData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "request_id")
    private RequestSqlData requestId;

    @Column(name = "requester_email")
    private String requesterEmail;

    @Column(name = "requester_name")
    private String requesterName;

    @Column(name = "requester_skype")
    private String requesterSkype;

    @Column(name = "requester_phone")
    private String requesterPhone;

    @Column(name = "hub_type")
    private String hubType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id")
    private TicketSubjectData subjectId;

    private String description;

    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id")
    private TicketStatusData statusId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assignee_id")
    private AccountData assignee;

    @Column(name = "time_estimated")
    private String timeEstimated;

    @Column(name = "time_log")
    private String timeLog;

    @Column(name = "due_date")
    private Timestamp dueDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private CompanyData companyId;

    @Column(name = "\"createdAt\"")
    private Timestamp createdAt;

    @Column(name = "\"updatedAt\"")
    private Timestamp updatedAt;

    public TicketData withRequestId(RequestSqlData requestId) {
        this.requestId = requestId;
        return this;
    }

    public TicketData withRequesterEmail(String requesterEmail) {
        this.requesterEmail = requesterEmail;
        return this;
    }

    public TicketData withRequesterName(String requesterName) {
        this.requesterName = requesterName;
        return this;
    }

    public TicketData withRequesterSkype(String requesterSkype) {
        this.requesterSkype = requesterSkype;
        return this;
    }

    public TicketData withRequesterPhone(String requesterPhone) {
        this.requesterPhone = requesterPhone;
        return this;
    }

    public TicketData withHubType(String hubType) {
        this.hubType = hubType;
        return this;
    }

    public TicketData withSubjectId(TicketSubjectData subjectId) {
        this.subjectId = subjectId;
        return this;
    }

    public TicketData withDescription(String description) {
        this.description = description;
        return this;
    }

    public TicketData withTitle(String title) {
        this.title = title;
        return this;
    }

    public TicketData withStatusId(TicketStatusData statusId) {
        this.statusId = statusId;
        return this;
    }

    public TicketData withAssignee(AccountData assignee){
        this.assignee = assignee;
        return this;
    }

    public TicketData withTimeEstimated(String timeEstimated) {
        this.timeEstimated = timeEstimated;
        return this;
    }

    public TicketData withTimeLog(String timeLog) {
        this.timeLog = timeLog;
        return this;
    }

    public TicketData withDueDate(Timestamp dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public TicketData withCompanyId(CompanyData companyId) {
        this.companyId = companyId;
        return this;
    }

    public TicketData withCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public TicketData withUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public int getId() {
        return id;
    }

    public RequestSqlData getRequestId() {
        return requestId;
    }

    public String getRequesterEmail() {
        return requesterEmail;
    }

    public String getRequesterName() {
        return requesterName;
    }

    public String getRequesterSkype() {
        return requesterSkype;
    }

    public String getRequesterPhone() {
        return requesterPhone;
    }

    public String getHubType() {
        return hubType;
    }

    public TicketSubjectData getSubjectId() {
        return subjectId;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public TicketStatusData getStatusId() {
        return statusId;
    }

    public String getTimeEstimated() {
        return timeEstimated;
    }

    public String getTimeLog() {
        return timeLog;
    }

    public Timestamp getDueDate() {
        return dueDate;
    }

    public CompanyData getCompanyId() {
        return companyId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public AccountData getAssignee() {
        return assignee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TicketData)) return false;
        TicketData that = (TicketData) o;
        return id == that.id &&
                Objects.equals(requesterEmail, that.requesterEmail) &&
                Objects.equals(requesterName, that.requesterName) &&
                Objects.equals(requesterSkype, that.requesterSkype) &&
                Objects.equals(requesterPhone, that.requesterPhone) &&
                Objects.equals(hubType, that.hubType) &&
                Objects.equals(description, that.description) &&
                Objects.equals(title, that.title) &&
                Objects.equals(timeEstimated, that.timeEstimated) &&
                Objects.equals(timeLog, that.timeLog) &&
                Objects.equals(dueDate, that.dueDate) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, requesterEmail, requesterName, requesterSkype, requesterPhone, hubType, description, title, timeEstimated, timeLog, dueDate, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "TicketData{" +
                "id=" + id +
                ", requesterEmail='" + requesterEmail + '\'' +
                ", requesterName='" + requesterName + '\'' +
                ", requesterSkype='" + requesterSkype + '\'' +
                ", requesterPhone='" + requesterPhone + '\'' +
                ", hubType='" + hubType + '\'' +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                ", timeEstimated='" + timeEstimated + '\'' +
                ", timeLog='" + timeLog + '\'' +
                ", dueDate=" + dueDate +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}

