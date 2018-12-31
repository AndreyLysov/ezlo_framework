package com.ezlo.automation.framework.tests.unit.db;

import com.ezlo.automation.framework.model.ezlo.EzlosData;
import com.ezlo.automation.framework.model.ezlo.Ezlos;
import com.ezlo.automation.framework.model.ezlo.UserData;
import com.ezlo.automation.framework.model.ezlo.Users;
import com.ezlo.automation.framework.tests.BaseTest;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.testng.Assert;
import org.testng.annotations.BeforeGroups;

import java.io.File;
import java.util.Collections;
import java.util.List;

import static com.ezlo.automation.framework.common_baby.CommonMethods.jsonFileToString;

public class NonSafeNoSqlUnitTests extends BaseTest {

    private String pathToValidUserJson = "src/test/resources/validUsers.json";
    private String pathToValidEzloJson = "src/test/resources/validEzlos.json";


    @BeforeGroups("withEzlos")
    protected void preconditionTestWithEzlos() {
        Ezlos ezlos = app.nosql().ezlos();
        if (ezlos.size() == 0) {
            String json = jsonFileToString(new File(pathToValidEzloJson));
            Gson gson = new Gson();
            List<EzlosData> listOfEzlos = gson.fromJson(json, new TypeToken<List<EzlosData>>() {
            }.getType());
            app.nosql().addItems(Collections.singleton(listOfEzlos));
            ezlos = app.nosql().ezlos();
            Assert.assertTrue(ezlos.size() != 0, "Ezlos hasn't been created!");
        }
    }

    @BeforeGroups("withUsers")
    protected void preconditionTestWithUsers() {
        Users users = app.nosql().users();
        if (users.size() == 0) {
            String json = jsonFileToString(new File(pathToValidUserJson));
            Gson gson = new Gson();
            List<UserData> listOfUsers = gson.fromJson(json, new TypeToken<List<UserData>>() {
            }.getType());
            app.nosql().addItems(Collections.singleton(listOfUsers));
            users = app.nosql().users();
            Assert.assertTrue(users.size() != 0, "Users hasn't been created!");
        }
    }

    //    @Test(groups = "withUsers")
    public void testClearUserCollection() {
        // Drop user collection
        app.nosql().clearUserCollection();
        Assert.assertTrue(app.nosql().users().size() == 0);
    }

    //    @Test(groups = "withEzlos")
    public void testClearEzlosCollection() {
        // Drop ezlo collection
        app.nosql().clearEzloCollection();
        Assert.assertTrue(app.nosql().ezlos().size() == 0);
    }
}
