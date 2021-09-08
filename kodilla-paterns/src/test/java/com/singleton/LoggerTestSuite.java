package com.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void log() {
        logger = Logger.INSTANCE;
    }

    @Test
    void logTest() {
        //Give
        logger.log("log");

        //When
        String logName = logger.getLastLog();

        //Then
        Assertions.assertEquals("log", logName);
    }
}
