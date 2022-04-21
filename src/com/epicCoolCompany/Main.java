package com.epicCoolCompany;

import java.time.Instant;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    static ArrayList<item> inventory = new ArrayList<item>();

    public static void printMenu() {
        int userChoice = 0;
        int userInputChoice = 0;

        //Print Menu
        for (int b = 0; b<60; b++ ) {
            System.out.print("-");
        }
        System.out.println("\n # | Name | Price | # On Hand | # in Cart | Description \n -----------------------------------------------------------");
        for (int i = 0; i <= ((inventory.size())-1); i++) {
            System.out.println(" " + (i + 1) + " | " + (inventory.get(i)).getItemName() + " | $" + (inventory.get(i)).getItemPrice() +
                    " | " + (inventory.get(i)).getItemQuantity() + " | " + (inventory.get(i)).getNumberInCart() + " | " + (inventory.get(i)).getItemDescription());
        }
        //Option Selector
        System.out.print(" \n 1 | Buy \n 2 | Remove From Cart \n 3 | Add Listing \n 4 | Remove Listing \n 5 | Checkout"); //0 For reciept
        Scanner input = new Scanner(System.in);
        System.out.println("\nChoose an Option: ");
        userInputChoice = input.nextInt();

        //Choosing What To Do
        switch (userInputChoice) {
            case 1: // Buying
            {
                System.out.println("Buy Which Item? (number): ");
                userChoice = (input.nextInt() - 1);
                item i = inventory.get(userChoice);
                int q = i.getItemQuantity();
                System.out.println("How many? (number): ");
                int numberBought = input.nextInt();
                if (numberBought > (inventory.get(userChoice)).quantity)
                    System.out.println("Sorry, we don't have that many on hand. Please try a lesser amount...");
                else {
                    (i).setItemQuantity(q - numberBought);
                    (i).setNumberInCart(((i).numberInCart) + numberBought);
                    System.out.println(numberBought + " " + (i).getItemName() + " added to cart");
                }

                break;
            }
            case 2: //Remove from cart
            {
                System.out.println("Which item do you want to remove?");
                userChoice = (input.nextInt() - 1);
                if ((inventory.get(userChoice).numberInCart) < 1)
                    System.out.println("You do not have any of those in your cart...");
                else
                    System.out.println("How many? (You have " + inventory.get(userChoice).numberInCart + ")");
                int remFromCart = (input.nextInt() - 1);
                if (remFromCart > (inventory.get(userChoice).numberInCart))
                    System.out.println("That's more than you have in your cart");
                else {
                    inventory.get(userChoice).setNumberInCart((inventory.get(userChoice).numberInCart) - remFromCart);
                    inventory.get(userChoice).setItemQuantity((inventory.get(userChoice).quantity) + remFromCart);
                }
                break;
            }
            case 3: //Add Inventory
            {
                System.out.println(" ");
                String junk = input.nextLine(); //Makes scanner not break
                System.out.println("What is the item's name?: ");
                String invItemName = input.nextLine();
                System.out.println("What is the item's price?: ");
                double invItemPrice = input.nextDouble();
                System.out.println("How many of this item do we have?: ");
                int invQuantity = input.nextInt();
                junk = input.nextLine(); //Make scanner not break
                System.out.println("Who sells this item?: ");
                String invItemSeller = input.nextLine();
                System.out.println("Give a good, short description of the item : ");
                String invItemDescription = input.nextLine();
                boolean invInCart = false;
                int invNumberInCart = 0;
                inventory.add(new item((invItemName), (invItemPrice), (invQuantity), (invItemSeller), (invItemDescription), (invInCart), (invNumberInCart)));
                //Repeat it back
                int iL = ((inventory.size()) - 1);
                System.out.println("A new " + inventory.get(iL).getItemName() + " with a price of $" + inventory.get(iL).getItemPrice()
                        + ", quantity of " + inventory.get(iL).getItemQuantity() + ", sold by " + inventory.get(iL).itemSeller() + ", and described as: '" + inventory.get(iL).getItemDescription() +
                        "' Has been added to the inventory");
                break;
            }
            case 4: //Delete Listings
            {
                System.out.println("Which Listing Shall be Eliminated?");
                userChoice = (input.nextInt() - 1);
                System.out.println("The listing for " + inventory.get(userChoice).getItemName() + " has been Deleted");
                inventory.remove(userChoice);
                break;
            }
            case 5: //Checkout and End
            {
                System.out.println("Checking out on " + Date.from(Instant.now()));
                double total = 0.00;
                for (int i = 0; i <= ((inventory.size()) - 1); i++)
                    if (inventory.get(i).numberInCart > 0) {
                        total += (inventory.get(i).numberInCart) * (inventory.get(i).getItemPrice());
                        System.out.print((inventory.get(i).getItemName()) + " - $" + (inventory.get(i).getItemPrice()) + " - x " + (inventory.get(i).getNumberInCart())
                                + " = $" + Math.round((((inventory.get(i).getItemPrice() * (inventory.get(i).getNumberInCart())))) * 100.00) / 100.00 + "\n");
                    } else
                        continue;
                System.out.println("Your total comes to: $" + Math.round(total * 100.00) / 100.00);
                System.exit(39);
                break;
            }
            case 0: //????
            {
                System.out.println("You're not supposed to be here, get out of my house");  //Reciepts
                break;
            }
            default:
                System.out.println("Sorry, that's not a valid option...");
        }
        printMenu();
    }


    public static void main(String[] args) {
        // write your code here

        //Add Initial Inventory
        {
            inventory.add(new item("Bees", 20.00, 20, "The Bee Man", "Don't Get Stung", false, 0));
            inventory.add(new item("Beans", 25.50, 20, "Bush", "Tasty", false, 0));
            inventory.add(new item("Laptop", 1399.99, 39, "ASUS", "It Computes", false, 0));
            inventory.add(new item("Cobblestone", 2.95, 64, "Mojang", "It Computes", false, 0));
        }
        printMenu();

    }
}




