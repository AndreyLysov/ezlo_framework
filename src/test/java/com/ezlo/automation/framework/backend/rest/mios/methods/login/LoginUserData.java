package com.ezlo.automation.framework.backend.rest.mios.methods.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class LoginUserData {
    @Expose
    @SerializedName("Identity")
    private String identity;
    @Expose
    @SerializedName("IdentitySignature")
    private String identitySignature;
    @Expose
    @SerializedName("Server_Event")
    private String serverEvent;
    @Expose
    @SerializedName("Server_Event_Alt")
    private String serverEventAlt;
    @Expose
    @SerializedName("Server_Account")
    private String serverAccount;
    @Expose
    @SerializedName("Server_Account_Alt")
    private String serverAccountAlt;

    public LoginUserData withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    public LoginUserData withIdentitySignature(String identitySignature) {
        this.identitySignature = identitySignature;
        return this;
    }

    public LoginUserData withServerEvent(String serverEvent) {
        this.serverEvent = serverEvent;
        return this;
    }

    public LoginUserData withServerEventAlt(String serverEventAlt) {
        this.serverEventAlt = serverEventAlt;
        return this;
    }

    public LoginUserData withServerAccount(String serverAccount) {
        this.serverAccount = serverAccount;
        return this;
    }

    public LoginUserData withServerAccountAlt(String serverAccountAlt) {
        this.serverAccountAlt = serverAccountAlt;
        return this;
    }

    public String getIdentity() {
        return identity;
    }

    public String getIdentitySignature() {
        return identitySignature;
    }

    public String getServerEvent() {
        return serverEvent;
    }

    public String getServerEventAlt() {
        return serverEventAlt;
    }

    public String getServerAccount() {
        return serverAccount;
    }

    public String getServerAccountAlt() {
        return serverAccountAlt;
    }

    @Override
    public String toString() {
        return "LoginUserData" +
                "\n{identity='" + identity + '\'' +
                ",\nidentitySignature='" + identitySignature + '\'' +
                ",\nserverEvent='" + serverEvent + '\'' +
                ",\nserverEventAlt='" + serverEventAlt + '\'' +
                ",\nserverAccount='" + serverAccount + '\'' +
                ",\nserverAccountAlt='" + serverAccountAlt + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginUserData that = (LoginUserData) o;
        return Objects.equals(serverEvent, that.serverEvent) &&
                Objects.equals(serverEventAlt, that.serverEventAlt) &&
                Objects.equals(serverAccount, that.serverAccount) &&
                Objects.equals(serverAccountAlt, that.serverAccountAlt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverEvent, serverEventAlt, serverAccount, serverAccountAlt);
    }
}
