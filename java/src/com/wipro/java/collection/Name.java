package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Name implements Comparator<Movie1> {
    // Sort by name in alphabetical order
   
    public int compare(Movie1 m1, Movie1 m2) {
        return m1.getName().compareTo(m2.getName());
    }

    public static void main(String[] args) {
        // Create a list of movies
        ArrayList<Movie1> movies = new ArrayList<>();
        movies.add(new Movie1("Force Awakens", 8.3, 2015));
        movies.add(new Movie1("Star Wars", 8.7, 1977));
        movies.add(new Movie1("Empire Strikes Back", 8.8, 1980));

        // Sort movies by name and display all
        Collections.sort(movies, new Name());
        System.out.println("\nMovies sorted by name:");
        for (Movie1 m : movies) {
            System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
        }
    }
}
