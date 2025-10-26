package com.swetha_v.assignment3;

//File Name: Account.java
public abstract class Account {
 protected String accountHolder;
 protected double balance;

 public Account(String accountHolder, double initialBalance) {
     this.accountHolder = accountHolder;
     this.balance = initialBalance;

     // Every time an account is created, increment the count
     bank.incrementAccountCount();
 }

 // Abstract methods
 public abstract void deposit(double amount);
 public abstract void withdraw(double amount);
 public abstract double getBalance();

 // Common method
 public void showInfo() {
     System.out.println("Account Holder: " + accountHolder);
     System.out.println("Current Balance: Rs." + balance);
 }
}
