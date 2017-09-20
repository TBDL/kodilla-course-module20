package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
    //Given
        ApplicationContext context =
            new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        List<String> toDoList = board.toDoList.getTasks();
        List<String> inProgressList = board.inProgressList.getTasks();
        List<String> doneList = board.doneList.getTasks();
        List<String> testList = new ArrayList<>();
        testList.add("task1");
    //When
        toDoList.add("task1");
        inProgressList.add("task1");
        doneList.add("task1");
    //Then
        Assert.assertEquals(testList, toDoList);
        Assert.assertEquals(testList, inProgressList);
        Assert.assertEquals(testList, doneList);

        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }
}
