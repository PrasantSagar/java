package com.wipro.java.collection.TreeMap;

//Java Program to Demonstrate TreeMap
//using the Default Constructor

//Importing required classes
import java.util.*;
import java.util.concurrent.*;

//Main class
public class TreeMap_Map {

 // Method 1
 // To illustrate constructor<Map>
 static void Example3rdConstructor()
 {
     // Creating an empty HashMap
     Map<Integer, String> hash_map
         = new HashMap<Integer, String>(); // O(1)

     // Mapping string values to int keys using put()
     // method
     hash_map.put(10, "Geeks"); // O(1)
     hash_map.put(15, "4"); // O(1)
     hash_map.put(20, "Geeks"); // O(1)
     hash_map.put(25, "Welcomes"); // O(1)
     hash_map.put(30, "You"); // O(1)

     // Creating the TreeMap using the Map
     TreeMap<Integer, String> tree_map
         = new TreeMap<Integer, String>(
             hash_map); // O(n log n)

     // Printing the elements of TreeMap
     System.out.println("TreeMap: " + tree_map); // O(n)
 }

 // Method 2
 // Main driver method
 public static void main(String[] args)
 {
     System.out.println(
         "TreeMap using TreeMap(Map) constructor:\n");
     Example3rdConstructor();
 }
}

