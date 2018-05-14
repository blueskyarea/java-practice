package main.java.practice.java8.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Basic rule for Lambda
 * 1. OK to omit return if void.
 * 2. Unnecessary to surround with {}.
 * 3. If only 1 argument, can omit ().
 * 4. Can omit argument type.
 * -------------------------
 * Lambda basic specification
 * 1. variable name should be unique.
 * 2. impossible to modify outside local variable.
 * 3. possible to add for List, put for Map.
 * 4. can not throw exception, should control try-catch.
 */
public class Lambda {

	public static void main(String[] args) {
		Lambda lambda = new Lambda();
		lambda.sampleForList();
		lambda.sampleForArray();
		lambda.sampleForMap();
	}

	private void sampleForList() {
		System.out.println("== START ==");
		List<String> sampleList = new ArrayList<>();
		sampleList.add("A");
		sampleList.add("B");
		sampleList.add("C");
		
		sampleList.forEach(word -> System.out.println(word));
		sampleList.forEach(System.out::println);
		System.out.println("== END ==");
	}
	
	private void sampleForArray() {
		System.out.println("== START ==");
		String[] sampleArray = { "D", "E", "F" };
		Arrays.stream(sampleArray).forEach(System.out::println);
		System.out.println("== END ==");
	}
	
	private void sampleForMap() {
		System.out.println("== START ==");
		Map<String, String> sampleMap = new HashMap<>();
		sampleMap.put("G", "valueG");
		sampleMap.put("H", "valueH");
		sampleMap.put("I", "valueI");
		
		sampleMap.forEach((key, value) -> {
			System.out.println(key);
		    System.out.println(value);
		});
		System.out.println("== END ==");
	}
 }
