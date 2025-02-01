/**
 * 
 */
package com.wipro.java;

/**
 * @author Sagar
 *
 */
public class Flowers {
	
	String name;
	String color;
	int petals;
 
	/**
	 * 
	 */
	public Flowers(String name,String color,int petals) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.color=color;
		this.petals=petals;
	}

	
	   //display
	   void display() {
	System.out.println("Flower name:"+name+", Color: " + color + " ,Petals:"+ petals);
	   }
	   
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Flowers obj1=new Flowers("Rose","Red",10);
		 Flowers obj2=new Flowers("Lotus","Pink",12);
        
		obj1.display();
		obj2.display();
		
		System.out.println(obj1);
		System.out.println(obj2);

	}

}
