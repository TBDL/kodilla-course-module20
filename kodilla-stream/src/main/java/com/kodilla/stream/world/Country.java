package com.kodilla.stream.world;


public final class Country {


    private final String name;
    private final int population;


    public Country(final String name, final int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }


    }
}


