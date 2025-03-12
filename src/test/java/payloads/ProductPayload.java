package payloads;

import java.util.Random;

import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;
import com.gspan.RestAssuredEx1.Address2;
import com.gspan.RestAssuredEx1.Location;
import com.gspan.RestAssuredEx1.Login;
import com.gspan.RestAssuredEx1.Name;
import com.gspan.RestAssuredEx1.User2;

import pojo.Product;

public class ProductPayload {

	public static final Faker faker = new Faker();

	public static final String[] cate = { "Electronics", "cloths", "glocery" };

	static Random r = new Random();

	public static Product getpayload() {

		String productName = faker.commerce().productName();
		Double price = Double.parseDouble(faker.commerce().price(3, 2));
		String sentence = faker.lorem().sentence();

		String string = cate[r.nextInt(cate.length)];
		String imageUrl = "https://avatars.githubusercontent.com/u/97165289";

		return new Product(productName, price, sentence, string, imageUrl);

	}

	

}
