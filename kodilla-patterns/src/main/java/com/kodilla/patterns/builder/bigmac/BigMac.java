package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {
    private final Roll roll;
    private final int burgers;
    private final Sauce sauce;
    private final List<Ingredient> ingredients;

    public static class BigMacBuilder {
        private Roll roll;
        private int burgers;
        private Sauce sauce;
        private List<Ingredient> ingredients = new ArrayList<>();

        public BigMacBuilder roll(Roll roll) {
            this.roll = roll;
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredient(Ingredient ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(roll, burgers, sauce, ingredients);
        }
    }

    private BigMac(final Roll roll, final int burgers, final Sauce sauce,
                   List<Ingredient> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public List<Ingredient> getIngredients() {
            return ingredients;
        }

    @Override
    public String toString() {
        return "<=== Your BigMac ===>" + "\n" +
                "roll: " + roll  + "\n" +
                "amount of burgers: " + burgers  + "\n" +
                "sauce: " + sauce  + "\n" +
                "ingredients: " + ingredients  + "\n" +
                "<===================>";
    }
}

