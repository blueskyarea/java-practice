package practice.java8.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda3 {

	public static void main(String[] args) {
		Lambda3 sample = new Lambda3();
		sample.sampleSort();
		sample.sampleStreamForEach();
		sample.sampleFilter();
		sample.sampleMap();
		sample.sampleSort2();
	}
	
	// specify instance with compare(s1, s2) implementation from Comparator interface.
	private void sampleSort() {
		List<Integer> numbersList = Arrays.asList(3, 1, -9, 7, 5);
		
		System.out.println("== START ==");
		Collections.sort(numbersList, (x, y) -> { return x - y; });
		numbersList.forEach(System.out::println);
		System.out.println("== END ==");
		
		System.out.println("== START ==");
		Collections.sort(numbersList, (x, y) -> { return y - x; });
		numbersList.forEach(System.out::println);
		System.out.println("== END ==");
		
		System.out.println("== START ==");
		Collections.sort(numbersList, (x, y) -> { return x*x - y*y; });
		numbersList.forEach(System.out::println);
		System.out.println("== END ==");
	}
	
	// stream method returns Stream instance of myself
	
	// void forEach(Consumer<T>)
	private void sampleStreamForEach() {
		List<Integer> numbersList = Arrays.asList(3, 1, -9, 7, 5);
		
		System.out.println("== START ==");
		numbersList.stream().forEach(i -> {System.out.println(i);});
		System.out.println("== END ==");
	}

	// Stream filter(Predicate<T>)
	private void sampleFilter() {
		List<Integer> numbersList = Arrays.asList(3, 1, -9, 7, 5);
		
		System.out.println("== START ==");
		numbersList.stream().filter(i -> {return i > 0;}).forEach(System.out::println);
		System.out.println("== END ==");
	}
	
	// Stream map(Function<T, R>)
	private void sampleMap() {
		List<Integer> numbersList = Arrays.asList(3, 1, -9, 7, 5);
		
		System.out.println("== START ==");
		numbersList.stream().map(i -> {return i * i;}).forEach(System.out::println);
		System.out.println("== END ==");
	}
	
	// Stream sort(Comparator<T>)
	private void sampleSort2() {
		List<Integer> numbersList = Arrays.asList(3, 1, -9, 7, 5);
		
		System.out.println("== START ==");
		numbersList.stream().sorted((x, y) -> {return x - y;}).forEach(System.out::println);
		System.out.println("== END ==");
	}
}
