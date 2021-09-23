package com.kodilla.kodilla.hibernate.tasklist.dao;

import com.kodilla.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Task list", "Task - 1");
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> testTaskList = taskListDao.findByListName(name);

        //Then
        Assertions.assertEquals(1, testTaskList.size());

        //CleanUp
        int id = testTaskList.get(0).getId();
        taskListDao.deleteById(id);

    }
}
