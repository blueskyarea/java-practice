package main.java.practice.multithread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImplementingThread {

	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		System.out.printf(dateFormat.format(new Date()) + " main thread at startging.\n", Thread.currentThread().toString());
		MyThread2 myThread2 = new MyThread2(5000);
		Thread thread1 = new Thread(myThread2);
		thread1.start();
		System.out.printf(dateFormat.format(new Date()) + " main thread at ending, actually waiting my-thread ending.\n", Thread.currentThread().toString());
	}
}
