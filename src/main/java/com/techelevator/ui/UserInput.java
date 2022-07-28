package com.techelevator.ui;

import com.techelevator.Inventory.VendingMachineItems;
import com.techelevator.reader.VendingMachineBuilder;
import com.techelevator.transaction.VendingMachineMoney;

import java.util.Locale;
import java.util.Scanner;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 *
 * Dependencies: None
 */
public class UserInput {
    private Scanner scanner = new Scanner(System.in);

    public String getHomeScreenOption() {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("D) Display Items");
        System.out.println("P) Purchase");
        System.out.println("E) Exit");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();
        System.out.println("option = " + option);
        if (option.equals("d")) {
            return "display";
        } else if (option.equals("p")) {
            return "purchase";
        } else if (option.equals("e")) {
            return "exit";
        } else {
            return "";
        }
    }
<<<<<<< HEAD
        public String getPurchaseScreenOption () {
            System.out.println("What would you like to do?");
            System.out.println();

            System.out.println("D) Display Items");
            System.out.println("P) Purchase");
            System.out.println("E) Exit");

            System.out.println();
            System.out.print("Please select an option: ");

            String selectedOption = scanner.nextLine();
            String option = selectedOption.trim().toLowerCase();
            System.out.println("option = " + option);
            if (option.equals("d")) {
                return "display";
            } else if (option.equals("p")) {
                return "purchase";
            } else if (option.equals("e")) {
                return "exit";
            } else {
                return "";
            }
=======

    public String getPurchaseScreenOptions(Double currentBalance) {

        System.out.println("(M) Feed Money");
        System.out.println("(S) Select an Item");
        System.out.println("(F) Finish Transaction");
        System.out.println();
        System.out.println("Current Money Provided: " + (currentBalance + getAmountFromUser()));
        System.out.println("Please select an option?");
        String purchaseOption = scanner.nextLine();
        System.out.println();


        String optionForPurchase = purchaseOption.trim().toLowerCase();
        System.out.println("option = " + optionForPurchase);
>>>>>>> ca8bf24ad8f8788cb4ae43b62e52414eca834857

        if (optionForPurchase.equals("m")) {
            return "Feed Money";
        }else if(optionForPurchase.equals("s")){
        return purchaseOption;
        }else if (optionForPurchase.equals("f")){
            return null;
        }

<<<<<<< HEAD
        }
=======
        return purchaseOption;
    }
    public double getAmountFromUser(){
        System.out.println("Please enter dollar amount: 1, 5, 10 or 20");
        String userAmount = scanner.nextLine();
        double doubleAmount = Double.parseDouble(userAmount);

        return doubleAmount;
    }
>>>>>>> ca8bf24ad8f8788cb4ae43b62e52414eca834857




}