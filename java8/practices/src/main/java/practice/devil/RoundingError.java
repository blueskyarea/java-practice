package practice.devil;

public class RoundingError {

	public static void main(String[] args) {
		double x = 4.0 - 3.10;
		System.out.println(x);	// 0.8999999999999999
		
		double y = 0.50 - 0.25;
		System.out.println(y);	// 0.25
		
		double z = 0.30 - 0.20;
		System.out.println(z);	// 0.09999999999999998
		
		double p = 0.20 - 0.10;
		System.out.println(p);	// 0.1
	}

}