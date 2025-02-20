package com.wipro.java.programs;

import java.util.Scanner;

//Generic Stack implementation using a linked list
class Stack<T> {
 private Node<T> top; // Top of the stack

 // Node class for the linked list
 private static class Node<T> {
     T data;
     Node<T> next;

     Node(T data) {
         this.data = data;
         this.next = null;
     }
 }

 // Push an item onto the stack
 public void push(T item) {
     Node<T> newNode = new Node<>(item);
     newNode.next = top;
     top = newNode;
 }

 // Pop an item from the stack
 public T pop() {
     if (isEmpty()) {
         return null; // Stack is empty
     }
     T data = top.data;
     top = top.next;
     return data;
 }

 // Peek at the top item of the stack
 public T peek() {
     if (isEmpty()) {
         return null; // Stack is empty
     }
     return top.data;
 }

 // Check if the stack is empty
 public boolean isEmpty() {
     return top == null;
 }
}

//Main class to test the stack implementation
public class genericStack {
 public static void main(String[] args) {
     Stack<Integer> integerStack = new Stack<>();
     Scanner scanner = new Scanner(System.in);

     while (scanner.hasNextInt()) {
         int userInput = scanner.nextInt();
         integerStack.push(userInput);
     }

     System.out.println("Peek: " + integerStack.peek());
     System.out.println("Pop: " + integerStack.pop());
     System.out.println("Is Empty: " + integerStack.isEmpty());
     System.out.println("Pop: " + integerStack.pop());
     System.out.println("Pop: " + integerStack.pop());
     System.out.println("Is Empty: " + integerStack.isEmpty());

     Stack<String> stringStack = new Stack<>();
     scanner.nextLine();

     while (scanner.hasNextLine()) {
         String userInput = scanner.nextLine();
         if (userInput.isEmpty()) {
             break;
         }
         stringStack.push(userInput);
     }

     System.out.println("Peek: " + stringStack.peek());
     scanner.close();
 }
}