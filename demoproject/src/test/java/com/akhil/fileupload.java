package com.akhil;

import java.nio.file.Path;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class fileupload {
    public static void main(String[] args) {
        Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));

        Page page = browser.newPage();

        page.navigate("https://the-internet.herokuapp.com/upload");

       // page.locator("#file-upload").setInputFiles(Path.of("C:\\Users\\Admin\\Downloads\\cat.jpg"));

        //page.locator("#file-upload").setInputFiles(Path.of(System.getProperty("user.dir")+"/Files/cat.jpg"));

        //  page.locator("#file-upload").setInputFiles(Path.of(System.getProperty("user.dir") + "\\Files\\cat.jpg"));

        Path [] files = {

                Path.of(System.getProperty("user.dir") + "\\Files\\cat.jpg"),
                Path.of(System.getProperty("user.dir") + "\\Files\\cat1.jpg")
        };

        page.locator("#file-upload").setInputFiles(files);
// 2nd way
        page.locator("#file-upload").setInputFiles(new Path[] {
            Path.of(System.getProperty("user.dir") + "\\Files\\cat.jpg"),
                Path.of(System.getProperty("user.dir") + "\\Files\\cat1.jpg")
        });
    }

}
