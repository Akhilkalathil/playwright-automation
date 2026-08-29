import java.nio.file.Paths;
import java.util.Base64;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import com.microsoft.playwright.Playwright;

public class screenshotviautility {

 public static void main(String[] args) {
                        

    Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));

      Page page = browser.newPage();
        
        page.navigate("https://www.naukri.com/");

        utility.capturescreenshot(page);

      page.close();
      browser.close(); 
}
}
