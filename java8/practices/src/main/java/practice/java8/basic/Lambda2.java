package practice.java8.basic;

public class Lambda2 {
	public static void main(String[] args) {
		// 1. local class
		class Local implements Runnable {
			public void sayYes() {
				System.out.println("yes");
			}

			@Override
			public void run() {
				System.out.println("no");
			}
		}

		Local local = new Local();
		local.sayYes();

		Runnable runner = new Local();
		runner.run();

		// 2. anonymous class
		Runnable runner2 = new Runnable() {
			public void run() {
				System.out.println("Yes? or No?");
			}
		};

		runner2.run();

		// 3. Lambda
		// () is argument for run method.
		// {} is implementation of run method.
		// runner3 has anonymous class instance with implements Runnable.
		// In short, lambda is for creating instance with interface
		// implementation.
		Runnable runner3 = () -> {
			System.out.println("This is Lambda!");
		};
		runner3.run();
	}
}
