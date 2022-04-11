package com.epicCoolCompany;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int userChoice = 0;

        //Main Bit
        System.out.println("1 | Buy \n 2 | Sell \n 3 | Add Item \n 4 | Remove Item \n 5 | Checkout"); //0 For reciept
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an Option");
        userChoice = input.nextInt();

        //Choosing What To Do
        switch (userChoice) {
            case 1: System.out.println("You Want to Buy? With What Money?");
                break;
            case 2: System.out.println("You Want to Sell? You Get $0");
                break;
            case 3: System.out.println("You Want to Add a New Item? We have 4 already");
                break;
            case 4: System.out.println("You Want to Remove Inventory? No, you're a nerd");
                break;
            case 5: System.out.println("Checkout? Gimme your social security number");
                break;
            case 0: System.out.println("You're not supposed to be here, get out of my house");
                break;
            default: System.out.println("Try again, you suck");
        }





    }
}
