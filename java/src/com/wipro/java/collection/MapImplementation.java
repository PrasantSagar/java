package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;

public class MapImplementation {
    public static void main(String[] args) {
    	
        // Creating a HashMap
        Map<Integer, String> map = new HashMap<>();
 
        //  put() - Adding elements to the Map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        // Printing the original map
        System.out.println("Original Map: " + map);

        //  get() - Retrieving an element
        System.out.println("Value for key 2: " + map.get(2));

        // remove() - Removing an element
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // 4. Iterating through the Map
        System.out.println("Iterating through the map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
         System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
