package com.kodilla.kodilla.hibernate.task.dao;


import com.kodilla.kodilla.hibernate.tasklist.TaskList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TaskListDao extends CrudRepository<TaskListDao, Integer> {
    List<TaskList> findByListName(String listName);
}
