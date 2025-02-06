package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Animal implements Comparable<Animal> {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implementing compareTo() method to compare by age
    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.age, other.age);  // Compare animals by age
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + "}";
    }

    // Main method to demonstrate Comparable (sort by age)
    public static void main(String[] args) {
        // Create a list of animals
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion", 5));
        animals.add(new Animal("Elephant", 10));
        animals.add(new Animal("Zebra", 4));
        animals.add(new Animal("Tiger", 3));
        animals.add(new Animal("Giraffe", 7));

        // Sort animals by age (using Comparable) and display all
        Collections.sort(animals);
        System.out.println("Animals sorted by age (Ascending):");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
