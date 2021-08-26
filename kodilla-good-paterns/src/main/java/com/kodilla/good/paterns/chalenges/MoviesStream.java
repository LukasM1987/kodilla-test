package com.kodilla.good.paterns.chalenges;

import java.util.Map;
import java.util.stream.Collectors;

public class MoviesStream {

    private static final MovieStore movieStore = new MovieStore();
    private static String movies;

    public static void main(String[] args) {
        addSign();
        print();
    }

    private static void addSign() {
        movies = movieStore.getMovies().entrySet().stream()
                .flatMap(movie -> movie.getValue().stream())
                .collect(Collectors.joining(" ! "));
    }

    private static void print() {
        System.out.println(movies);
    }
}
