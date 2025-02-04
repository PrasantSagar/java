package com.wipro.java.oops.polymorphism;

//Subclass extending Student
public class CollegeStudent extends Student {
 String major;

 // Constructor
 public CollegeStudent(String name, int age, String major) {
     super(name, age); // Call parent constructor
     this.major = major;
 }

 // Overriding method 
 @Override
 public void displayInfo() {
     super.displayInfo();  // Calls the parent method
     System.out.println("Major: " + major);
 }

 // Main method 
 public static void main(String[] args) {
   
     Student s1 = new Student("Prasant", 23);
     s1.study();
     s1.study("Java Programming");

     System.out.println("--");

     Student s2 = new CollegeStudent("Sagar", 23, "Computer Science");
     s2.displayInfo(); // Calls overridden method in CollegeStudent class
 }
}
