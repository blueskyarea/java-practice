package main.java.practice.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SomeList {

	public static void main(String[] args) {
		// Collections.singletonList()
		List<String> list = Collections.singletonList("A");
		//list.add("B");
		
		// Arrays.asList()
		List<String> list2 = Arrays.asList("A", "B", "C");
		//list2.add("D");
		
		// com.google.common.collect.Lists.newArrayList
		List<String> list3 = com.google.common.collect.Lists.newArrayList("A", "B", "C");
		list3.add("D");
		System.out.println(list3.size());
	}

}
