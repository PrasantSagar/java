package com.wipro.java.oops.ExceptionalHandling;

public class JavaException {
    public static void main(String[] args) {
    	
        try {
            int num1 = 20;
            int num2 = 0;
            int result = num1 / num2; // This will throw Exception
            System.out.println("Result: " + result);
        } 
        
        catch (Exception e) {
            System.out.println("Exception : Division by zero is not allowed.");
        } 
        
        finally {
            System.out.println("Execution completed.");
        }
        System.out.println("Rest of the code.");

    }
}
