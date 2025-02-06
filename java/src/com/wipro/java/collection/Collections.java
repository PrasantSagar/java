package com.wipro.java.collection;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
    	
        // List - ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Cricket");
        arrayList.add("Football");
        arrayList.add("Basketball");
        System.out.println("ArrayList: " + arrayList);
        arrayList.remove("Basketball");
        System.out.println("ArrayList after removal: " + arrayList);
        System.out.println("Element at index 1: " + arrayList.get(1));

        // List - LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("LinkedList: " + linkedList);
        linkedList.addFirst(5);
        linkedList.addLast(4);
        System.out.println("LinkedList after additions: " + linkedList);
        linkedList.remove(2);
        System.out.println("LinkedList after removal: " + linkedList);

        // Map - HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Cricket");
        hashMap.put(2, "Football");
        hashMap.put(3, "Basketball");
        System.out.println("HashMap: " + hashMap);
        hashMap.put(3, "Volleyball");
        System.out.println("HashMap after update: " + hashMap);
        hashMap.remove(3);
        System.out.println("HashMap after removal: " + hashMap);
        System.out.println("Value for key 1: " + hashMap.get(1));
    }
}
