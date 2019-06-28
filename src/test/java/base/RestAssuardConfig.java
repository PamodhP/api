package base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import models.requestModels.Authentication.IdentityContext;
import models.requestModels.Authentication.PostAuthModel;
import models.responseModels.AuthModel;
import org.testng.annotations.BeforeSuite;

import java.util.ArrayList;
import java.util.List;

public class RestAssuardConfig {

    private Response response;

    @BeforeSuite
    public void config() {
        RestAssured.baseURI = "https://api-test.kiwibank.co.nz";
    }

    public RequestSpecification getRequestSpecification() {
        return RestAssured.given().contentType(ContentType.JSON);
    }

    protected Response getCustomerCallFramework(RequestSpecification requestSpecification,
                                                String tokenType, String accessNumber) {
        requestSpecification.header("Content-Type", "application/json");
        requestSpecification.header("Authorization", getAccessTokenBaseType(requestSpecification, tokenType, accessNumber));
        response = requestSpecification.get("api/v1/customers/" + accessNumber);
        return response;
    }

    private String getAccessTokenBaseType(RequestSpecification requestSpecification,
                                          String tokenType, String accessNumber) {
        PostAuthModel postAuthModel = new PostAuthModel()
                .setClient_secret("mSrfYdIFBagfjEgH")
                .setClient_id("bXBVv6lzkF8P0oQGu0Z0vQrR9aiwdQKK")
                .setGrant_type("client_credentials")
                .setIdentityContextType(tokenType)
                .setScopes(returnscopes())
                .setDelegated(true)
                .setIdentityContext(new IdentityContext().setOriginatorId(accessNumber));

        requestSpecification.body(postAuthModel);
        //Response response = httpRequest.post("ext/v2/auth/token");
        response = requestSpecification.post("v2/auth/token");
        ResponseBody body = response.getBody();
        AuthModel responseBody = body.as(AuthModel.class);
        return "Bearer" + " " + responseBody.getAccess_token();
    }

    private List<String> returnscopes() {
        List<String> scopes = new ArrayList<>();
        scopes.add("customers.read");
        scopes.add("payments.read");
        scopes.add("payments.write");
        scopes.add("accounts.basic.read");
        scopes.add("accounts.foreigncurrency.write");
        scopes.add("customers.international.read");
        return scopes;
    }
}
