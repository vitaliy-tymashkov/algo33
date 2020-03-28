package com.epam.learn.util;

public class RepetitionsChecker {

    public int checkInStartDirection(int[] testData, int indexOfStart, int start){
        if ((indexOfStart - 1) >= 0) {
            if (testData[indexOfStart - 1] == start) {
                indexOfStart--;
                while ((testData[indexOfStart] == start)) {
                    indexOfStart--;
                    if (indexOfStart < 0) {
                        break;
                    }
                }
            }
        }
        return indexOfStart;
    }

    public int checkInEndDirection(int[] testData, int indexOfEnd, int end){
        if ((indexOfEnd + 1) < testData.length) {
            if (testData[indexOfEnd + 1] == end) {
                indexOfEnd++;
                while ((testData[indexOfEnd] == end)) {
                    indexOfEnd++;
                    if (indexOfEnd > testData.length-1) {
                        break;
                    }
                }
            }
        }
        return indexOfEnd;
    }
}
