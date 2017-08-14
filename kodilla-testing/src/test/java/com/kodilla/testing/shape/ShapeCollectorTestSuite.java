package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    @Test
    public void addFigureTest() {
    //Given
    Square square = new Square("square",1.2);
    ShapeCollector shapeCollector = new ShapeCollector(square);
    //When
    shapeCollector.addFigure(square);
    //Then
    Assert.assertEquals(1, shapeCollector.getFiguresQuantity());
}

    @Test
    public void removeFigureTest(){
    //Given
    Square square = new Square("square",1.2);
    ShapeCollector shapeCollector = new ShapeCollector(square);
    shapeCollector.addFigure(square);
    //When
    boolean result = shapeCollector.removeFigure(square);
    //Then
    Assert.assertTrue(result);
    Assert.assertEquals(0, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void getFigureTest(){
    //Given
    Square square = new Square("square",1.2);
    ShapeCollector shapeCollector = new ShapeCollector(square);
    shapeCollector.addFigure(square);
    //When
    Shape retrievedShape = shapeCollector.getFigure(0);
    //Then
    Assert.assertEquals(square, retrievedShape);
    }


}
