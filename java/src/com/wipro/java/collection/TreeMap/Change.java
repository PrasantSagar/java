package com.wipro.java.collection.TreeMap;

//Java program to Illustrate Updation of Elements
//in TreeMap using put() Method

//Importing required classes
import java.util.*;

//Main class
class Change {

 // Main driver method
 public static void main(String args[])
 {
     // Initialization of a TreeMap using Generics
     TreeMap<Integer, String> tm
         = new TreeMap<Integer, String>(); // O(1)

     // Inserting the elements in Map using put() method
     tm.put(3, "Geeks"); // O(log n)
     tm.put(2, "Geeks"); // O(log n)
     tm.put(1, "Geeks"); // O(log n)

     // Print all current elements in map
     System.out.println(tm); // O(n)

     // Inserting the element at specified corresponding
     // to specified key
     tm.put(2, "For"); // O(log n)

     // Printing the updated elements of Map
     System.out.println(tm); // O(n)
 }
}

