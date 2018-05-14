package main.java.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaitInput {

	public static void main(String[] args) {

		String input = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("EXIT が入力されたら終了します");
		while (true) {
			try {
				input = br.readLine();
			} catch (IOException e) {
				System.out.println("入力エラー：" + e.getMessage());
				break;
			}

			if (input.equals("EXIT")) {
				System.out.println("終了しました");
				break;
			} else if (input.length() == 0) {
				System.out.println("入力がありません");
			} else {
				System.out.println(input);
			}
		}

	}

}
