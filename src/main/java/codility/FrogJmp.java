package codility;

public class FrogJmp {
	public static void main(String[] args) {
		int X = 10;
		int Y = 41;
		int D = 30;
				
		System.out.println(new FrogJmp().solution(X, Y, D));
	}
	
	public int solution(int X, int Y, int D) {
		if ((Y - X) % D == 0) {
			return (Y - X) / D;
		} else {
			return (Y - X) / D + 1;
		}
    }
}
