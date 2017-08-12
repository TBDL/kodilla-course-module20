package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.*;
import java.lang.*;
import org.junit.*;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> emptyListTest = oddNumbersExterminator.exterminate(emptyList);
        //Then
        if (emptyListTest.isEmpty()) {
            System.out.println("Test of testOddNumbersExterminatorEmptyList: OK");
        }
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> fullList = new ArrayList<Integer>();
        fullList.add(1);
        fullList.add(2);
        fullList.add(3);
        fullList.add(4);
        //When
        ArrayList<Integer> fullListTest = oddNumbersExterminator.exterminate(fullList);
        //Then
        if (fullListTest.isEmpty() == false &&
             fullListTest.contains(1) == false &&
             fullListTest.contains(3) == false &&
             fullListTest.contains(2) &&
             fullListTest.contains(4)) {

            System.out.println("Test of testOddNumbersExterminatorNormalList: OK");
        }
    }
}

