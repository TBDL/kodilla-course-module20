package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ArrayOperationsTestSuite {


    @Test
    public void testGetAverage(){

        //Given
        int[] testArray = {1,2,3,4,5};
        int sum = 0;
        for (int i =0; i < testArray.length; i++) {
            sum = sum + testArray[i];
        }

        //When
        double average = sum/testArray.length;

        //Then
        Assert.assertEquals(average, ArrayOperations.getAverage(testArray), 0.1);

    }


}
