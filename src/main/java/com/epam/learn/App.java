package com.epam.learn;

import com.epam.learn.util.Logger;

import java.util.Arrays;

/**
 * Input - sorted array of int
 * Output - count the quantity of numbers inside more than L and less than R (included)
 * Time complexity = O(logN)
 *
 * MAJOR NOTICE
 * L and R may be not included in the array!
 * https://www.sitepoint.com/javas-binary-search-api-tutorial/
 */
public class App {
    public static void main(String[] args) {

        System.out.println("*********** START ************");
//        int[] testData = {1,2,3,4,5,6,7,8,9};
//        int start = 3;
//        int end = 5;

        int[] testData = {1,3,8,15,34,56,88,89,90};
        int start = 2;
        int end = 556;

        int result = Algo.run(testData, start, end);

        Logger.showResult(result);
        System.out.println("*********** STOP ************");

    }
}
