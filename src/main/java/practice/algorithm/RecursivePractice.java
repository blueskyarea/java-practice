package main.java.practice.algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RecursivePractice {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] param = input.split(" ");
		Integer answer = calculation(param, 0, param.length);
		System.out.println(answer);
	}

	private static Integer calculation(String[] param, Integer start,
			Integer end) {
		Integer answer = 0;
		String operator = null;
		for (int i = start; i < end; i++) {
			if (param[i].equals("+")) {
				operator = "+";
			} else if (param[i].equals("-")) {
				operator = "-";
			} else if (param[i].equals("(")) {
				int endBracket = getEnd(param, i);
				if (operator == null) {
					answer = calculation(param, i + 1, endBracket);
				} else if (operator.equals("+")) {
					answer = answer + calculation(param, i + 1, endBracket);
				} else if (operator.equals("-")) {
					answer = answer - calculation(param, i + 1, endBracket);
				}
				i = endBracket;
			} else {
				int num = Integer.valueOf(param[i]);
				if (operator == null) {
					answer = num;
				} else if (operator.equals("+")) {
					answer = answer + num;
				} else if (operator.equals("-")) {
					answer = answer - num;
				}
			}
		}
		return answer;
	}

	private static Integer getEnd(String param[], Integer start) {
		Integer numberOfStartBracket = 0;
		Integer end = start + 1;
		for (int i = start + 1; i < param.length; i++) {
			end = i;
			if (param[i].equals("(")) {
				numberOfStartBracket++;
			} else if (param[i].equals(")")) {
				if (numberOfStartBracket == 0) {
					break;
				} else {
					numberOfStartBracket--;
				}
			}
		}
		return end;
	}
}
