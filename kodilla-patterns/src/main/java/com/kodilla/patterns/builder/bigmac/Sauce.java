package com.kodilla.patterns.builder.bigmac;

public class Sauce {
    private final String standard = "STANDARD";
    private final String thousandIslands = "THOUSAND ISLANDS";
    private final String barbecue = "BARBECUE";
    private final String sauceType;

    public Sauce(String sauceType) {
        if (sauceType.equals(standard) ||
            sauceType.equals(thousandIslands) ||
            sauceType.equals(barbecue)) {
            this.sauceType = sauceType;
        } else {
            throw new IllegalStateException("Sauce should be STANDARD, " +
                    "THOUSAND ISLANDS or BARBECUE");
        }
    }

    @Override
    public String toString() {
        return sauceType;
    }
}

