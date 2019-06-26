package kiwibank;

import base.BaseAPI;
import base.Constants;
import bdd.BaseAPI_BDD;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import models.responseModels.AuthModel;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class PaymentsTests extends BaseAPI {
    Verify verify = new Verify();

    @Test
    public void authAPITest() throws IOException {
        ResponseBody responseBody = getAuthCall().getBody();
        AuthModel authModel = responseBody.as(AuthModel.class);
        Assert.assertEquals(200, getAuthCall().statusCode());
        Assert.assertEquals(3600, authModel.getExpires_in());
        System.out.println(getAuthCall().statusCode());
    }

    @Test
    public void customerTest() {
        Response response = getCustomerCall(Constants.STAFF, "2558");
        verify.StatusCodeShouldHave(response, 200);
        JSONObject jResponse = new JSONObject(response.body().asString());
        verify.VerifyCustomerInfo(jResponse, "2558");
    }

    @Test
    public void authenticationCheck() {
        String access_Token = getAccessTokenBaseType(Constants.STAFF, "2558");
        System.out.println(access_Token);
    }

    @Test
    public void authenticationCheck_BDD() {
        Response response = new BaseAPI_BDD().postJsonPayload();
        AuthModel authModel = response.as(AuthModel.class);
        System.out.println(authModel.getAccess_token());
    }
}
