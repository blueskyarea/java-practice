package codility;

import java.util.ArrayDeque;
import java.util.Queue;

public class CyclicRotation {

	public static void main(String[] args) {
		//int[] A = {3, 8, 9, 7, 6};
		int[] A = {1, 2, 3, 4};
		int K = 4;
		int[] result = new CyclicRotation().solution(A, K);
		for (int r : result) {
			System.out.print(r);
		}
	}

	public int[] solution(int[] A, int K) {
		if (A.length == 0) {
			return A;
		}
		
		Queue<Integer> queue = new ArrayDeque<>();
		for (int i = A.length - 1; -1 < i; i--) {
			queue.add(A[i]);
		}
		
		for (int j = 0; j < K; j++) {
			int tmp = queue.poll();
			queue.add(tmp);
		}
		
		int[] result = A;
		for (int k = queue.size() -1 ; -1 < k; k--) {
			result[k] = queue.poll();
			queue.add(result[k]);
		}
		
		return result;
	}
}
