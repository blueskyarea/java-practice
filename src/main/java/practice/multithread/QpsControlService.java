package main.java.practice.multithread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class QpsControlService {
	// low NUM_THEAD and slow response will make unstable QPS.
	private static final int NUM_THREAD = 4;
	private static final int NUM_LOOP = 100;
	private static final long SLEEP_MILSEC = 1000L;
	private static final long FIXED_RES_MILSEC = 5000L;

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		new QpsControlService().start();
	}

	protected void start() throws InterruptedException, ExecutionException {
		ExecutorService exec = Executors.newFixedThreadPool(NUM_THREAD);
		List<Future<?>> list = new ArrayList<Future<?>>();
		for (int i = 0; i < NUM_LOOP; i++) {
			Future<?> future = exec.submit(new TestRunnable());
			list.add(future);
			Thread.sleep(SLEEP_MILSEC);
		}
		exec.shutdown();
		for (Future<?> future : list) {
			future.get();
		}
	}

	public class TestRunnable implements Runnable {
		public void run() {
			System.out.println("ThreadId : " + Thread.currentThread().getId());
			System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
			try {
				long responseTime = (long)(Math.random() * 10000);
				System.out.println(responseTime);
				Thread.sleep(responseTime);
				//Thread.sleep(FIXED_RES_MILSEC);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}