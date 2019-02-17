package main.java.codility;

import java.util.Arrays;


public class MaxCounters {

	public static void main(String[] args) {
		int N = 5;
		int A[] = {3, 4, 4, 6, 1, 4, 4};
		int result[] = new MaxCounters().solution(N, A);
		for (int r : result) {
			System.out.print(r + ",");
		}
	}

	public int[] solution(int N, int[] A) {
        int counter[] = new int[N];
        int currentMax = 0;
        for (int i = 0; i < A.length; i++) {
        	int target = A[i];
        	if (target > N) {
        		Arrays.fill(counter, currentMax);
        		//for (int j = 0; j < N; j++) {
        		//	counter[j] = currentMax;
        		//}
        	} else {
        		int tmp = ++counter[target - 1];
        		if (tmp > currentMax) {
        			currentMax = tmp;
        		}
        	}
        }
        return counter;
    }
}
