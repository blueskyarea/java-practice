package main.java.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class JudgeInputDate {

	private String inputLine;
	private String inputMonth;
	private String inputDate;
	private String inputDay;
	private String today;

	JudgeInputDate() {

		System.out.println("今日は何月ですか？");
		inputMonth = readInputLine();

		System.out.println("今日は何日ですか？");
		inputDate = readInputLine();

		inputDay = inputMonth + "月" + inputDate + "日";
		System.out.println("入力したのは、" + inputDay);

		Calendar calendar = Calendar.getInstance();
		today = (calendar.get(Calendar.MONTH) + 1) + "月"
				+ calendar.get(Calendar.DATE) + "日";

		if (inputDay.equals(today)) {
			System.out.println("入力したのは今日の日付です");
		} else {
			System.out.println("入力したのは今日の日付ではありません");
		}

	}

	private String readInputLine() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			inputLine = br.readLine();
		} catch (IOException e) {
			System.out.println("入力エラー：" + e.getMessage());
		}

		return inputLine;
	}

	public static void main(String[] args) {
		new JudgeInputDate();
	}

}
