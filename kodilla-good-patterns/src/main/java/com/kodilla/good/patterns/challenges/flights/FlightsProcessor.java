package com.kodilla.good.patterns.challenges.flights;

public class FlightsProcessor {

    private Flights flights = new Flights();
    private String intermediary;

    public void findFlightsFrom(String airportName) {
        System.out.println("Direct flights from " + airportName + " to:");
        flights.getFlights().entrySet().stream()
                .filter(departureAirport -> departureAirport.getKey().toString() == airportName)
                .flatMap(arrivalAirports -> arrivalAirports.getValue().stream())
                .forEach(System.out::println);
    }

    private String findIntermediary(String airportName){

        flights.getFlights().entrySet().stream()
                .forEach(arrivalAirports -> {
                    if (arrivalAirports.getValue().toString().contains(airportName)) {
                        String intermediary = arrivalAirports.getKey().toString();
                        this.intermediary = intermediary;}});
        return intermediary;
    }

    public void findFlightsTo(String airportName) {
        System.out.println("Direct flights to " + airportName + " from:");
        flights.getFlights().entrySet().stream()
                .forEach(arrivalAirports -> {
                    if (arrivalAirports.getValue().toString().contains(airportName)) {
                        System.out.println(arrivalAirports.getKey().toString());
                    }});

        System.out.println("Indirect flights to " + airportName + " from:");
        FlightsProcessor flightsProcessor = new FlightsProcessor();
        String intermediary = flightsProcessor.findIntermediary(airportName);
        flights.getFlights().entrySet().stream()
                .forEach(arrivalAirports -> {
                    if (arrivalAirports.getValue().toString().contains(intermediary)) {
                        System.out.println(arrivalAirports.getKey().toString() + " through " + intermediary);
                    }});
    }
}



/*
OR using for each loop


    public void findFlightsTo(String airportName) {
        System.out.println("Direct flights to " + airportName + " from:");
        for (Map.Entry entry : flights.getFlights().entrySet()) {
            if (entry.getValue().toString().contains(airportName)) {
                System.out.println(entry.getKey().toString());
            }
        }

        System.out.println("Indirect flights to " + airportName + " from:");
        for (Map.Entry entry2 : flights.getFlights().entrySet()) {
            if (entry2.getValue().toString().contains(airportName)) {
                String intermediary = entry2.getKey().toString();

                for (Map.Entry entry3 : flights.getFlights().entrySet()) {
                    if (entry3.getValue().toString().contains(intermediary)) {
                        System.out.println(entry3.getKey().toString() + " through " + intermediary);
                    }
                }
            }
        }
    }
}

*/