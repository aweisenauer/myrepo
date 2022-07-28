package com.techelevator.application;

import com.techelevator.Inventory.VendingMachineItems;
import com.techelevator.reader.VendingMachineBuilder;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private Map<String, VendingMachineItems> inventory = new HashMap<>();
    public VendingMachine(VendingMachineBuilder vendingMachineBuilder){
        inventory = vendingMachineBuilder.getInventory();
    }
    UserInput userInput = new UserInput();
    UserOutput userOutput = new UserOutput();


    public void run() {
        while(true) {
            userOutput.displayHomeScreen();
            String choice = userInput.getHomeScreenOption();

            System.out.println(choice);
            if(choice.equals("display")) {
                // display the items
                UserOutput.displayInventoryItems(inventory);
            }
            else if(choice.equals("purchase")) {
                // make a purchase
//                UserOutput.displayPurchaseScreen();
//                String choice = userInput.

            }
            else if(choice.equals("exit")) {
                // good bye
                break;
            }
        }
    }
}
