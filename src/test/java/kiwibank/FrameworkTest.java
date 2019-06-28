package kiwibank;

import base.Constants;
import base.RestAssuardConfig;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import testData.Scnearios;

public class FrameworkTest extends RestAssuardConfig {

    @Test(dataProvider = "ProvideAccessNumbers", dataProviderClass = Scnearios.class)
    public void withFrameworkCustomer(String customerType, String accessNumber) {
        RequestSpecification requestSpecification = new RestAssuardConfig().getRequestSpecification();
        response = getCustomerCallFramework(requestSpecification, Constants.STAFF, accessNumber);
        verify.StatusCodeShouldHave(response, HttpStatus.SC_OK);
        verify.VerifyCustomerInfoNew(response, accessNumber);
        response.then().log().all();
    }

    @Test(dataProvider = "ProvideAccessNumbers", dataProviderClass = Scnearios.class)
    public void getPostPaymentSubmission(String customerType, String accessNumber) {
        RequestSpecification requestSpecification = new RestAssuardConfig().getRequestSpecification();
        response = getPostPaymentSubmissionFramework(requestSpecification, Constants.STAFF, accessNumber);
        verify.StatusCodeShouldHave(response, HttpStatus.SC_CREATED);
        verify.VerifyPostSubmission(response);
        response.then().log().all();

    }
}
