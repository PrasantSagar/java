package com.wipro.java.collection.TreeMap;

//Java program to Illustrate Removal of Elements
//in TreeMap using remove() Method

//Importing required classes
import java.util.*;

//Main class
class Remove {

 // Main driver method
 public static void main(String args[])
 {
     // Initialization of a TreeMap using Generics
     TreeMap<Integer, String> tm
         = new TreeMap<Integer, String>(); // O(1)

     // Inserting the elements using put() method
     tm.put(3, "Geeks"); // O(log n)
     tm.put(2, "Geeks"); // O(log n)
     tm.put(1, "Geeks"); // O(log n)
     tm.put(4, "For"); // O(log n)

     // Printing all elements of Map
     System.out.println(tm); // O(n)

     // Removing the element corresponding to key
     tm.remove(4); // O(log n)

     // Printing updated TreeMap
     System.out.println(tm); // O(n)
 }
}

