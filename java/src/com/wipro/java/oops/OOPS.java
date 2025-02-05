package com.wipro.java.oops;  // Package declaration

// Abstract class to demonstrate Abstraction
abstract class LibraryItem {
    private String title;  // Encapsulated field

    // Constructor to initialize item title
    public LibraryItem(String title) {
        this.title = title;
    }

    // Getter method for title (Encapsulation)
    public String getTitle() {
        return title;
    }

    // Setter method for title (Encapsulation)
    public void setTitle(String title) {
        this.title = title;
    }
    
    // Abstract method to be implemented by subclasses
    public abstract void displayInfo();
    
    // Regular method
    public void libraryItemInfo() {
        System.out.println("Library Item: " + title);
    }
}

// Encapsulation
class Book extends LibraryItem {
    private String author;  // Private field for author name

    // Constructor
    public Book(String title, String author) {
        super(title);  // Call the superclass constructor
        this.author = author;
    }

    // Getter method (Encapsulation)
    public String getAuthor() {
        return author;
    }

    // Setter method (Encapsulation)
    public void setAuthor(String author) {
        this.author = author;
    }

    // Overriding the abstract method (Polymorphism)
    @Override
    public void displayInfo() {
        System.out.println("Book Title: " + getTitle() + ", Author: " + author);
    }
}

// Another subclass to demonstrate Inheritance and Polymorphism
class Magazine extends LibraryItem {
    private int issueNumber;

    // Constructor
    public Magazine(String title, int issueNumber) {
        super(title);  // Call the superclass constructor
        this.issueNumber = issueNumber;
    }

    // Getter method (Encapsulation)
    public int getIssueNumber() {
        return issueNumber;
    }

    // Setter method (Encapsulation)
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    // Overriding the abstract method (Polymorphism)
    @Override
    public void displayInfo() {
        System.out.println("Magazine Title: " + getTitle() + ", Issue Number: " + issueNumber);
    }
}

// Main class to demonstrate all concepts
public class OOPS {
    public static void main(String[] args) {
        // Creating objects of the classes
        LibraryItem book = new Book("Java Programming", "James Gosling");  // Inheritance and Polymorphism
        LibraryItem magazine = new Magazine("Tech World", 15);  // Inheritance and Polymorphism 

        // Using displayInfo()
        book.displayInfo();  // Direct method for book
        magazine.displayInfo();  // Direct method for magazine
        
        // Displaying other information (Abstraction)
        book.libraryItemInfo();  
        magazine.libraryItemInfo();  
    }
}
