package com.kodilla.good.patterns.challenges.food2Door;

public class HealthyShop implements Producer {

  public void process(Order order) {

      HealthyShopOrderProcessor healthyShopOrderProcessor =
              new HealthyShopOrderProcessor();

      boolean result = healthyShopOrderProcessor.sendRequestToProcessOrder();

      if (result) {
          System.out.println("The order " + order.getOrderNumber()  +
                  " has been processed by \"HealthyShop\".");
      } else {
          System.out.println("The order " + order.getOrderNumber() +
                  " has not been processed by \"HealthyShop\".");
      }
   }
}

