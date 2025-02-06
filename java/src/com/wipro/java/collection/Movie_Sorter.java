package com.wipro.java.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// Movie class implementing Comparable interface
class Movie implements Comparable<Movie> {
    private String name;
    private double r;
    private int y;

    // Constructor
    public Movie(String name, double r, int y) {
        this.name = name;
        this.r = r;
        this.y = y;
    }

    // compareTo method to sort by year in ascending order
    
    public int compareTo(Movie m) {
        if (this.r < m.r) {
            return -1;
        } else if (this.r > m.r) {
            return 1;
        } else {
            return 0;
        }
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    public double getR() {
        return r;
    }
    public int getY() {
        return y;
    }
}

public class Movie_Sorter {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Interstellar", 8.6, 2014));
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("Dunkirk", 7.9, 2017));

        // Sorting movies using Comparable (based on year in ascending order)
        Collections.sort(movies);

        // Display sorted movies
        System.out.println("Movies sorted by year (ascending order):");
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " - Rating: " + movie.getR() + " - Year: " + movie.getY());
        }
    }
}
