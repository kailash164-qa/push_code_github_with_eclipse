package payloads;

import com.github.javafaker.Faker;
import com.gspan.RestAssuredEx1.Login;

public class LoginPayload  {
	
	public static final Faker faker = new Faker();
	
	

	public static Login getLogin() {

		String username = faker.name().username();
		String password = faker.internet().password();

		Login loginPayload = new Login(username, password);

		return loginPayload;

	}

}
