package com.epam.learn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AlgoTest {

    @Test
    public void testRun_arrayOfTenConsecutiveNumbers_resultTwo() {
        int[] testData = {1,2,3,4,5,6,7,8,9};
        int start = 3;
        int end = 5;
        int expectedResult = 3;

        int result = Algo.run(testData, start, end);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testRun_arrayOfTenNonConsecutiveNumbers_resultTwo() {
        int[] testData = {1,3,8,15,34,56,88,89,90};
        int start = 3;
        int end = 88;
        int expectedResult = 6;

        int result = Algo.run(testData, start, end);

        assertEquals(expectedResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRun_reversedStartAndStop_Exception() {
        int[] testData = {1,2,3,4,5,6,7,8,9};
        int start = 5;
        int end = 3;

        try {
            Algo.run(testData, start, end);
        }
        catch (IllegalArgumentException e){
            if (e.getMessage().equals("Start > End")) {
                throw (e);
            }
        }
        fail("Expected custom IllegalArgumentsException(\"Start > End\")");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRun_noStartElement_Exception() {
        int[] testData = {1,2,3,4,5,6,7,8,9};
        int start = 0;
        int end = 3;

        try {
            Algo.run(testData, start, end);
        }
        catch (IllegalArgumentException e){
            if (e.getMessage().equals("Start element does not exist in the array!")) {
                throw (e);
            }
        }
        fail("Expected custom IllegalArgumentsException(\"Start element does not exist in the array!\")");
    }
}