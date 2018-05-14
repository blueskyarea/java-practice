package main.java.practice.log4j.src.main.java.com.sample;

import org.apache.log4j.Logger;

public class Job1 {
	private static final Logger logger = Logger.getLogger("job1Logger");
	
	public Job1() {
	}
	
	public void infoLog() {
		logger.info("Job1 info");
	}
	
	public void errorLog() {
		logger.error("Job1 error");
	}
}
