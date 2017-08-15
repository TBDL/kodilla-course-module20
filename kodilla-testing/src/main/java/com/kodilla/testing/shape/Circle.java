package com.kodilla.testing.shape;

public class Circle implements Shape {

    String name;
    double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return Math.PI * (radius * radius);
    }



}
