package com.wipro.java.collection.TreeMap;

//Java Program to Illustrate Operations in TreeMap
//Such as Creation, insertion
//searching, and traversal

//Importing required classes
import java.util.*;
import java.util.concurrent.*;

//Main class
//Implementation of TreeMap
public class TreeMap_Operations {

 // Declaring a TreeMap
 static TreeMap<Integer, String> tree_map;

 // Method 1
 // To create TreeMap
 static void create()
 {
     // Creating an empty TreeMap
     tree_map = new TreeMap<Integer, String>(); // O(1)
     System.out.println("TreeMap successfully created");
 }

 // Method 2
 // To Insert values in the TreeMap
 static void insert()
 {
     // Mapping string values to int keys using put()
     // method
     tree_map.put(10, "Geeks"); // O(log n)
     tree_map.put(15, "4"); // O(log n)
     tree_map.put(20, "Geeks"); // O(log n)
     tree_map.put(25, "Welcomes"); // O(log n)
     tree_map.put(30, "You"); // O(log n)
     System.out.println(
         "\nElements successfully inserted in the TreeMap");
 }

 // Method 3
 // To search a key in TreeMap
 static void search(int key)
 {
     System.out.println(
         "\nIs key \"" + key + "\" present? "
         + tree_map.containsKey(key)); // O(log n)
 }

 // Method 4
 // To search a value in TreeMap
 static void search(String value)
 {
     System.out.println(
         "\nIs value \"" + value + "\" present? "
         + tree_map.containsValue(value)); // O(n)
 }

 // Method 5
 // To display the elements in TreeMap
 static void display()
 {
     System.out.println("\nDisplaying the TreeMap:");
     System.out.println("TreeMap: " + tree_map); // O(n)
 }

 // Method 6
 // To traverse TreeMap
 static void traverse()
 {
     System.out.println("\nTraversing the TreeMap:");
     for (Map.Entry<Integer, String> e :
          tree_map.entrySet()) // O(n)
         System.out.println(e.getKey() + " "
                            + e.getValue());
 }

 // Method 6
 // Main driver method
 public static void main(String[] args)
 {
     // Calling above defined methods inside main()
     create();
     insert();
     search(50);
     search("Geeks");
     display();
     traverse();
 }
}

