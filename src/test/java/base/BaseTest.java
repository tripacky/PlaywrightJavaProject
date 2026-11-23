package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseTest {
	protected Playwright playwright;
	protected Browser browser;
	protected Page page;
	
	 // 1. SETUP: Runs once before any test methods execute
    @BeforeMethod
    public void setup() {
        System.out.println("Setup: Initializing Playwright and Browser...");
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
        //BrowserContext context = browser.newContext();
        page = browser.newPage();
    }

    // 2. TEARDOWN: Runs once after all test methods finish
    @AfterMethod
    public void teardown() {
        System.out.println("Teardown: Closing browser and cleaning up...");
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }

}
