package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();
        for (Map.Entry<String, Double> item : temperatures.getTemperatures().entrySet()) {
            resultMap.put(item.getKey(), item.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperature(Map<String, Double> temperaturesMap) {
        Map<String, Double> resultMap = temperaturesMap;
        double average = 0;
        for (Map.Entry<String, Double> item : temperatures.getTemperatures().entrySet()) {
            average = average + item.getValue();
        }
        return average / resultMap.size();
    }

    public double medianTemperature() {
        List<Double> medianTemeprature = new ArrayList<>();
        for (Map.Entry<String, Double> item : temperatures.getTemperatures().entrySet()) {
            medianTemeprature.add(item.getValue());
        }
        Collections.sort(medianTemeprature);
        return (medianTemeprature.get((medianTemeprature.size() - 1) / 2));
    }

}
