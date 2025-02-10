package com.wipro.java.java8.usecase;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class EmployeeTest {
    private EmployeeService service;

    @Before
    public void setUp() {
        service = new EmployeeService(); // Create a new instance for fresh data

        // Adding initial test employees
        service.addEmployee(new Employee(1, "Prasant", "IT", 50000, LocalDate.of(2020, 5, 10)));
        service.addEmployee(new Employee(2, "Sagar", "HR", 45000, LocalDate.of(2019, 3, 15)));
        service.addEmployee(new Employee(3, "Aarav", "Finance", 60000, LocalDate.of(2021, 8, 22)));
    }

    // Test adding a new employee
    @Test
    public void testAddEmployee() {
        Employee emp = new Employee(4, "Rahul", "Marketing", 55000, LocalDate.now());
        service.addEmployee(emp);
        Optional<Employee> retrieved = service.searchEmployee(4);
        assertTrue(retrieved.isPresent());
        assertEquals("Rahul", retrieved.get().getName());
    }

    // Test preventing duplicate employees
    @Test
    public void testAddDuplicateEmployee() {
        Employee duplicateEmp = new Employee(1, "Prasant", "IT", 50000, LocalDate.of(2020, 5, 10));
        service.addEmployee(duplicateEmp);

        // Ensure no duplicates were added
        long count = service.filterByDepartment("IT").stream().filter(e -> e.getId() == 1).count();
        assertEquals(1, count); // There should only be one "Prasant"
    }

    //  Test removing an employee
    @Test
    public void testRemoveEmployee() {
        service.removeEmployee(1);
        assertFalse(service.searchEmployee(1).isPresent());
    }

    //  Test searching an employee by ID
    @Test
    public void testSearchEmployee() {
        Optional<Employee> emp = service.searchEmployee(2);
        assertTrue(emp.isPresent());
        assertEquals("Sagar", emp.get().getName());
    }

    //  Test searching for a non-existent employee
    @Test
    public void testSearchNonExistentEmployee() {
        Optional<Employee> emp = service.searchEmployee(99);
        assertFalse(emp.isPresent());
    }

    //  Test updating an employee's salary
    @Test
    public void testUpdateSalary() {
        service.updateSalary(3, 70000);
        Optional<Employee> emp = service.searchEmployee(3);
        assertTrue(emp.isPresent());
        assertEquals(70000, emp.get().getSalary(), 0);
    }

    // Test preventing negative salary updates
    @Test
    public void testUpdateNegativeSalary() {
        service.updateSalary(3, -5000);
        
        // Salary should remain unchanged
        Optional<Employee> emp = service.searchEmployee(3);
        assertTrue(emp.isPresent());
        assertEquals(60000, emp.get().getSalary(), 0);
    }

    //  Test filtering employees by department
    @Test
    public void testFilterByDepartment() {
        List<Employee> hrEmployees = service.filterByDepartment("HR");
        assertEquals(1, hrEmployees.size());
        assertEquals("Sagar", hrEmployees.get(0).getName());
    }

    //  Test sorting employees by name
    @Test
    public void testSortByName() {
        List<Employee> sortedEmployees = service.sortByName();
        assertEquals("Aarav", sortedEmployees.get(0).getName());
        assertEquals("Prasant", sortedEmployees.get(1).getName());
        assertEquals("Sagar", sortedEmployees.get(2).getName());
    }

    //  Test calculating average salary
    @Test
    public void testGetAverageSalary() {
        double expectedAverage = (50000 + 45000 + 60000) / 3.0;
        assertEquals(expectedAverage, service.getAverageSalary(), 0.01);
    }

    //  Test removing a non-existent employee
    @Test
    public void testRemoveNonExistentEmployee() {
        service.removeEmployee(99); // Removing an employee that doesn't exist
        assertEquals(3, service.sortByName().size()); // No change should occur
    }

    //  Test updating salary for a non-existent employee
    @Test
    public void testUpdateSalaryForNonExistentEmployee() {
        service.updateSalary(99, 70000);
        assertNull(service.searchEmployee(99).orElse(null));
    }
}
