package com.gspan.RestAssuredEx1;

import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestExample {

	public static void main(String[] args) {
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		
		
		

	
		  RequestSpecification httpRequest = RestAssured.given(); 
		   Response response = httpRequest.request(Method.GET, "");
		  System.out.println("Status received => " + response.getStatusLine());
		//  System.out.println("Response=>" + response.prettyPrint());
		
		JsonPath jsonpath = response.jsonPath();
		
		
		//extract field
		String emailId=jsonpath.getString("data.email[1]");
		System.out.println("Extracted email id is :"+emailId);
		
		
		System.out.println("**********************************");
		
		String jsonString="{\r\n"
				+ "    \"page\": 2,\r\n"
				+ "    \"per_page\": 6,\r\n"
				+ "    \"total\": 12,\r\n"
				+ "    \"total_pages\": 2,\r\n"
				+ "    \"data\": [\r\n"
				+ "        {\r\n"
				+ "            \"id\": 7,\r\n"
				+ "            \"email\": \"michael.lawson@reqres.in\",\r\n"
				+ "            \"first_name\": \"Michael\",\r\n"
				+ "            \"last_name\": \"Lawson\",\r\n"
				+ "            \"avatar\": \"https://reqres.in/img/faces/7-image.jpg\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"id\": 8,\r\n"
				+ "            \"email\": \"lindsay.ferguson@reqres.in\",\r\n"
				+ "            \"first_name\": \"Lindsay\",\r\n"
				+ "            \"last_name\": \"Ferguson\",\r\n"
				+ "            \"avatar\": \"https://reqres.in/img/faces/8-image.jpg\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"id\": 9,\r\n"
				+ "            \"email\": \"tobias.funke@reqres.in\",\r\n"
				+ "            \"first_name\": \"Tobias\",\r\n"
				+ "            \"last_name\": \"Funke\",\r\n"
				+ "            \"avatar\": \"https://reqres.in/img/faces/9-image.jpg\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"id\": 10,\r\n"
				+ "            \"email\": \"byron.fields@reqres.in\",\r\n"
				+ "            \"first_name\": \"Byron\",\r\n"
				+ "            \"last_name\": \"Fields\",\r\n"
				+ "            \"avatar\": \"https://reqres.in/img/faces/10-image.jpg\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"id\": 11,\r\n"
				+ "            \"email\": \"george.edwards@reqres.in\",\r\n"
				+ "            \"first_name\": \"George\",\r\n"
				+ "            \"last_name\": \"Edwards\",\r\n"
				+ "            \"avatar\": \"https://reqres.in/img/faces/11-image.jpg\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"id\": 12,\r\n"
				+ "            \"email\": \"rachel.howell@reqres.in\",\r\n"
				+ "            \"first_name\": \"Rachel\",\r\n"
				+ "            \"last_name\": \"Howell\",\r\n"
				+ "            \"avatar\": \"https://reqres.in/img/faces/12-image.jpg\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"support\": {\r\n"
				+ "        \"url\": \"https://contentcaddy.io?utm_source=reqres&utm_medium=json&utm_campaign=referral\",\r\n"
				+ "        \"text\": \"Tired of writing endless social media content? Let Content Caddy generate it for you.\"\r\n"
				+ "    }\r\n"
				+ "}";
		
		
		
		
		ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			Users user=objectMapper.readValue(jsonString, Users.class);
			
			/*
			 * String pageT=user.getTotal();
			 * 
			 * System.out.println(pageT);
			 */
			
			List<DataPojo> d = user.getData();
		
			for(int i=0;i<d.size();i++) {
				
				System.out.println(d.get(i).getEmail());
				//break;
			}
			
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
		
		
		
		
	}
}
