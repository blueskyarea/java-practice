package main.java.practice.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	private static List<String> result = new ArrayList<>();

	public static void main(String[] args) {
		check("123", "");
		result.forEach(System.out::println);
	}
	
	public static void check(String target, String ans) {
		if (target.length() <= 1) {
			if (!result.contains(ans + target)) {
				result.add(ans + target);
			}
		} else {
			for (int i = 0; i < target.length(); i++) {
				check(target.substring(0, i) + target.substring(i + 1), ans + target.charAt(i));
			}
		}
	}

}
