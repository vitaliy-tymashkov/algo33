package com.epam.learn;

import com.epam.learn.util.Checker;
import com.epam.learn.util.Logger;
import com.epam.learn.util.RepetitionsChecker;

import java.util.*;

public class Algo {
    public static int run(int[] testData, int start, int end){
        Logger.showInput(testData, start, end);

        //TODO Check if array is sorted
        Checker checker = new Checker();
        RepetitionsChecker repetitionsChecker = new RepetitionsChecker();
        checker.orderOfIndexes(start, end);
        //TODO Check of start index >= 0 and end index < length
        //TODO Check that length >= end - startint

        int indexOfStart = Arrays.binarySearch(testData, start);
        indexOfStart = checker.isStartOutOfTheLimits(indexOfStart);
        indexOfStart = repetitionsChecker.checkInStartDirection(testData, indexOfStart, start);

        int indexOfEnd = Arrays.binarySearch(testData, end);
        indexOfEnd = checker.isEndOutOfTheLimits(indexOfEnd);
        indexOfEnd = repetitionsChecker.checkInEndDirection(testData, indexOfEnd, end);

        Logger.showIndexes(indexOfStart, indexOfEnd);

        return indexOfEnd - indexOfStart - 1;
    }
}
