package com.swetha_v.assignment3;



//File Name: SavingsAccount.java
public class SavingsAccount extends Account {

 public SavingsAccount(String accountHolder, double initialBalance) {
     super(accountHolder, initialBalance);
 }

 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited Rs." + amount + " in Savings Account");
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn Rs." + amount + " from Savings Account");
     } else {
         System.out.println("Insufficient balance in Savings Account!");
     }
 }

 @Override
 public double getBalance() {
     return balance;
 }
}
