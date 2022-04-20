package com.epicCoolCompany;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {



    static void updateInventory() {

    }

    public static void main(String[] args) {
        // write your code here
        int userInputChoice = 0;
        int userChoice = 0;

        //Inventory
        //item item1 = new item("Bees", 20.00, 20, "The Bee Man", "Don't Get Stung", false, 0 );
        //item item2 = new item("Beans", 25.50, 20, "Bush", "Tasty", false, 0 );
        //item item3 = new item("Laptop", 1399.99, 39, "ASUS", "It Computes", false, 0 );

        ArrayList<item> inventory = new ArrayList<item>();
        inventory.add(new item("Bees", 20.00, 20, "The Bee Man", "Don't Get Stung", false, 0));
        inventory.add(new item("Beans", 25.50, 20, "Bush", "Tasty", false, 0));
        inventory.add(new item("Laptop", 1399.99, 39, "ASUS", "It Computes", false, 0));
        inventory.add(new item("Cobblestone", 2.95, 64, "Mojang", "It Computes", false, 0));

        //Print Menu
        for (int i = 0; i <= ((inventory.size()) - 1); i++) {
            System.out.println(" " + (i + 1) + " | " + (inventory.get(i)).getItemName() + " | $" + (inventory.get(i)).getItemPrice() +
                    " | " + (inventory.get(i)).getItemQuantity() + " | " + (inventory.get(i)).getNumberInCart());
        }
        //Option Selector
        System.out.print(" \n 1 | Buy \n 2 | Remove From Cart \n 3 | Add Item \n 5 | Checkout"); //0 For reciept
        Scanner input = new Scanner(System.in);
        System.out.println("\nChoose an Option: ");
        userInputChoice = input.nextInt();
        if (userInputChoice > 4) {
            System.out.println("Checkout Time");
            }
        else
            //Choosing What To Do
            switch (userInputChoice) {
                case 1:
                    System.out.println("Buy Which Item? (number): ");
                    userChoice = (input.nextInt() - 1);
                    (inventory.get(userChoice)).buyItem();
                    System.out.println("One " + (inventory.get(userChoice)).getItemName() + " added to cart");
                    break;
                case 2:
                    System.out.println("You Want to Remove Something from your cart? \n unfortunate...");
                    break;
                case 3:
                    System.out.println(" ");
                    String invItemName = input.nextLine(); //Makes scanner not break
                    System.out.println("What is the item's name?: ");
                    invItemName = input.nextLine();
                    System.out.println("What is the item's price?: ");
                    double invItemPrice = input.nextDouble();
                    System.out.println("How many of this item do we have?: ");
                    int invQuantity = input.nextInt();
                    String junk = input.nextLine(); //Make scanner not break
                    System.out.println("Who sells this item?: ");
                    String invItemSeller = input.nextLine();
                    System.out.println("Give a good, short description of the item : ");
                    String invItemDescription = input.nextLine();
                    boolean invInCart = false;
                    int invNumberInCart = 0;
                    inventory.add(new item(invItemName,invItemPrice,invQuantity,invItemSeller,invItemDescription,invInCart,invNumberInCart));
                    //Repeat it back
                    int iL = ((inventory.size()) - 1);
                    System.out.println("A new " + inventory.get(iL).getItemName() + " with a price of $" + inventory.get(iL).getItemPrice()
                            + ", quantity of " + inventory.get(iL).getItemQuantity() + ", sold by "+inventory.get(iL).itemSeller() + ", and described as: '" + inventory.get(iL).getItemDescription() +
                            "' Has been added to the inventory");
                    break;
                case 4:
                    System.out.println("You Want to Remove Inventory? No, you're a nerd");  //Remove Item
                    break;
                case 0:
                    System.out.println("You're not supposed to be here, get out of my house");  //Reciepts
                    break;
                default:
                    System.out.println("Try again, you suck");
        }

        //Make new item

    }
}




