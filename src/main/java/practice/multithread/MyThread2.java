package main.java.practice.multithread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread2 implements Runnable {
	private long intervalMs;
	private SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	public MyThread2(long intervalMs) {
		this.intervalMs = intervalMs;
	}
	
	@Override
	public void run() {
		System.out.printf(dateFormat.format(new Date()) + " [%s] my-thread startging.\n", Thread.currentThread().toString());
		try {
			Thread.sleep(intervalMs);
		} catch (InterruptedException ie) {
			// nothing to do
		}
		System.out.printf(dateFormat.format(new Date()) + " [%s] my-thread ending.\n", Thread.currentThread().toString());
	}
}
