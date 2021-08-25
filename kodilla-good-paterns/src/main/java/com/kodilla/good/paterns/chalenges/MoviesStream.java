package com.kodilla.good.paterns.chalenges;

import java.util.Map;
import java.util.stream.Collectors;

public class MoviesStream {

    private static String movies;

    public static void main(String[] args) {
        print();
    }

    private static void addSign() {
        MovieStore movieStore = new MovieStore();
        movies = movieStore.getMovies().entrySet().stream()
                .map(Map.Entry::getValue)
                .map(sign -> String.join(" ! ", sign))
                .collect(Collectors.joining());
    }

    private static void print() {
        addSign();
        System.out.println(movies);
    }
}
