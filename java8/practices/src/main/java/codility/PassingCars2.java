package codility;


public class PassingCars2 {

	public static void main(String[] args) {
		int[] A = {0,1,0,1,1};
		//int[] A = {0,1};
		//int[] A = {1,0};
		System.out.println(new PassingCars2().solution(A));
	}
	
	public int solution(int[] A) {
		int count = 0;
		int countEast = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 1) {
				count = count + countEast;
				if (count > 1000000000) {
					return -1;
				}
			} else {
				countEast++;
			}
		}
        return count;
    }

}
