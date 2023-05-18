package practice.java8.functionalInterfaces;

import java.util.function.Predicate;

/**
 * Predicate<T>
 * T is data type of method argument.
 * Method is boolean test(T)
 *
 */
public class PredicateSample {

	public static void main(String[] args) {
		PredicateSample sample = new PredicateSample();
		sample.sample1();
	}

	private void sample1() {
		Predicate<String> checker = (string) -> { return string.equals("Predicate"); };
		System.out.println(checker.test("Predicate"));
		System.out.println(checker.test("Not Predicate"));
	}
}
