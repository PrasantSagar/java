package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Rate implements Comparator<Movie1> {
    // Sort by rating in descending order
    @Override
    public int compare(Movie1 m1, Movie1 m2) {
        return Double.compare(m2.getRating(), m1.getRating()); 
    }

    public static void main(String[] args) {
        // Create a list of movies
        ArrayList<Movie1> movies = new ArrayList<>();
        movies.add(new Movie1("Force Awakens", 8.3, 2015));
        movies.add(new Movie1("Star Wars", 8.7, 1977));
        movies.add(new Movie1("Empire Strikes Back", 8.8, 1980));

        // Sort movies by rating and display all
        Collections.sort(movies, new Rate());
        System.out.println("Movies sorted by rating (Descending):");
        for (Movie1 m : movies) {
            System.out.println(m.getRating() + " " + m.getName() + " " + m.getYear());
        }
    }
}
