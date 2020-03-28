package com.epam.learn;

import com.epam.learn.util.Checker;
import com.epam.learn.util.Logger;

import java.util.*;

public class Algo {
    public static int run(int[] testData, int start, int end){
        Logger.showInput(testData, start, end);

        //TODO Check if array is sorted
        Checker checker = new Checker();
        checker.orderOfIndexes(start, end);
        //TODO Check of start index >= 0 and end index < length
        //TODO Check that length >= end - startint

        int indexOfStart = checker.isStartOutOfTheLimits(Arrays.binarySearch(testData, start));
        int indexOfEnd = checker.isEndOutOfTheLimits(Arrays.binarySearch(testData, end));

        Logger.showIndexes(indexOfStart, indexOfEnd);

        return indexOfEnd - indexOfStart;
    }
}
