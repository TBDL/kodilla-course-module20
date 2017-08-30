package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchingSystem {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> openAirports = new HashMap<>();

        openAirports.put("Copernicus Airport Wrocław", true);
        openAirports.put("Edinburgh Airport", true);
        openAirports.put("Luxembourg Airport", false);

        for(Map.Entry<String, Boolean> entry : openAirports.entrySet()) {

            if(! openAirports.containsKey(flight.getArrivalAirport())){
                throw new RouteNotFoundException();
            }

            if(! openAirports.containsKey(flight.getDepartureAirport())){
                throw new RouteNotFoundException();
            }

            if (entry.getKey() == flight.getArrivalAirport() && entry.getValue()) {
                    System.out.println("Flight to " + flight.getArrivalAirport() + " has been found");
                } else {
                    System.out.println("Flight to " + flight.getArrivalAirport() + " has not been found");
                }
            }
        }

    public static void main (String[] args){

        Flight flight1 = new Flight("Copernicus Airport Wrocław","typing error");

        FlightSearchingSystem search1 = new FlightSearchingSystem();

        try {
            search1.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("The airport has not been found: " + e);
        } finally {
            System.out.println("Saving flight search...");
        }
    }
}



