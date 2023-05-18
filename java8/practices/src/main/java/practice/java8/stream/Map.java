package practice.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {
		List<String> before = Arrays.asList("1", "2", "3");
		List<Integer> after = before.stream().map(x -> Integer.valueOf(x) * 10).collect(Collectors.toList());
		after.forEach(System.out::println);
	}

}
