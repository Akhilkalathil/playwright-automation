package com.akhil;

import com.github.javafaker.Faker;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class register {

       public static void main(String[] args) {

        
        Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));

        Page page = browser.newPage();
        
        page.navigate("https://freelance-learn-automation.vercel.app/login");

       page.locator("xpath=//a[normalize-space()='New user? Signup']").click();

       page.locator("#name").fill(new Faker().name().fullName());

       page.locator("xpath=//input[@id='email']").fill(new Faker().name().firstName()+"_"+new Faker().name().lastName()+"@gamil.com");
       
//page.pause();

       page.locator("#password").fill("admin@123");

       page.locator("xpath=//label[normalize-space()='Java']").click();
       
      PlaywrightAssertions.assertThat(page.locator("xpath=//label[normalize-space()='Java']")).isChecked();
    
      page.locator("xpath=//input[@id='gender2']").click();

      page.locator("#state").selectOption("Goa");

      String hobies[] = {"Playing","Swimming"};
      page.locator("#hobbies").selectOption(hobies);

      page.locator(".submit-btn").click();

       browser.close();
       page.close();

       }

}
