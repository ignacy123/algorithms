package com.github.ignacy123.algorithms;

/**
 * Created by ignacy on 11.10.16.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] testArray = new int[100];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i;
        }
        System.out.println(binarySearch(testArray, 57));
    }


    public static int binarySearch(int[] array, int element) {
        int left = 0;
        int right = array.length;
        while (right > left) {
            int middle = (left + right) / 2;
            if (array[middle] == element) {
                return middle;
            }
            if (array[middle] > element) {
                right = middle - 1;
            }
            if (array[middle] < element) {
                left = middle + 1;
            }
        }
        return -1;
    }
}
