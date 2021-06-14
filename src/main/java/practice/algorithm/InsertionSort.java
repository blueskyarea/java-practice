package main.java.practice.algorithm;

import java.util.Random;

public class InsertionSort {
	public static void main(String args[]) {
		//int[] a = {3,2,1};
		Random rand = new Random();
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(10) + 1;
		}
		
		System.out.println("---Before sort---");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		int left = 0;
		int right = a.length - 1;
		insertionSort(a, left, right);
		
		System.out.println("---After sort---");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

    /**
     * Sorts the specified range of the array using insertion sort.
     *
     * @param a the array to be sorted
     * @param left the index of the first element, inclusive, to be sorted
     * @param right the index of the last element, inclusive, to be sorted
     */
    private static void insertionSort(int[] a, int left, int right) {
    	for (int i = left, j = i; i < right; j = ++i) {
            int ai = a[i + 1];
            while (ai < a[j]) {
                a[j + 1] = a[j];
                if (j-- == left) {
                    break;
                }
            }
            a[j + 1] = ai;
        }
    }
}
