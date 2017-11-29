package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class HawaiianPizzaDecorator extends AbstractPizzaOrderDecorator {
    public HawaiianPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        //hardcoded stub cost = 10
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return "Hawaiian " + super.getDescription() + ", pineapple, olives, maize";
    }
}
