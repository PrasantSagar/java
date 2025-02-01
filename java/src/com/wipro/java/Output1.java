package com.wipro.java;

/**
 * @author Sagar
 *
 */
public class Output1 {

    int num = 5;

    /**
     * Method to change the value of num
     * @param num New value to assign
     */
    public void changeValue(int num) {
        this.num = num;
    }

    /**
     * Main method to execute the program
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Output1 obj = new Output1();  // Create an object of Output1
        obj.changeValue(10);          // Change the value of num to 10
        System.out.println(obj.num);  // Print the value of num
    }
}
