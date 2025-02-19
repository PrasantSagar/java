package com.wipro.java.collection.HashMap;

import java.util.*;

public class StudentHashMap {
    public static void main(String[] args) {
        // HashMap to store Roll Number as Key and List of Names as Value
        HashMap<Integer, List<String>> studentMap = new HashMap<>();

        // Adding students with duplicate roll numbers and names
        addStudent(studentMap, 101, "Aarav");
        addStudent(studentMap, 102, "Bhavya");
        addStudent(studentMap, 103, "Charvi");
        addStudent(studentMap, 101, "Aarav"); // Duplicate Name with same Roll No
        addStudent(studentMap, 104, "Dev");
        addStudent(studentMap, 105, "Eshan");
        addStudent(studentMap, 102, "Bhavya"); // Duplicate Name with same Roll No
        addStudent(studentMap, 106, "Farhan");
        addStudent(studentMap, 107, "Aarav"); // Duplicate Name with different Roll No
        addStudent(studentMap, 108, "Bhavya"); // Duplicate Name with different Roll No

        // Printing the HashMap
        System.out.println("Student Records with Duplicates:");
        for (Map.Entry<Integer, List<String>> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Helper method to add students to the HashMap
    private static void addStudent(HashMap<Integer, List<String>> map, int rollNo, String name) {
        map.computeIfAbsent(rollNo, k -> new ArrayList<>()).add(name);
    }
}
