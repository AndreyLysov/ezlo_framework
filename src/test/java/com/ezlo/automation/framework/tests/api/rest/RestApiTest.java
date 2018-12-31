package com.ezlo.automation.framework.tests.api.rest;

import com.ezlo.automation.framework.common_baby.Constants;
import com.ezlo.automation.framework.common_baby.rest_api.ResponseCodes;
import com.ezlo.automation.framework.backend.rest.mios.methods.login.LoginUserData;
import com.ezlo.automation.framework.backend.rest.mios.methods.login.LoginUserResponse;
import com.ezlo.automation.framework.tests.BaseTest;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class RestApiTest extends BaseTest {

    @Test
    public static void testLoginUser() {
        LoginUserResponse loginUserResponse = app.rest().veraLogin(
                Constants.STR_VERA_LOGIN_USERNAME,
                Constants.STR_VERA_LOGIN_PASSWORD);
        assertThat(loginUserResponse.getCode(), equalTo(ResponseCodes.OK.getCode()));
        assertThat(loginUserResponse.getLoginUserData(), equalTo(
                new LoginUserData()
                        .withServerAccount("mms-stg14.mios.com")
                        .withServerAccountAlt("mms-stg24.mios.com")
                        .withServerEvent("mms-stg14.mios.com")
                        .withServerEventAlt("mms-stg24.mios.com")
                )
        );
    }
}
