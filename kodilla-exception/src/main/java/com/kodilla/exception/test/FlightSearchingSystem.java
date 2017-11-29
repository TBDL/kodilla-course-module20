package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchingSystem {

    public String findFlight(Flight flight) throws RouteNotFoundException {


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


                }
        String name = "flight found";



        return name;

            }


    public static void main (String[] args){

        Flight flight1 = new Flight("Copernicus Airport Wrocław","Luxembourg Airport");

        FlightSearchingSystem search1 = new FlightSearchingSystem();

        try {
           String a =  search1.findFlight(flight1);
           System.out.println(a);
        } catch (RouteNotFoundException e) {
            System.out.println("The airport has not been found: " + e);
        } finally {
            System.out.println("Saving flight search...");
        }
    }
}



