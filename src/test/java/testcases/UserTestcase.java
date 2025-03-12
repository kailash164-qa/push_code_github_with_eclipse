package testcases;

import static io.restassured.RestAssured.given;

import java.util.List;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.gspan.RestAssuredEx1.User2;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import payloads.ProductPayload;
import payloads.UserPayloads;
import pojo.Product;
import routes.Routes;

public class UserTestcase extends BaseClass {

	@Test()
	public void getAllProducts() {

		given().when()
				// .get(Routes.getAllPrducts)
				.get(Routes.getAllUsers)

				.then().statusCode(200)

				.log().body();

	}
	
	
		@Test()
		public void  getSingleProductByID() {
			
			Integer intProperty = config.getIntProperty("user_id");
		
			
			given()
			.pathParam("id", intProperty)
			
			.when()
				.get(Routes.getSingleUser)
				
			
			.then()
			
			.statusCode(200)
			
			.log().body();
			
		}
		
	
	
		@Test()
		public void  getProductByLimit() {
			
			Integer intProperty = config.getIntProperty("limit_user");
			
			given()
			.pathParam("order", intProperty)
			//.queryParam("limit", 4)
			.when()
				.get(Routes.limit_users)
		
			.then().statusCode(200)
			
			.log().body();
			
		}
	
	
		@Test()
		public void  getProductBySorting() {
			
			
			
			Response response = given()
			.pathParam("order", "desc")
			
			.when()
				.get(Routes.sort_users)
		
			.then()
			.log().body()
			.statusCode(200).extract().response();
			
			List<Integer> productListDesc = response.jsonPath().getList("id",Integer.class);
			
			assertEquals(isSortedDesc(productListDesc), true , "Decending order is sorted ");
			//productListDesc.stream().sorted().forEach(System.out::println);
			
		
			
		}
		
		@Test
		public void createProduct() {
			User2 userPayload = UserPayloads.getUserPayload();
			
			System.out.println(userPayload);
		
			
			/* Response response = */ given()
			.contentType(ContentType.JSON)
			.body(userPayload)
			.when()
				.post(Routes.postUser)
		
			.then().statusCode(200)
			
			.log().body();
		
			
			/*
			 * int int1 = response.jsonPath().getInt("id"); System.out.println(int1);
			 */
			
			
		}
	
	
	
	

		@Test
		public void updateProduct() {
			User2 userPayload = UserPayloads.getUserPayload();
			
			Integer intProperty = config.getIntProperty("user_id");
		
			
		given()
			.contentType(ContentType.JSON)
			.pathParam("id", intProperty)
			.body(userPayload)
			.when()
				.put(Routes.update_users)
		
			.then().statusCode(200)
			
			.log().body();
			
			
			
		}
		
		
		
		
		
		@Test
		public void deleteProduct() {
			
			
			Integer intProperty = config.getIntProperty("user_id");
		
			
		given()
			.contentType(ContentType.JSON)
			.pathParam("id", intProperty)
			
			.when()
				.delete(Routes.delete_users)
		
			.then().statusCode(200)
			
			.log().body();
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	

}
