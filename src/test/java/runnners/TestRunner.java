package runnners;


import org.junit.runner.RunWith;
import io.cucumber.junit.*;
    
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature\\features\\invalidLogin.feature",
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
