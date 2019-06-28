package kiwibank;

import base.Constants;
import base.RestAssuardConfig;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class FrameworkTest extends RestAssuardConfig {

    Verify verify = new Verify();

    @Test
    public void withFrameworkCustomer() {
        RequestSpecification requestSpecification = new RestAssuardConfig().getRequestSpecification();
        Response response = getCustomerCallFramework(requestSpecification, Constants.STAFF, "786504");
        verify.StatusCodeShouldHave(response, 200);
        JSONObject jResponse = new JSONObject(response.body().asString());
        verify.VerifyCustomerInfo(jResponse, "786504");
    }
}
