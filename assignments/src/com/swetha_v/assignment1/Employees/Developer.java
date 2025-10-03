package com.swetha_v.assignment1.Employees;


/**
 * Represents a Developer, subclass of Employee.
 */
public class Developer extends Employee {
    private String programmingLanguage;

    /**
     * Constructor for Developer class.
     * 
     * @param name Employee name
     * @param employeeId Unique employee ID
     * @param salary Employee salary
     * @param programmingLanguage Developer's primary programming language
     */
    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return super.toString() + ", Developer [Language=" + programmingLanguage + "]";
    }
}
