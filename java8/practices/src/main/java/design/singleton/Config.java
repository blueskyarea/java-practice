package design.singleton;

public class Config {
	
	private static Config config;
	private String pamameter;
	
	private Config(String parameter){
		this.pamameter = parameter;
	}
	
	public synchronized static Config getInstance(String parameter) {
		if (config == null) {
			config = new Config(parameter);
		}
		return config;
	}
	
	public String getString(String key) {
		return "example" + pamameter;
	}
}
