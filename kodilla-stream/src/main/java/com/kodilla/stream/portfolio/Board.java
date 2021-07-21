package com.kodilla.stream.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class Board {

    private final List<TaskList> tasksLists = new ArrayList<>();
    private final String name;

    public Board(final String name) {
        this.name = name;
    }

    public void addTaskList(TaskList taskList) {
        tasksLists.add(taskList);
    }

    public boolean removeTaskList(TaskList taskList) {
        return tasksLists.remove(taskList);
    }

    public List<TaskList> getTasksLists() {
        return new ArrayList<>(tasksLists);
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasksLists +
                ", name='" + name + '\'' +
                '}';
    }
}
