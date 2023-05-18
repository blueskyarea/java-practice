package practice;

public class MultiplicationTable2 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= 9; j++) {
				int answer = i * j;
				System.out.print(String.format("%2d", answer) + "|");
			}
			System.out.println();
		}
	}
}
