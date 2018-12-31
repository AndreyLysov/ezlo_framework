package com.ezlo.automation.framework.model.ocs.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "countries")
public class CountryData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String alpha2;

    private String alpha3;

    private int code;

    @Column(name = "\"createdAt\"")
    private Timestamp createdAt;

    @Column(name = "\"updatedAt\"")
    private Timestamp updatedAt;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "countryId")
    private Set<CountryNmaData> countryNmas;

    public CountryData withName(String name) {
        this.name = name;
        return this;
    }

    public CountryData withAlpha2(String alpha2) {
        this.alpha2 = alpha2;
        return this;
    }

    public CountryData withAlpha3(String alpha3) {
        this.alpha3 = alpha3;
        return this;
    }

    public CountryData withCode(int code) {
        this.code = code;
        return this;
    }

    public CountryData withCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public CountryData withUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public CountryData withCountryNmas(Set<CountryNmaData> countryNmas){
        this.countryNmas = countryNmas;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAlpha2() {
        return alpha2;
    }

    public String getAlpha3() {
        return alpha3;
    }

    public int getCode() {
        return code;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public Set<CountryNmaData> getCountryNmas() {
        return countryNmas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CountryData)) return false;
        CountryData that = (CountryData) o;
        return id == that.id &&
                code == that.code &&
                Objects.equals(name, that.name) &&
                Objects.equals(alpha2, that.alpha2) &&
                Objects.equals(alpha3, that.alpha3) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, alpha2, alpha3, code, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "CountryData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alpha2='" + alpha2 + '\'' +
                ", alpha3='" + alpha3 + '\'' +
                ", code=" + code +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
