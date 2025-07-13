package playWrightWithJava;

import com.github.javafaker.Faker;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class RegisterNewUser {
	public static Browser browser;
	public static Page page;

	public static void main(String[] args) throws InterruptedException {
		try {

			browser = Playwright.create().chromium()
					.launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome").setSlowMo(500));

			page = browser.newPage();
			page.navigate("https://freelance-learn-automation.vercel.app/login");

			Thread.sleep(2000);

			System.out.println("Title of the webPage is :" + page.title());

			page.getByText("New user? Signup").click();

			Thread.sleep(2000);

			PlaywrightAssertions.assertThat(page.locator(".submit-btn")).isDisabled();

			page.getByPlaceholder("Name").fill(new Faker().name().firstName());

			Thread.sleep(1000);

			page.getByPlaceholder("Email").fill(new Faker().name().firstName()+"_"+new Faker().name().lastName()+"@gmail.com");
			Thread.sleep(1000);
			page.getByPlaceholder("Password").fill("Kailash@12345");
			Thread.sleep(1000);
			page.getByText("Selenium Grid").click();
			Thread.sleep(2000);
			page.locator("#gender2").click();
			Thread.sleep(2000);
			page.locator("#state").selectOption("Goa");
			Thread.sleep(2000);
			
			
			
			String arr[]= {"Dancing","Singing"};
			page.locator("#hobbies").selectOption(arr);
			
			Thread.sleep(2000);
			
			page.locator(".submit-btn").click();
			
			Thread.sleep(4000);
		}

		finally {
			page.close();
			browser.close();
		}

	}

}
