package com.kodilla.patterns.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskTestSuite {

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task shoppingTask = taskFactory.createTask(TaskFactory.SHOPPING);
        //When
        shoppingTask.executeTask();
        boolean result = shoppingTask.isTaskExecuted();
        String name = shoppingTask.getTaskName();
        //Then
        Assert.assertEquals(true, result);
        Assert.assertEquals("BUY", name);
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task drivingTask = taskFactory.createTask(TaskFactory.DRIVING);
        //When
        drivingTask.executeTask();
        boolean result = drivingTask.isTaskExecuted();
        String name = drivingTask.getTaskName();
        //Then
        Assert.assertEquals(true, result);
        Assert.assertEquals("GOTO", name);
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task paintingTask = taskFactory.createTask(TaskFactory.PAINTING);
        //When
        paintingTask.executeTask();
        boolean result = paintingTask.isTaskExecuted();
        String name = paintingTask.getTaskName();
        //Then
        Assert.assertEquals(true, result);
        Assert.assertEquals("PAINT", name);
    }
}
