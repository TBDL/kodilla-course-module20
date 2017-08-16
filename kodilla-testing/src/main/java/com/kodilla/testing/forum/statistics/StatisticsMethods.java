package com.kodilla.testing.forum.statistics;

import java.util.*;

public class StatisticsMethods {

    Statistics statistics;



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

    public int getCommentsAmount(){
        int commentsAmount = statistics.commentsCount();
        return commentsAmount;
    }


}
