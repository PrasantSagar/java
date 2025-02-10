package com.wipro.java.java8.usecase;

import java.util.*;
import java.util.stream.Collectors;

// Service class for managing employees
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    // Add an employee (Prevents duplicates)
    public void addEmployee(Employee emp) {
        if (employees.stream().anyMatch(e -> e.getId() == emp.getId())) {
            System.out.println("Error: Employee with ID " + emp.getId() + " already exists.");
            return;
        }
        employees.add(emp);
        System.out.println("Employee added: " + emp);
    }

    // Remove an employee by ID
    public void removeEmployee(int id) {
        boolean removed = employees.removeIf(emp -> emp.getId() == id);
        if (!removed) {
            System.out.println("Error: Employee with ID " + id + " not found.");
        }
    }

    // Search employee by ID
    public Optional<Employee> searchEmployee(int id) {
        return employees.stream().filter(emp -> emp.getId() == id).findFirst();
    }

    // Update employee salary
    public void updateSalary(int id, double newSalary) {
        if (newSalary < 0) {
            System.out.println("Error: Salary cannot be negative.");
            return;
        }
        employees.stream().filter(emp -> emp.getId() == id).findFirst().ifPresentOrElse(
            emp -> {
                emp.setSalary(newSalary);
                System.out.println("Salary updated for Employee ID " + id);
            },
            () -> System.out.println("Error: Employee with ID " + id + " not found.")
        );
    }

    // Display all employees
    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            employees.forEach(System.out::println);
        }
    }

    // Filter employees by department
    public List<Employee> filterByDepartment(String department) {
        return employees.stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase(department))
                .collect(Collectors.toList());
    }

    // Sort employees by name
    public List<Employee> sortByName() {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
    }

    // Get average salary
    public double getAverageSalary() {
        return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }
}
