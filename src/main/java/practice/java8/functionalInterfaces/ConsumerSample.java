package main.java.practice.java8.functionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Consumer<T>
 * T is data type of method argument.
 * Method is void accept(T)
 */
public class ConsumerSample {

	public static void main(String[] args) {
		ConsumerSample sample = new ConsumerSample();
		sample.sample1();
		sample.sample2();
	}
	
	private void sample1() {
		Consumer<String> nameCaller = (name) -> {System.out.println("Good morning " + name);};
		nameCaller.accept("Comsumer");
	}

	private void sample2() {
		BiConsumer<Integer, Integer> calculator = (x, y) -> {System.out.println("x + y = " + (x + y));};
		calculator.accept(50, 150);
	}
}
