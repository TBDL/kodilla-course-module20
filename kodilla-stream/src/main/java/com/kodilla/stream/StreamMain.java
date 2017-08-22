package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {


        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultStringOfForumUsers = forum.getUsersList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> ChronoUnit.YEARS.between
                        (forumUser.getBirthDate(), LocalDateTime.now()) >= 20 )
                .filter(forumUser -> forumUser.getPublishedPostsAmount() >= 1 )
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));
                theResultStringOfForumUsers.entrySet().stream()
                    .map(entry -> entry.getKey() + ": " + entry.getValue())
                    .forEach(System.out::println);
        System.out.println("The size of the list is: " + theResultStringOfForumUsers.size());

    }
}




