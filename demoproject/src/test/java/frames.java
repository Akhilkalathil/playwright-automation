import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class frames {

   public static void main(String[] args) {
    
    Browser broswer =  Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
        
    Page page = broswer.newPage();

    page.navigate("https://www.redbus.in/");

    page.locator("xpath=//button[normalize-space()='Account']").click();
    page.locator("xpath=//button[normalize-space()='Log in']").click();

    List <Frame> allframes = page.frame(null)
    page.locator("xpath=//input[@type='tel']").fill("7788994455");
    page.frameLocator(null)

    page.close();
    broswer.close();


   }

}
