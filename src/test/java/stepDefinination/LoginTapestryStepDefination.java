package stepDefinination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTapestryStepDefination extends BaseTest {

	
	
	
	@Given("user luch the browser")
	public void user_luch_the_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
	}

	@Given("hit the {string}")
	public void hit_the(String string) {
		driver.get(string);
		driver.findElement(By.xpath("//a[@class='account-icon']")).click();
	}

	@When("user enter the email address")
	public void user_enter_the_email_address() {
		driver.findElement(By.xpath("//input[@name='loginEmail' and contains(@class, 'js-email required')]")).sendKeys("vipb2btest@gmail.com");
	}

	@When("click on continue button")
	public void click_on_continue_button() {
		driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
	}

	@When("user enter the password")
	public void user_enter_the_password() {
		driver.findElement(By.xpath("//input[@id='login-form-password']")).sendKeys("Tester@123");
	}

	@When("click on sign In Button")
	public void click_on_sign_In_Button() {
		driver.findElement(By.xpath("//button[@type='submit' and contains(@data-qa,'al_btn_signin')]")).click();
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println(driver.getTitle());
	}

	@Then("check more outcomes")
	public void check_more_outcomes() throws InterruptedException {
	    Thread.sleep(5000);
		driver.quit();
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	
	

	

	

	
	

	

}
