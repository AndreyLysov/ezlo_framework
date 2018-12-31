package com.ezlo.automation.framework.model.ezlo.data;

import com.ezlo.automation.framework.model.ezlo.inner.TokenFieldData;
import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Objects;

@Entity(value = "tokens", noClassnameStored = true)
public class TokenData {
    
    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    private String user;
    @Expose
    @Embedded
    private TokenFieldData token;

    public TokenData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public TokenData withUser(String user) {
        this.user = user;
        return this;
    }

    public TokenData withToken(TokenFieldData token) {
        this.token = token;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public TokenFieldData getToken() {
        return token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TokenData)) return false;
        TokenData tokenData = (TokenData) o;
        return Objects.equals(id, tokenData.id) &&
                Objects.equals(user, tokenData.user) &&
                Objects.equals(token, tokenData.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, token);
    }

    @Override
    public String toString() {
        return "TokenData{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", token=" + token +
                '}';
    }
}
