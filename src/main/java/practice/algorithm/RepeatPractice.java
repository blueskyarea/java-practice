package practice.algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RepeatPractice {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] param = input.split(" ");
		
		Integer answer = Integer.valueOf(param[0]);
		for (int i = 1; i < param.length; ) {
			if (param[i].equals("+")) {
				answer = answer + Integer.valueOf(param[i + 1]);
			} else if (param[i].equals("-")) {
				answer = answer - Integer.valueOf(param[i + 1]);
			}
			i = i + 2;
		}
		System.out.println(answer);
	}
}
