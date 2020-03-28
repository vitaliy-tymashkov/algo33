package com.epam.learn.util;

import java.util.Arrays;

public class Logger {

    public static void showInput(int[] testData, int start, int end) {
        System.out.println("=========================");
        System.out.println("INPUT ARRAY = " + Arrays.toString(testData));
        System.out.println("L = " + start);
        System.out.println("R = " + end);
    }

    public static void showIndexes(int indexOfStart, int indexOfEnd){
        System.out.println("-------------------------");
        System.out.println("start index = " + indexOfStart);
        System.out.println("end index = " + indexOfEnd);
        System.out.println("-------------------------");
    }

    public static void showSuccess(String message) {
        System.out.println("Message = " + message);
        System.out.println("=========================");
    }

    public static void showResult(int result) {
        System.out.println("Result = " + result);
        System.out.println("=========================");
    }
}
