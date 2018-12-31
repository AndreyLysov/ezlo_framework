package com.ezlo.automation.framework.tests.api.methods;

import com.ezlo.automation.framework.backend.web_socket.ezlo.methods.UiType;
import com.ezlo.automation.framework.generators.Errors;
import com.ezlo.automation.framework.model.ezlo.UserData;
import com.ezlo.automation.framework.backend.web_socket.ezlo.InvalidResponse;
import com.ezlo.automation.framework.backend.web_socket.ezlo.methods.login_user.RequestLoginUserData;
import com.ezlo.automation.framework.backend.web_socket.ezlo.methods.login_user.ValidResponseLoginUserData;
import com.ezlo.automation.framework.tests.BaseApiTest;
import org.testng.Assert;
import org.testng.annotations.*;

import static com.ezlo.automation.framework.generators.ApiDataSupplier.genLoginUserBaseBody;
import static com.ezlo.automation.framework.generators.ApiDataSupplier.genLoginUserFullBody;
import static com.ezlo.automation.framework.generators.PortalDataSupplier.generateBaseUser;

//todo - This method was implemented only to show another approach to solve web socket testing. (It means that no test design and so on wasn't done)
public class LoginUserTests extends BaseApiTest {

    private String method = "loginUser";
    private String logoutMethod = "logoutUser";
    private String id = "TestAutomation";
    private UserData user = generateBaseUser();

    private RequestLoginUserData request = new RequestLoginUserData()
            .withId(id)
            .withMethod(method);

    private ValidResponseLoginUserData validResponse = new ValidResponseLoginUserData()
            .withId(id)
            .withId(method);

    private InvalidResponse invalidResponse = new InvalidResponse().withId(id);

    //Inserted the user into DB as test suite preconditions
    @BeforeSuite(alwaysRun = true)
    public void insertUser() {
        app.nosql().addItem(user);
    }

    //Removed preconditions after test suite execution
    @AfterSuite(alwaysRun = true)
    public void deleteUser() {
        app.nosql().deleteItem(user);
    }

    //We need new web socket connection before each test case execution
    @BeforeMethod
    public void openConnection() {
        app.webSocket().connect();
    }

    //Close web socket connection after test execution
    @AfterMethod
    public void closeConnection() {
        app.webSocket().close();
    }

    @DataProvider
    public Object[][] dataProvider() {
        return new Object[][]{
//      |   Request                                                                                     | Expected response
//      |                                                                                               |
           { request.clone().withLoginUserData(genLoginUserBaseBody(user)),                              validResponse   },
           { request.clone().withLoginUserData(genLoginUserFullBody(user, UiType.ANDROID)),              validResponse   },
           { request.clone().withLoginUserData(genLoginUserFullBody(user, UiType.iOS)),                  validResponse   },
           { request.clone().withLoginUserData(genLoginUserBaseBody(user).withUiType(UiType.WEB)),       validResponse   },
           { request.clone().withLoginUserData(genLoginUserBaseBody(user).withUiType(UiType.DESKTOP)),   validResponse   },
           { request.clone().withLoginUserData(genLoginUserBaseBody(user).withEmail(null)),              invalidResponse.clone().withError(Errors.BAD_PARAMS)},
           { request.clone().withLoginUserData(genLoginUserBaseBody(user).withHash("invalid")),          invalidResponse.clone().withError(Errors.EZLO_AUTH_ERROR)},
           { request.clone().withLoginUserData(genLoginUserBaseBody(user).withHash("")),                 invalidResponse.clone().withError(Errors.HASH_IS_EMPTY)},
           { request.clone().withLoginUserData(genLoginUserBaseBody(user).withHash(null)),               invalidResponse.clone().withError(Errors.BAD_PARAMS)}
        };
    }


    @Test(dataProvider = "dataProvider")
    public void testLogInMethod(RequestLoginUserData request, Object expectedResponse) {
        sendRequest(request);
        String actualResponse = app.webSocket().getResponse();
        if (actualResponse.contains("null")) {
            Assert.assertEquals(getValidLoginUserResponse(actualResponse), expectedResponse);
        } else {
            Assert.assertEquals(getInvalidResponse(actualResponse), expectedResponse);
        }
    }
}
