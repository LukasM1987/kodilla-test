package com.kodilla.kodillapatterns2.observer.homework;

public class Mentor implements TaskObserver {

    private String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(name + ": New task from student: " + taskQueue.getStudent() + "\n" +
                " (total: " + taskQueue.getTasks().size() + " tasks.)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
