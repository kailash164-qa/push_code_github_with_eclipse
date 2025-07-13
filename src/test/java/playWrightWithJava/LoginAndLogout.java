package playWrightWithJava;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class LoginAndLogout {

	public static Browser browser;
	public static Page page;

	public static void main(String[] args) throws InterruptedException {

		try {

			browser = Playwright.create().chromium()
					.launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));

			page = browser.newPage();
			page.navigate("https://ca-statebar--uatsbx.sandbox.my.site.com/s/login/");

			page.locator("xpath=//input[@placeholder='Email']").fill("sameer@gmail.com");

			page.waitForTimeout(20);
			
			page.getByPlaceholder("Password").fill("Test@12345");

		//	page.locator("xpath=//input[@placeholder='Password']").fill("Test@12345");
			page.waitForTimeout(20);

			page.getByText("Log in").click();
			Thread.sleep(8000);
			
			
			System.out.println("Title of the webPage is :" + page.title());

			PlaywrightAssertions.assertThat(page).hasTitle("Home");

			
			page.locator("xpath=//span[@class='triggerDownArrow down-arrow']").click();
			
			Thread.sleep(2000);
			
			page.getByTitle("Logout").click();
			
			Thread.sleep(7000);
		}

		finally {
			page.close();
			browser.close();
		}

	}

}
