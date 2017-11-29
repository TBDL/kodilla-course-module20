package com.kodilla.patterns.tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskDatabase {

    private List<String> executedTasks = new ArrayList<>();

    public void addTask(String executedTask) {
        executedTasks.add(executedTask);
    }

    public List<String> getExecutedTasks() {
        return executedTasks;
    }
}
