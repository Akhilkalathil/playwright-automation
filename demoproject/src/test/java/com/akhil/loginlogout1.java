package com.akhil;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class loginlogout1 {

    public static void main(String[] args) {
        
            Browser browser = null;   
             Page page = null; 

     browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));

         page = browser.newPage();
        
        page.navigate("https://freelance-learn-automation.vercel.app/login");

        page.locator("#email1").fill("admin@email.com");

        page.keyboard().press("Control+A");
        page.keyboard().press("Control+C");
        page.keyboard().press("Tab");
        page.keyboard().press("Control+V");

       // page.close();
       // browser.close();

    }    

}
