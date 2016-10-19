package com.github.ignacy123.algorithms;

/**
 * Created by ignacy on 11.10.16.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] testArray = new int[6];
        testArray[0] = 9;
        testArray[1] = 2;
        testArray[2] = 4;
        testArray[3] = 1;
        testArray[4] = 7;
        testArray[5] = 6;
        System.out.println(bubbleSort(testArray));
    }

    public static int[] bubbleSort(int[] array){
        for(int j = 0; j< array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
        return array;
    }

    public static int[] swap (int[] array, int indexOne, int indexTwo){
        int a = array[indexOne];
        int b = array[indexTwo];
        array[indexOne] = b;
        array[indexTwo] = a;
        return array;
    }
}
