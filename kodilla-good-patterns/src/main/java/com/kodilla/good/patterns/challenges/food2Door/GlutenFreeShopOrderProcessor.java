package com.kodilla.good.patterns.challenges.food2Door;

public class GlutenFreeShopOrderProcessor {

    public void sendOrder (String order) {
        //sending order to customer service
    }

    public GlutenFreeShopDto retrieveDto() {
        GlutenFreeShopDto glutenFreeShopDto =
                new GlutenFreeShopDto(false, "lack of products.");
        return glutenFreeShopDto;
    }
}
