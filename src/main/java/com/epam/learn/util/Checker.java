package com.epam.learn.util;

public class Checker {

    public void orderOfIndexes(int start, int end){
        if ( start > end ) {
            throw new IllegalArgumentException("Start > End");
        }
    }

    public void isStartInArray(int indexOfStart){
        if (indexOfStart == -1){
            throw new IllegalArgumentException("Start element does not exist in the array!");
        }
    }

    public void isEndInArray(int indexOfEnd){
        if (indexOfEnd == -1){
            throw new IllegalArgumentException("End element does not exist in the array!");
        }
    }
}
