package main.java.practice.java8.functionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Function<T, R>
 * T is data type of method argument.
 * R is data type of return value.
 * Method is R apply(T)
 *
 */
public class FunctionSample {

	public static void main(String[] args) {
		FunctionSample sample = new FunctionSample();
		sample.sample1();
		sample.sample2();
	}
	
	private void sample1() {
		Function<Integer, String> counter = (i) -> { return "count is "+ i; };
		String response = counter.apply(10);
		System.out.println(response);
	}
	
	private void sample2() {
		BiFunction<Integer, Integer, Integer> calculator = (x, y) -> { return x + y; };
		Integer response = calculator.apply(10, 20);
		System.out.println("result is " + response);
	}
 
}
