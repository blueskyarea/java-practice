package challenge.integer;

public class IntegerChallenge {
	public static void main(String[] args) {
		Integer number1 = 5;
		Integer number2 = 5;
		
		Integer number3 = 128;
		Integer number4 = 128;
		
		// True or False ?
		System.out.println(number1 == number2);
		System.out.println(number3 == number4);
		System.out.println(new Integer(1) == new Integer(1));
	}
}
