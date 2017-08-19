package com.kodilla.testing.forum.statistics;
import org.junit.*;
import java.util.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test(expected = java.lang.ArithmeticException.class)
    public void testGetAveragePostAmount0PerUser0() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsAmountTest = 0;
        ArrayList<String> userList = new ArrayList<String>();
        when(statisticsMock.postsCount()).thenReturn(postsAmountTest);
        when(statisticsMock.usersNames()).thenReturn(userList);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);
        double delta = 1e-15;
        //When
        double averageAmountOfPostsPerUserTest = statisticsMethodsTest.getAveragePostsAmountPerUser();
        //Then
        Assert.assertEquals(0, averageAmountOfPostsPerUserTest, delta);
    }

    @Test
    public void testGetAveragePostAmount1000PerUser100() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsAmountTest = 1000;
        ArrayList<String> userList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            userList.add("user");
        }
        when(statisticsMock.postsCount()).thenReturn(postsAmountTest);
        when(statisticsMock.usersNames()).thenReturn(userList);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);
        double delta = 1e-15;
        //When
        double averageAmountOfPostsPerUserTest = statisticsMethodsTest.getAveragePostsAmountPerUser();
        //Then
        Assert.assertEquals(10, averageAmountOfPostsPerUserTest, delta);

    }

    @Test
    public void testGetAverageCommentsAmount0PerUser100() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentsAmountTest = 0;
        ArrayList<String> userList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            userList.add("user");
        }
        when(statisticsMock.commentsCount()).thenReturn(commentsAmountTest);
        when(statisticsMock.usersNames()).thenReturn(userList);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);
        double delta = 1e-15;
        //When
        double averageAmountOfCommentsPerUserTest = statisticsMethodsTest.getAverageCommentsAmountPerUser();
        //Then
        Assert.assertEquals(0, averageAmountOfCommentsPerUserTest, delta);

    }

    @Test
    public void testPostAmountIsBiggerThanCommentsAmount() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsAmountTest = 2;
        int commentsAmountTest = 1;
        when(statisticsMock.postsCount()).thenReturn(postsAmountTest);
        when(statisticsMock.commentsCount()).thenReturn(commentsAmountTest);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);
        //When
        boolean postAmountIsBiggerThanCommentsAmount =
                statisticsMethodsTest.getPostsAmount() >  statisticsMethodsTest.getCommentsAmount();
        //Then
        Assert.assertTrue(postAmountIsBiggerThanCommentsAmount);

    }

    @Test
    public void testCommentsAmountIsBiggerThanPistsAmount() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsAmountTest = 1;
        int commentsAmountTest = 2;
        when(statisticsMock.postsCount()).thenReturn(postsAmountTest);
        when(statisticsMock.commentsCount()).thenReturn(commentsAmountTest);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);
        //When
        boolean commentsAmountIsBiggerThanPostsAmount =
                statisticsMethodsTest.getPostsAmount() < statisticsMethodsTest.getCommentsAmount();
        //Then
        Assert.assertTrue(commentsAmountIsBiggerThanPostsAmount);

    }

 /*   @Test
        public void testCalculateStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsAmountTest = 1000;
        int commentsAmountTest = 0;
        ArrayList<String> userList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {userList.add("user");}
        int averagePostAmountPerUserTest = postsAmountTest / userList.size();
        int averageCommentsAmountPerUserTest = commentsAmountTest / userList.size();
        int averageCommentsAmountPerPostTest = commentsAmountTest / userList.size();


        when(statisticsMock.postsCount()).thenReturn(postsAmountTest);
        when(statisticsMock.commentsCount()).thenReturn(commentsAmountTest);
        when(statisticsMock.usersNames()).thenReturn(userList);

        //Assert
        Assert.assertEquals(, );
    }

*/

}