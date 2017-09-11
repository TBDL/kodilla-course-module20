package com.kodilla.good.patterns.challenges.flights;

public class Application {

    public static void main (String [] args) {

        FlightsProcessor flightsProcessor = new FlightsProcessor();

//        Select one of the below airports:
//        Wroclaw
//        Cracow
//        Warsaw

        flightsProcessor.findFlightsFrom("Warsaw");
        flightsProcessor.findFlightsTo("Wroclaw");

    }
}
