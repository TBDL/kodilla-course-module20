package com.kodilla.good.patterns.challenges.flights;

import java.util.*;

public final class Flights {

    public final Map<Airport, List<Airport>> getFlights() {

        final Map<Airport, List<Airport>> flights = new HashMap<>();

        Airports airports = new Airports();
        Airport wroclaw = airports.getDepartureAirports().get(0);
        Airport cracow = airports.getDepartureAirports().get(1);
        Airport warsaw = airports.getDepartureAirports().get(2);

        List<Airport> flightsFromWroclaw = airports.getFlightsFromWroclaw();
        List<Airport> flightsFromCracow = airports.getFlightsFromCracow();
        List<Airport> flightsFromWarsaw = airports.getFlightsFromWarsaw();

        flights.put(wroclaw, flightsFromWroclaw);
        flights.put(cracow, flightsFromCracow);
        flights.put(warsaw, flightsFromWarsaw);

        return new HashMap<>(flights);
    }
}