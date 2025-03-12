package payloads;

import java.util.Random;

import com.github.javafaker.Faker;
import com.gspan.RestAssuredEx1.Address2;
import com.gspan.RestAssuredEx1.Location;
import com.gspan.RestAssuredEx1.Name;
import com.gspan.RestAssuredEx1.User2;

public class UserPayloads {

	public static final Faker faker = new Faker();
	static Random r = new Random();

	public static User2 getUserPayload() {

		String firstName = faker.name().firstName();

		String lastName = faker.name().lastName();

		Name name = new Name(firstName, lastName);

		String city = faker.address().city();
		String streetAddress = faker.address().streetAddress();
		String zipCode = faker.address().zipCode();
		Integer buildingNumber = r.nextInt(100);

		String latitude = faker.address().latitude();

		String longitude = faker.address().longitude();

		Location location = new Location(latitude, longitude);

		Address2 address2 = new Address2(city, streetAddress, zipCode, buildingNumber, location);

		String emailAddress = faker.internet().emailAddress();

		String username = faker.name().username();

		String password = faker.internet().password();

		String cellPhone = faker.phoneNumber().cellPhone();

		return new User2(emailAddress, username, password, cellPhone, name, address2);

	}

}
