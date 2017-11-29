package com.kodilla.kodillapatterns2.pizza;

import com.kodilla.kodillapatterns2.decorator.pizza.*;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.SchemaOutputResolver;
import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testHawaiianPizzaWithAdditionalCheese() {

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawaiianPizzaDecorator(theOrder);
        theOrder = new AdditionalCheeseDecorator(theOrder);
        theOrder = new AdditionalJalapenosDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals(new BigDecimal(33), theCost);
        Assert.assertEquals("Hawaiian Pizza ordered with ingredients: cheese, tomato sauce, pineapple, olives, maize" +
        "\nAdditional: cheese" +
        "\nAdditional: jalapenos", description);
        System.out.println(description);
        System.out.println("Cost: " + theCost);
    }


}
