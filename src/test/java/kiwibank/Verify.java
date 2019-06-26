package kiwibank;

import io.restassured.response.Response;

import org.json.JSONObject;
import org.testng.asserts.SoftAssert;


public class Verify {

    SoftAssert softAssert;

    public void StatusCodeShouldHave(Response response, int statusCode) {
        softAssert = new SoftAssert();
        softAssert.assertEquals(response.getStatusCode(), statusCode);
        softAssert.assertAll();
    }

    public void VerifyCustomerInfo(JSONObject jsonObject, String accessNumber){

        softAssert = new SoftAssert();
        softAssert.assertEquals(jsonObject.getJSONObject("customer").get("customerId"), accessNumber);
        softAssert.assertAll();


    }
}
