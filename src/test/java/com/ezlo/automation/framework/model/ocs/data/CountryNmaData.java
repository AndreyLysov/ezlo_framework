package com.ezlo.automation.framework.model.ocs.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "country_nmas")
public class CountryNmaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private CountryData countryId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nma_id")
    private NmaData nmaId;

    public CountryNmaData() {
        createdAt = new Timestamp(new Date().getTime());
        updatedAt = new Timestamp(new Date().getTime());
    }

    public CountryNmaData withNmaId(NmaData nmaId) {
        this.nmaId = nmaId;
        return this;
    }

    public CountryNmaData withCountryId(CountryData countryId) {
        this.countryId = countryId;
        return this;
    }

    public CountryNmaData withCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public CountryNmaData withUpdatedAt(Timestamp updatedAt) {
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

    public CountryData getCountryId() {
        return countryId;
    }

    public NmaData getNmaId() {
        return nmaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CountryNmaData)) return false;
        CountryNmaData that = (CountryNmaData) o;
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
        return "CountryNmaData{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
