package com.kodilla.good.paterns.flights;
import java.time.LocalDate;
import java.util.Objects;

public class Flight {

    private String departureCity;
    private String arrivalCity;
    private LocalDate flightDay;

    public Flight(String departureCity, String arrivalCity, LocalDate flightDay) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.flightDay = flightDay;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public String toString() {
        return "Your flight from: " + departureCity + " to " + arrivalCity + " in day: " + flightDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureCity, flight.departureCity) && Objects.equals(arrivalCity, flight.arrivalCity) && Objects.equals(flightDay, flight.flightDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureCity, arrivalCity, flightDay);
    }
}
