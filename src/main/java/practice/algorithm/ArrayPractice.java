package practice.algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayPractice {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] param = input.split(" ");
		System.out.println(Integer.valueOf(param[0]) + Integer.valueOf(param[1]));
	}
}
