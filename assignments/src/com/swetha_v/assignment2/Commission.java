package com.swetha_v.assignment2;

import java.util.Scanner;

/**
 * Commission class to store employee details and calculate commission
 */
public class Commission {
    // Data members
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    // Method to accept details of the sales employee
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        name = sc.nextLine();

        System.out.print("Enter employee address: ");
        address = sc.nextLine();

        System.out.print("Enter employee phone: ");
        phone = sc.nextLine();

        System.out.print("Enter sales amount: ");
        salesAmount = sc.nextDouble();
    }

    // Method to calculate commission
    public double calculateCommission() {
        double commission = 0;

        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0;
        }

        return commission;
    }

    // Method to display employee details and commission
    public void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + calculateCommission());
    }
}
