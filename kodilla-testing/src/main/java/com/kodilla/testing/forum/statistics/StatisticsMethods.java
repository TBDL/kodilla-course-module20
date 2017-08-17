package com.kodilla.testing.forum.statistics;
import java.util.*;

public class StatisticsMethods {

    Statistics statistics;
    int usersAmount;
    int postsAmount;
    int commentsAmount;
    double averageAmountOfPostsPerUser;
    double averageAmountOfCommentsPerUser;
    double averageAmountOfCommentsPerPost;

    public StatisticsMethods(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        int usersAmount = statistics.usersCount();
        int postsAmount = statistics.postsCount();
        int commentsAmount = statistics.commentsCount();
        double averageAmountOfPostsPerUser  = statistics.postsCount() / statistics.usersCount();
        double averageAmountOfCommentsPerUser = statistics.commentsCount() / statistics.usersCount();
        double averageAmountOfCommentsPerPost = statistics.commentsCount() / statistics.usersCount();

        this.usersAmount = usersAmount;
        this.postsAmount = postsAmount;
        this.commentsAmount = commentsAmount;
        this.averageAmountOfPostsPerUser = averageAmountOfPostsPerUser;
        this.averageAmountOfCommentsPerUser = averageAmountOfCommentsPerUser;
        this.averageAmountOfCommentsPerPost = averageAmountOfCommentsPerPost;

    }

    public  int getPostsAmount(){

        int postsAmount = statistics.postsCount();
        return postsAmount;
    }

    public int getUsersAmount(){

        int usersAmount = statistics.usersCount();
        return usersAmount;
    }

    public int getCommentsAmount(){

        int commentsAmount = statistics.commentsCount();
        return commentsAmount;
    }

}
