package main.java.codility;

import java.util.Arrays;

public class MissingInteger {

	public static void main(String[] args) {
		int[] A = {1, 3, 6, 4, 1, 2};
		//int[] A = {1, 2, 3};
		//int[] A = {-1, -3};
		System.out.println(new MissingInteger().solution(A));
	}
	
	public int solution(int[] A) {
        int answer = 0;
		Arrays.sort(A);
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				if (A[i] == answer + 1) {
					answer++;
				} else if (A[i] == answer){
				} else {
					return answer + 1;
				}
			}
		}
		return answer + 1;
    }
}
