package testcases;

import static io.restassured.RestAssured.given;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.Product;
import routes.Routes;

public class ProductDataDrivenTest extends BaseClass {


	@Test(dataProvider = "dp1", dataProviderClass = utils.DataProviders.class)
	void testAddNewProduct(Map<String, String> data) {

		String stringTitle = data.get("title");
		double doublePrice = Double.parseDouble(data.get("price"));
		String stringDescription = data.get("description");
		String stringCategory = data.get("category");
		String stringImage = data.get("image");

		Product product = new Product(stringTitle,  doublePrice,
		 stringDescription,stringCategory, stringImage);

		//Product product = new Product("A", "B", 121.33, "C", "D");

	

		Response response = given()

				.body(product).contentType(ContentType.JSON).when().post(Routes.postProduct)

				.then()

				.log().body().extract().response();

		int int1 = response.jsonPath().getInt("id");

		System.out.println(int1);

		
		  given().pathParam("id",
		  int1).when().delete(Routes.delete_product).then().statusCode(200);
		  
		  System.out.println("product id while deleting new records " + int1);
		 

	}

}
