package practice.gc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import org.apache.commons.lang3.time.StopWatch;

public class GcTest {

	private static int numberOfData = 10000000;
	private static StopWatch stopWatch = new StopWatch();
	private static Integer counter = 1;

	public static void main(String[] args) {
		while (true) {
			System.out.println("----- attempt:" + counter + " -----");
			GcTest.createBigList();
			GcTest.createBigMap();
			counter++;
		}
	}

	private static void createBigList() {
		System.out.println("BigList");
		stopWatch.start();
		List<Integer> bigList = new ArrayList<>();
		
		// save
		IntStream.rangeClosed(0, numberOfData).forEach(i -> bigList.add(i));
		
		// load
		IntStream.rangeClosed(0, numberOfData).forEach(i -> bigList.get(i));
		
		System.out.println(stopWatch.getTime());
		stopWatch.reset();
	}
	
	private static void createBigMap() {
		System.out.println("BigMap");
		stopWatch.start();
		
		Map<Integer, Integer> bigMap = new HashMap<>();
		// save
		IntStream.rangeClosed(0, numberOfData).forEach(i -> bigMap.put(i, i));
		
		// load
		IntStream.rangeClosed(0, numberOfData).forEach(i -> bigMap.get(i));
		
		System.out.println(stopWatch.getTime());
		stopWatch.reset();
	}
}
