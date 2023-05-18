package codility;


public class GenomicRangeQuery {

	public static void main(String[] args) {
		String S = "CAGCCTA";
		int[] P = {2, 5, 0};
		int[] Q = {4, 5, 6};
		int[] answer = new GenomicRangeQuery().solution(S, P, Q);
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

	public int[] solution(String S, int[] P, int[] Q) {
        int[] answer = new int[P.length];    
        for (int i = 0; i < P.length; i++) {
        	String tmp = S.substring(P[i], Q[i] + 1);
        	if (tmp.contains("A")) {
            	answer[i] = 1;
            } else if (tmp.contains("C")) {
            	answer[i] = 2;
            } else if (tmp.contains("G")) {
            	answer[i] = 3;
            } else {
            	answer[i] = 4;
            }
        }
        return answer;
    }
}
