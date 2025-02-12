package practices;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Test1 {
	
	@Test
	public void f() throws InterruptedException {
		
		
		  // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\mmc-webautomation-framework\\src\\test\\java\\practices\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("http://www.javatpoint.com/");  
          
         //Maximize the browser  
          driver.manage().window().maximize();  
          
          //Scroll down the webpage by 5000 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 5000)");   
          
     
        Thread.sleep(3000);
        
        driver.quit();
		
		
	}

}
