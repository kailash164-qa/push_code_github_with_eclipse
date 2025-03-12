package testcases;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import routes.Routes;
import utils.ConfigReader;

public class BaseClass {

	ConfigReader config;
	RequestLoggingFilter requestLoggingFilter;
	
	ResponseLoggingFilter responseLoggingFilter;

	@BeforeClass
	public void setUp() throws FileNotFoundException {

		config = new ConfigReader();

		RestAssured.baseURI = Routes.BASE_URL;
		
		/*
		 * FileOutputStream fileOutputStream = new
		 * FileOutputStream(".\\logs\\test.log");
		 * 
		 * PrintStream printStream = new PrintStream(fileOutputStream,true);
		 * 
		 * requestLoggingFilter = new RequestLoggingFilter(printStream);
		 * 
		 * responseLoggingFilter = new ResponseLoggingFilter(printStream);
		 * 
		 * RestAssured.filters(requestLoggingFilter,responseLoggingFilter);
		 */

	}

	public boolean isSortedDesc(List<Integer> list) {

		for (int i = 0; i < list.size()- 1; i++) {

			if (list.get(i) < list.get(i + 1)) {

				return false;

			}

		}
		return true;

	}

	
	
	public boolean isSortedAsc(List<Integer> list) {

		for (int i = 0; i < list.size() - 1; i++) {

			if (list.get(i) > list.get(i + 1)) {

				return false;

			}

		}
		return true;

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
