package com.wipro.java.oops.interface1;

public class Document implements Showable,Printable {

	@Override
	public void print() {
		System.out.println("print");
	}
	
	@Override
	public void show() {
		System.out.println("show");
	}
	
	public static void main(String args[]) {
		 Document doc1= new Document();
		 doc1.show();
		 doc1.print();
		 
	}

}
