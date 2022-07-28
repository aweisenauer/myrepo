package com.techelevator.ui;

import com.techelevator.reader.VendingMachineBuilder;

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
        }
        else if (option.equals("p")) {
            return "purchase";
        }
        else if (option.equals("e")) {
            return "exit";
        }
        else {
            return "";
        }

public String getPurchaseScreenOption(){
            System.out.println();
            System.out.println("Please select an option?");
            System.out.println();
            System.out.println("(M) Feed Money");
            System.out.println("(S) Select an Item");
            System.out.println("(F) Finish Transaction");

            String purchaseOption = scanner.nextLine();
            String optionForPurchase = purchaseOption.trim().toLowerCase();
            System.out.println("option = " + optionForPurchase);

            if (optionForPurchase.equals("m")){
                return "Feed Money";
            } 

            }



        }



}

