package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	
	Properties prop;

	String path = "C:\\Users\\KailashBangad\\eclipse-workspace\\RestAssuredEx1\\src\\test\\java\\utils";

	File file = new File(path);

	public ConfigReader() {

		try (InputStream input = new FileInputStream(file + "\\config.properties")) {

			prop = new Properties();

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println(prop.getProperty("product_id"));

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	
	
	public String getStringProperty(String key) {
		return prop.getProperty(key);
		
	}
	
	
	public Integer getIntProperty(String key) {
		return Integer.parseInt(prop.getProperty(key));
		
	}


	public static void main(String[] args) {
		new ConfigReader();
	}

}
