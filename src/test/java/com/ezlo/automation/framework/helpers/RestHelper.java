package com.ezlo.automation.framework.helpers;

import com.ezlo.automation.framework.backend.rest.mios.methods.add_NMA_device.SyncEZLOData;
import com.ezlo.automation.framework.common_baby.Constants;
import com.ezlo.automation.framework.backend.rest.mios.methods.login.LoginUserData;
import com.ezlo.automation.framework.backend.rest.mios.methods.login.LoginUserResponse;
import com.google.gson.Gson;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;


public class RestHelper {

    private HttpResponse get(String url) {
        try {
            return HttpClientBuilder.create().build().execute(new HttpGet(new URI(url)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private HttpResponse post(String url) {
        try {
            return HttpClientBuilder.create().build().execute(new HttpPost(new URI(url)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public LoginUserResponse veraLogin(String username, String password) {
        String ssh1 = DigestUtils.sha1Hex(username + password + Constants.STR_SHA1_KEY);
        String url =
                Constants.getProperties().getProperty("baseUrl")
                        + "autha/auth/username/" + username
                        + "?SHA1PasswordCS=" + ssh1
                        + "&PK_Oem=1"
                        + "&SHA1Password=" + ssh1
                        + "&MMS_DEBUG="
                        + Constants.STR_MMS_DEBUG_KEY;
        HttpResponse httpResponse = get(url);
        assert httpResponse != null;
        LoginUserData loginUserData = null;
        try {
            loginUserData = new Gson().fromJson(EntityUtils.toString(httpResponse.getEntity()), LoginUserData.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert loginUserData != null;
        return new LoginUserResponse()
                .withCode(httpResponse.getStatusLine().getStatusCode())
                .withLoginUserData(loginUserData);
    }

    public void syncEzlo(SyncEZLOData request){
        HttpResponse response = get(Constants.getProperties()
                .getProperty("baseUrl")
                + "SyncEZLO.php"
                + "?serial=" + request.getEzloSerial()
                + "&MACAddress=" + request.getMacAddress()
                + "&secret=" + request.getSecret());
    }
}