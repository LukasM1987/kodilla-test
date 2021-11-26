package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskQueueTestSuite {

    @Test
    void observerTaskTest() {
        //Given
        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");
        TaskQueue student1 = new TaskQueue("Student 1");
        TaskQueue student2 = new TaskQueue("Student 2");
        TaskQueue student3 = new TaskQueue("Student 3");
        TaskQueue student4 = new TaskQueue("Student 4");
        student1.registerObserver(mentor1);
        student2.registerObserver(mentor2);
        student3.registerObserver(mentor1);
        student4.registerObserver(mentor2);

        //When
        student1.addTask("Task 1");
        student1.addTask("Task 2");
        student2.addTask("Task 1");
        student3.addTask("Task 1");
        student3.addTask("Task 2");
        student4.addTask("Task 3");
        student4.addTask("Task 4");

        //Then
        Assertions.assertEquals(4, mentor1.getUpdateCount());
        Assertions.assertEquals(3, mentor2.getUpdateCount());
    }
}
