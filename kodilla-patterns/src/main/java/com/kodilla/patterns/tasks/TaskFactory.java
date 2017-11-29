package com.kodilla.patterns.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskClass) {
        switch(taskClass) {
            case SHOPPING:
                return new ShoppingTask("BUY", "EGGS", 100);
            case PAINTING:
                return new PaintingTask("PAINT", "BLACK", "COFFIN");
            case DRIVING:
                return new DrivingTask("GOTO", "TOKIO", "BICYCLE");
            default:
                return null;
        }
    }
}
