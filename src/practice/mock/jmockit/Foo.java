package practice.mock.jmockit;

public class Foo {
	public String methodString(String value) {
		return "Foo.methodString is called with " + value;
	}
	
	public String methodInteger(Integer value) {
		return "Foo.methodInteger is called with " + value;
	}
}
