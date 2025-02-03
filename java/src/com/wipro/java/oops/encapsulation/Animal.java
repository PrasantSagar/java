package com.wipro.java.oops.encapsulation;

public class Animal {
    
    // Instance variables (private access)
    private String name;
    private String species;
    private float weight;  // 
    private String color;
    
    // Constructor to initialize the instance variables
    public Animal(String name, String species, float weight, String color) { 
        super();  // Calls the root parent class (Object) constructor
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.color = color;
    }
    
    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter method for species
    public String getSpecies() {
        return species;
    }

    // Setter method for species
    public void setSpecies(String species) {
        this.species = species;
    }

    // Getter method for weight
    public float getWeight() {  // 
        return weight;
    }

    // Setter method for weight with validation
    public void setWeight(float weight) {  
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be positive");
        }
    }

    // Getter method for color
    public String getColor() {
        return color;
    }

    // Setter method for color
    public void setColor(String color) {
        this.color = color;
    }

    // Main method to test the Animal class
    public static void main(String[] args) {
        
        // Create an Animal object with initial values
        Animal a1 = new Animal("Leo", "Lion", 190.5f, "Golden");  
        
        // Print the initial details of the animal
        System.out.println("Name: " + a1.getName());
        System.out.println("Species: " + a1.getSpecies());
        System.out.println("Weight: " + a1.getWeight() + " kg");
        System.out.println("Color: " + a1.getColor());
        
        // Change the weight and print the updated details
        a1.setWeight(100.0f);  
        System.out.println("Updated Weight: " + a1.getWeight() + " kg");
        
        // Setting an invalid weight
        a1.setWeight(-1.0f);  
        
        a1.setColor("Brown");
        a1.setName("Simba");
        System.out.println("Updated Name: " + a1.getName());
        System.out.println("Updated Color: " + a1.getColor());
    }
}
