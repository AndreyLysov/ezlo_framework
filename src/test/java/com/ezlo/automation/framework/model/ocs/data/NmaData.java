package com.ezlo.automation.framework.model.ocs.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

import static com.ezlo.automation.framework.common_baby.CommonMethods.md5Hash;

@Entity
@Table(name = "nmas")
public class NmaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String uri;

    private String key;

    private String username;

    @Transient
    private String password;

    @Column(name = "password")
    private String pswHash;

    private String sender;

    @Column(name = "\"createdAt\"")
    private Timestamp createdAt;

    @Column(name = "\"updatedAt\"")
    private Timestamp updatedAt;

    private boolean dev;

    @Column(name = "map_color")
    private String mapColor;

    @Column(name = "\"isEnabled\"")
    private boolean isEnabled;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "nmaId")
    private Set<CountryNmaData> coutryNmas;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "nma")
    private Set<HubNmaData> hubNmas;

    public NmaData() {
        createdAt = new Timestamp(new Date().getTime());
        updatedAt = new Timestamp(new Date().getTime());
    }

    public NmaData withName(String name) {
        this.name = name;
        return this;
    }

    public NmaData withUri(String uri) {
        this.uri = uri;
        return this;
    }

    public NmaData withKey(String key) {
        this.key = key;
        return this;
    }

    public NmaData withUsername(String username) {
        this.username = username;
        return this;
    }

    public NmaData withPassword(String password) {
        this.password = password;
        this.pswHash = md5Hash(this.username + this.password);
        return this;
    }

    public NmaData withSender(String sender) {
        this.sender = sender;
        return this;
    }

    public NmaData withCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public NmaData withUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public NmaData withDev(boolean dev) {
        this.dev = dev;
        return this;
    }

    public NmaData withMapColor(String mapColor) {
        this.mapColor = mapColor;
        return this;
    }

    public NmaData withEnabled(boolean enabled) {
        isEnabled = enabled;
        return this;
    }

    public NmaData withCountryNmas(Set<CountryNmaData> countryNmas){
        this.coutryNmas = countryNmas;
        return this;
    }

    public NmaData withHubNmas(Set<HubNmaData> hubNmas){
        this.hubNmas = hubNmas;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUri() {
        return uri;
    }

    public String getKey() {
        return key;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSender() {
        return sender;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public boolean isDev() {
        return dev;
    }

    public String getMapColor() {
        return mapColor;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public Set<CountryNmaData> getCoutryNmas() {
        return coutryNmas;
    }

    public Set<HubNmaData> getHubNmas() {
        return hubNmas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NmaData)) return false;
        NmaData nmaData = (NmaData) o;
        return id == nmaData.id &&
                dev == nmaData.dev &&
                isEnabled == nmaData.isEnabled &&
                Objects.equals(name, nmaData.name) &&
                Objects.equals(uri, nmaData.uri) &&
                Objects.equals(key, nmaData.key) &&
                Objects.equals(username, nmaData.username) &&
                Objects.equals(sender, nmaData.sender) &&
                Objects.equals(createdAt, nmaData.createdAt) &&
                Objects.equals(updatedAt, nmaData.updatedAt) &&
                Objects.equals(mapColor, nmaData.mapColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, uri, key, username, sender, createdAt, updatedAt, dev, mapColor, isEnabled);
    }

    @Override
    public String toString() {
        return "NmaData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", uri='" + uri + '\'' +
                ", key='" + key + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sender='" + sender + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", dev=" + dev +
                ", mapColor='" + mapColor + '\'' +
                ", isEnabled=" + isEnabled +
                '}';
    }
}
