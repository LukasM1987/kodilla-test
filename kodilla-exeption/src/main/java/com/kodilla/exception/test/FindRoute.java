package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReaderException;

import java.util.HashMap;
import java.util.Map;

public class FindRoute {

    private static final Map<String, Boolean> routes = new HashMap<>();

    public Map<String, Boolean> getRoutes() {
        return routes;
    }

    public boolean findRoutes(Flight flight) throws RouteNotFoundException {
        routes.put("Warszawa", true);
        routes.put("Modlin", true);
        routes.put("Lodz", false);
        routes.put("Barcelona", true);
        routes.put("Radom", false);
        routes.put("Lublin", false);
        routes.put("Berlin", true);
        routes.put("Olsztyn", false);

        if (routes.containsKey(flight.getDepartureAirptort()) && routes.get(flight.getArrivalAirport())) {
            return true;
        } else {
            throw new RouteNotFoundException();
        }
    }
}