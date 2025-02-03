/**
 * 
 */
package com.wipro.java.oops;

/**
 * Parent class=Employee
 * Child class= Developer
 * keyword = extends
 
 */
public class Developer extends Employee{

	/**
	 * 
	 */
	public Developer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// child object is instantiated from child constructor
    	//parent class consumes the prop and behaviors of child class
		
		Employee employee=new Developer();
		employee.setEmp_id(1234);;
		employee.setName("Sagar");
		employee.setEmail("sagarprashant068@gmail.com");
		employee.setDepartment("Software");
		employee.setSalary(50000);;
		
     System.out.println(employee.getEmp_id());
     System.out.println(employee.getName());
     System.out.println(employee.getEmail());
     System.out.println(employee.getDepartment());
     System.out.println(employee.getSalary());

	}

}
