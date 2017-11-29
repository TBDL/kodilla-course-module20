package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalJalapenosDecorator extends AbstractPizzaOrderDecorator {
    public AdditionalJalapenosDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        //hardcoded stub cost = 5
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() +"\nAdditional: jalapenos";
    }
}
