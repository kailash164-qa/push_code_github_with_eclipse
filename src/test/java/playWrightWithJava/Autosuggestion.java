package playWrightWithJava;

import org.junit.Assert;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class Autosuggestion {

	public static Browser browser;
	public static Page page;

	public static void main(String[] args) throws InterruptedException {
		try {

			browser = Playwright.create().chromium()
					.launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));

			page = browser.newPage();
			page.navigate("https://www.google.com/");

			System.out.println("Title of the webPage is :" + page.title());

			PlaywrightAssertions.assertThat(page).hasTitle("Google");

			Thread.sleep(2000);

			page.locator("#APjFqb").fill("selenium");
			Thread.sleep(2000);

			Locator locator = page.locator("//div[@id='Alh6id']//li");
			Thread.sleep(3000);
			for (int i = 0; i < locator.count(); i++) {

				String innerText = locator.nth(i).innerText();

				System.out.println(innerText + " ");

				/*
				 * if (innerText.equalsIgnoreCase("selenium")) {
				 * 
				 * locator.nth(i).click();
				 * 
				 * break;
				 * 
				 * }
				 */

			}
			
			
		//	Thread.sleep(3000);

		}

		finally {
			page.close();
			browser.close();
		}
	}

}
