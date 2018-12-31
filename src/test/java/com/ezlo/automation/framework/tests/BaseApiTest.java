package com.ezlo.automation.framework.tests;

import com.ezlo.automation.framework.backend.web_socket.ezlo.InvalidResponse;
import com.ezlo.automation.framework.backend.web_socket.ezlo.methods.login_user.ValidResponseLoginUserData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BaseApiTest extends BaseTest {

    protected Gson gson = new GsonBuilder()
                                .excludeFieldsWithoutExposeAnnotation()
                                .serializeNulls()
                                .create();

    protected void sendRequest(Object request) {
        app.webSocket().send(gson.toJson(request));
    }

    protected ValidResponseLoginUserData getValidLoginUserResponse(String response) {
        return gson.fromJson(response, ValidResponseLoginUserData.class);
    }

    protected InvalidResponse getInvalidResponse(String response){
        return gson.fromJson(response, InvalidResponse.class);
    }
}
