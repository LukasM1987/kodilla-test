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
        double average = 0;
        for (Map.Entry<String, Double> item : temperatures.getTemperatures().entrySet()) {
            average = average + item.getValue();
        }
        return average / temperaturesMap.size();
    }

    public double medianTemperature(Map<String, Double> values) {
        List<Double> medianTemeprature = new ArrayList<>();
        double modulo = (double) values.size() % 2;
        if (modulo == 0) {
            for (Map.Entry<String, Double> item : temperatures.getTemperatures().entrySet()) {
                medianTemeprature.add(item.getValue());
            }
            Collections.sort(medianTemeprature);
            double value1 = medianTemeprature.get((medianTemeprature.size() / 2) - 1);
            double value2 = medianTemeprature.get((medianTemeprature.size() / 2));
            return (value1 + value2) / 2;
        } else {
            for (Map.Entry<String, Double> item : temperatures.getTemperatures().entrySet()) {
                medianTemeprature.add(item.getValue());
            }
            Collections.sort(medianTemeprature);
            return medianTemeprature.get((medianTemeprature.size() - 1) / 2);
        }
    }
}
