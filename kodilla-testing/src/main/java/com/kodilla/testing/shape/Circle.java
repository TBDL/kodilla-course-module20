package com.kodilla.testing.shape;

public class Circle implements Shape {

    String name;
    double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public void getShapeName() {
        System.out.println("circle");
    }

    public double getField() {
        return Math.PI * (radius * radius);
    }

}
