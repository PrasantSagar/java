package com.wipro.java.oops.ExceptionalHandling;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;

class Checked_Unchecked {
    public static void main(String[] args) {
        
        // Unchecked Exception (ArrayIndexOutOfBoundsException)
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked Exception Caught: Array index is out of bounds.");
        }

        // Checked Exception (FileNotFoundException)
        try {
            File file = new File("Wrong File");
            FileReader fr = new FileReader(file); // May throw FileNotFoundException
            System.out.println("File opened successfully.");
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
        
        System.out.println("Program executed successfully.");
    }
}
