package com.akhil;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.testng.Assert;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class alerthandling {
    public static void main(String[] args) {
        Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(5000));

        Page page = browser.newPage();

        page.navigate("https://the-internet.herokuapp.com/javascript_alerts");

       page.onDialog(dialog -> {

          String msg =  dialog.message();

          System.out.println("Message is"+msg);

          Assert.assertTrue(msg.contains("I am a JS prompt"));

          dialog.accept("Akhil");
       });

       page.locator("xpath=//button[normalize-space()='Click for JS Prompt']").click();

       page.close();
            browser.close();
    }

}
