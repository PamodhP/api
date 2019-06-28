package kiwibank;

import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.responseModels.Customer.Customer;
import models.responseModels.PaymentSubmission.PaymentResponse;
import org.json.JSONObject;
import org.testng.asserts.SoftAssert;


public class Verify {

    private SoftAssert softAssert;

    public void StatusCodeShouldHave(Response response, int statusCode) {
        softAssert = new SoftAssert();
        softAssert.assertEquals(response.getStatusCode(), statusCode, "Expected Status code not Found");
        softAssert.assertAll();
    }

    public void VerifyCustomerInfo(JSONObject jsonObject, String accessNumber){

        softAssert = new SoftAssert();
        softAssert.assertEquals(jsonObject.getJSONObject("customer").get("customerId"), accessNumber);
        //jsonObject.getJSONObject("customer").getJSONArray("addresses").getJSONObject(1).get("addressType");
        softAssert.assertAll();
    }

    public void VerifyCustomerInfoNew(Response response, String accessNumber) {
        softAssert = new SoftAssert();
        Customer customer = response.as(Customer.class, ObjectMapperType.GSON);
        softAssert.assertEquals(customer.getCustomer().getCustomerId(), accessNumber);
        softAssert.assertAll();
    }

    public void VerifyPostSubmission(Response response) {
        softAssert = new SoftAssert();
        PaymentResponse paymentResponse = response.as(PaymentResponse.class, ObjectMapperType.GSON);
        softAssert.assertEquals(paymentResponse.getData().getStatus(), "AcceptedSettlementCompleted");
        softAssert.assertAll();
    }
}
