/**
 * 
 */
package com.wipro.java.java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApi1 {
    public static void main(String[] args) {
        // Sorting a list
        List<Integer> numbers1 = Arrays.asList(5, 2, 8, 1, 3);
        List<Integer> sortedNumbers = numbers1.stream()
                                              .sorted()
                                              .collect(Collectors.toList());

        System.out.println("Sorted Numbers: " + sortedNumbers);

        // Finding min and max in a list
        List<Integer> numbers2 = Arrays.asList(10, 20, 5, 25, 30);

        int min = numbers2.stream().min(Integer::compare).get();
        int max = numbers2.stream().max(Integer::compare).get();

        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);
    }
}
