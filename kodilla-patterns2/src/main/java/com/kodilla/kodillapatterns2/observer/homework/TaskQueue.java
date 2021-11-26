package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements TaskObservable {

    private final List<TaskObserver> taskObservers;
    private final List<String> tasks;
    private final String student;

    public TaskQueue(String student) {
        taskObservers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.student = student;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(TaskObserver taskObserver) {
        taskObservers.add(taskObserver);
    }

    @Override
    public void notifyObservers() {
        for (TaskObserver taskObserver : taskObservers) {
            taskObserver.update(this);
        }
    }

    @Override
    public void removeObserver(TaskObserver taskObserver) {
        taskObservers.remove(taskObserver);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getStudent() {
        return student;
    }
}
