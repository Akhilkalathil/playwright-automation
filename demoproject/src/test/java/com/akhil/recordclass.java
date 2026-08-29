package com.akhil;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import com.microsoft.playwright.options.AriaRole;

public class recordclass {

public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));

      BrowserContext context = browser.newContext();
      Page page = context.newPage();
      page.navigate("https://freelance-learn-automation.vercel.app/login");
      PlaywrightAssertions.assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Sign In"))).isVisible();
      page.getByPlaceholder("Enter Email").click();
      page.getByPlaceholder("Enter Email").fill("admin@email.com");
      page.getByPlaceholder("Enter Password").click();
      page.getByPlaceholder("Enter Password").click();
      page.getByPlaceholder("Enter Password").fill("admin@123");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign in")).click();
      PlaywrightAssertions.assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Welcome Admin Manager to"))).isVisible();
      page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("menu")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign out")).click();
      PlaywrightAssertions.assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Sign In"))).isVisible();
    }
  }

}
