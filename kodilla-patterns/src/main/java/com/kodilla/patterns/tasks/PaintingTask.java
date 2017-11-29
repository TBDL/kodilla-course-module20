package com.kodilla.patterns.tasks;

public class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;
    private TaskDatabase taskDatabase = new TaskDatabase();
    private String record;

    public PaintingTask(final String taskName,
                        final String color,
                        final String whatToPaint) {

        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public void executeTask() {
        String record = taskName + " " + color + " " + whatToPaint;
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
