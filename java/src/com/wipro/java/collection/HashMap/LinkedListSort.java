package com.wipro.java.collection.HashMap;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Collections;

// A class that implements Comparator for sorting LinkedList elements
class CustomComparator implements Comparator<String> {

    // Implement the compare method
    @Override
    public int compare(String s1, String s2) {
        // Sort strings in alphabetical order (ascending order)
        return s1.compareTo(s2);
    }
}

public class LinkedListSort {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements to LinkedList
        list.add("Orange");
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");
        list.add("Grapes");

        // Printing original LinkedList
        System.out.println("Original LinkedList: " + list);

        // Sorting the LinkedList using Collections.sort() and a custom Comparator
        Collections.sort(list, new CustomComparator());

        // Printing the sorted LinkedList
        System.out.println("Sorted LinkedList: " + list);
    }
}