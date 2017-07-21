package practice.log4j.src.main.java.com.sample;

public class Log4jPractice {
	public static void main(String[] args) {
		Job1 job1 = new Job1();
		Job2 job2 = new Job2();
		job1.infoLog();
		job1.errorLog();
		job2.infoLog();
		job2.errorLog();
	}
}
