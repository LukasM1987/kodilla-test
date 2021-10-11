package com.kodilla.kodilla.hibernate.tasklist;

import com.kodilla.kodilla.hibernate.task.Task;
import com.kodilla.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {


    @Autowired
    private TaskListDao taskListDao;
    private static final String TASK_NAME = "Task name";
    private static final String TASK_DESCRIPTION = "Task - 1";
    private static final String LISTNAME = "Kodilla tasks";

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

    @Test
    void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        Assertions.assertNotEquals(0, id);

        //CleanUp
        taskListDao.deleteById(id);
    }
}
