package com.github.ignacy123.algorithms;

/**
 * Created by ignacy on 19.10.16.
 */
public class ArrayUtils {

    public static int[] swap(int[] array, int indexOne, int indexTwo) {
        int tmp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = tmp;
        return array;
    }


}
