package testcases;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.gspan.RestAssuredEx1.Login;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import payloads.LoginPayload;
import payloads.ProductPayload;
import pojo.Product;
import routes.Routes;

public class LoginTest extends BaseClass{
	
	
	
	
	
	@Test
	public void InValidCredential() {
			Login login = LoginPayload.getLogin();
	
		
	 given()
		.contentType(ContentType.JSON)
		.body(login)
		.when()
			.post(Routes.login)
	
		.then()
		.assertThat()
		.statusCode(401)
		
		.log().body();
		
		
		
		
	}
	
	
	@Test
	public void validCredential() {
		
		
		String userName = config.getStringProperty("username");
		String passWord = config.getStringProperty("password");
		
		Login login = new Login(userName, passWord);
		//	Login login = LoginPayload.getLogin();
	
		
	 given()
		.contentType(ContentType.JSON)
		.body(login)
		.when()
			.post(Routes.login)
	
		.then()
		.assertThat()
		.statusCode(401)
		
		.log().body();
		
		
		
		
	}
	
	
	
	
	
	

}
