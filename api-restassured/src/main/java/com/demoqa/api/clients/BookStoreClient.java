package com.demoqa.api.clients;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class BookStoreClient {
    private static final String BASE_URL = "https://demoqa.com";

    public Response getAllBooks() {
        return given()
                .baseUri(BASE_URL)
                .when()
                .get("/BookStore/v1/Books");
    }
}
