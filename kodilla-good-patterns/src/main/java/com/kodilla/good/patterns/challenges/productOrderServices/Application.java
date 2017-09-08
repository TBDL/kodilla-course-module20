package com.kodilla.good.patterns.challenges.productOrderServices;

public class Application {

    public static void main(String[] args) {

        SellRequestRetriever sellRequestRetriever = new SellRequestRetriever();
        SellRequest sellRequest = sellRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(),
                new CosmeticsSellingService(),
                new CosmeticsRepository());
        productOrderService.process(sellRequest);

    }
}
