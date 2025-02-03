package com.wipro.java.oops.encapsulation;
 
public class Person {
 
	public Person(String name, int age) {
		super();//calls the root parent class=object
		this.name = name;
		this.age = age;
	}
	
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		if(age>0) {
			this.age=age;
		}
		else
		System.out.println("Age must be positive");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 
	
	public static void main(String a[]) {
		
		Person p1=new Person("Alice", 24);
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		
		p1.setAge(30);
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		
		p1.setAge(-5);
		
		
	}
	
}