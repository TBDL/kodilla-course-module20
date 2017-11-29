package com.kodilla.patterns.builder.bigmac;

public class Ingredient {
    private final String salad  = "SALAD";
    private final String onion = "ONION";
    private final String bacon = "BACON";
    private final String cucumbers = "CUCUMBERS";
    private final String chiliPeppers = "CHILI PEPPERS";
    private final String champignons = "CHAMPIGNONS";
    private final String shrimps = "SHRIMPS";
    private final String cheese = "CHEESE";
    private final String ingredient;

    public Ingredient(String ingredient) {
        if (ingredient.equals(salad) ||
            ingredient.equals(onion) ||
            ingredient.equals(bacon) ||
            ingredient.equals(cucumbers) ||
            ingredient.equals(chiliPeppers) ||
            ingredient.equals(champignons) ||
            ingredient.equals(shrimps) ||
            ingredient.equals(cheese)) {
            this.ingredient = ingredient;
        } else {
            throw new IllegalStateException("Select from the available ingredients: " +
                    "SALAD, ONION, BACON, CUCUMBERS, CHILI PEPPERS, CHAMPIGNONS, SHRIMPS, CHEESE");
        }
    }

    @Override
    public String toString() {
        return ingredient;
    }
}

