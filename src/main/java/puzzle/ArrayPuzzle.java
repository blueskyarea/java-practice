package main.java.puzzle;

public class ArrayPuzzle {

	public static void main(String[] args) {
		int[] array[][] = {
			null,
			{{1, 2, 3, 4, 5}},
			new int[1][1],
			new int[1][1],
			new int[1][],
			{{6, 7, 8, 9, 10, 11}, {12, 13, 14, 15}, {16, 17, 18, 19}}
		};
		//System.out.println(array[0][0][0]);	// NullPointerException
		System.out.println(array[1][0][2]);		// 3
		System.out.println(array[2][0][0]);		// 0
		//System.out.println(array[3][0][1]);	// ArrayIndexOutOfBoundsException
		//System.out.println(array[4][0][0]);	// NullPointerException
		System.out.println(array[5][2][2]);		// 18
	}

}
