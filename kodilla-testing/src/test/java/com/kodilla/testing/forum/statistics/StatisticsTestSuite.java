package com.kodilla.testing.forum.statistics;
import org.junit.*;
import java.util.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void testGetPostsAmount0WithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postAmountTest = 0;
        when(statisticsMock.postsCount()).thenReturn(postAmountTest);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);
        //When
        int quantityOfPosts = statisticsMethodsTest.getPostsAmount();
        //Then
        Assert.assertEquals(0, quantityOfPosts);
    }

    @Test
        public void testGetPostsAmount1000WithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postAmountTest = 1000;
        when(statisticsMock.postsCount()).thenReturn(postAmountTest);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);
        //When
        int quantityOfPosts = statisticsMethodsTest.getPostsAmount();
        //Then
        Assert.assertEquals(1000,quantityOfPosts);
    }




}
