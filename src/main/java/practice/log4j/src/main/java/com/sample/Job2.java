package practice.log4j.src.main.java.com.sample;

import org.apache.log4j.Logger;

public class Job2 {
	private static final Logger logger = Logger.getLogger("job2Logger");
	
	public Job2() {
	}
	
	public void infoLog() {
		logger.info("Job2 info");
	}
	
	public void errorLog() {
		logger.error("Job2 error");
	}
}
