package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @Test
    public void addFigureTest() {
    //Given
    Square square = new Square("square", 2.0);
    ShapeCollector shapeCollector = new ShapeCollector(square);
    String a = square.getShapeName();
    double b = square.getField();
    ShapeObject shapeObject1 = new ShapeObject(a, b);
    //When
    shapeCollector.addFigure(shapeObject1);
    //Then
    Assert.assertEquals(1, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void removeFigureTest(){
    //Given
    Square square = new Square("square",1.2);
    ShapeCollector shapeCollector = new ShapeCollector(square);
    String a = square.getShapeName();
    double b = square.getField();
    ShapeObject shapeObject1 = new ShapeObject(a, b);
    shapeCollector.addFigure(shapeObject1);
    //When
    boolean result = shapeCollector.removeFigure(shapeObject1);
    //Then
    Assert.assertTrue(result);
    Assert.assertEquals(0, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void getFigureTest(){
    //Given
    Square square = new Square("square",1.2);
    ShapeCollector shapeCollector = new ShapeCollector(square);
    String a = square.getShapeName();
    double b = square.getField();
    ShapeObject shapeObject1 = new ShapeObject(a, b);
    shapeCollector.addFigure(shapeObject1);
    //When
    Shape retrievedShape = shapeCollector.getFigure(0);
    //Then
    Assert.assertEquals(shapeObject1, retrievedShape);
    }

    @Test
    public void showFiguresTest()    {
        //Given
        Square square = new Square("square", 1.2);
        Triangle triangle = new Triangle("triangle", 1.2, 1.0);
        Circle circle = new Circle ("circle", 1.0);
        ShapeObject shapeObject1 = new ShapeObject(square.getShapeName(), square.getField());
        ShapeObject shapeObject2 = new ShapeObject(triangle.getShapeName(), triangle.getField());
        ShapeObject shapeObject3= new ShapeObject(circle.getShapeName(), circle.getField());

        ShapeCollector shapeCollector = new ShapeCollector(square);
        shapeCollector.addFigure(shapeObject1);
        shapeCollector.addFigure(shapeObject2);
        shapeCollector.addFigure(shapeObject3);

        ArrayList<Shape> expectedList = new ArrayList<>();
        expectedList.add(shapeObject1);
        expectedList.add(shapeObject2);
        expectedList.add(shapeObject3);
        //When
        ArrayList<Shape> retrievedList = shapeCollector.showFigures();
        //Then
        Assert.assertEquals(expectedList,retrievedList);
    }
}
