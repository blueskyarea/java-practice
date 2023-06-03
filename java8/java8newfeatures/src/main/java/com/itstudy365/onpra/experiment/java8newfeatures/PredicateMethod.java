package com.itstudy365.onpra.experiment.java8newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * In Java, the Predicate interface is a functional interface introduced in Java
 * 8 as part of the java.util.function package. It represents a predicate, which
 * is a boolean-valued function that takes an input and returns true or false.
 * 
 * The Predicate interface has a single abstract method called test, which
 * accepts an input of a specific type and returns a boolean value. The method
 * signature of test is defined as follows:
 * 
 * boolean test(T t);
 *
 * Here, T represents the type of the input to the predicate. The test method is
 * responsible for evaluating the predicate logic on the given input and
 * returning the result as a boolean.
 *
 * The Predicate interface is commonly used in functional-style programming and
 * provides a way to express conditions or criteria. It can be used in various
 * scenarios, such as filtering collections, validating inputs, or defining
 * complex conditions.
 *
 */
public class PredicateMethod {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Filter even numbers using a Predicate
		Predicate<Integer> evenPredicate = num -> num % 2 == 0;
		List<Integer> evenNumbers = filter(numbers, evenPredicate);

		System.out.println(evenNumbers); // Output: [2, 4, 6, 8, 10]
	}

	public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
		return list.stream().filter(predicate).toList();
	}
}
