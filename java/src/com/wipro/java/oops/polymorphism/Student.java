package com.wipro.java.oops.polymorphism;

//Parent class
public class Student {
 String name;
 int age;

 // Constructor
 public Student(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Method Overriding (To be overridden in subclass)
 public void displayInfo() {
     System.out.println("Student Name: " + name);
     System.out.println("Student Age: " + age);
 }

 // Method Overloading
 public void study() {
     System.out.println(name + " is studying.");
 }

 public void study(String subject) {
     System.out.println(name + " is studying " + subject + ".");
 }
 public static void main(String args[]) {
   }
}
