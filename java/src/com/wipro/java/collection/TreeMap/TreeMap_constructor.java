package com.wipro.java.collection.TreeMap;

// Java Program to Demonstrate TreeMap
// using the Default Constructor

// Importing required classes
import java.util.*;

public class TreeMap_constructor {

    // Method 1
    // To show TreeMap constructor
    static void Example1stConstructor()
    {
        // Creating an empty TreeMap
        TreeMap<Integer, String> tree_map
            = new TreeMap<Integer, String>(); // O(1)

        // Mapping string values to int keys using put()
        // method
        tree_map.put(10, "Geeks"); // O(log n)
        tree_map.put(15, "4"); // O(log n)
        tree_map.put(20, "Geeks"); // O(log n)
        tree_map.put(25, "Welcomes"); // O(log n)
        tree_map.put(30, "You"); // O(log n)

        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map); // O(n)
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        System.out.println(
            "TreeMap using TreeMap() constructor:\n");

        // Calling constructor
        Example1stConstructor(); // O(n log n) for put and
                                 // O(n) for printing
    }
}
