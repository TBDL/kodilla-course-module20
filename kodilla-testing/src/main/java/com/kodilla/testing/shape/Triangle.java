package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String name;
    double side;
    double height;

    public Triangle(String name, double side, double height) {
        this.name = name;
        this.side = side;
        this.height = height;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return (side * height) / 2;
    }
}