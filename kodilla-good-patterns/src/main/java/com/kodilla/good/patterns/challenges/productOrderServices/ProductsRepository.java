package com.kodilla.good.patterns.challenges.productOrderServices;

public interface ProductsRepository {

    boolean createOrder(User user, Order order, OrderDate orderDate, DeliveryDate deliveryDate);
}
