package main.java.practice.mock.jmockit;

public class Hoge {
	
	//public String name = "name";
	public Foo foo;
	
	public String methodHoge() {
		return "hoge";
	}
	
	public String methodHoge(String value) {
		return foo.methodString(value);
	}
}
