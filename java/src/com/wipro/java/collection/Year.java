package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Year implements Comparator<Movie1> {
    // Sort by year in ascending order
    
    public int compare(Movie1 m1, Movie1 m2) {
        return Integer.compare(m1.getYear(), m2.getYear());
    }

    public static void main(String[] args) {
        // Create a list of movies
        ArrayList<Movie1> movies = new ArrayList<>();
        movies.add(new Movie1("Force Awakens", 8.3, 2015));
        movies.add(new Movie1("Star Wars", 8.7, 1977));
        movies.add(new Movie1("Empire Strikes Back", 8.8, 1980));

        // Sort movies by year (ascending) and display all
        Collections.sort(movies, new Year());
        System.out.println("\nMovies sorted by year (Ascending):");
        for (Movie1 m : movies) {
            System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
        }
    }
}
