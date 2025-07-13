package stepDefinination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {

	public static WebDriver driver;


	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {

		driver = new ChromeDriver();
		driver.get("https://ca-statebar--uatsbx.sandbox.my.site.com/s/login/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@When("User  enters valid credentials")
	public void user_enters_valid_credentials() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("someshbangad6@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test12345");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button//span[text()='Log in']")).click();
		Thread.sleep(1000);
	}


	

	@Then("user in on home page")
	public void user_in_on_dashboard_page() {

		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Home", "Pass");

	}

}
