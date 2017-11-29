package com.kodilla.patterns.strategy.social.publishers;

public class SnapchatPublisher implements SocialPublisher {
    public String share() {
        return "published on Snapchat";
    }
}
