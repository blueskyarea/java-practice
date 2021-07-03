package codility;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		int[] A = {9, 3, 9, 3, 9, 7, 9, 7, 522};
		System.out.println(new OddOccurrencesInArray().solution(A));
	}

	public int solution(int[] A) {
		Map<Integer, Integer> map = new HashMap();
		for (int i = 0; i < A.length; i++) {
			if (map.containsKey(A[i])) {
				map.remove(A[i]);
			} else {
				map.put(A[i], A[i]);
			}
		}
		
		int result = 0;
		for (int key : map.keySet()) {
			return key;
		}
		return result;
	}
}
