package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    private ArrayList<Shape> figures = new ArrayList<Shape>();
    private Shape shape;

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    public void addFigure(Shape shape) {
        // do nothing
    }

    public boolean removeFigure(Shape shape) {

        return true;
    }

    public Shape getFigure(int n) {
        return null;
    }

    public void showFigures() {

    }

    public int getFiguresQuantity(){
        return 100;
    }
}