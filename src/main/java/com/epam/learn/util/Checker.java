package com.epam.learn.util;

public class Checker {

    public void orderOfIndexes(int start, int end){
        if ( start > end ) {
            throw new IllegalArgumentException("Start > End");
        }
    }

    public int isStartOutOfTheLimits(int indexOfStart){
        if (indexOfStart < 0){
            return Math.abs(indexOfStart) - 2;
        }
        return indexOfStart - 1;
    }

    public int isEndOutOfTheLimits(int indexOfEnd){
        if (indexOfEnd < 0){
            return Math.abs(indexOfEnd) - 1;
        }
        return indexOfEnd + 1;
    }
}
