package com.techelevator.Inventory;


    public abstract class VendingMachineItems {
        //add variables
        private String name;
        private double price;
        private String slot;
        private String type;
        public int quantity;

        //constructor
        public VendingMachineItems(String slot, String name, double price, String type) {
            this.name = name;
            this.price = price;
            this.slot = slot;
            this.type = type;
            this.quantity = 6; //every item starts with 6 units

        }

public abstract String noise();
        //getters and setters


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getSlot() {
            return slot;
        }

        public void setSlot(String slot) {
            this.slot = slot;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
