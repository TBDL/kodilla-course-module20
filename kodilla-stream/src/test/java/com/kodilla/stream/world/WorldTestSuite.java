package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country country1 = new Country("Poland", 35000000);
        Country country2 = new Country("Japan", 127000000);
        Country country3 = new Country("China", 1300000000);
        Country country4 = new Country("Canada", 36000000);
        Country country5 = new Country("Brazil", 207000000);
        Country country6 = new Country("Mexico", 127000000);

        BigDecimal worldPopulation;
        worldPopulation = BigDecimal.valueOf(
                            (country1.getPopulation() + country2.getPopulation() +
                            country3.getPopulation() + country4.getPopulation() +
                            country5.getPopulation() + country6.getPopulation()));

        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent americas = new Continent();
        World world = new World();

        //When
        europe.addCountry(country1);
        asia.addCountry(country2);
        asia.addCountry(country3);
        americas.addCountry(country4);
        americas.addCountry(country5);
        americas.addCountry(country6);

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(americas);

        //Then
        Assert.assertEquals(worldPopulation, world.getPeopleQuantity());

    }
}