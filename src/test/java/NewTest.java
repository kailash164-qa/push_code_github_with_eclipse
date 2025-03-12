import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;

import org.testng.annotations.Test;

import com.gspan.RestAssuredEx1.Datum;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class NewTest {
	@Test(enabled = false)
	public void f() throws IOException {

		Response response = given().baseUri("https://randomuser.me/api/").log().all().when().get().then().extract()
				.response();

		System.out.println("Response:: " + response.asString());

	}
	
	
	@Test(enabled = true)
	public void createUser() {
		
		Datum datum = new Datum(101, "kb@yahoo.com", "kailash", "bangad", "testAvtar");
		datum.setId(102);
		datum.setFirst_name("mukesh");
		datum.setEmail("mukesh@gmail.com");
		datum.setAvatar("test2");
		datum.setLast_name("otwani");

		//String jsonString = "{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}";

		Datum response = given()
		.baseUri("https://reqres.in/")
		.contentType(ContentType.JSON)
		.body(datum)
		.when()
		.post("api/users").then().log().all().assertThat()
		
		.statusCode(201)
		.extract()
		.response()
		.as(Datum.class);

		
	assertEquals(datum.getEmail(), response.getEmail());
	}

}
