package com.kodilla.good.patterns.challenges.flights;

public class FlightsProcessor {

    Flights flights = new Flights();


    public void findFlightsFrom(String airportName) {
        System.out.println("Flight from " + airportName + ":");
        flights.getFlights().entrySet().stream()
                .filter(departureAirport -> departureAirport.getKey().toString() == airportName)
                .flatMap(arrivalAirports -> arrivalAirports.getValue().stream())
                .forEach( System.out::println);
    }

    public void findFlightsTo(String airportName) {
        System.out.println("Flight to " + airportName + ":");
        flights.getFlights().entrySet().stream()
                .flatMap(arrivalAirports -> arrivalAirports.getValue().stream())




    }
}
