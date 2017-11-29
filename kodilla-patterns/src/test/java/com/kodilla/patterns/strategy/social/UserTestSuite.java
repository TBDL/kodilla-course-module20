package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("jnowak");
        User user2 = new YGeneration("jlipa");
        User user3 = new ZGeneration("tbadelek");
        //When
        String user1Post = user1 + " " + user1.sharePost();
        String user2Post = user2 + " " + user2.sharePost();
        String user3Post = user3 + " " + user3.sharePost();
        //Then
        Assert.assertEquals("jnowak published on Facebook", user1Post);
        System.out.println(user1Post);
        Assert.assertEquals("jlipa published on Snapchat", user2Post);
        System.out.println(user2Post);
        Assert.assertEquals("tbadelek published on Twitter", user3Post);
        System.out.println(user3Post);
    }

    @Test
    public void testIndividualSharingStrategies() {
        //Given
        User user1 = new Millenials("tbadelek");
        //When
        user1.setSocialPublisher(new SnapchatPublisher());
        String user1Post = user1 + " " + user1.sharePost();
        //Then
        Assert.assertEquals("tbadelek published on Snapchat", user1Post);
        System.out.println(user1Post);
    }
}
