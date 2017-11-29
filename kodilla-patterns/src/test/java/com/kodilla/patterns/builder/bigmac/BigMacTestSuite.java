package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacNew() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .roll(new Roll("WITH SESAME"))
                .burgers(3)
                .sauce(new Sauce("THOUSAND ISLANDS"))
                .ingredient(new Ingredient("SALAD"))
                .ingredient(new Ingredient("ONION"))
                .ingredient(new Ingredient("BACON"))
                .ingredient(new Ingredient("CUCUMBERS"))
                .ingredient(new Ingredient("CHILI PEPPERS"))
                .ingredient(new Ingredient("CHAMPIGNONS"))
                .ingredient(new Ingredient("SHRIMPS"))
                .ingredient(new Ingredient("CHEESE"))
                .build();
        //When
        int ingredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(8, ingredients);
        System.out.println(bigMac);
    }
}
