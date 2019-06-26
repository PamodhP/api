package bdd;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.responseModels.AuthModel;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static io.restassured.RestAssured.given;

public class BaseAPI_BDD {

    FileInputStream fileInputStream;

    public Response postJsonPayload() {

        String jsonBody = null;
        try {
            fileInputStream = new FileInputStream(new File("./jsonfiles/auth.json"));
            jsonBody = IOUtils.toString(fileInputStream, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return
                given()
                        .contentType(ContentType.JSON)
                        .when()
                        .body(jsonBody)
                        .post("https://api-test-internal.microservices-nonprod.apif.kiwibank.co.nz/ext/v2/auth/token")
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
    }
}
