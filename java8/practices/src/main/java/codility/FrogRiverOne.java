package codility;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

	public static void main(String[] args) {
		int X = 6;
		//int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
		//int[] A = {1};
		//int[] A = {5};
		int[] A = {1, 3, 1, 4, 2, 3, 6, 4, 5};
		System.out.println(new FrogRiverOne().solution(X, A));
	}
	
    public int solution(int X, int[] A) {
    	Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
        	set.add(A[i]);
        	if (set.size() == X) {
        		return i;
        	}
        }
    	return -1;
    }
}
