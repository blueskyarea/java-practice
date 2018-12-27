package main.java.practice.java8.date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {
	public static void main(String args[]) {
		DateTimeAPI dta = new DateTimeAPI();
		dta.tryNow();
		System.out.println("------");
		dta.specifyTimeZone();
		System.out.println("------");
		dta.convertTimeZone();
		System.out.println("------");
		dta.convertStringFormat();
	}
	
	private void tryNow() {
		Instant instantNow = Instant.now();
		System.out.println("Instant.now(): " + instantNow);
		
		LocalDateTime ldtNow = LocalDateTime.now();
		System.out.println("LocalDateTime.now(): " + ldtNow);
		
		ZonedDateTime zdtNow = ZonedDateTime.now();
		System.out.println("ZonedDateTime.now(): " + zdtNow);
		
		OffsetDateTime odtNow = OffsetDateTime.now();
		System.out.println("OffsetDateTime.now(): " + odtNow);
	}
	
	private void specifyTimeZone() {
		LocalDateTime ldtjst = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println("LocalDateTime.now(): " + ldtjst);
		
		ZonedDateTime zdtjst = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println("ZonedDateTime.now(): " + zdtjst);
		
		OffsetDateTime odtjst = OffsetDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println("OffsetDateTime.now(): " + odtjst);
	}
	
	private void convertTimeZone() {
		LocalDateTime ldtjst = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
		LocalDateTime ldtutc = LocalDateTime.ofInstant(ldtjst.toInstant(ZoneOffset.UTC), ZoneId.of("UTC"));
		System.out.println("LocalDateTime.now(): " + ldtutc);
		
		ZonedDateTime zdtjst = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		ZonedDateTime zdtutc = ZonedDateTime.ofInstant(zdtjst.toInstant(), ZoneId.of("UTC"));
		System.out.println("ZonedDateTime.now(): " + zdtutc);
		
		OffsetDateTime odtjst = OffsetDateTime.now(ZoneId.of("Asia/Tokyo"));
		OffsetDateTime odtutc = OffsetDateTime.ofInstant(odtjst.toInstant(), ZoneId.of("UTC"));
		System.out.println("OffsetDateTime.now(): " + odtutc);
	}
	
	private void convertStringFormat() {	
		String ORG_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
		String orgDate = "2018-12-26T14:24:01.247Z";
		LocalDateTime ldt = LocalDateTime.parse(orgDate, DateTimeFormatter.ofPattern(ORG_FORMAT));
		
		String NEW_FORMAT = "yyyyMMddHHmm";
		String result = ldt.format(DateTimeFormatter.ofPattern(NEW_FORMAT));
		System.out.println(result);
	}
}
