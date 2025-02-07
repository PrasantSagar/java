package com.wipro.java.java8;

public class StringApi {

    public StringApi() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        String str = "Name xyz";

        // Print the length of the string
        System.out.println(str.length());

        // Print the character at index 2
        System.out.println(str.charAt(2));

        // Print the substring starting from index 1
        System.out.println(str.substring(1,3));

        // Check if the string contains "a"
        System.out.println(str.contains("a"));

        // Split the string by spaces and print each part
        String[] a = str.split(" ");
        for (String str1 : a) {
            System.out.println(str1);
        }
    }
}
