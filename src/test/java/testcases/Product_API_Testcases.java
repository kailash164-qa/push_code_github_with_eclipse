package testcases;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import payloads.ProductPayload;
import pojo.Product;
import routes.Routes;

import static io.restassured.RestAssured.*;
import  org.hamcrest.Matcher.*;
import static org.testng.Assert.assertEquals;

import java.util.Collection;
import java.util.List;


public class Product_API_Testcases extends BaseClass{
	
	
	//@Test()
	public void  getAllProducts() {
		
		given()
		 .when()
			//.get(Routes.getAllPrducts)
		.get(Routes.getAllCategory)
		
		.then().statusCode(200)
		
		.log().body();
		
		
		
	}
	
	//@Test()
	public void  getSingleProductByID() {
		
		Integer intProperty = config.getIntProperty("product_id");
	
		
		given()
		.pathParam("id", intProperty)
		
		.when()
			.get(Routes.getSingleProduct)
			
		
		.then()
		
		.statusCode(200)
		
		.log().body();
		
	}
	
	
	@Test()
	public void  getSingleProductByCategory() {
		
		
	String stringProperty = config.getStringProperty("single_category");
		
		given()
		
		.pathParam("category", stringProperty)
		.when()
		
			.get(Routes.getProductByCategory)
		
		.then()
		.assertThat()
		.log().body()
		.statusCode(200);

		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//@Test()
	public void  getProductByLimit() {
		
		Integer intProperty = config.getIntProperty("limit_product");
		
		given()
		//.pathParam("id", intProperty)
		.queryParam("limit", 4)
		.when()
			.get(Routes.limit_product_ByQuery)
	
		.then().statusCode(200)
		
		.log().body();
		
	}
	
	
	
	
	
	//@Test()
	public void  getProductBySorting() {
		
		
		
		Response response = given()
		.pathParam("order", "desc")
		
		.when()
			.get(Routes.sort_product)
	
		.then()
		.log().body()
		.statusCode(200).extract().response();
		
		List<Integer> productListDesc = response.jsonPath().getList("id",Integer.class);
		
		assertEquals(isSortedDesc(productListDesc), true , "Decending order is sorted ");
		//productListDesc.stream().sorted().forEach(System.out::println);
		
	
		
	}
	
	
	
	
	
	
	//Add new product
	@Test
	public void createProduct() {
		Product getpayload = ProductPayload.getpayload();
	
		
		Response response = given()
		.contentType(ContentType.JSON)
		.body(getpayload)
		.when()
			.post(Routes.postProduct)
	
		.then().statusCode(200)
		
		.log().body()
		.extract().response();
		
		
		int int1 = response.jsonPath().getInt("id");
		
		System.out.println("product id while creting new records "+int1);
		
	}
			
	
	//@Test
	public void updateProduct() {
		Product updatedPayload = ProductPayload.getpayload();
		
		Integer intProperty = config.getIntProperty("product_id");
	
		
	given()
		.contentType(ContentType.JSON)
		.pathParam("id", intProperty)
		.body(updatedPayload)
		.when()
			.put(Routes.update_product)
	
		.then().statusCode(200)
		
		.log().body();
		
		
		
	}
	
	//@Test
	public void deleteProduct() {
		
		
		Integer intProperty = config.getIntProperty("product_id");
	
		
	given()
		.contentType(ContentType.JSON)
		.pathParam("id", intProperty)
		
		.when()
			.delete(Routes.delete_product)
	
		.then().statusCode(200)
		
		.log().body();
		
		
		
	}
	
	

}
