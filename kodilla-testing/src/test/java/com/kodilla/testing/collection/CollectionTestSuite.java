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
        List expectedEmptylist = Collections.emptyList();
        System.out.println("Testing empty list");
        //Then
        Assert.assertEquals(expectedEmptylist,emptyListTest);
        
     }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<Integer>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        ArrayList<Integer> expectedNormalList = new ArrayList<Integer>();
        expectedNormalList.add(2);
        expectedNormalList.add(4);
        //When
        ArrayList<Integer> normalListTest = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal list");
        //Then
        Assert.assertEquals(expectedNormalList,normalListTest);
        }
}

