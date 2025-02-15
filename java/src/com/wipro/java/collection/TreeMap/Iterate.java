package com.wipro.java.collection.TreeMap;

//Java Program to Illustrate Iterating over TreeMap
//using

//Importing required classes
import java.util.*;

//Main class
class Iterate {

 // Main driver method
 public static void main(String args[]) {
     // Initialization of a TreeMap using Generics
     TreeMap<Integer, String> tm = new TreeMap<Integer, String>(); // O(1)

     // Inserting the elements using put() method
     tm.put(3, "Geeks"); // O(log n)
     tm.put(2, "For");   // O(log n)
     tm.put(1, "Geeks"); // O(log n)

     // For-each loop for traversal over Map via entrySet() Method
     for (Map.Entry mapElement : tm.entrySet()) {
         int key = (int)mapElement.getKey(); // O(1)
         String value = (String)mapElement.getValue(); // O(1)
         // Printing the key and value
         System.out.println(key + " : " + value); // O(1)
     }
 }
}

