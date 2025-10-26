package com.swetha_v.assignment3;

//File Name: Main.java
public class Main {
 public static void main(String[] args) {

     SavingsAccount s1 = new SavingsAccount("Swetha", 1000);
     CheckingAccount c1 = new CheckingAccount("Rahul", 2000);

     Transaction t = new Transaction();

     t.performTransaction(s1, 500, "deposit");
     t.performTransaction(c1, 1000, "withdraw");

     System.out.println("Total Accounts in bank: " + bank.getTotalAccounts());
 }
}
