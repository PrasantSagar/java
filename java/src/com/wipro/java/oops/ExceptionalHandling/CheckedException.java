package com.wipro.java.oops.ExceptionalHandling;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;

class CheckedException {
    public static void main(String[] args) {
        try {
            File file = new File("Wrong File");
            FileReader fr = new FileReader(file); // May throw FileNotFoundException
            System.out.println("File opened successfully.");
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}

