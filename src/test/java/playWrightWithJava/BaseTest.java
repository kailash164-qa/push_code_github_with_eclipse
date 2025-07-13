package playWrightWithJava;

import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import io.cucumber.java.Before;

public class BaseTest {

	public static Browser browser;

	public static Page page;

	@BeforeTest
	public static void basePage() throws Exception{
		Browser browser = Playwright.create().chromium()
				.launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));

		Page page = browser.newPage();
		page.navigate("https://ca-statebar--uatsbx.sandbox.my.site.com/s/login/");

	}

}
