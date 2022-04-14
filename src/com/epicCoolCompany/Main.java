package com.epicCoolCompany;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


    int userChoice = 0;

        String[] cart = {""};
        String[] inventory = {"Bees", "Beans", "Laptop", "Anchovy", "Child", "Umbrella"};
        //Inventory
        item item1 = new item("Bees", 20.00, 20, "The Bee Man", "Don't Get Stung", false, 0 );
        item item2 = new item("Beans", 25.50, 20, "Bush", "Tasty", false, 0 );

        System.out.println(" 1 | " + item1.getItemName() + " | $" + item1.getItemPrice() + " | " + item1.getItemQuantity()  );
        System.out.println(" 2 | " + item2.getItemName() + " | $" + item2.getItemPrice() + " | " + item2.getItemQuantity()  );
        //Main Bit
        System.out.println(" 1 | Buy \n 2 | Sell \n 3 | Add Item \n 4 | Remove Item \n 5 | Checkout"); //0 For reciept
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an Option");
        userChoice = input.nextInt();

        //Choosing What To Do
        switch (userChoice) {
            case 1: System.out.println("You Want to Buy? With What Money?");                //Buy
                break;
            case 2: System.out.println("You Want to Sell? You Get $0");                     //Sell
                break;
            case 3: System.out.println("You Want to Add a New Item? We have 4 already");    //Add Item
                break;
            case 4: System.out.println("You Want to Remove Inventory? No, you're a nerd");  //Remove Item
                break;
            case 5: System.out.println("Checkout? Gimme your social security number");      //Checkout
                break;
            case 0: System.out.println("You're not supposed to be here, get out of my house");  //Reciepts
                break;
            default: System.out.println("Try again, you suck");
        }




    }
}
