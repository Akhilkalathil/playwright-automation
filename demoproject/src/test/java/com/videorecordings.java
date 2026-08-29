package com;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class videorecordings {

    public static void main(String[] args) {
        Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

       BrowserContext context  = browser.newContext(new Browser.NewContextOptions().setRecordVideoSize(500,500).setRecordVideoDir(Paths.get("videos/")));

    
         Page page = context.newPage();
        
        page.navigate("https://freelance-learn-automation.vercel.app/login");

        PlaywrightAssertions.assertThat(page).hasTitle("Learn Automation Courses");

         System.out.print("Going to login");

        page.locator("#email1").fill("admin@email.com");

        System.out.print("Email address entered");

        //page.locator("xpath=//input[@id='email1']").fill("admin@email.com");

        page.locator("#password1").fill("admin@123");

        System.out.print("Password entered");

       // page.getByText("Sign in").click();

       page.locator("xpath=//button[normalize-space()='Sign in']").click();

        System.out.print("Sign on button clicked");

        //PlaywrightAssertions.assertThat(page.locator("await page.locator('h1:has-text(\"Learn Automation Courses\")')")).containsText("Welcome");

        page.locator("xpath=//img[@alt='menu']").click();

        System.out.print("Sign off button goin to click");

          page.locator("xpath=//button[normalize-space()='Sign out']").click();

        System.out.print("Sign off button clicked");

        PlaywrightAssertions.assertThat(page).hasURL("https://freelance-learn-automation.vercel.app/login");

        System.out.print("Login page displayed");

       
          page.close();
          context.close();
            browser.close();
        
        


    }
}
