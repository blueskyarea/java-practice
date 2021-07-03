package practice.java8.stream;

import java.util.stream.Stream;

public class LazyStream {
	public static void main(String[] args) {
		// lazy
		System.out.println("<lazy>");
		Stream.iterate(0, i -> i + 1)
				.map(i -> i + 1)
				.peek(i -> System.out.println("Map: " + i))
				.limit(5)
				.forEach(i -> {});
		System.out.println("---");
		Stream.iterate(0, i -> i + 1)
				.limit(5)
				.map(i -> i + 1)
				.peek(i -> System.out.println("Map: " + i))
				.forEach(i -> {});
		
		// not lazy
		System.out.println();
		System.out.println("<not lazy>");
		Stream.iterate(0, i -> i + 1)
				.flatMap(i -> Stream.of(i, i, i, i))
				.map(i -> i + 1)
				.peek(i -> System.out.println("Map: " + i))
				.limit(5)
				.forEach(i -> {});
		System.out.println("---");
		Stream.iterate(0, i -> i + 1)
				.flatMap(i -> Stream.of(i, i, i, i))
				.limit(5)
				.map(i -> i + 1)
				.peek(i -> System.out.println("Map: " + i))
				.forEach(i -> {});
	}
}
