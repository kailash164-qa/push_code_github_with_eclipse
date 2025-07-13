package stepDefinination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InValidLoginErrorMsgCapture extends BaseTest {



	@When("user enter the inValidEmail address")
	public void user_enter_the_inValidEmail_address() {

		driver.findElement(By.xpath("//input[@name='loginEmail' and contains(@class, 'js-email required')]"))
				.sendKeys("vipb2btessxd@");
		
	}

	@When("capture the error message")
	public void capture_the_error_message() throws InterruptedException {
		Thread.sleep(4000);
		text = driver.findElement(By.xpath("//div[@id='form-email-error' and contains(text(),'Enter a valid email address.')]"))
				.getText();

		Thread.sleep(4000);

	}

	@Then("I validate the error messgae")
	public void i_validate_the_error_messgae() {
		Assert.assertEquals(text, "Enter a valid email address.");
	}

	@Then("quite browser")
	public void quite_browser() throws InterruptedException {
		Thread.sleep(6000);
		driver.quit();
	}

}
