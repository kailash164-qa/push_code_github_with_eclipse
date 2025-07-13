package com.gspan.RestAssuredEx1;

import java.net.ResponseCache;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TestPost {
	
	
	
	
	@Test
	public void testPost() {
		
		String smaple="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		
		Response res =given()
		.contentType(ContentType.JSON)
		.body(smaple)
		.when()
		.get("https://reqres.in/api/users")
		.then()
		.extract()
		//.path("data[1]",)
		.response();
	
	
		
		JsonPath jsonPath = res.jsonPath();
		
		
		System.out.println("jsonPath.data.findALL{it name>3}");
		
		
	}
	
	
	

}
