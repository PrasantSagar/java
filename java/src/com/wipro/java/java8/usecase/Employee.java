package com.wipro.java.java8.usecase;

import java.time.LocalDate;

// Employee class representing an employee
public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private LocalDate joiningDate;

    // Constructor to initialize Employee object
    public Employee(int id, String name, String department, double salary, LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    // Getter methods
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public LocalDate getJoiningDate() { return joiningDate; }

    // Setter methods
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setSalary(double salary) { this.salary = salary; }

    // toString method to display employee details
    @Override
    public String toString() {
        return "Employee { ID=" + id + ", Name='" + name + '\'' +
                ", Dept='" + department + '\'' + ", Salary=" + salary +
                ", JoiningDate=" + joiningDate + " }";
    }
}
