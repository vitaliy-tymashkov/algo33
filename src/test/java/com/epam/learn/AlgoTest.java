package com.epam.learn;

import com.epam.learn.util.Logger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AlgoTest {

    @Test
    public void testRun_arrayOfTenConsecutiveNumbers_result3() {
        int[] testData = {1,2,3,4,5,6,7,8,9};
        int start = 3;
        int end = 5;
        int expectedResult = 3;

        int result = Algo.run(testData, start, end);
        Logger.showResult(result);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testRun_arrayOfTenNonConsecutiveNumbers_result4() {
        int[] testData = {1,3,8,15,34,56,88,89,90};
        int start = 4;
        int end = 87;
        int expectedResult = 4;

        int result = Algo.run(testData, start, end);
        Logger.showResult(result);
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
                Logger.showSuccess("Expected Exception for 'Start > End' case");
                throw (e);
            }
        }
        fail("Expected custom IllegalArgumentsException(\"Start > End\")");
    }

    @Test
    public void testRun_noStartAndEndElements_Result10() {
        int[] testData = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int start = 0;
        int end = 10;

        int expectedResult = 9;

        int result = Algo.run(testData, start, end);
        Logger.showResult(result);
        assertEquals(expectedResult, result);
    }
}