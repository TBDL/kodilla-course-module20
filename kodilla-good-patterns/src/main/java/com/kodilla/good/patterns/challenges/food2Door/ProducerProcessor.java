package com.kodilla.good.patterns.challenges.food2Door;

public class ProducerProcessor {

    OrderRetriever orderRetriever = new OrderRetriever();
    Order order = orderRetriever.retrieve();

    public void processOrder(Producer producer) {
         producer.process(order);
    }
}
