package com.ezlo.automation.framework.backend.web_socket.ezlo.methods.login_user;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class LoginUserResultData {

    //ToDo - @OleksiiIsakov: Is it possible to do it programmatically? No with the pattern.
    private static final String STR_PEER_UNIQUE_ID_PATTERN = "\\d{1,5}[/]\\d{1,5}";
    @SerializedName("peer_unique_id")
    @Expose
    private String peerUniqueId;  // value pattern is "35/211"

    public LoginUserResultData withPeerUniqueId(String peerUniqueId) {
        this.peerUniqueId = peerUniqueId;
        return this;
    }

    public String getPeerUniqueId() {
        return peerUniqueId;
    }

    @Override
    public String toString() {
        return "LoginUserResultData{" +
                "peerUniqueId='" + peerUniqueId + '\'' +
                '}';
    }

    //todo - @andrey.lysov - need to discuss with backend team what the sense of peer_unique.
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof LoginUserResultData))
            return false;
        LoginUserResultData that = (LoginUserResultData) o;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(peerUniqueId);
    }
}