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

    /*
        Map<Integer, Integer> statisticsList = new HashMap<Integer, Integer>();
        statisticsList.put(0,usersAmount);
        statisticsList.put(1,postsAmount);
        statisticsList.put(2,commentsAmount);
        statisticsList.put(3,averagePostAmountPerUser);
        statisticsList.put(4,averageCommentsAmountPerUser);
        statisticsList.put(5,averageCommentsAmountPerPost);
     */



    @Test
        public void testCalculateStatisticsUsersAmount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsAmountTest = 1000;
        int commentsAmountTest = 0;
        ArrayList<String> userList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {userList.add("user");}

        when(statisticsMock.postsCount()).thenReturn(postsAmountTest);
        when(statisticsMock.commentsCount()).thenReturn(commentsAmountTest);
        when(statisticsMock.usersNames()).thenReturn(userList);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);

        //When
        statisticsMethodsTest.calculateAdvStatistics(statisticsMock);
        Map<Integer, Integer> wynik = statisticsMethodsTest.showStatistics();

        //then
        Assert.assertEquals(Integer.valueOf(100), wynik.get(0));
    }

    @Test
    public void testCalculateStatisticsPostsAmount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsAmountTest = 1000;
        int commentsAmountTest = 0;
        ArrayList<String> userList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {userList.add("user");}

        when(statisticsMock.postsCount()).thenReturn(postsAmountTest);
        when(statisticsMock.commentsCount()).thenReturn(commentsAmountTest);
        when(statisticsMock.usersNames()).thenReturn(userList);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);

        //When
        statisticsMethodsTest.calculateAdvStatistics(statisticsMock);
        Map<Integer, Integer> wynik = statisticsMethodsTest.showStatistics();

        //then
        Assert.assertEquals(Integer.valueOf(1000), wynik.get(1));
    }

    @Test
    public void testCalculateStatisticsCommentsAmount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsAmountTest = 1000;
        int commentsAmountTest = 0;
        ArrayList<String> userList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {userList.add("user");}

        when(statisticsMock.postsCount()).thenReturn(postsAmountTest);
        when(statisticsMock.commentsCount()).thenReturn(commentsAmountTest);
        when(statisticsMock.usersNames()).thenReturn(userList);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);

        //When
        statisticsMethodsTest.calculateAdvStatistics(statisticsMock);
        Map<Integer, Integer> wynik = statisticsMethodsTest.showStatistics();

        //then
        Assert.assertEquals(Integer.valueOf(0), wynik.get(2));
    }

    @Test
    public void testCalculateStatisticsPostsPerUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsAmountTest = 1000;
        int commentsAmountTest = 0;
        ArrayList<String> userList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {userList.add("user");}

        when(statisticsMock.postsCount()).thenReturn(postsAmountTest);
        when(statisticsMock.commentsCount()).thenReturn(commentsAmountTest);
        when(statisticsMock.usersNames()).thenReturn(userList);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);

        //When
        statisticsMethodsTest.calculateAdvStatistics(statisticsMock);
        Map<Integer, Integer> wynik = statisticsMethodsTest.showStatistics();

        //then
        Assert.assertEquals(Integer.valueOf(10), wynik.get(3));
    }

    @Test
    public void testCalculateStatisticsCommentsPerUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsAmountTest = 1000;
        int commentsAmountTest = 0;
        ArrayList<String> userList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {userList.add("user");}

        when(statisticsMock.postsCount()).thenReturn(postsAmountTest);
        when(statisticsMock.commentsCount()).thenReturn(commentsAmountTest);
        when(statisticsMock.usersNames()).thenReturn(userList);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);

        //When
        statisticsMethodsTest.calculateAdvStatistics(statisticsMock);
        Map<Integer, Integer> wynik = statisticsMethodsTest.showStatistics();

        //then
        Assert.assertEquals(Integer.valueOf(0), wynik.get(4));
    }

    @Test
    public void testCalculateStatisticsComments0PerPosts1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsAmountTest = 1000;
        int commentsAmountTest = 0;
        ArrayList<String> userList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {userList.add("user");}

        when(statisticsMock.postsCount()).thenReturn(postsAmountTest);
        when(statisticsMock.commentsCount()).thenReturn(commentsAmountTest);
        when(statisticsMock.usersNames()).thenReturn(userList);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);

        //When
        statisticsMethodsTest.calculateAdvStatistics(statisticsMock);
        Map<Integer, Integer> wynik = statisticsMethodsTest.showStatistics();

        //then
        Assert.assertEquals(Integer.valueOf(0), wynik.get(5));
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testCalculateStatisticsComments1000PerPosts0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsAmountTest = 0;
        int commentsAmountTest = 1000;
        ArrayList<String> userList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {userList.add("user");}

        when(statisticsMock.postsCount()).thenReturn(postsAmountTest);
        when(statisticsMock.commentsCount()).thenReturn(commentsAmountTest);
        when(statisticsMock.usersNames()).thenReturn(userList);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);

        //When
        statisticsMethodsTest.calculateAdvStatistics(statisticsMock);
        Map<Integer, Integer> wynik = statisticsMethodsTest.showStatistics();

        //then
        Assert.assertEquals(Integer.valueOf(0), wynik.get(5));
    }


}