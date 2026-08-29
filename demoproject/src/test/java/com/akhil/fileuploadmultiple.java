package com.akhil;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class fileuploadmultiple {
    public static void main(String[] args) {
        Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));

        Page page = browser.newPage();

        page.navigate("https://the-internet.herokuapp.com/upload");

       FileChooser filechooser = page.waitForFileChooser(() -> page.locator("#drag-drop-upload").click());

       filechooser.setFiles(Paths.get("C:\\Users\\Admin\\Downloads\\cat.jpg"));

       page.close();
            browser.close();
    }

}
