package main.java.practice.java8.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaWithStream {

	/**
	 * For using stream,
	 * 1. Convert type to Stream.
	 * 2. Something(filter, map) processing.
	 * 3. Ending processing and get return value.
	 */
	public static void main(String[] args) {
		LambdaWithStream lambda = new LambdaWithStream();
		lambda.sampleForList();
		lambda.sampleForArray();
		lambda.sampleForMap();
		lambda.calculateForList();
		lambda.convertForList();
		lambda.matchForList();
	}

	private void sampleForList() {
		System.out.println("== START ==");
		List<String> sampleList = new ArrayList<>();
		sampleList.add("A");
		sampleList.add("B");
		sampleList.add("C");
		
		Stream<String> stream = sampleList.stream();
		
		List<String> filteredList = stream.filter(word -> word.equals("B") || word.equals("C")).collect(Collectors.toList());
		filteredList.forEach(System.out::println);
		System.out.println("== END ==");
	}
	
	private void sampleForArray() {
		System.out.println("== START ==");
		String[] sampleArray = { "D", "E", "F" };
		Stream<String> stream = Arrays.stream(sampleArray);
		
		Comparator<String> comparator = (p, o) -> o.compareTo(p);
		List<String> sortedList = stream.sorted(comparator).collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		System.out.println("== END ==");
	}
	
	private void sampleForMap() {
		System.out.println("== START ==");
		Map<String, String> sampleMap = new HashMap<>();
		sampleMap.put("G", "valueG");
		sampleMap.put("H", "valueH");
		sampleMap.put("I", "valueI");
		
		Stream<Entry<String, String>> stream = sampleMap.entrySet().stream();
		System.out.println("== END ==");
	}
	
	private void calculateForList() {
		System.out.println("== START ==");
		List<Integer> intList = new ArrayList<>();
		intList = Arrays.asList(1, 2, 3);
		
		Integer count = intList.stream().reduce(0, (base, value) -> base + value);
		System.out.println(count);
		Integer count2 = intList.stream().reduce((base, value) -> base + value).get();
		System.out.println(count2);
		System.out.println("== END ==");
	}
	
	private void convertForList() {
		System.out.println("== START ==");
		List<Integer> intList = new ArrayList<>();
		intList = Arrays.asList(1, 2, 3);
		
		List<Integer> convertedList = intList.stream().map(value -> value + 10).collect(Collectors.toList());
		convertedList.forEach(System.out::println);
		System.out.println("== END ==");
	}
	
	private void matchForList() {
		System.out.println("== START ==");
		List<Integer> intList = new ArrayList<>();
		intList = Arrays.asList(1, 2, 3);
		
		Boolean result = intList.stream().anyMatch(value -> value == 2);
		Boolean result2 = intList.stream().anyMatch(value -> value == 5);
		System.out.println(result);
		System.out.println(result2);
		System.out.println("== END ==");
	}
}
