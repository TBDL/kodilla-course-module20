package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        // or Calculator calculator = (Calculator)context.getBean("calculator");
        //When
        double sum = calculator.add(1.2, 5.6);
        double difference = calculator.sub(3.0, 2.0);
        double product = calculator.mul(1.0, 5.6);
        double quotient = calculator.div(11.2, 5.6);
        //Then
        Assert.assertEquals(6.8, sum, 0.1);
        Assert.assertEquals(1.0, difference, 0.1);
        Assert.assertEquals(5.6, product, 0.1);
        Assert.assertEquals(2.0, quotient, 0.1);
    }
}

