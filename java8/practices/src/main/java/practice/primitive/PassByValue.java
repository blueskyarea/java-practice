package practice.primitive;

public class PassByValue {
	
	public static int c = 10;
	public static Integer d = 10;

	public static void main(String[] args) {
		int a = 10;
		System.out.println("before: a = " + a);
		calc(a);
		System.out.println("after: a = " + a);
		
		Integer b = new Integer(10);
		System.out.println("before: b = " + b);
		calc2(b);
		System.out.println("after: b = " + b);
		
		calc3(c);
		System.out.println("7: c = " + c);
		
		calc4(d);
		System.out.println("9: d = " + d);
		
		for (int i=0; i<10; i++) {
			System.out.println("test");
		}
		
		for (int i=0; i<10; i++) {
			System.out.println("test");
		}
	}
	
	private static void calc(int a){
		a = a * 2;
		System.out.println("in method: a = " + a);
	}
	
	private static void calc2(Integer b){
		b = b * 2;
		System.out.println("in method: b = " + b);
	}
	
	private static void calc3(int c){
		c = c * 2;
		System.out.println("6: c = " + c);
	}

	private static void calc4(Integer d){
		d = d * 2;
		System.out.println("8: d = " + d);
	}
}
