package com.kodilla.patterns.tasks;

public class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;
    private TaskDatabase taskDatabase = new TaskDatabase();
    private String record;

    public ShoppingTask(final String taskName,
                        final String whatToBuy,
                        final double quantity) {

        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public void executeTask() {
        String record = taskName + " " + whatToBuy + " " + quantity;
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
