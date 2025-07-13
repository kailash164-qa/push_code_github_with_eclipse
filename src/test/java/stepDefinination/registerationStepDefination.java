package stepDefinination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerationStepDefination {

	public static WebDriver _driver;

	@Given("I enter AIMS url in the browser for registration")
	public void i_enter_AIMS_url_in_the_browser_for_registration() {
		// Write code here that turns the phrase above into concrete actions

		_driver = new ChromeDriver();
		_driver.get(
				"https://ca-statebar--uatsbx.sandbox.my.site.com/s/login");
		_driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		_driver.manage().window().maximize();

		_driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@When("I enter user name and passsword for registration")
	public void i_enter_user_name_and_passsword_for_registration() throws InterruptedException {
		WebElement emailId = _driver.findElement(By.xpath("//input[@placeholder='Email']"));
		emailId.clear();
		Thread.sleep(2000);
		emailId.sendKeys("kailashbangad6@gmail.com");

		WebElement password = _driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.clear();
		Thread.sleep(2000);
		password.sendKeys("Test@12345");

		

	}

	@When("I click on the login button for registration")
	public void i_click_on_the_login_button_for_registration() {
		WebElement logInButton = _driver.findElement(By.xpath("//span[text()='Log in']"));
		logInButton.click();

	}

	@When("User clicked on Applicaions")
	public void user_clicked_on_Applicaions() {
		WebElement applications_button = _driver.findElement(By.xpath("//*[text()= 'Applications']"));
		applications_button.click();

	}

	@When("User clicked on View Application Forms")
	public void user_clicked_on_View_Application_Forms() {
		// Write code here that turns the phrase above into concrete actions
		
		WebElement viewapplicationsforms_button = _driver.findElement(By.xpath("//*[text()='View Forms']"));
		viewapplicationsforms_button.click();

	}
	@When("user click on Registration Application")
	public void user_click_on_Registration_Application() {
		WebElement registrationapplication_button = _driver.findElement(By.xpath("//button[text()='Registration Application']"));
		registrationapplication_button.click();

	    
	}

	
	

	@When("User clicked on Launch or edit Application")
	public void user_clicked_on_Launch_or_edit_Application() {
	
	WebElement edit_registration = _driver.findElement(By.xpath("//*[text()='Edit']"));
	edit_registration.click();
	}

	@Then("User clicked  registration instructions")
	public void user_clicked_registration_instructions() throws InterruptedException {
		
		Thread.sleep(1000);
		WebElement registratiionpage = _driver.findElement(By.xpath("//a[text() ='Registration Instructions']"));
		registratiionpage.click();

	}
	
	
	@When("User click on personal information")
	public void user_click_on_personal_information() {
		WebElement persnalinformation = _driver.findElement(By.xpath("//*[text()='Personal Information']"));
		persnalinformation.click();
	}

	@When("User enter the details and click on save button")
	public void user_enter_the_details_and_click_on_save_button() {
	  WebElement firstName = _driver.findElement(By.xpath("//*[@name='FirstName']"));
	  firstName.sendKeys("testFirstName");
	  WebElement middleName = _driver.findElement(By.xpath("//*[@name='MiddleName']"));
	  middleName.sendKeys("testMiddleName");
	  WebElement lastName = _driver.findElement(By.xpath("//*[@name='LastName']"));
	  
	  lastName.sendKeys("testLastName");
	  WebElement suffix = _driver.findElement(By.xpath("//*[@name='Suffix']"));
	  suffix.sendKeys("testSuffix");
	  _driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
	  
	  
	}

	@When("User enter the security questions details and click on save button")
	public void user_enter_the_security_questions_details_and_click_on_save_button() {
		_driver.findElement(By.xpath("//*[@name='Spouse_s_Full_Name__c']")).sendKeys("NA");
		
		_driver.findElement(By.xpath("//*[@name='X1st_Parent_s_Full_Name__c']")).sendKeys("NA");
		
		_driver.findElement(By.xpath("//*[@name='X2nd_Parent_s_Full_Name__c']")).sendKeys("NA");
		  _driver.findElement(By.xpath("(//*[text()='Save'])[2]")).click();
	}

	@When("User enter the Date_and_place_of_birth details and click on save button")
	public void user_enter_the_Date_and_place_of_birth_details_and_click_on_save_button() {
		 _driver.findElement(By.xpath("//*[@name='Birthdate']")).sendKeys("Mar 2, 2025");
		 _driver.findElement(By.xpath("//*[@name='City_of_Birth__c']")).sendKeys("testCity");
		 _driver.findElement(By.xpath("(//*[text()='Save'])[3]")).click();
	}

	@When("User enter the emails address details and click on save  button")
	public void user_enter_the_emails_address_details_and_click_on_save_button() {
		WebElement privateemail = _driver.findElement(By.xpath("//*[@name='Private_Email__c']"));
		privateemail.sendKeys("test@yahoo.com");
		
		
		WebElement workemail = _driver.findElement(By.xpath("//*[@name='hed__WorkEmail__c']"));
		workemail.sendKeys("test@gmail.com");
		
		 _driver.findElement(By.xpath("(//*[text()='Save'])[4]")).click();
		
	}

	@When("user enter the phone numbers and click on save button")
	public void user_enter_the_phone_numbers_and_click_on_save_button() {
		_driver.findElement(By.xpath("//*[@name='Private_Phone__c']")).sendKeys("1234567890");
		_driver.findElement(By.xpath("//*[@name='hed__WorkPhone__c']")).sendKeys("1234567890");
		
		 _driver.findElement(By.xpath("(//*[text()='Save'])[5]")).click();
	}

	@When("user enter the mailing address details  and click on save button")
	public void user_enter_the_mailing_address_details_and_click_on_save_button() {
		_driver.findElement(By.xpath("//*[@name='MailingCountry']")).sendKeys("t1");
		_driver.findElement(By.xpath("//*[@name='MailingStreet']")).sendKeys("t2");
		
		_driver.findElement(By.xpath("//*[@name='MailingCity']")).sendKeys("t3");
		
		_driver.findElement(By.xpath("//*[@name='MailingState']")).sendKeys("t4");
		
		_driver.findElement(By.xpath("//*[@name='MailingPostalCode']")).sendKeys("t5");
		
		 _driver.findElement(By.xpath("(//*[text()='Save'])[6]")).click();
		 
		 _driver.findElement(By.xpath("//a[text()='Former Names & Aliases']")).click();
		 _driver.findElement(By.xpath("//button[@name='Has_Aliases__c']")).click();
		 
		 _driver.findElement(By.xpath("//button[text()='Save']")).click();
		 
		 
		 _driver.findElement(By.xpath("//a[text()='Special Student']")).click();
		 _driver.findElement(By.xpath("//button[@name='Special_Student__c']")).click();
		 
		 _driver.findElement(By.xpath("//button[text()='Save']")).click();
		 
		 
		 _driver.findElement(By.xpath("//a[text()='Pre-Legal Education']")).click();
		 
		 _driver.findElement(By.xpath("//button[@name='At_Least_2_Years_of_Pre_Legal_Education__c']")).click();
		 
		 _driver.findElement(By.xpath("//button[text()='Save']")).click();
		 
		 
		 
 _driver.findElement(By.xpath("//a[text()='Law Office Study Program']")).click();
		 
		 _driver.findElement(By.xpath("//button[@name='Requested_Law_Office_Study__c']")).click();
		 
		 _driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		 
		 
		 
         _driver.findElement(By.xpath("//a[text()='Legal Education']")).click();
		 
		 _driver.findElement(By.xpath("//button[@name='Has_Legal_Education__c']")).click();
		 
		 _driver.findElement(By.xpath("//button[text()='Save']")).click();
		 
		 
          _driver.findElement(By.xpath("//a[text()='Jurisdictions of Admission']")).click();
		 
		 _driver.findElement(By.xpath("//button[@name='Admitted_to_any_Jurisdiction_s__c']")).click();
		 
		 _driver.findElement(By.xpath("//button[text()='Save']")).click();
		 
		 
		 
		 _driver.findElement(By.xpath("//a[text()='Demographics']")).click();
		 
		 
		 
		 
		 
		 _driver.findElement(By.xpath("//a[text()='Verification']")).click();
		 
		 
		 
		 
		 
		 

		 
		 
		 //verification
		 _driver.findElement(By.xpath("//button[text()='Submit']")).click();
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
