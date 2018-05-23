package main.java.performance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.time.StopWatch;

public class ListAndMap {

	private static int NUM_DATA = 10000000;
	private StopWatch stopWatch = new StopWatch();
	
	public static void main(String[] args) {
		System.out.println("Target # of data is " + NUM_DATA);
		ListAndMap listAndMap = new ListAndMap();
		listAndMap.testForList();
		listAndMap.testForMap();
	}

	private void testForList() {
		List<Integer> list = new ArrayList<>();
		System.out.println("start list add.");
		stopWatch.start();
		for (int i = 1; i <= NUM_DATA; i++) {
			list.add(i);
		}
		stopWatch.stop();
		System.out.println(stopWatch);
		stopWatch.reset();
		
		System.out.println("start list get.");
		stopWatch.start();
		for (int i = 0; i < NUM_DATA; i++) {
			list.get(i);
		}
		stopWatch.stop();
		System.out.println(stopWatch);
		stopWatch.reset();
	}
	
	private void testForMap() {
		Map<Integer, Integer> map = new HashMap<>();
		System.out.println("start map put.");
		stopWatch.start();
		for (int i = 1; i <= NUM_DATA; i++) {
			map.put(i, i);
		}
		stopWatch.stop();
		System.out.println(stopWatch);
		stopWatch.reset();
		
		System.out.println("start map get.");
		stopWatch.start();
		for (int i = 1; i <= NUM_DATA; i++) {
			map.get(i);
		}
		stopWatch.stop();
		System.out.println(stopWatch);
		stopWatch.reset();
	}
}
