package main.java.challenge.lamda;

public class LamdaChallenge {
	public static void main(String[] args) throws InterruptedException {
		Runnable r = () -> {
			for(int i = 0; i <= 10000; i++) {
				System.out.println(i);
			}
			System.out.println("Running!");
		};
		
		Thread thread = new Thread(r);
		thread.start();
		thread.join();
	}
}
