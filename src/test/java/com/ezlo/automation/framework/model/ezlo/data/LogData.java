package com.ezlo.automation.framework.model.ezlo.data;

import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Date;
import java.util.Objects;


@Entity(value = "logs", noClassnameStored = true)
public class LogData {

    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    private String completed;
    @Expose
    private Date date;
    @Expose
    private String error;
    @Expose
    private String operation;
    @Expose
    private String operationId;
    @Expose
    private String serial;
    @Expose
    private String status;


    public LogData withCompleted(String completed) {
        this.completed = completed;
        return this;
    }

    public LogData withDate(Date date) {
        this.date = date;
        return this;
    }

    public LogData withError(String error) {
        this.error = error;
        return this;
    }
    public LogData withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    public LogData withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    public LogData withSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public LogData withStatus(String status) {
        this.status = status;
        return this;
    }

    public ObjectId getId() { return id; }

    public String getCompleted() { return completed; }

    public Date getDate() { return date; }

    public String getError() { return error; }

    public String getOperation() { return operation; }

    public String getOperationId() { return operationId; }

    public String getSerial() { return serial; }

    public String getStatus() { return status; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogData)) return false;
        LogData that = (LogData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(completed, that.completed) &&
                Objects.equals(date, that.date) &&
                Objects.equals(error, that.error) &&
                Objects.equals(operation, that.operation) &&
                Objects.equals(operationId, that.operationId) &&
                Objects.equals(serial, that.serial) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, completed, date, error, operation, operationId, serial, status);
    }

    @Override
    public String toString() {
        return "LogData{" +
                "id='" + id + '\'' +
                ", completed='" + completed + '\'' +
                ", date='" + date + '\'' +
                ", error='" + error + '\'' +
                ", operation='" + operation + '\'' +
                ", operationId='" + operationId + '\'' +
                ", serial='" + serial + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}