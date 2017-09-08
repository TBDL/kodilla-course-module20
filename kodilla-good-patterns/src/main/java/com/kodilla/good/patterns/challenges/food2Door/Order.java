package com.kodilla.good.patterns.challenges.food2Door;

public class Order {
    int orderNumber;
    String supplier;
    String product;
    int quantity;

    public Order(int orderNumber, String supplier, String product, int quantity) {
        this.orderNumber = orderNumber;
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
    }

    public int getOrderNumber() { return orderNumber;}

    public String getSupplier() {
        return supplier;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
