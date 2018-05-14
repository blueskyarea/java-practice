package main.java.practice.algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JunctionPractice {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] param = input.split(" ");
		
		Integer num1 = Integer.valueOf(param[0]);
		String operate = param[1];
		Integer num2 = Integer.valueOf(param[2]);
		if (operate.equals("+")) {
			Integer answer = num1 + num2;
			System.out.println(answer);
		} else if (operate.equals("-")) {
			Integer answer = num1 - num2;
			System.out.println(answer);
		} else if (operate.equals("*")) {
			Integer answer = num1 * num2;
			System.out.println(answer);
		} else if (operate.equals("/")) {
			Integer answer = num1 / num2;
			Integer rest = num1 % num2;
			System.out.println(answer + " ... " + rest);
		}
	}
}
