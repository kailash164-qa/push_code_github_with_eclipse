package com.gspan.RestAssuredEx1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Test_Basic_All_In_Rest_Assured {

	
	
	
	//verify status code
	//@Test
	public void statusCode() {
		
		given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200);
		
		
	}
	
	//@Test
	public void testLogging() {
		
		given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.log().all();
		
		
	}
	
	
	
	//@Test
	public void testEqualToFunction() {
		
		given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.body("data[0].last_name", equalTo("Lawson"));
		
		
	}
	
	
	//@Test
	public void test_particular_itmes_inListOfItems() {
		
		given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.body("data.last_name", hasItem("Funke"));
		
		
	}
	
	
	//@Test
	public void test_multiple_items() {
		
		given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.body("data.last_name", hasItems("Ferguson","Funke","Fields"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
