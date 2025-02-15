package com.wipro.java.collection.TreeMap;

//Java Program to Illustrate Addition of Elements
//in TreeMap using put() Method

//Importing required classes
import java.util.*;

//Main class
class Add {

 // Main driver method
 public static void main(String args[])
 {
     // Default Initialization of a TreeMap
     TreeMap tm1 = new TreeMap(); // O(1)

     // Inserting the elements in TreeMap using put()
     // method
     tm1.put(3, "Geeks"); // O(log n)
     tm1.put(2, "For"); // O(log n)
     tm1.put(1, "Geeks"); // O(log n)

     // Initialization of a TreeMap using Generics
     TreeMap<Integer, String> tm2
         = new TreeMap<Integer, String>(); // O(1)

     // Inserting the elements in TreeMap again using
     // put() method
     tm2.put(new Integer(3), "Geeks"); // O(log n)
     tm2.put(new Integer(2), "For"); // O(log n)
     tm2.put(new Integer(1), "Geeks"); // O(log n)

     // Printing the elements of both TreeMaps
     // Map 1
     System.out.println(tm1); // O(n)
     // Map 2
     System.out.println(tm2); // O(n)
 }
}
