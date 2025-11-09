package api.tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class BooksSmokeTest {

    @Test
    void getBooks_returns200() {
        RestAssured.baseURI = "https://demoqa.com";

        given()
                .when()
                .get("/BookStore/v1/Books")
                .then()
                .statusCode(200);
    }
}