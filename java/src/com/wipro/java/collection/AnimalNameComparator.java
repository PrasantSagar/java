package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnimalNameComparator implements Comparator<Animal> {
    // Sort animals by name in alphabetical order
	
    public int compare(Animal a1, Animal a2) {
        return a1.getName().compareTo(a2.getName());  // Compare animals by name
    }

    // Main method to demonstrate Comparator (sort by name)
    public static void main(String[] args) {
        // Create a list of animals
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion", 5));
        animals.add(new Animal("Elephant", 10));
        animals.add(new Animal("Zebra", 4));
        animals.add(new Animal("Tiger", 3));
        animals.add(new Animal("Giraffe", 7));

        // Sort animals by name (using Comparator) and display all
        Collections.sort(animals, new AnimalNameComparator());
        System.out.println("\nAnimals sorted by name (Alphabetically):");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
