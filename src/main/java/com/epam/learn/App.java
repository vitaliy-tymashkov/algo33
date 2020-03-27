package com.epam.learn;

import java.util.Arrays;

/**
 * Input - sorted array of int
 * Output - count the quantity of numbers inside more than L and less than R (included)
 * Time complexity = O(logN)
 *
 * MAJOR NOTICE
 * L and R must be present in the array!
 *
 * In another case - we should use additional NavigableMap to find the index of the closest element
 */
public class App {
    public static void main(String[] args) {

        System.out.println("START");
        int[] testData = {1,2,3,4,5,6,7,8,9};
        int start = 3;
        int end = 5;
        System.out.println("INPUT ARRAY = " + Arrays.toString(testData));
        System.out.println("L = " + start);
        System.out.println("R = " + end);

        int result = Algo.run(testData, start, end);

        System.out.println("RESULT = " + result);
        System.out.println("STOP");

    }
}
