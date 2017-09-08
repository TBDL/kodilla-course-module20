package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class Airports {


    public List<Airport> getDepartureAirports() {
        List<Airport> airports = new ArrayList<>();
        airports.add(new Airport ("Wroclaw"));
        airports.add(new Airport ("Cracow"));
        airports.add(new Airport ("Warsaw"));
        return airports;
    }

    public List<Airport> getFlightsFromWroclaw() {
        List<Airport> airports = new ArrayList<>();
        airports.add(new Airport ("Cracow"));
        airports.add(new Airport ("Warsaw"));
        return airports;


    }

    public List<Airport> getFlightsFromCracow() {
        List<Airport> airports = new ArrayList<>();
        airports.add(new Airport ("Wroclaw"));
        airports.add(new Airport ("Warsaw"));
        return airports;
    }

    public List<Airport> getFlightsFromWarsaw() {
        List<Airport> airports = new ArrayList<>();
        airports.add(new Airport ("Wroclaw"));
        return airports;
    }
}
