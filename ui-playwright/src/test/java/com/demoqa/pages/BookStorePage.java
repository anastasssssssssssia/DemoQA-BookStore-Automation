package com.demoqa.pages;

import com.microsoft.playwright.Page;

public class BookStorePage extends BasePage {
    public BookStorePage(Page page) {
        super(page);
    }

    public String getPageTitle() {
        return page.title();
    }
}