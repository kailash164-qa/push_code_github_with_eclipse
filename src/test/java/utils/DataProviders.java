package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataProviders {

	public static Object[][] arr;
	@DataProvider(name="dp1")
	public static Object[][] jsonDataProvider() throws StreamReadException, DatabindException, IOException {

		String filePath = "C:\\Users\\KailashBangad\\eclipse-workspace\\RestAssuredEx1\\src\\test\\resources\\testdata\\product.json";

		// ReadJson File to Map it to a Lists of maps

		ObjectMapper mapper = new ObjectMapper();
		List<Map<String, String>> value = mapper.readValue(new File(filePath),
				new TypeReference<List<Map<String, String>>>() {
				});

		Object[][] arr = new Object[value.size()][];

		for (int i = 0; i < value.size(); i++) {

			arr[i] = new Object[] {

					value.get(i) };

		}
		return arr;

	}
@DataProvider
	public static Object[][] csvDataProvider() {

		String filePath = "";

		try (BufferedReader br = new BufferedReader(new FileReader("/Path/To/file.csv"));) {

			br.readLine();

			String line = "";
			String DELIMITER = ",";
			List<String[]> records = new ArrayList<>();
			while ((line = br.readLine()) != null) {
				String[] values = line.split(DELIMITER);
				records.add(values);
			}

			arr = new Object[records.size()][];

			for (int i = 0; i < records.size(); i++) {

				arr[i] = new Object[] {

						records.get(i) };

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return arr;

	}

}
