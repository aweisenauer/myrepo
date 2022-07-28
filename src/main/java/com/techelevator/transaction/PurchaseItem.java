package com.techelevator.transaction;

import com.techelevator.Inventory.VendingMachineItems;
import com.techelevator.application.VendingMachine;
import com.techelevator.reader.VendingMachineBuilder;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.util.Scanner;

public class PurchaseItem {
    public void purchaseItem(VendingMachine vendingMachine, VendingMachineBuilder vendingMachineBuilder, VendingMachineMoney vendingMachineMoney, VendingMachineItems vendingMachineItems) {
        Scanner userInput = new Scanner(System.in);
        String getMoneyFromUser = userInput.nextLine();
        String purchaseChoice = userInput.nextLine();


        if (purchaseChoice.equals("m")) {
            vendingMachineMoney.feedMoney(Double.parseDouble(getMoneyFromUser));
        } else if (purchaseChoice.equals("S")) {
            UserOutput.displayInventoryItems(vendingMachineBuilder.getInventory());
            System.out.println("Please enter the slot number: ");
            String slotNumberFromUser = userInput.nextLine();
            if (slotNumberFromUser != vendingMachineItems.getSlot()) {
                System.out.println("Please enter a valid slot number:");
            } else if (slotNumberFromUser == vendingMachineItems.getSlot() && vendingMachineItems.quantity>0) {
                System.out.println("You want to buy " + vendingMachineItems.getName() + " " + vendingMachineItems.getPrice());
                System.out.println("How many do you want to buy?");
                int selectionQuantity = Integer.parseInt(userInput.nextLine());
                vendingMachineItems.quantity-=selectionQuantity;

                //do transaction with balance and item price. include stock of item
            }
        } else {
            System.out.println(vendingMachineMoney.getBalance());
        }
    }

}


//for(String item : inventory)
//if(slotnumberfromuser == vendingmachineitem.getslot && quantity >= selectionQuantity && quantity-selectionQuantity>=0)
//user.balance -= (item.getprice * selectionQuantity)