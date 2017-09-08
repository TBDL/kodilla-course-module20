package com.kodilla.good.patterns.challenges.productOrderServices;

public class SellRequestRetriever {

    public SellRequest retrieve() {

        User user = new User("John", "Wekl");
        Order order = new Order(1, "soap White Deer", 10, 7.99, "PLN");
        OrderDate orderDate = new OrderDate(2017, 10, 12);
        DeliveryDate deliveryDate = new DeliveryDate(2017, 10, 22);

        return new SellRequest(user, order, orderDate, deliveryDate);

    }

}
