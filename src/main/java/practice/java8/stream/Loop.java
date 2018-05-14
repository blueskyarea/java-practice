package main.java.practice.java8.stream;

import java.util.stream.IntStream;

public class Loop {
	public static void main(String[] args) {
		new Loop().start();
	}

	public void start() {
		for (int i = 0; i <= 20; i++) {
			System.out.println(String.format("%02d", i));
		}

		IntStream.range(1, 10).boxed().parallel().map(x -> x)
				.forEach(out -> System.out.println(String.format("%02d", out)));
	}
}
