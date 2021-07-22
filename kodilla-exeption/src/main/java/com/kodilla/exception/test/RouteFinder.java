package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReaderException;

import java.util.HashMap;
import java.util.Map;

public class RouteFinder {

    private static final Map<String, Boolean> routes = new HashMap<>();

    public void findRoutes(Flight flight) throws RouteNotFoundException {
        routes.put("Warszawa", true);
        routes.put("Modlin", true);
        routes.put("Lodz", false);
        routes.put("Barcelona", true);
        routes.put("Radom", false);
        routes.put("Lublin", false);
        routes.put("Berlin", true);
        routes.put("Olsztyn", false);

        if ((routes.containsKey(flight.getDepartureAirptort()) && (routes.containsKey(flight.getArrivalAirport())))) {
            if ((routes.get(flight.getDepartureAirptort()) && (routes.get(flight.getArrivalAirport())))) {
                System.out.println("This connection is existing, have a nice fly.");
            } else {
                throw new RouteNotFoundException();
            }
        } else {
            System.out.println("Airport does not exist.");
        }
    }
}