package com.demoqa.tests;

import com.demoqa.pages.BookStorePage;
import com.microsoft.playwright.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeSmokeTest {
    @Test
    void homePageLoads() {
        try (Playwright pw = Playwright.create()) {
            Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
            Page page = browser.newPage();

            page.navigate("https://demoqa.com/books");

            BookStorePage bookStorePage = new BookStorePage(page);
            String title = bookStorePage.getPageTitle();

            Assertions.assertThat(title).contains("DEMOQA");

            browser.close();
        }
    }
}