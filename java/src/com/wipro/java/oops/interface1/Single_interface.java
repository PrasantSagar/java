package com.wipro.java.oops.interface1;

//Define the single interface
interface Animal {
 void sound();  
}

//Implement the interface in a class
class Dog implements Animal {
 public void sound() {
     System.out.println("Bark");
 }
}

class Cat implements Animal {
 public void sound() {
     System.out.println("Meow");
 }
}

// test the interface implementation
public class Single_interface {
 public static void main(String[] args) {
     Animal dog = new Dog();
     Animal cat = new Cat();
     
     dog.sound();
     cat.sound();  
 }
}

