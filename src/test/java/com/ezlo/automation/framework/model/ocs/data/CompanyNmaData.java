package com.ezlo.automation.framework.model.ocs.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "company_nmas")
public class CompanyNmaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "\"createdAt\'")
    private Timestamp createdAt;

    @Column(name = "\"updatedAt\'")
    private Timestamp updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private CompanyData companyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nma_id")
    private NmaData nmaId;

    public CompanyNmaData() {
        createdAt = new Timestamp(new Date().getTime());
        updatedAt = new Timestamp(new Date().getTime());
    }


    public CompanyNmaData withCompanyId(CompanyData companyId) {
        this.companyId = companyId;
        return this;
    }

    public CompanyNmaData withNmaId(NmaData nmaId) {
        this.nmaId = nmaId;
        return this;
    }

    public CompanyNmaData withCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public CompanyNmaData withUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public int getId() {
        return id;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public CompanyData getCompanyId() {
        return companyId;
    }

    public NmaData getNmaId() {
        return nmaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompanyNmaData)) return false;
        CompanyNmaData that = (CompanyNmaData) o;
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
        return "CompanyNmaData{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
