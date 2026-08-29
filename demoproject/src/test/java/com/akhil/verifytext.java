package com.akhil;

import java.util.regex.Pattern;

import org.testng.Assert;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class verifytext {

    public static void main(String[] args) {

     
     Browser broswer =  Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
        
       Page page = broswer.newPage();

    page.navigate("https://freelance-learn-automation.vercel.app/login");
        
        page.locator("#email1").fill("Akhil@email.com");

        page.locator("#password1").fill("423434");

        page.locator(".submit-btn").click();

        String expected =  "USER Email Doesn't Exist";
        
      //  PlaywrightAssertions.assertThat(page.locator(".errorMessage")).containsText(expected);

          PlaywrightAssertions.assertThat(page.locator(".errorMessage")).containsText(Pattern.compile("Akhil"));

        /*
        String expected = "USER Email Doesn't Exist";

        String actual = page.locator(".errorMessage").textContent();
        Assert.assertEquals(expected, actual);
        */

        page.close();
        broswer.close();

    }

}
