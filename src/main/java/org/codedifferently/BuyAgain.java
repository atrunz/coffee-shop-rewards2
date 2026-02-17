package org.codedifferently;

import java.util.Scanner;

public class BuyAgain {
//if I want this loop to run, I have to figure out why points aren't getting update properly
    public static boolean buyagain(Customer cust1, Scanner scan, CoffeeItem item1, CoffeeItem item2, CoffeeItem item3, CoffeeItem item4, CoffeeItem item5, CoffeeItem item6) {
        System.out.println("Would you like to buy more product? (y/n)");
        String check2 = scan.next();

        if (check2.equals("y")) {
            System.out.println("We are currently offering:");
            System.out.println("1)." + item1.getItemName() + " for $" + item1.getPrice());
            System.out.println("2)." + item2.getItemName() + " for $" + item2.getPrice());
            System.out.println("3)." + item3.getItemName() + " for $" + item3.getPrice());
            System.out.println("4)." + item4.getItemName() + " for $" + item4.getPrice());
            System.out.println("5)." + item5.getItemName() + " for $" + item5.getPrice());
            System.out.println("6)." + item6.getItemName() + " for $" + item6.getPrice());

            System.out.println("If you are ready to checkout, please enter 7");

            System.out.println("What would you like to purchase?");
            return true;
        } else {
            System.out.println("Thank you for your business, have a nice day!");//exit program thank user and tell them to have a nice day
            return false;
        }
    }
}
