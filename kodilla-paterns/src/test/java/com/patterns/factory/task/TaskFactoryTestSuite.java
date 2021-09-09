package com.patterns.factory.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {


    @Test
    void shoppingTaskTest() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);

        //Then
        Assertions.assertAll(
                () -> Assertions.assertEquals("Shopping task has been executed: some products 6.0", shopping.executeTask()),
                () -> Assertions.assertEquals("Shopping", shopping.getTaskName()),
                () -> Assertions.assertTrue(shopping.isTaskExecuted())
        );
    }

    @Test
    void paintingTaskTest() {
        ///Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);

        //Then
        Assertions.assertAll(
                () -> Assertions.assertEquals("Painting task has been executed: matte black car", painting.executeTask()),
                () -> Assertions.assertEquals("Painting", painting.getTaskName()),
                () -> Assertions.assertTrue(painting.isTaskExecuted())
        );
    }

    @Test
    void drivingTaskTest() {
        ///Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);

        //Then
        Assertions.assertAll(
                () -> Assertions.assertEquals("Driving task has been executed: Warsaw car", driving.executeTask()),
                () -> Assertions.assertEquals("Driving", driving.getTaskName()),
                () -> Assertions.assertTrue(driving.isTaskExecuted())
        );
    }
}
