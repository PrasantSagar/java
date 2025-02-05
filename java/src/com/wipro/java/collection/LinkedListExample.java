package com.wipro.java.collection;
import java.util.LinkedList; // Importing LinkedList class

public class LinkedListExample { 
    public static void main(String[] args) {
    	
        // Creating a LinkedList of Integer type
        LinkedList<Integer> ll = new LinkedList<>();

             int n=10;
        // Adding elements from 1 to n in the LinkedList
        for (int i = 1; i <= n; i++) {
            ll.add(i);
        }

        // Printing elements
        System.out.println("Original LinkedList: " + ll);

        // Removing element at index 3 (0-based index)
        if (ll.size() > 3) { // Ensuring index 3 exists before removing
            ll.remove(3);
        }

        // Displaying the list after deletion
        System.out.println("After removing element at index 3: " + ll);

        // Printing elements one by one
        System.out.print("Elements after removal: ");
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
    }
}
