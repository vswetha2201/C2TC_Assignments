package com.swetha_v.assignment3;


//File Name: CheckingAccount.java
public class CheckingAccount extends Account {

 public CheckingAccount(String accountHolder, double initialBalance) {
     super(accountHolder, initialBalance);
 }

 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited Rs." + amount + " in Checking Account");
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn Rs." + amount + " from Checking Account");
     } else {
         System.out.println("Insufficient balance in Checking Account!");
     }
 }

 @Override
 public double getBalance() {
     return balance;
 }
}
