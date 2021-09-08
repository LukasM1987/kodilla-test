package com.kodilla.exception.test;

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
        if (!routes.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        } else {
            if (routes.get(flight.getArrivalAirport())) {
                System.out.println("Connection is existing.");
            } else {
                System.out.println("Connection does not exist.");
            }
        }
    }
}