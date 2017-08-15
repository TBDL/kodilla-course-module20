package com.kodilla.testing.shape;

public class ShapeObject implements Shape {

    String name;
    double field;


    public ShapeObject(String name, double field) {
        this.name = name;
        this.field = field;
    }

   public String getShapeName(){return name;};

   public double getField(){return field;};
}
