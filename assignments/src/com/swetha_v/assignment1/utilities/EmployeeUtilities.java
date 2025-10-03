package com.swetha_v.assignment1.utilities;

import com.swetha_v.assignment1.Employees.Employee;

/**
 * Utility class for performing operations on employees.
 */
public class EmployeeUtilities {

    /**
     * Increase salary of an employee by a given percentage.
     * 
     * @param employee Employee object
     * @param percentage Percentage increase
     */
    public void increaseSalary(Employee employee, double percentage) {
        double newSalary = employee.getSalary() + (employee.getSalary() * percentage / 100);
        employee.setSalary(newSalary);
        System.out.println("Updated Salary for " + employee.getName() + ": " + employee.getSalary());
    }

    /**
     * Print details of an employee.
     * 
     * @param employee Employee object
     */
    public void printEmployeeDetails(Employee employee) {
        System.out.println(employee.toString());
    }
}
