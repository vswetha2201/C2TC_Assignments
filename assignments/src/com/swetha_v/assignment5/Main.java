package com.swetha_v.assignment5;

//File Name: Main.java
import java.util.*;

public class Main {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     String input = sc.nextLine(); 
     String[] data = input.split(",");

     String stageEvent = data[0];
     String customer = data[1];
     int noOfSeats = Integer.parseInt(data[2]);

     TicketBooking tb = new TicketBooking(stageEvent, customer, noOfSeats);

     int choice = sc.nextInt();
     sc.nextLine(); // clear buffer

     tb.displayDetails();

     switch(choice) {
         case 1:
             double amount1 = sc.nextDouble();
             tb.makePayment(amount1);
             break;

         case 2:
             double amount2 = sc.nextDouble();
             sc.nextLine();
             String wallet = sc.nextLine();
             tb.makePayment(amount2, wallet);
             break;

         case 3:
             String holder = sc.nextLine();
             double amount3 = sc.nextDouble();
             sc.nextLine();
             String cardType = sc.nextLine();
             String ccv = sc.nextLine();
             tb.makePayment(holder, amount3, cardType, ccv);
             break;

         default:
             System.out.println("Invalid choice");
     }
     sc.close();
 }
}