package com.patterns.strategy.social;

public class FaceBookPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Facebook";
    }
}
