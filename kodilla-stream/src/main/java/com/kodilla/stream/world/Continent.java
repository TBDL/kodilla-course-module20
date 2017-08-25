package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class Continent {

    private final Set<Country> continent = new HashSet<>();

    public void addCountry(Country country) {
        continent.add(country);
    }

       public Set<Integer> getContinentPopulation(){
        return continent.stream()
                .map(country -> country.getPopulation())
                .collect(Collectors.toSet());
       }
}

