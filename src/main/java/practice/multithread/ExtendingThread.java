package main.java.practice.multithread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtendingThread {

	public static void main(String args[]) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		System.out.printf(dateFormat.format(new Date()) + " main thread at startging.\n", Thread.currentThread().toString());
		MyThread myThread1 = new MyThread(5000);
		myThread1.start();
		MyThread myThread2 = new MyThread(10000);
		myThread2.start();
		System.out.printf(dateFormat.format(new Date()) + " main thread at ending, actually waiting my-thread ending.\n", Thread.currentThread().toString());
	}
}
