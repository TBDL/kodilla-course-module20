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

    public void getShapeName() {
        System.out.println("triangle");
    }

    public double getField() {
        return (side * height) / 2;
    }
}