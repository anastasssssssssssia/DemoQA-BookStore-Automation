package com.demoqa.tests;

import com.demoqa.pages.LoginPage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest extends TestBase {

    @Test
    void successfulLoginTest() {
        LoginPage loginPage = new LoginPage(page);

        page.navigate("https://demoqa.com/login");

        loginPage.login("QuantumChord", "Viyas3kм!");

        page.waitForURL(url -> url.contains("profile"));
        assertTrue(page.url().contains("profile"));
    }

    @Test
    void loginWithInvalidCredentialsTest() {
        LoginPage loginPage = new LoginPage(page);

        page.navigate("https://demoqa.com/login");
        loginPage.login("invaliduser", "wrongpassword");

        String errorMessage = loginPage.getErrorMessage();
        assertNotNull(errorMessage);
        assertTrue(errorMessage.contains("Invalid"));
    }
}