package com.patterns.factory.task;

import com.patterns.factory.example.Shape;

public class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;
    private boolean executeTask = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        this.executeTask = true;
        return taskName + " task has been executed: " + where + " " + using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executeTask;
    }
}
