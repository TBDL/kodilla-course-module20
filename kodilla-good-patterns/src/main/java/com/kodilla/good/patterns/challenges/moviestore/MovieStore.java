package com.kodilla.good.patterns.challenges.moviestore;
import java.util.*;
import java.util.stream.Collectors;

public class MovieStore {

    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny człowiek");
        ironManTranslations.add("Iron man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTtlesWithTranslations = new HashMap<>();
        booksTtlesWithTranslations.put("IM", ironManTranslations);
        booksTtlesWithTranslations.put("AV", avengersTranslations);
        booksTtlesWithTranslations.put("FL", flashTranslations);


        return booksTtlesWithTranslations;
    }

    public static void main (String [] args) {

        MovieStore movieStore = new MovieStore();
        String titles = movieStore.getMovies().entrySet().stream()
                .flatMap(a -> a.getValue().stream())
                .collect(Collectors.joining(", "));
        System.out.println(titles);

    }
}
