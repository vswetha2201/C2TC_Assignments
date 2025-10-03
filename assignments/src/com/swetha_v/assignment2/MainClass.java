package com.swetha_v.assignment2;

/**
 * Main class to test Student and Commission classes
 */
public class MainClass {
    public static void main(String[] args) {
        // Create Student object
        Student s = new Student(); // This will print "Student object is created"

        // Create Commission object
        Commission emp = new Commission();

        // Accept employee details
        emp.acceptDetails();

        // Display employee details and commission
        emp.displayDetails();
    }
}
