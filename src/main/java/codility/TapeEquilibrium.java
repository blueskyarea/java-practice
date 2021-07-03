package codility;


public class TapeEquilibrium {

	public static void main(String[] args) {
		int A[] = {3, 1, 2, 4, 3};
		//int A[] = {1, 2, 3, 4, 100000};
		//int A[] = {};
		//int A[] = {1000, -1000};
		//int A[] = {20};
		System.out.println(new TapeEquilibrium().solution(A));
	}
	
	public int solution(int[] A) {
		if (A.length == 0) {
			return 0;
		}
		if (A.length == 1) {
			return A[0];
		}
		
		int A1 = A[0];
		int A2 = 0;
		for (int i = 1; i < A.length; i++) {
			A2 = A2 + A[i];
		}
		
		int answer = Math.abs(A1 - A2);
		for (int i = 1; i < A.length - 1; i++) {
			A1 = A1 + A[i];
			A2 = A2 - A[i];
			int tmp = Math.abs(A1 - A2);
			if (tmp < answer) {
				answer = tmp;
			}
		}

		/*for (int i = 0; i < A.length - 1; i++) {
			int A1 = 0;
			int A2 = 0;
			for (int j = 0; j <= i; j++) {
				A1 = A1 + A[j];		
			}
			for (int k = i + 1; k < A.length; k++) {
				A2 = A2 + A[k];
			}
			int tmp = Math.abs(A1 - A2);
			if (tmp < answer) {
				answer = tmp;
			}
		}*/
		return answer;
    }

}
