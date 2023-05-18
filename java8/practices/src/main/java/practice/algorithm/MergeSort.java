package practice.algorithm;

import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(10) + 1;
		}
		
		System.out.println("---Before sort---");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		// Sort
		mergeSort(a, a.length);
		
		System.out.println("---After sort---");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void mergeSort(int a[], int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int left[] = new int[mid];
		int right[] = new int[n - mid];
		
		for (int i = 0; i < mid; i++) {
			left[i] = a[i];
		}
		
		for (int i = mid; i < n; i++) {
			right[i - mid] = a[i];
		}
		mergeSort(left, left.length);
		mergeSort(right, right.length);
		
		merge(a, left, right, left.length, right.length);
	}
	
	public static void merge(int a[], int left[], int right[], int leftLength, int rightLength) {
		int i = 0, j = 0, k = 0;
		while (i < leftLength && j < rightLength) {
			if (left[i] <= right[j]) {
				a[k++] = left[i++];
			} else {
				a[k++] = right[j++];
			}
		}
		while (i < leftLength) {
			a[k++] = left[i++];
		}
		while (j < rightLength) {
			a[k++] = right[j++];
		}
	}
}
