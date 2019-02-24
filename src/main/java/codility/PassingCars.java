package main.java.codility;


public class PassingCars {

	public static void main(String[] args) {
		//int[] A = {0,1,0,1,1};
		//int[] A = {0,1};
		int[] A = {1,0};
		System.out.println(new PassingCars().solution(A));
	}
	
	public int solution(int[] A) {
		int count = 0;
		int firstNum = A[0];
		int oppositeNum = Math.abs(firstNum - 1);
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] == firstNum) {
				for (int j = i + 1; j < A.length; j++) {
					if (A[j] == oppositeNum) {
						count++;
						if (count > 1000000000) {
							return -1;
						}
					}
				}
			}
		}
        return count;
    }

}
