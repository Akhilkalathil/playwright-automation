package com.gettingstarted;


import com.microsoft.playwright;
import com.microsoft.browser;
import com.microsoft.browsertype;
import com.microsoft.Page;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class mainmethod {

public static void main(String[] args) {
    
Playwright pw = Playwright.create();

BrowserType browsertype = pw.chromium();

Browser browser = browsertype.launch();

Page page = browser.newPage();

page.navigate("https://playwright.dev/java/docs/writing-tests");

String page = page.title();

System.out.println("Title is" + title);

page.close();

browser.close();

pw.close();

}

}
