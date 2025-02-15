package com.wipro.java.collection.TreeMap;

//Java Program to Demonstrate TreeMap
//using Comparator Constructor

//Importing required classes
import java.util.*;
import java.util.concurrent.*;

//Class 1
//Helper class representing Student
class Student {
 int rollno;
 String name, address;

 public Student(int rollno, String name, String address)
 {
     this.rollno = rollno;
     this.name = name;
     this.address = address;
 }

 public String toString()
 {
     return this.rollno + " " + this.name + " "
         + this.address;
 }
}

//Class 2
//Helper class - Comparator implementation
class Sortbyroll implements Comparator<Student> {
 public int compare(Student a, Student b)
 {
     return a.rollno - b.rollno;
 }
}

//Class 3
//Main class
public class TreeMapComparator {

 static void Example2ndConstructor()
 {
     TreeMap<Student, Integer> tree_map
         = new TreeMap<Student, Integer>(
             new Sortbyroll()); // O(1)

     tree_map.put(new Student(111, "bbbb", "london"),
                  2); // O(log n)
     tree_map.put(new Student(131, "aaaa", "nyc"),
                  3); // O(log n)
     tree_map.put(new Student(121, "cccc", "jaipur"),
                  1); // O(log n)

     System.out.println("TreeMap: " + tree_map); // O(n)
 }

 public static void main(String[] args)
 {
     System.out.println(
         "TreeMap using TreeMap(Comparator) constructor:\n");
     Example2ndConstructor(); // O(n log n) for put and
                              // O(n) for printing
 }
}

