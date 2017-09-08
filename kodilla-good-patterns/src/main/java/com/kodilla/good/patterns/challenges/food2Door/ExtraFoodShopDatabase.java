package com.kodilla.good.patterns.challenges.food2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShopDatabase {
    public boolean result;

    public boolean checkSuppliers(String supplier) {
        ArrayList<String> suppliers = new ArrayList<>();
        suppliers.add("supplier1");
        return suppliers.contains(supplier);
    }

    public boolean checkProductsAndQuantities(String product, Integer quantity) {
        HashMap<String, Integer> productsAndQuantities = new HashMap<>();
        productsAndQuantities.put("potato", 5000000);
        for (Map.Entry<String, Integer> entry : productsAndQuantities.entrySet()) {
            boolean result = ((entry.getKey().contains(product)) && (entry.getValue() >= quantity));
            this.result = result;
        }
        return result;
    }
}
