package com.kodilla.stream.forumuser;

import java.util.*;

public final class Forum {

   private final List<ForumUser> usersList = new ArrayList<>();

   public Forum(){
       usersList.add(new ForumUser(1, "user1", 'M',
               1999, 10, 14, 100));
       usersList.add(new ForumUser(2, "user2", 'M',
               1965, 10, 14, 100));
       usersList.add(new ForumUser(3, "user3", 'M',
               1945, 10, 14, 0));
       usersList.add(new ForumUser(4, "user4", 'F',
               1935, 10, 14, 100));
   }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(usersList);
    }
}
