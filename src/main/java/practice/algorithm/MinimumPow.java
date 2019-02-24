package main.java.practice.algorithm;

import java.util.ArrayList;
import java.util.List;

public class MinimumPow {

	public static void main(String[] args) {
		int input = 102002;
		String strInput = String.valueOf(input);
		List<String> ar = new ArrayList<>();
		for (int i = 0; i < strInput.length(); i++) {
			ar.add(String.valueOf(strInput.charAt(i)));
		}
		
		double expect = 0;
		for (String n : ar) {
			expect += Math.pow(2.0, Double.valueOf(n));
		}
		System.out.println(expect);
		System.out.println(calc(expect));
	}
	
	private static String calc(double expect) {
		int i = 0;
		while (true) {
			if (!(Math.pow(2.0, Double.valueOf(i)) > expect)) {
				i++;
			} else {
				i--;
				break;
			}
		}
		if (expect - Math.pow(2.0, Double.valueOf(i)) > 0) {
			return i + calc(expect - Math.pow(2.0, Double.valueOf(i)));
		}
		return String.valueOf(i);
	}

}
