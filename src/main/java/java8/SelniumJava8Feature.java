package java8;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelniumJava8Feature {

	public static WebDriver driver;

	public static String allLinks[] = { "Computers", "Digital downloads", "Apparel", "Books", "Jewelry", "Gift Cards",
			"Electronics" };

	@BeforeTest
	public void setUp() {

		driver = new ChromeDriver();

		// URL of the login website that is tested
		driver.get("https://demo.nopcommerce.com/");

		// Maximize window size of browser
		driver.manage().window().maximize();
	}

	@AfterTest
	public void tearDown() {

		driver.quit();
	}

	@Test
	public void getAllHeaderLinksUsingJava8() {
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='header-menu']//ul"));
		List<String> asList = Arrays.asList(allLinks);
		ele.stream().forEach(x -> {
			System.out.println(x.getText());

		});

	}

}
