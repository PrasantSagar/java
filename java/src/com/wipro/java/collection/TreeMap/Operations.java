package com.wipro.java.collection.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Operations {
    public static void main(String[] args)
    {
        Map<String, Integer> treeMap = new TreeMap<>();

        // Adding elements to the tree map
        treeMap.put("A", 1); // O(log n)
        treeMap.put("C", 3); // O(log n)
        treeMap.put("B", 2); // O(log n)

        // Getting values from the tree map
        int valueA = treeMap.get("A"); // O(log n)
        System.out.println("Value of A: " + valueA);

        // Removing elements from the tree map
        treeMap.remove("B"); // O(log n)

        // Iterating over the elements of the tree map
        for (String key : treeMap.keySet()) { // O(n)
            System.out.println(
                "Key: " + key + ", Value: "
                + treeMap.get(key)); // O(log n) for each
                                     // get operation
        }
    }
}
