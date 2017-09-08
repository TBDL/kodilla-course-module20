package com.kodilla.good.patterns.challenges.flights;

public class Application {

  //  Znalezienie wszystkich lotów do danego miasta
  //  Znalezienie lotów poprzez inne miasto np. lot z Gdańska przez Kraków do Wrocławia

    public static void main (String [] args) {

        FlightsProcessor flightsProcessor = new FlightsProcessor();

//        Select one of the below airports:
//        Wroclaw
//        Cracow
//        Warsaw

        flightsProcessor.findFlightsFrom("Wroclaw");
        flightsProcessor.findFlightsTo("Warsaw");

    }
}
