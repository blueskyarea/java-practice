package codility;

import java.util.Arrays;

public class PermCheck {

	public static void main(String[] args) {
		//int[] A = {4, 1, 3, 2};
		//int[] A = {4, 1, 3};
		//int[] A = {};
		//int[] A = {10};
		int[] A = {2, 3, 4};
		System.out.println(new PermCheck().solution(A));
	}
	
    public int solution(int[] A) {
    	if (A.length == 0) {
    		return 0;
    	}
    	if (A.length == 1 && A[0] == 1) {
    		return 1;
    	}
    	
        Arrays.sort(A);
    	if (A[0] != 1) {
    		return 0;
    	}
        for (int i = 1; i < A.length; i++) {
    		if (A[i] == i + 1) {
    		} else {
    			return 0;
    		}
    	}
    	
    	return 1;
    }
}
