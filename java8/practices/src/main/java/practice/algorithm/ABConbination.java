package practice.algorithm;

import java.util.ArrayList;
import java.util.List;

public class ABConbination {
	private static List<String> finalResult = new ArrayList<>();

	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		int c = 1;

		String input = "";

		for (int i = 0; i < a; i++) {
			input = input.concat("a");
		}
		for (int i = 0; i < b; i++) {
			input = input.concat("b");
		}
		for (int i = 0; i < c; i++) {
			input = input.concat("c");
		}

		System.out.println("input : " + input);
		check(input, "");
		finalResult.forEach(System.out::println);
	}

	public static void check(String input, String output) {
		if (input.length() <= 1) {
			String result = output + input;
			String tmpChar = "";
			int count = 1;
			boolean okFlg = true;
			for (int i = 0; i < result.length(); i++) {
				if (tmpChar.equals(String.valueOf(result.charAt(i)))) {
					count++;
				} else {
					count = 1;
				}
				tmpChar = String.valueOf(result.charAt(i));
				if (count >= 3) {
					okFlg = false;
					break;
				}
			}
			if (okFlg && !finalResult.contains(result)) {
				finalResult.add(result);
			}
		} else {
			for (int i = 0; i < input.length(); i++) {
				check(input.substring(0, i) + input.substring(i + 1), output + input.charAt(i));
			}
		}
	}

}
