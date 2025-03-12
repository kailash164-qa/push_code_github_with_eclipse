package runnners;


import org.junit.runner.RunWith;
import io.cucumber.junit.*;
    
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\KailashBangad\\eclipse-workspace\\RestAssuredEx1\\src\\test\\resources\\features\\login.feature",
        glue ="stepDefinination",
       
        
        		plugin = {"pretty","html:target/HtmlReports1/report.html",

        				"json:target/JSONReports/report.json",

        				"junit:target/JUnitReports/report.xml"},
       dryRun = false, 
        monochrome=true,
        strict=true
        
    )














public class TestRunner {

}
