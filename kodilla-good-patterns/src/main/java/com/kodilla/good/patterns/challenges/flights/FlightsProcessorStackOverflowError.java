package com.kodilla.good.patterns.challenges.flights;

public class FlightsProcessorStackOverflowError {
    /*

public class FlightsProcessor {

    private Flights flights = new Flights();
    private FlightsProcessor flightsProcessor = new FlightsProcessor();
    private String intermediary;

    public void findFlightsFrom(String airportName) {
        System.out.println("Direct flights from " + airportName + " to:");
        flights.getFlights().entrySet().stream()
                .filter(departureAirport -> departureAirport.getKey().toString() == airportName)
                .flatMap(arrivalAirports -> arrivalAirports.getValue().stream())
                .forEach(System.out::println);
    }

    public String findIntermediary(String airportName){

        flights.getFlights().entrySet().stream()
                .forEach(b -> {
                    if (b.getValue().toString().contains(airportName)) {
                        String intermediary = b.getKey().toString();
                        this.intermediary = intermediary;}});
                        return intermediary;
    }

    public void findFlightsTo(String airportName) {
        System.out.println("Direct flights to " + airportName + " from:");
        flights.getFlights().entrySet().stream()
                .forEach(a -> {
                    if (a.getValue().toString().contains(airportName)) {
                        System.out.println(a.getKey().toString());
                    }
                });

        System.out.println("Indirect flights to " + airportName + " from:");
        String intermediary = flightsProcessor.findIntermediary(airportName);
        flights.getFlights().entrySet().stream()
                .forEach(c -> {
                    if (c.getValue().toString().contains(intermediary)) {
                        System.out.println(c.getKey().toString() + " through " + intermediary);
                    }
                });
    }
}

*/
}
