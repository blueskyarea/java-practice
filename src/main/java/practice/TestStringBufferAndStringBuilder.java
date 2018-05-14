package main.java.practice;

public class TestStringBufferAndStringBuilder {

	private static final int MAX_THREAD = 100;

	public static void main(String[] args) throws InterruptedException {
		TestStringBufferAndStringBuilder tester = new TestStringBufferAndStringBuilder();
		tester.stringBufferTest();
		tester.stringBuilderTest();
	}

	private void stringBufferTest() throws InterruptedException {
		StringBufferTester bufferTester = new StringBufferTester();
		Thread[] thread = new Thread[MAX_THREAD];

		for (int i = 0; i < MAX_THREAD; i++) {
			thread[i] = new Thread(bufferTester);
			thread[i].start();
		}
		
		for (Thread t : thread) {
			t.join();
		}

		System.out.println("StringBufferResult:" + bufferTester.getLength());
	}

	private void stringBuilderTest() throws InterruptedException {
		StringBuilderTester builderTester = new StringBuilderTester();
		Thread[] thread = new Thread[MAX_THREAD];

		for (int i = 0; i < MAX_THREAD; i++) {
			thread[i] = new Thread(builderTester);
			thread[i].start();
		}
		
		for (Thread t : thread) {
			t.join();
		}
		
		System.out.println("StringBuilderResult:" + builderTester.getLength());
	}

	private class StringBufferTester implements Runnable {
		private StringBuffer sb = new StringBuffer();

		public void run() {
			for (int i = 0; i < 100; i++) {
				sb.append("123");
			}
		}

		public int getLength() {
			return sb.length();
		}
	}

	private class StringBuilderTester implements Runnable {
		private StringBuilder sb = new StringBuilder();

		public void run() {
			for (int i = 0; i < 100; i++) {
				sb.append("123");
			}
		}

		public int getLength() {
			return sb.length();
		}
	}

}
