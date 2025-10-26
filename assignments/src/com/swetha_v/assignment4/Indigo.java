package com.swetha_v.assignment4;

//File Name: Indigo.java
public class Indigo implements Airfare {
 private int hours;
 private double costPerHour;

 public Indigo() {}

 public Indigo(int hours, double costPerHour) {
     this.hours = hours;
     this.costPerHour = costPerHour;
 }

 public int getHours() { return hours; }
 public void setHours(int hours) { this.hours = hours; }

 public double getCostPerHour() { return costPerHour; }
 public void setCostPerHour(double costPerHour) { this.costPerHour = costPerHour; }

 @Override
 public double calculateAmount() {
     return (hours * costPerHour) * 8; // multiply by 8
 }

 @Override
 public void display() {
     System.out.printf("%.2f", calculateAmount());
 }
}
