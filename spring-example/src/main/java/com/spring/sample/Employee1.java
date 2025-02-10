package com.spring.sample;

public class Employee1 {

	private int id;
	private String name;

	public Employee1() {
		System.out.println("def cons");
	}

	public Employee1(int id) {
		this.id = id;
	}

	public Employee1(String name) {
		this.name = name;
	}

	// encapsulating
	public Employee1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void show() {
		System.out.println(name + " " + id);
	}
}