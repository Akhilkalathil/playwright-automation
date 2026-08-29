import java.nio.file.Paths;
import java.util.Base64;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import com.microsoft.playwright.Playwright;

public class screenshot {

 public static void main(String[] args) {
                        

    Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));

      Page page = browser.newPage();
        
        page.navigate("https://www.naukri.com/");

        page.locator("#login_Layer").screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("Element screenshot.png")));

           //       byte [] array = page.screenshot(new Page.ScreenshotOptions().setFullPage(false).setPath(Paths.get("Screenshot2.png")));

           //     System.out.println(Base64.getEncoder().encodeToString(array));
      page.close();
      browser.close(); 
}
}
