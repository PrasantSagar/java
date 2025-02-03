/**
 * 
 */
package com.wipro.java.oops;

/**
 * @author Sagar
 *
 */

//POJO:plain old java object access thru getter/setter
public class Employee {
	
	private int emp_id;  //unique identifier for the employee
	private String Name;  // name of the employee
	private String email; // Email of the employee
	private String Department; // Department of the employee
	private float salary;  //salary of the employee
	
	

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}
	
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	/**
	 * 
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
