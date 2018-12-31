package com.ezlo.automation.framework.model.ocs.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "hubs_nmas")
public class HubNmaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String serial;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nma_id")
    private NmaData nma;

    @Column(name = "\"createdAt\"")
    private Timestamp createdAt;

    @Column(name = "\"updatedAt\"")
    private Timestamp updatedAt;

    public HubNmaData withSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public HubNmaData withNmaID(NmaData nma) {
        this.nma = nma;
        return this;
    }

    public HubNmaData withCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public HubNmaData withUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public HubNmaData() {
        createdAt = new Timestamp(new Date().getTime());
        updatedAt = new Timestamp(new Date().getTime());
    }

    public int getId() {
        return id;
    }

    public String getSerial() {
        return serial;
    }

    public NmaData getNma() {
        return nma;
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
        if (!(o instanceof HubNmaData)) return false;
        HubNmaData that = (HubNmaData) o;
        return id == that.id &&
                Objects.equals(serial, that.serial) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serial, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "HubNmaData{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
