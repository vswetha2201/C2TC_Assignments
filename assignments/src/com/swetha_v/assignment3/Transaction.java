package com.swetha_v.assignment3;

//File Name: Transaction.java
public final class Transaction {
 // Final variable (fixed fee for all transactions)
 private final double transactionFee = 10.0;

 // Final method to ensure consistent transaction process
 public final void performTransaction(Account account, double amount, String type) {
     System.out.println("\n--- Transaction Process Started ---");

     if (type.equalsIgnoreCase("deposit")) {
         account.deposit(amount);
     } 
     else if (type.equalsIgnoreCase("withdraw")) {
         account.withdraw(amount);
     } 
     else {
         System.out.println("Invalid transaction type.");
     }

     // Deduct transaction fee
     account.withdraw(transactionFee);
     System.out.println("Transaction Fee Rs." + transactionFee + " deducted.");

     System.out.println("Final Balance: Rs." + account.getBalance());
     System.out.println("--- Transaction Completed ---\n");
 }
}
