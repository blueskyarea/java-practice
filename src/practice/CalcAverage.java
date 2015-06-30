package practice;

public class CalcAverage {
	
	private int sum;
	private float average;
	
	CalcAverage() {
	}
	
	private boolean isValidArguments(String[] args) {
		for (String arg : args) {
			try {
				Integer.parseInt(arg);
			} catch (NumberFormatException e) {
				return false;
			}
		}
		return true;
	}
	
	private float calcAverage(String[] args) {
		for (String arg : args) {
			sum = sum + Integer.parseInt(arg);
		}
		return (sum / args.length);
	}

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("引数があたえられていません");
			return;
		}
		
		CalcAverage ca = new CalcAverage();
		if (!ca.isValidArguments(args)) {
			System.out.println("引数の値が不正です");
			return;
		}
		
		System.out.println(ca.calcAverage(args));
	}

}
