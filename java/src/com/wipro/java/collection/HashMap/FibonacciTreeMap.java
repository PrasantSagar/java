package com.wipro.java.collection.HashMap;

import java.util.TreeMap;

public class FibonacciTreeMap {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        TreeMap<Integer, Long> fibonacciMap = new TreeMap<>();

        // Generate Fibonacci series and store in TreeMap
        for (int i = 0; i < n; i++) {
            long fibValue = fibonacci(i);
            fibonacciMap.put(i, fibValue);
        }

        // Display the Fibonacci series stored in the TreeMap
        System.out.println("Fibonacci Series stored in TreeMap:");
        for (Integer key : fibonacciMap.keySet()) {
            System.out.println("Index: " + key + ", Fibonacci Number: " + fibonacciMap.get(key));
        }
    }

    // Recursive method to calculate Fibonacci number
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
