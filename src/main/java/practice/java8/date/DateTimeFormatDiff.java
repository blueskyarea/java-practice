package main.java.practice.java8.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatDiff {

	public static void main(String[] args) {
		String ORG_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
		String orgDate = "2017-12-31T13:00:01.247Z";
		LocalDateTime ldt = LocalDateTime.parse(orgDate, DateTimeFormatter.ofPattern(ORG_FORMAT));
		
		// yyyyMMddHHmmss
		String NEW_FORMAT = "yyyyMMddHHmmss";
		String result = ldt.format(DateTimeFormatter.ofPattern(NEW_FORMAT));
		System.out.println(result); // 20171231130001

		// YYYYMMddHHmmss
		String NEW_FORMAT2 = "YYYYMMddHHmmss";
		String result2 = ldt.format(DateTimeFormatter.ofPattern(NEW_FORMAT2));
		System.out.println(result2); // 20181231130001
	}

}
