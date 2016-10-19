package com.github.ignacy123.algorithms;

/**
 * Created by ignacy on 11.10.16.
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] testArray = new int[100];
        for(int i = 0; i<testArray.length; i++){
            testArray[i] = i;
        }
        System.out.println(linearSearch(testArray, 99));
    }


    public static int linearSearch(int[] array, int element){
        int counter = 0;
        for(int i = 0; i<array.length; i++){
            counter++;
            if(array[i] == element){
                System.out.println(counter);
                return i;
            }
        }
        System.out.println(counter);
        return 0;
    }
}
