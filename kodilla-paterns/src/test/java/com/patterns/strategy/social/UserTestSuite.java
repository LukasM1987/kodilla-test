package com.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User julka = new ZGeneration("Julka");
        User millenials = new Millenials("Millenials");
        User yGeneration = new YGeneration("Y Generation");

        //When
        String julkaSocial = julka.predict();
        System.out.println("Julka social media is: " + julkaSocial);
        String millenialsSocial = millenials.predict();
        System.out.println("Millenials social media is: " + millenialsSocial);
        String yGenerationSocial = yGeneration.predict();
        System.out.println("Y Generation social media is: " + yGenerationSocial);

        //Then
        Assertions.assertEquals("Julka z twittera", julkaSocial);
        Assertions.assertEquals("Facebook", millenialsSocial);
        Assertions.assertEquals("Snapchat", yGenerationSocial);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials("Millenials");

        //When
        String millenialsSocial = millenials.predict();
        System.out.println("Millenials social media is: " + millenialsSocial);
        millenials.setSocialPublisher(new SnapchatPublisher());
        millenialsSocial = millenials.predict();
        System.out.println("Millenials new social media is: " + millenialsSocial);

        //Then
        Assertions.assertEquals("Snapchat", millenialsSocial);

    }
}
