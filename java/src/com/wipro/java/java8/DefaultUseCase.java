package com.wipro.java.java8;

//if two interfaces have same default method

interface Testinterface1{
	
	//Default Method
	 default void show() 
	 {
		 System.out.println("Default Interface1");
	 }
}

	 interface Testinterface2{
		 
		 //Default Method
	 default void show() {
		 System.out.println("Default Interface2");
	 }
	 }
	 
	  class DefaultUseCase implements Testinterface1,Testinterface2{
		 
	 public void show() {
		 Testinterface1.super.show();
		 Testinterface2.super.show();
	 }
	 
	 public static void main(String args[]) {
		 DefaultUseCase d = new DefaultUseCase();
		 d.show();
		 
	 }
	  }
