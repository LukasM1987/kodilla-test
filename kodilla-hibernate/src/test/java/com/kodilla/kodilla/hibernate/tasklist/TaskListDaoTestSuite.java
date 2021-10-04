package com.kodilla.kodilla.hibernate.tasklist;

import com.kodilla.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String TASK_NAME = "Task name";
    private static final String TASK_DESCRIPTION = "Task - 1";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(TASK_NAME, TASK_DESCRIPTION);
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> testTaskList = taskListDao.findByListName(name);

        //Then
        Assertions.assertEquals(1, testTaskList.size());
        Assertions.assertEquals("Task name", testTaskList.get(0).getListName());

        //CleanUp
        int id = testTaskList.get(0).getId();
        taskListDao.deleteById(id);
    }
}
