package com.kodilla.good.patterns.challenges.food2Door;

public class ExtraFoodShop implements Producer{

    public void process(Order order) {

        ExtraFoodShopDatabase extraFoodShopDatabase = new ExtraFoodShopDatabase();
        boolean isProcessed = ((extraFoodShopDatabase.checkSuppliers(order.getSupplier()) &&
                (extraFoodShopDatabase.checkProductsAndQuantities(order.getProduct(), order.getQuantity()))));

        if (isProcessed) {
            System.out.println("The order " + order.getOrderNumber() +
                    " has been processed by \"ExtraFoodShop\".");
        } else {
            System.out.println("The order " + order.getOrderNumber() +
                    " has not been processed by \"ExtraFoodShop\".");
        }
    }
}
