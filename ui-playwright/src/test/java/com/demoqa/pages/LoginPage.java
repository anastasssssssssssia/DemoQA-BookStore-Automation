package com.demoqa.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage extends BasePage {
    private final Locator usernameInput = page.locator("#userName");
    private final Locator passwordInput = page.locator("#password");
    private final Locator loginButton = page.locator("#login");

    public LoginPage(Page page) {
        super(page);
    }

    public void login(String username, String password) {
        usernameInput.fill(username);
        passwordInput.fill(password);
        loginButton.click();
    }
}