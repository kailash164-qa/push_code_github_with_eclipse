package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	
	public static WebDriver _driver;
	

	public RegistrationPage() {
		PageFactory.initElements(_driver, this);
	}
	
	
	
	
	
 public  void m1() {
	  
	  WebElement emailId = _driver.findElement(By.xpath("//input[@placeholder='Email']"));
	  emailId.clear();
	  emailId.sendKeys("kailash.bangad13@gmail.com");
	  
	  
	  WebElement password = _driver.findElement(By.xpath("//input[@placeholder='Password']"));
	  password.clear();
	  password.sendKeys("Test@12345");
	  
	  
	  WebElement logInButton = _driver.findElement(By.xpath("//span[text()='Log in']"));
	  logInButton.click();
	  
  }
 WebElement ssnleftpanel=_driver.findElement(By.xpath("//*[text()='Social Security Number']"));
 
 
 public WebElement ssn_one = _driver.findElement(By.xpath("(//*[@part='input-container'])[1]"));
 public WebElement ssn_two = _driver.findElement(By.xpath("(//*[@class='slds-form-element__control slds-grow']/input)[2]"));
 public WebElement ssn_three = _driver.findElement(By.xpath("(//*[@class='slds-form-element__control slds-grow']/input)[3]"));

 public WebElement ssn_checkboxone = _driver.findElement(By.xpath("(//*[@part='indicator'])[1]"));
 public WebElement ssn_checkboxone1 = _driver.findElement(By.xpath("(//*[text()='I am not eligible for a U.S. Social Security Number']"));
 public WebElement ssn_checkboxtwo = _driver.findElement(By.xpath("(//*[@part='indicator'])[2]"));
 public WebElement ssn_checkboxthree = _driver.findElement(By.xpath("(//*[@part='indicator'])[3]"));
 
 
 public void ClickonSSN()
 {
     ssnleftpanel.click();
    
 }

 public void EnterSSNNumber()
 
 
 {
	//creating a reference 
	 JavascriptExecutor js = (JavascriptExecutor) _driver;
	 js.executeScript("arguments[0].scrollIntoView(false);", ssn_one);
     ssn_one.sendKeys("111");
     ssn_two.sendKeys("22");
     ssn_three.sendKeys("777");
 }
 public void clickSSNcheckbox()
 {
     //ScrollToView(ssn_checkboxone);
     ssn_checkboxone.click();
     ssn_checkboxtwo.click();
     ssn_checkboxthree.click();

 }
 public void ClickonssnSave()
 {
    // ssnsaveBtn.Click();
 }
	
	
	
	
	
	
	
	
	

}
