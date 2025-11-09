package com.demoqa.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ProfilePage extends BasePage {
    private final Locator userNameLabel;

    public ProfilePage(Page page) {
        super(page);
        this.userNameLabel = page.locator("#userName-value");
    }

    public String getUserName() {
        return userNameLabel.textContent();
    }

    public boolean isLoaded() {
        return userNameLabel.isVisible();
    }
}