package practice.mock.jmockit;

public class Hoge {
	
	public String name = "name";
	public Foo foo;
	
	public String methodHoge() {
		return "hoge";
	}
	
	public String methodHoge(String value) {
		StringBuilder result = new StringBuilder();
		result.append(foo.methodString(value));
		result.append(",");
		try {
			result.append(foo.methodInteger(Integer.parseInt(value)));
			result.append(",");
		} catch (NumberFormatException e) {};
		return result.toString();
	}
}
