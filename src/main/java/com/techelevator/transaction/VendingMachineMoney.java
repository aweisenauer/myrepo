package com.techelevator.transaction;

import com.techelevator.ui.UserInput;

public class VendingMachineMoney {
    // add var
    private double balance = 0;


    public double feedMoney(double depositAmount){
     balance = (balance + depositAmount)*100;
        return balance;
    }
    public double withdrawPurchase(double withdrawAmount){
        balance = (balance - withdrawAmount)*100;
        return balance;
    }

    public double getBalance() {
        return balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

 public static void moneyExchange(){
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        double dollar = 1.00;
 }



}
