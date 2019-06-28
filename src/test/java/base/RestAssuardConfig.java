package base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import kiwibank.Verify;
import models.requestModels.Authentication.IdentityContext;
import models.requestModels.Authentication.PostAuthModel;
import models.requestModels.Payments.*;
import models.requestModels.Payments.Initiation.*;
import models.requestModels.Payments.Risk.OperationsActivityLogging;
import models.requestModels.Payments.Risk.OrderingCustomerAccountAvailableBalance;
import models.requestModels.Payments.Risk.Risk;
import models.responseModels.AuthModel;
import org.testng.annotations.BeforeSuite;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class RestAssuardConfig {

    protected Response response;
    protected Verify verify = new Verify();

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

    protected Response getPostPaymentSubmissionFramework(RequestSpecification requestSpecification,
                                                         String tokenType, String accessNumber) {

        UUID uuid = UUID.randomUUID();
        requestSpecification.header("Authorization", getAccessTokenBaseType(requestSpecification, tokenType, accessNumber));
        requestSpecification.header("x-idempotency-key", uuid.toString());
        requestSpecification.header("bypass-cache", true);
        requestSpecification.header("Content-Type", "application/json");

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


        requestSpecification.body(paymentRequest);
        response = requestSpecification.post("api/v1/internationalpayments");
        return response;

    }

}
