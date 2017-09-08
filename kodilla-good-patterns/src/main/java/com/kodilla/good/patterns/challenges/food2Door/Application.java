package com.kodilla.good.patterns.challenges.food2Door;

public class Application {

    public static void main (String[] args) {
       ProducerProcessor producerProcessor1 = new ProducerProcessor();
       producerProcessor1.processOrder(new ExtraFoodShop());

       ProducerProcessor producerProcessor2 = new ProducerProcessor();
       producerProcessor2.processOrder(new HealthyShop());

       ProducerProcessor producerProcessor3 = new ProducerProcessor();
       producerProcessor3.processOrder(new GlutenFreeShop());
    }
}
