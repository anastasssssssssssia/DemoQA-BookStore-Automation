package com.demoqa.tests;

import com.demoqa.api.clients.BookStoreClient;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BookStoreApiTest {
    private BookStoreClient bookStoreClient = new BookStoreClient();

    @Test
    void getAllBooks_returns200() {
        Response response = bookStoreClient.getAllBooks();

        assertThat(response.statusCode()).isEqualTo(200);
        assertThat(response.jsonPath().getList("books")).isNotEmpty();
    }
}