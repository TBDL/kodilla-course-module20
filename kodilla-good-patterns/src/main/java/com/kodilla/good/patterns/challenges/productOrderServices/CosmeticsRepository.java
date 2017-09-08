package com.kodilla.good.patterns.challenges.productOrderServices;

public class CosmeticsRepository implements ProductsRepository {

   public boolean createOrder(User user, Order order, OrderDate orderDate, DeliveryDate deliveryDate) {
       System.out.println("The order has been created");
       return true;
   }

}
