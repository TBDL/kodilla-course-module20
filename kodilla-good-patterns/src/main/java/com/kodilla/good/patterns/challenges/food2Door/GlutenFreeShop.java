package com.kodilla.good.patterns.challenges.food2Door;

public class GlutenFreeShop implements Producer {

    public void process(Order order){
        GlutenFreeShopOrderProcessor glutenFreeShopOrderProcessor =
                new GlutenFreeShopOrderProcessor();
        glutenFreeShopOrderProcessor.sendOrder(order.toString());

        GlutenFreeShopDto glutenFreeShopDto = glutenFreeShopOrderProcessor.retrieveDto();
        if (glutenFreeShopDto.getIsProcessed()){
            System.out.println("The order " + order.getOrderNumber() +
                    " has been processed by \"GlutenFreeShop\".");
        } else {
            System.out.println("The order " + order.getOrderNumber() +
                    " has not been processed by \"GlutenFreeShop\"." +
                    " Reason: " + glutenFreeShopDto.getAdditionalInformation());
        }
    }
}
