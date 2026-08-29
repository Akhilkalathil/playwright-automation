package com.akhil;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class loginlogout2 {

    public static void main(String[] args) {
        
            Browser browser = null;   
             Page page = null; 

     browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));

         page = browser.newPage();
        
        page.navigate("https://jqueryui.com/slider/");

        

       // page.close();
       // browser.close();

    }    

}
