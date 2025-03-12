package stepDefinination;

import java.sql.Driver;
import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {

	public static WebDriver driver;


	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		Assert.assertEquals(driver.getTitle(), "OrangeHRM", "Pass");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User  enters valid credential {string} as username {string} as password")
	public void user_enters_valid_credential(String uname, String pass) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys(uname);
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()= ' Login '] ")).click();
		Thread.sleep(1000);

	}

	@Then("user in on dashboard page")
	public void user_in_on_dashboard_page() {

		boolean displayed = driver.findElement(By.xpath("//span//h6[text()='Dashboard']")).isDisplayed();
		Assert.assertEquals(displayed, true, "Pass");

	}

}
