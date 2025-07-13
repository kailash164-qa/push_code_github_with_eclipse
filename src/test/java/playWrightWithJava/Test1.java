package playWrightWithJava;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Response;

public class Test1 {

	public static Browser launch;
	public static Page page;

	public static void main(String[] args) throws InterruptedException {
		try (Playwright playwright = Playwright.create()) {

			launch = playwright.chromium()
					.launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome").setSlowMo(90));

			page = launch.newPage();
			page.navigate("https://ca-statebar--uatsbx.sandbox.my.site.com/s/login/");

			System.out.println("Title of the page is :" + page.title());

			Thread.sleep(5000);

			page.close();
			launch.close();
			playwright.close();

		}

	}

}
