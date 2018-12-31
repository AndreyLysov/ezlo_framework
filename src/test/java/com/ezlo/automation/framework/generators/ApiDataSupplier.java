package com.ezlo.automation.framework.generators;


import com.ezlo.automation.framework.backend.web_socket.ezlo.methods.UiType;
import com.ezlo.automation.framework.model.ezlo.UserData;
import com.ezlo.automation.framework.backend.web_socket.ezlo.methods.login_user.ReqBodyLoginUserData;

import java.security.SecureRandom;
import java.util.List;

import static com.ezlo.automation.framework.common_baby.CommonMethods.generateString;

//todo - need to think how we can make methods names shorter to save free space.
public class ApiDataSupplier {

    public static ReqBodyLoginUserData genLoginUserData(UserData userData, Boolean withRequired) {
        ReqBodyLoginUserData reqBodyLoginUser = new ReqBodyLoginUserData();
        String uiType;
        if (withRequired == null) {
            uiType = Data.getValidUiType().get(new SecureRandom().nextInt(Data.getValidUiType().size()));
            reqBodyLoginUser
                    .withEmail(userData.getEmail())
                    .withHash(userData.getMd5hash())
                    .withUiType(uiType)
                    .withLocale(userData.getLocale())
                    .withMobFields();
        } else if (withRequired) {
            reqBodyLoginUser
                    .withEmail(userData.getEmail())
                    .withHash(userData.getMd5hash());
        } else {
            uiType = Data.getValidUiType().get(new SecureRandom().nextInt(Data.getValidUiType().size()));
            reqBodyLoginUser
                    .withUiType(uiType)
                    .withLocale(userData.getLocale());
            if (uiType.equals(UiType.ANDROID.getUiType())
                    || !uiType.equals(UiType.iOS.getUiType())) {
                reqBodyLoginUser.withMobFields();
            }
        }

        return reqBodyLoginUser;
    }

    public static ReqBodyLoginUserData genLoginUserBaseBody(UserData user) {
        return baseReqBodyLoginUser(user);
    }

    public static ReqBodyLoginUserData genLoginUserFullBody(UserData user, UiType uiType) {
        return genLoginUserFullBody(user, uiType.getUiType());
    }

    public static ReqBodyLoginUserData genLoginUserFullBody(UserData user, String uiType) {
        return baseReqBodyLoginUser(user)
                .withUiType(uiType)
                .withLocale(user.getLocale())
                .withMobFields();
    }

    //TODO - @OleksiiIsakov: implement field logic
    public static List<String> genValidDeviceIds(UserData userData) {
        return generateString(1, 12, true, true);
    }

    //TODO - @OleksiiIsakov: implement field logic
    public static List<String> genValidPushTokens(UserData userData) {
        return generateString(1, 32, true, true);
    }

    //TODO - @OleksiiIsakov: implement field logic
    public static List<String> genValidOemVendor(UserData userData) {
        return generateString(1, 7, true, true);
    }

    private static ReqBodyLoginUserData baseReqBodyLoginUser(UserData user) {
        return new ReqBodyLoginUserData()
                .withEmail(user.getEmail())
                .withHash(user.getMd5hash());
    }

    //TODO - @OleksiiIsakov: implement field logic
    public static List<String> genValidLocale(UserData userData) {
        return generateString(1, 5, true, true);
    }
}