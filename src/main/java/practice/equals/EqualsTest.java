package main.java.practice.equals;

public class EqualsTest {

	public static void main(String[] args) {
		NotOverrideEquals instanceA = new NotOverrideEquals(1, "eclipse");
		NotOverrideEquals instanceB = new NotOverrideEquals(1, "eclipse");
		
		System.out.println(instanceA.equals(instanceB));
		// -> false
		
		OverrideEquals instanceC = new OverrideEquals(1, "eclipse");
		OverrideEquals instanceD = new OverrideEquals(1, "eclipse");
		
		System.out.println(instanceC.equals(instanceD));
		// -> true
	}

}
