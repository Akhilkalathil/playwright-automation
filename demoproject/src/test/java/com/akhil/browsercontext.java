package com.akhil;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.testng.Assert;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class browsercontext {
    public static void main(String[] args) {
        Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(5000));

        BrowserContext browserecontest = browser.newContext();

        Page page = browserecontest.newPage();

        page.navigate("https://freelance-learn-automation.vercel.app/login");

       Page newpage = browserecontest.waitForPage(()->
{
  page.locator("xpath=//div[@class='container-child']//a[4]//*[name()='svg']").click();
}
    );

    newpage.locator("//input[@id='email']").last().fill("Akhil");  

      page.bringToFront();


      newpage.close();
      browserecontest.close();
       page.close();
            browser.close();
    }

}
