package com.kodilla.patterns.tasks;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    private TaskDatabase taskDatabase = new TaskDatabase();
    private String record;

    public DrivingTask(final String taskName,
                       final String where,
                       final String using) {

        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public void executeTask() {
        String record = taskName + " " + where + " " + using;
        taskDatabase.addTask(record);
        this.record = record;
        System.out.println("Executing task: " + record);
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        return taskDatabase.getExecutedTasks().contains(record);
    }

}
