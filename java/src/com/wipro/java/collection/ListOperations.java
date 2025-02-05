package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        // Creating two lists
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);

        List<Integer> l2 = new ArrayList<>();
        l2.add(40);
        l2.add(50);

        // Add all elements of l2 at index 1 in l1
        l1.addAll(1, l2);
        System.out.println("After addAll(1, l2): " + l1); 
        // Output: [10, 40, 50, 20, 30]

        // Remove element at index 1
        l1.remove(1);
        System.out.println("After remove(1): " + l1); 
        // Output: [10, 50, 20, 30]

        // Set index 0 to value 5
        l1.set(0, 5);
        System.out.println("After set(0, 5): " + l1); 
        // Output: [5, 50, 20, 30]
    }
}
