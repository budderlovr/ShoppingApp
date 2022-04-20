package com.epicCoolCompany;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int userInputChoice = 0;
        int userChoice = 0;

        //Inventory
        //item item1 = new item("Bees", 20.00, 20, "The Bee Man", "Don't Get Stung", false, 0 );
        //item item2 = new item("Beans", 25.50, 20, "Bush", "Tasty", false, 0 );
        //item item3 = new item("Laptop", 1399.99, 39, "ASUS", "It Computes", false, 0 );

        ArrayList<item> inventory = new ArrayList<item>();
        inventory.add (new item("Bees", 20.00, 20, "The Bee Man", "Don't Get Stung", false, 0));
        inventory.add (new item("Beans", 25.50, 20, "Bush", "Tasty", false, 0));
        inventory.add (new item("Laptop", 1399.99, 39, "ASUS", "It Computes", false, 0));
        inventory.add (new item("Cobblestone", 2.95, 64, "Mojang", "It Computes", false, 0));

        //Print Menu
        for (int i = 0; i <=((inventory.size())-1); i++) {
            System.out.println(" " + (i+1) + " | " + (inventory.get(i)).getItemName() + " | $" + (inventory.get(i)).getItemPrice() +
                    " | " + (inventory.get(i)).getItemQuantity() + " | " + (inventory.get(i)).getNumberInCart());
        }
        if(userInputChoice<5) {
            //Option Selector
            System.out.print(" \n 1 | Buy \n 2 | Sell \n 3 | Add Item \n 4 | Remove Item \n 5 | Checkout"); //0 For reciept
            Scanner input = new Scanner(System.in);
            System.out.println("\nChoose an Option: ");
            userChoice = input.nextInt();

            //Choosing What To Do
            switch (userInputChoice) {
                case 1:
                    System.out.println("Buy Which Item? (number): ");
                    userChoice = (input.nextInt() - 1);
                    (inventory.get(userChoice)).buyItem();
                    System.out.println("One " + (inventory.get(userChoice)).getItemName() + " added to cart");
                    break;
                case 2:
                    System.out.println("You Want to Sell? You Get $0");                     //Sell
                    break;
                case 3:
                    System.out.println("You Want to Add a New Item? We have 4 already");    //Add Item
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
        }
         else
             System.out.println("Checkout Time");



        }
    }

