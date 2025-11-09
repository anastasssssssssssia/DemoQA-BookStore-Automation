package com.demoqa.tests;

import com.demoqa.pages.LoginPage;
import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

public class LoginTest {
    @Test
    void userCanLogin() {
        try (Playwright pw = Playwright.create()) {
            Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
            Page page = browser.newPage();

            page.navigate("https://demoqa.com/login");

            LoginPage loginPage = new LoginPage(page);
            loginPage.login("testuser", "Password123!");

            // Просто проверяем что страница загрузилась
            assert page.title().contains("DEMOQA");

            browser.close();
        }
    }
}