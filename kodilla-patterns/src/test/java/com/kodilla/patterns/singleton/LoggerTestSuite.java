package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testLogAndGetLog() {
        //Given
        //When
        Logger.getInstance().log("log1");
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("log1", result);
    }
}
