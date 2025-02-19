package com.wipro.java.collections.usecase2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionConverter {
    public static void main(String[] args) {
        // Step 1: Create a TreeMap and add some data
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(101, "Alice");
        treeMap.put(103, "Charlie");
        treeMap.put(102, "Bob");
        treeMap.put(105, "Eve");
        treeMap.put(104, "David");

        System.out.println("Original TreeMap (Sorted by Keys):");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Step 2: Convert TreeMap to HashMap
        HashMap<Integer, String> hashMap = new HashMap<>(treeMap);

        // Step 3: Display the HashMap
        System.out.println("\nConverted HashMap (Unordered):");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
