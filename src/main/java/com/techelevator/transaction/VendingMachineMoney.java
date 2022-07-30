package com.techelevator.transaction;

import com.techelevator.ui.UserInput;

public class VendingMachineMoney {
    // add var
    private double balance = 0;
    private double depositAmount ;



    public double feedMoney(double depositAmount){
     balance = (balance + depositAmount);
        return balance;
    }
    public double withdrawPurchase(double withdrawAmount){
        balance = (balance - withdrawAmount);
        return balance;
    }
    public double getDepositAmount() {
        return depositAmount;
    }
    public double getBalance() {


        return this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance ;
    }

 public String moneyExchange(){
     int nickel;
     int dime;
     int quarter;
     int dollar;
     double changeAmount = getBalance();
     double change = Math.round(changeAmount*100);
     dollar = (int)change/100;
     change = change%100;
     quarter =(int)change /25;
     change = change%25;
     dime = (int)change/10;
     change = change%10;
     nickel = (int)change/5;
     change = change/5;
     return "Your change is: " + dollar + " dollars" + ", " + quarter + " quarters" + ", " + dime + " dimes" + ", " + nickel + " nickels.";
        }
 }

