package practice;

import org.apache.commons.lang3.time.StopWatch;

public class TryStopWatch {

	public static void main(String[] args) throws InterruptedException {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		Thread.sleep(5000);
		stopWatch.stop();
		
		System.out.println(stopWatch.getTime());
	}

}
