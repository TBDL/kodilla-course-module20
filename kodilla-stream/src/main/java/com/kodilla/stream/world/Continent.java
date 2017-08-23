package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent {

    private final Set<Country> europe = new HashSet<>();
    private final Set<Country> asia = new HashSet<>();
    private final Set<Country> americas = new HashSet<>();



    public void addEuropeanCountry() {
        europe.add(new Country("Poland", 35000000)); //to wyjeb- ma bycw testach
        europe.add(new Country("Germany", 82000000));
        europe.add(new Country("Switzerland", 8000000));
    }

    public void addAsianCountry() {
        asia.add(new Country("Russia", 144000000));
        asia.add(new Country("Japan", 127000000));
        asia.add(new Country("China", 1300000000));
    }

    public void addAmericanCountry() {
        americas.add(new Country("Canada", 36000000));
        americas.add(new Country("Brazil", 207000000));
        americas.add(new Country("Mexico", 127000000));

    }

    public Set<Country> getEuropePopulation(){
        return europe;
    }

    public Set<Country> getAsiaPopulation(){
        return asia;
    }

    public Set<Country> getAmericasPopulation(){
        return americas;
    }

}