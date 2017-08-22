package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userID;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int publishedPostsAmount;

    public ForumUser(final int userID, final String username, final char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int publishedPostsAmount) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.publishedPostsAmount = publishedPostsAmount;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublishedPostsAmount() {
        return publishedPostsAmount;
    }


    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", publishedPostsAmount=" + publishedPostsAmount +
                '}';
    }




}
