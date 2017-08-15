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

        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        figures.remove(shape);
        return true;
    }

    public Shape getFigure(int n) {
        return figures.get(n);
    }

    public ArrayList<Shape> showFigures() {
        return figures;
    }

    public int getFiguresQuantity(){
        return figures.size();
    }
}