package com.swetha_v.assignment1.Employees;


/**
 * Represents a generic employee with basic details.
 */
public class Employee {
    // Private attributes (Encapsulation)
    private String name;
    private int employeeId;
    private double salary;

    /**
     * Constructor for Employee class.
     * 
     * @param name Employee name
     * @param employeeId Unique employee ID
     * @param salary Employee salary
     */
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getter and Setter methods

    public String getName() {
        return name;
    }

    protected void setName(String name) { // protected allows subclasses
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    protected void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) { // public, can be updated outside
        this.salary = salary;
    }

    /**
     * Display employee information.
     * @return employee details as string
     */
    public String toString() {
        return "Employee [Name=" + name + ", ID=" + employeeId + ", Salary=" + salary + "]";
    }
}
