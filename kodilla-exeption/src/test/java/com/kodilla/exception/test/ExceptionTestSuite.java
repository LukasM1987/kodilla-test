package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTestSuite {


    @Test
    void testSecondChallengeException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When And Then
        Assertions.assertAll(
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 1.0)),
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.0, 1.5)),
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9, 1.4)),
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.1, 1.5)),
                () -> Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0, 1.2))
        );
    }
}
