package pageobjectmodel;

import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import pages.loginpage;

public class loginpageobjectmodel {
@Test
    public void login ()
    {
        Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://freelance-learn-automation.vercel.app/login");
        
        loginpage loginpage = new loginpage(page);

        loginpage.logintoanapplication("admin@email.com","admin123");
    }

}
