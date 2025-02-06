package com.wipro.java.java8;

public class Shapes_Functional_Interface  {
	
@FunctionalInterface
interface Shapes {
    // One abstract method
    void area(double dimension);

    // Default method
    default double perimeter(double radius) {
        return  2 * Math.PI * radius;
    }
    
    // Default method
    default String shapeInfo() {
        return "Shape Information";
    }

    // Static method
    static String displayType() {
        return "This is a shape";
    }

    // Static method
    static String category() {
        return "Geometrical Shape";
    }
}

static class Circle implements Shapes {
    // Implementing the abstract method
    public void area(double radius) {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }

    public static void main(String args[]) {
        Circle c = new Circle();
        c.area(5);

        // Calling default methods
        System.out.println(c.perimeter(10));
        System.out.println(c.shapeInfo());

        // Calling static methods
        System.out.println(Shapes.displayType());
        System.out.println(Shapes.category());
    }
}
}

