package com.epam.learn;

import com.epam.learn.util.Checker;
import com.epam.learn.util.Logger;
import com.google.common.primitives.Ints;

import java.util.*;

public class Algo {
    public static int run(int[] testData, int start, int end){

        //TODO Check if array is sorted
        Checker checker = new Checker();
        checker.orderOfIndexes(start, end);
        //TODO Check of start index >= 0 and end index < length
        //TODO Check that length >= end - startint


        int indexOfStart = findBinarySearch(testData, start);
//        int indexOfStart = findWithGuava(testData, start);
        checker.isStartInArray(indexOfStart);

        int indexOfEnd = findBinarySearch(testData, end);
//        int indexOfEnd = findWithGuava(testData, end);
        checker.isEndInArray(indexOfEnd);

        new Logger().show(indexOfStart, indexOfEnd);

        return indexOfEnd - indexOfStart + 1;
    }

    // Function to find the index of an element in a primitive array in Java
    private static int findBinarySearch(int[] a, int target)
    {
        int index = Arrays.binarySearch(a, target);
        return (index < 0) ? -1 : index;
    }

    // Function to findWithGuava the index of an element in a primitive array in Java
    // For fun - Time may be checked on 10000000 elements array
    private static int findWithGuava(int[] a, int target)
    {
        return Ints.indexOf(a, target);
    }
}
