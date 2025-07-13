package playWrightWithJava;

import java.nio.file.Path;

import org.junit.Assert;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import com.microsoft.playwright.BrowserType.ConnectOptions;
import com.microsoft.playwright.BrowserType.ConnectOverCDPOptions;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.BrowserType.LaunchPersistentContextOptions;
import com.microsoft.playwright.Page;

public class VerifyTitleOfTheWebPage {
	public static Browser browser;
	public static Page page;

	public static void main(String[] args) throws InterruptedException {

		try {

			browser = Playwright.create().chromium()
					.launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));

			page = browser.newPage();
			page.navigate("https://ca-statebar--uatsbx.sandbox.my.site.com/s/login/");

			System.out.println("Title of the webPage is :" + page.title());

			PlaywrightAssertions.assertThat(page).hasTitle("Login");

			Thread.sleep(2000);
			
			page.getByText("Log in").click();
			Thread.sleep(2000);
			String expected="Enter a value in the User Name field.";
			
			
			//capturing text 
			String actal = page.locator("xpath=//div[text()='Enter a value in the User Name field.']").textContent();
			System.out.println(actal);
			Assert.assertEquals(expected,actal);

			Thread.sleep(4000);
			
		}

		finally {
			page.close();
			browser.close();
		}

	}

}
