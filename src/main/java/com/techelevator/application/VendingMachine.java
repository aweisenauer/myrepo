package com.techelevator.application;

import com.techelevator.Inventory.VendingMachineItems;
import com.techelevator.reader.VendingMachineBuilder;

import com.techelevator.transaction.VendingMachineMoney;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    VendingMachineMoney vendingMachineMoney = new VendingMachineMoney();
    private Map<String, VendingMachineItems> inventory = new HashMap<>();

    public VendingMachine(VendingMachineBuilder vendingMachineBuilder) {
        inventory = vendingMachineBuilder.getInventory();
    }

    UserInput userInput = new UserInput();
    UserOutput userOutput = new UserOutput();


    public void run() {
        while (true) {
            userOutput.displayHomeScreen();
            String choice = userInput.getHomeScreenOption();

            System.out.println(choice);

            if (choice.equals("display")) {

                // display the items
                UserOutput.displayInventoryItems(inventory);
            } else if (choice.equals("purchase")) {
                // make a purchase
                String choice2 = userInput.getPurchaseScreenOptions(vendingMachineMoney.getBalance());
                if (choice2.equals("Feed Money")) {

                    String getMoneyFromUser = userInput.getInputFromUser("Please enter dollar amount: 1, 5, 10 or 20");
                    double getMoneyFromUserDouble = Double.parseDouble(getMoneyFromUser);
                    userInput.getPurchaseScreenOptions(getMoneyFromUserDouble);

                    //      vendingMachineMoney.feedMoney(userInput.getAmountFromUser());
                    //do we need something else?
                } else if (choice2.equals("Select Item")) {
                    //call purchase item.purchaseitem()
                    UserOutput.displayInventoryItems(inventory);
                    String slotNumberFromUser = userInput.getInputFromUser("Please enter the slot number: ");
                    if (!inventory.containsKey(slotNumberFromUser)) {
                        String validSlotNumberFromUser = userInput.getInputFromUser("Please Enter a Valid Slot Number");
                    } else if (inventory.get(slotNumberFromUser).getQuantity() > 0) {//check quantity
                        userOutput.displayMessage("You want to buy " + inventory.get(slotNumberFromUser).getName() + " " + inventory.get(slotNumberFromUser).getPrice());
                        String quantityFromUser = userInput.getInputFromUser("How many do you want to buy?:  ");
                        int quantity = Integer.parseInt(quantityFromUser);
                        double leftMoney = vendingMachineMoney.withdrawPurchase(vendingMachineMoney.getDepositAmount());

                        if (leftMoney > 0) {
                            userOutput.displayMessage("You have " + leftMoney + " remaining.");
                        } else {
                            userOutput.displayMessage("Not enough money!");
                        }
//                        int selectionQuantity = Integer.parseInt(userInput.nextLine());
//                        vendingMachineItems.quantity-=selectionQuantity;
//
//                        //do transaction with balance and item price. include stock of item
                    } else {
                        //end transaction. give change. 0 out vending machine money
                    }
                }
            } else if (choice.equals("exit")) {
                // good bye
                break;
            }
        }
    }
}

