package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class loginpagecopygit {
    
    private Locator usernameLocator;
    private Locator passwordLocator;
    private Locator submitbuttonLocator;

    //create constructor with same class name and pass page

    public loginpagecopygit(Page page)
    {
        usernameLocator = page.getByPlaceholder("Enter");
        passwordLocator = page.locator("#password1");
        submitbuttonLocator = page.locator("xpath=//button[normalize-space()='Sign in']");
    }

// Create method

public void logintoanapplication(String user, String pass)
{
    usernameLocator.fill(user);
    passwordLocator.fill(pass);
    submitbuttonLocator.click();

}

}
