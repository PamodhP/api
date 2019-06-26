package base;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import models.responseModels.AuthModel;
import models.requestModels.IdentityContext;
import models.requestModels.PostAuthModel;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BaseAPI {

    String BaseURL = "https://api-test-internal.microservices-nonprod.apif.kiwibank.co.nz";


    public String getAccessToken() throws IOException {
        RestAssured.baseURI = BaseURL;
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("Content-Type", "application/json");
        FileInputStream fileInputStream = new FileInputStream(new File("./jsonfiles/auth.json"));
        httpRequest.body(IOUtils.toString(fileInputStream, "UTF-8"));
        Response response = httpRequest.post("ext/v2/auth/token");

        ResponseBody body = response.getBody();
        AuthModel responseBody = body.as(AuthModel.class);
        return "Bearer" + " " + responseBody.getAccess_token();
    }

    public Response getAuthCall() throws IOException {
        RestAssured.baseURI = BaseURL;
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("Content-Type", "application/json");
        FileInputStream fileInputStream = new FileInputStream(new File("./jsonfiles/auth.json"));
        httpRequest.body(IOUtils.toString(fileInputStream, "UTF-8"));
        Response response = httpRequest.post("ext/v2/auth/token");
        return response;
    }

    public Response getCustomerCall(String tokenType, String accessNumber) {
        RestAssured.baseURI = BaseURL;
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("Content-Type", "application/json");
        httpRequest.header("Authorization", getAccessTokenBaseType(tokenType, accessNumber));
        Response response = httpRequest.get("ext/api/v1/customers/" + accessNumber);
        return response;
    }

    public String getAccessTokenBaseType(String tokenType, String accessNumber) {
        RestAssured.baseURI = BaseURL;
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("Content-Type", "application/json");

        PostAuthModel postAuthModel = new PostAuthModel()
                .setClient_secret("mSrfYdIFBagfjEgH")
                .setClient_id("bXBVv6lzkF8P0oQGu0Z0vQrR9aiwdQKK")
                .setGrant_type("client_credentials")
                .setIdentityContextType(tokenType)
                .setScopes(returnscopes())
                .setDelegated(true)
                .setIdentityContext(new IdentityContext().setOriginatorId(accessNumber));

        httpRequest.body(postAuthModel);
        Response response = httpRequest.post("ext/v2/auth/token");
        ResponseBody body = response.getBody();
        AuthModel responseBody = body.as(AuthModel.class);
        return "Bearer" + " " + responseBody.getAccess_token();
    }

    public List<String> returnscopes() {
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
