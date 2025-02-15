package com.wipro.java.collection.TreeMap;

//Java Program to Demonstrate TreeMap
//using the SortedMap Constructor

//Importing required classes
import java.util.*;
import java.util.concurrent.*;

//Main class
public class TreeMap_Sorted {

 // Method
 // To show TreeMap(SortedMap) constructor
 static void Example4thConstructor()
 {
     // Creating a SortedMap
     SortedMap<Integer, String> sorted_map
         = new ConcurrentSkipListMap<Integer,
                                     String>(); // O(1)

     // Mapping string values to int keys using put()
     // method
     sorted_map.put(10, "Geeks"); // O(log n)
     sorted_map.put(15, "4"); // O(log n)
     sorted_map.put(20, "Geeks"); // O(log n)
     sorted_map.put(25, "Welcomes"); // O(log n)
     sorted_map.put(30, "You"); // O(log n)

     // Creating the TreeMap using the SortedMap
     TreeMap<Integer, String> tree_map
         = new TreeMap<Integer, String>(
             sorted_map); // O(n log n)

     // Printing the elements of TreeMap
     System.out.println("TreeMap: " + tree_map); // O(n)
 }

 // Method 2
 // Main driver method
 public static void main(String[] args)
 {
     System.out.println(
         "TreeMap using TreeMap(SortedMap) constructor:\n");
     Example4thConstructor(); // O(n log n) for put and
                              // O(n) for printing
 }
}

