package main.java.codility;

public class BinaryGap {

	public static void main(String[] args) {
		int N = 2147483647;
	}
	
	public int solution(int N) {
		String bin = Integer.toBinaryString(N);
		int result = 0;
		int counter = 0;
		for (int i = 0; i < bin.length(); i++) {
			if (String.valueOf(bin.charAt(i)).equals("1")) {
				if (result < counter) {
					result = counter;
				}
				counter = 0;
			} else {
				counter++;
			}
		}
		
        return result;
    }
}
