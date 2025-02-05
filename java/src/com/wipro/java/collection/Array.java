package com.wipro.java.collection;

public class Array {
    public static void main(String[] args) {
        // Declare an array of size 5
        int[] arr = new int[5];

        // Assign values to array
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // Print all elements using a loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}

