package com.github.ignacy123.algorithms;

import java.util.Arrays;

/**
 * Created by ignacy on 18.10.16.
 */
public class SelectionSort {
	public void selectionSort(int[] arr) {
		int minIndex;
		int tmp;
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[minIndex])
					minIndex = j;
			if (minIndex != i) {
				ArrayUtils.swap(arr, i, minIndex);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 4;
		arr[1] = 6;
		arr[2] = 1;
		arr[3] = 8;
		arr[4] = 0;
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.selectionSort(arr);
		System.out.println(Arrays.toString(arr));


	}

}
