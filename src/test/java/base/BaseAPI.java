package base;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import models.requestModels.Authentication.IdentityContext;
import models.requestModels.Authentication.PostAuthModel;
import models.requestModels.Payments.*;
import models.requestModels.Payments.Initiation.*;
import models.requestModels.Payments.Risk.OperationsActivityLogging;
import models.requestModels.Payments.Risk.OrderingCustomerAccountAvailableBalance;
import models.requestModels.Payments.Risk.Risk;
import models.responseModels.AuthModel;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BaseAPI {

    //String BaseURL = "https://api-test-internal.microservices-nonprod.apif.kiwibank.co.nz";

    Response response;
    private String BaseURL = "https://api-test.kiwibank.co.nz";

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
        response = httpRequest.post("ext/v2/auth/token");
        return response;
    }

    public Response getCustomerCall(String tokenType, String accessNumber) {
        RestAssured.baseURI = BaseURL;
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("Content-Type", "application/json");
        httpRequest.header("Authorization", getAccessTokenBaseType(tokenType, accessNumber));
        response = httpRequest.get("api/v1/customers/" + accessNumber);
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
        //Response response = httpRequest.post("ext/v2/auth/token");
        Response response = httpRequest.post("v2/auth/token");

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

    public Response getPostPaymentSubmission(String tokenType, String accessNumber) {

        UUID uuid = UUID.randomUUID();

        RestAssured.baseURI = BaseURL;
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("Content-Type", "application/json");
        httpRequest.header("Authorization", getAccessTokenBaseType(tokenType, accessNumber));
        httpRequest.header("x-idempotency-key", uuid.toString());
        httpRequest.header("bypass-cache", true);
        httpRequest.header("Content-Type", "application/json");

        PaymentRequest paymentRequest = new PaymentRequest()
                .setRisk(new Risk()
                        .setOperationsActivityLogging(new OperationsActivityLogging()
                                .setPageUrl("http://activity.com/wozhair")
                                .setLoginIpAddress("127.0.0.1")
                                .setServerIpAddress("127.0.0.2")
                                .setKiwibankSessionId("xZhDFS543fVXGHEEHFlkjlkjdr6")
                                .setInternationalSessionId("HdsfdkjhRSSFRzfkhj764H")
                                .setOrderingCustomerAccountAvailableBalance(new OrderingCustomerAccountAvailableBalance()
                                        .setAmount("100")
                                        .setCurrency("USD"))))
                .setData(new Data()
                        .setInitiation(new Initiation()
                                .setInstructionIdentification("Peush Kiwi")
                                .setEndToEndIdentification("P013878")
                                .setInstructedAmount(new InstructedAmount()
                                        .setAmount("25.00")
                                        .setCurrency("NZD"))
                                .setOrderingCustomerFee(new OrderingCustomerFee()
                                        .setAmount("2.00")
                                        .setCurrency("NZD"))
                                .setPaymentRelease(new PaymentRelease()
                                        .setReleasePayment(true))
                                .setPaymentInformation(new PaymentInformation()
                                        .setPaymentType("NZD_Nostro")
                                        .setPaymentFXContractReference("C111001")
                                        .setPaymentValueDate("2019-06-24")
                                        .setPaymentAmount(new PaymentAmount()
                                                .setAmount("20.00")
                                                .setCurrency("USD"))
                                        .setChargeType("SHA"))
                                .setBeneficiaryDetails(new BeneficiaryDetails()
                                        .setIdentification("Manual test thourgh API")
                                        .setAddress(new Address()
                                                .setAddressLine1("167 Knights Road")
                                                .setAddressLine2("XXXX")
                                                .setSuburb("Hutt Central")
                                                .setCity("Wellington")
                                                .setState("")
                                                .setPostalCode("4324535")
                                                .setCountryName("New Zealand")
                                                .setCountryCode("NZ")))
                                .setOrderingCustomerAccount(new OrderingCustomerAccount()
                                        .setSchemeName("AccountNumber")
                                        .setIdentification("389006063471802"))
                                .setBeneficiaryBank(new BeneficiaryBank()
                                        .setSchemeName("NatBankCode")
                                        .setIdentification("FW02200321")
                                        .setSecondaryIdentification("MANTUS33")
                                        .setSecondarySchemeName("Swift")
                                        .setName("Westpac Banking Corp")
                                        .setAddress(new Address()
                                                .setAddressLine1("55 Errol St")
                                                .setAddressLine2("")
                                                .setSuburb("")
                                                .setCity("Wellington")
                                                .setState("")
                                                .setPostalCode("5010")
                                                .setCountryName("New Zealand")
                                                .setCountryCode("NZ")))
                                .setSwiftReceiver(new SwiftReceiver()
                                        .setSwiftCode("KIWINZ20"))
                                .setOrderingCustomerDetails(new OrderingCustomerDetails()
                                        .setIdentification("786504")
                                        .setClassification("Individual")
                                        .setName("Tester,Peushan")
                                        .setAddress(new Address()
                                                .setAddressLine1("20 customehouse")
                                                .setAddressLine2("test")
                                                .setSuburb("central")
                                                .setCity("Tokiyo")
                                                .setState("")
                                                .setPostalCode("6785")
                                                .setCountryName("Japan")
                                                .setCountryCode("JPY")))
                                .setBeneficiaryAccount(new BeneficiaryAccount()
                                        .setSchemeName("AccountNumber")
                                        .setIdentification("KIW0001978"))
                                .setRemittanceInformation(new RemittanceInformation()
                                        .setReference(new Reference()
                                                .setBeneficiaryReference(new BeneficiaryReference()
                                                        .setPaymentDetailsLine1("Test on 5th De")
                                                        .setPaymentDetailsLine2("878sa")
                                                        .setPaymentDetailsLine3("test")
                                                        .setPaymentDetailsLine4(""))
                                                .setDomesticOrderingCustomerReference(new DomesticOrderingCustomerReference()
                                                        .setForeignExchangeDealRate("0.67114"))))));


        httpRequest.body(paymentRequest);
        response = httpRequest.post("api/v1/internationalpayments");
        return response;

    }


}
