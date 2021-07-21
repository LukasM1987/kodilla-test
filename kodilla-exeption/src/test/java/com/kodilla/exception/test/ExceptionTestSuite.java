package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTestSuite {

    @Test
    void testSecongChallenge() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When And Then
        Assertions.assertAll(
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 1.5)),
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9, 1.5)),
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9, 1.6)),
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.1, 1.5)),
                () -> Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.6, 1.4)),
                () -> Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.3, 1.6))
        );
    }
}
