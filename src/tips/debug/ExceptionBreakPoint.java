package tips.debug;

public class ExceptionBreakPoint {

	public static void main(String[] args) {
		try {
			System.out.println("first");
			System.out.println("second");
			oftenTimesNullPointer();
			System.out.println("third");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void oftenTimesNullPointer() {
		if (Math.random() < 0.9) {
			throw new NullPointerException();
		}
	}

}
