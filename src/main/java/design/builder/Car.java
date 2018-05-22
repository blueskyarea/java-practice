package main.java.design.builder;

// This pattern is from EffectiveJava
public class Car {
	private String name;
	private Integer speed;
	private String color;

	private Car(Builder builder) {
		this.name = builder.name;
		this.speed = builder.speed;
		this.color = builder.color;
	}
	
	public String printInfo() {
		return "This car name is " + name + ". speed is " + speed + ". color is " + color; 
	}

	static class Builder {
		private String name;
		private Integer speed;
		private String color;

		Builder(String name, Integer speed) {
			this.name = name;
			this.speed = speed;
		}

		Builder color(String color) {
			this.color = color;
			return this;
		}

		Car build() {
			if (name == null || speed == null) {
				throw new NullPointerException();
			}
			return new Car(this);
		}
	}
}
