package com.kodilla.testing.forum.statistics;
import org.junit.*;
import java.util.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void testGetAveragePostsAmount0PerUser1WithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsAmountTest = 0;
        ArrayList<String> userList = new ArrayList<String>();
        userList.add("user1");
        int usersAmountTest = userList.size();
        when(statisticsMock.postsCount()).thenReturn(postsAmountTest);
        when(statisticsMock.usersCount()).thenReturn(usersAmountTest);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);
        double delta = 1e-15;
        //When
        double averageAmountOfPostsPerUserTest = statisticsMethodsTest.getPostsAmount() / statisticsMethodsTest.getUsersAmount();
        //Then
        Assert.assertEquals(0, averageAmountOfPostsPerUserTest, delta);
    }

    @Test
    public void testGetAveragePostsAmount1000PerUser1WithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsAmountTest = 1000;
        ArrayList<String> userList = new ArrayList<String>();
        userList.add("user1");
        int usersAmountTest = userList.size();
        when(statisticsMock.postsCount()).thenReturn(postsAmountTest);
        when(statisticsMock.usersCount()).thenReturn(usersAmountTest);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);
        double delta = 1e-15;
        //When
        double averageAmountOfPostsPerUserTest = statisticsMethodsTest.getPostsAmount() / statisticsMethodsTest.getUsersAmount();
        //Then
        Assert.assertEquals(1000, averageAmountOfPostsPerUserTest, delta);
    }

    @Test
    public void testGetAverageCommentsAmount0PerUser1WithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentsAmountTest = 0;
        ArrayList<String> userList = new ArrayList<String>();
        userList.add("user1");
        int usersAmountTest = userList.size();
        when(statisticsMock.postsCount()).thenReturn(commentsAmountTest);
        when(statisticsMock.usersCount()).thenReturn(usersAmountTest);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);
        double delta = 1e-15;
        //When
        double averageAmountOfCommentsPerUserTest = statisticsMethodsTest.getCommentsAmount() / statisticsMethodsTest.getUsersAmount();
        //Then
        Assert.assertEquals(0, averageAmountOfCommentsPerUserTest, delta);
    }

    @Test
    public void testCommentsAmountSmallerThanPostsAmount(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentsAmountTest = 1;
        int postsAmountTest = 2;
        when(statisticsMock.commentsCount()).thenReturn(commentsAmountTest);
        when(statisticsMock.postsCount()).thenReturn(postsAmountTest);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);
        //When
        boolean commentsAmountSmallerThanPostsAmount = commentsAmountTest < postsAmountTest;
        //Assert
        Assert.assertTrue(commentsAmountSmallerThanPostsAmount);

    }



    @Test
    public void testCommentsAmountBiggerThanPostsAmount(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentsAmountTest = 2;
        int postsAmountTest = 1;
        when(statisticsMock.commentsCount()).thenReturn(commentsAmountTest);
        when(statisticsMock.postsCount()).thenReturn(postsAmountTest);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);
        //When
        boolean commentsAmountSmallerThanPostsAmount = commentsAmountTest > postsAmountTest;
        //Assert
        Assert.assertTrue(commentsAmountSmallerThanPostsAmount);

    }


    @Test(expected=java.lang.ArithmeticException.class)
    public void testGetAverageCommentsAmount100PerUser0WithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentsAmountTest = 100;
        ArrayList<String> userList = new ArrayList<String>();
        int usersAmountTest = userList.size();
        when(statisticsMock.commentsCount()).thenReturn(commentsAmountTest);
        when(statisticsMock.usersCount()).thenReturn(usersAmountTest);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);
        double delta = 1e-15;
        //When
        double averageAmountOfPostsPerUserTest = statisticsMethodsTest.getCommentsAmount() / statisticsMethodsTest.getUsersAmount();
        //Then
        Assert.assertEquals(0, averageAmountOfPostsPerUserTest, delta);
    }


    @Test
    public void testGetAverageCommentsAmount100PerUser100WithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentsAmountTest = 100;
        ArrayList<String> userList = new ArrayList<String>();
        for (int i = 0; i<100; i++){
            userList.add("user1");
        }
        int usersAmountTest = userList.size();
        when(statisticsMock.commentsCount()).thenReturn(commentsAmountTest);
        when(statisticsMock.usersCount()).thenReturn(usersAmountTest);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);
        double delta = 1e-15;
        //When
        double averageAmountOfPostsPerUserTest = statisticsMethodsTest.getCommentsAmount() / statisticsMethodsTest.getUsersAmount();
        //Then
        Assert.assertEquals(1, averageAmountOfPostsPerUserTest, delta);
    }


}


