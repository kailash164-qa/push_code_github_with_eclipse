package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {

	
	

	@Test
	public void a() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.mobiscroll.com/select/country-picker");
		
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='demo155-country-picker']")).click();

		List<WebElement> elements = driver.findElements(
				By.xpath("//div[@class='mbsc-scroller-wheel-item mbsc-ios mbsc-ltr mbsc-wheel-item-checkmark']"));

		for (WebElement e : elements) {

			String text = e.getText();
			System.out.println(text);

			if (text.equals("India")) {

				e.click();

				
				
			}

		}

	}

}
