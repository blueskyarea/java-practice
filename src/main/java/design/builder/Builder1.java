package main.java.design.builder;

public class Builder1 {
	public static void main(String[] args) {
		String info1 = new Car.Builder("Mac", 330).build().printInfo();
		String info2 = new Car.Builder("Toro", 350).color("blue").build().printInfo();
		System.out.println(info1);
		System.out.println(info2);
	}
}
