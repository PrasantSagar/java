package com.wipro.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    // Add two numbers
    @Test
    public void testAdd() {
        int result = calculator.add(3, 2);
        assertEquals(5, result); 
    }

    //Subtract two numbers
    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }
    
      // Add With Negative Numbers
    @Test
    public void testAddWithNegativeNumbers() {
        int result = calculator.add(-3, -2);
        assertEquals(-5, result);
    }
          
    // Subtract With Negative Numbers
    @Test
    public void testSubtractWithNegativeNumbers() {
        int result = calculator.subtract(-3, -2);
        assertEquals(-1, result);
    }
}
