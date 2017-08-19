package com.kodilla.testing.forum.statistics;
import java.util.*;

public class StatisticsMethods {

    private Statistics statistics;
    public ArrayList<Integer> statisticsList = new ArrayList<Integer>();

    public StatisticsMethods(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUsersAmount() {
        int usersAmount = statistics.usersNames().size();
        return usersAmount;
    }

    public int getPostsAmount() {
        int postsAmount = statistics.postsCount();
        return postsAmount;
    }

    public int getCommentsAmount() {
        int commentsAmount = statistics.commentsCount();
        return commentsAmount;
    }

    public int getAveragePostsAmountPerUser() {
        int averagePostAmountPerUser = statistics.postsCount() / statistics.usersNames().size();
        return averagePostAmountPerUser;
    }

    public int getAverageCommentsAmountPerUser() {
        int averageCommentsAmountPerUser = statistics.commentsCount() / statistics.usersNames().size();
        return averageCommentsAmountPerUser;
    }

    public int getAverageCommentsAmountPerPost() {
        int averageCommentsAmountPerPost = statistics.commentsCount() / statistics.postsCount();
        return averageCommentsAmountPerPost;
    }

     void calculateAdvStatistics(Statistics statistics) {

       int usersAmount = statistics.usersNames().size();
       int postsAmount = statistics.postsCount();
       int commentsAmount = statistics.commentsCount();
       int averagePostAmountPerUser = statistics.postsCount() / statistics.usersNames().size();
       int averageCommentsAmountPerUser = statistics.commentsCount() / statistics.usersNames().size();
       int averageCommentsAmountPerPost = statistics.commentsCount() / statistics.postsCount();

         statisticsList.add(usersAmount);
         statisticsList.add(postsAmount);
         statisticsList.add(commentsAmount);
         statisticsList.add(averagePostAmountPerUser);
         statisticsList.add(averageCommentsAmountPerUser);
         statisticsList.add(averageCommentsAmountPerPost);

    }

     ArrayList<Integer> showStatistics() {

        return statisticsList;
    }

}
