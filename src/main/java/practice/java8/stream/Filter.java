package main.java.practice.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
	public static void main(String[] args) {
		List<String> before = Arrays.asList("a", "b", "c");
		List<String> after = before.stream().filter(e -> e.equals("b")).collect(Collectors.toList());
		after.forEach(System.out::println);
	}
}
