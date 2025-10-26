package com.swetha_v.assignment3;

//File Name: Bank.java
public class bank {
 // Static variable to track total number of accounts
 private static int totalAccounts = 0;

 // Method to increase account count
 public static void incrementAccountCount() {
     totalAccounts++;
 }

 // Static method to return total accounts
 public static int getTotalAccounts() {
     return totalAccounts;
 }
}
