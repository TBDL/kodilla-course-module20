package com.kodilla.testing.shape;

public class Square implements Shape {

    String name;
    double side;

    public Square(String name, double side) {
        this.name = name;
        this.side = side;
    }

    public void getShapeName() {
        System.out.println("square");
    }

    public double getField() {
        return side * side;
    }

    @Override
    public String toString() {
        return name +" "+ side;
    }
}
