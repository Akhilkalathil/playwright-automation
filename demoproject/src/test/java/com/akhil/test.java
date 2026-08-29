package com.akhil;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType;

public class test {

    public static void main(String[] args) {

        Playwright pw = Playwright.create();

        BrowserType browsertype = pw.firefox();

        Browser browser = browsertype.launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page page = browser.newPage();
        
        page.navigate("https://in.tradingview.com/");

        String pageTitle = page.title();
        
        System.out.print("Titile is"+ pageTitle);

        browser.close();
        pw.close();

    }

}
