package practice.configuration.properties;

import org.apache.commons.configuration2.Configuration;

public class PropertiesConfigMain {

	public static void main(String[] args) {
		PropertiesConfig config = new PropertiesConfig("main.properties");
		Configuration configInstance = config.getInstance();
		System.out.println(configInstance.getString("api.url"));
		System.out.println(configInstance.getInt("api.retry"));
	}
}
