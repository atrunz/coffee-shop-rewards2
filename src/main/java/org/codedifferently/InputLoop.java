package org.codedifferently;

import java.util.ArrayList;
import java.util.Scanner;

public class InputLoop {

    public static void inputloop(boolean isRunning, boolean isRunning2, Scanner scan, ArrayList<Customer> myCustomers, Customer cust1, CoffeeItem item1, CoffeeItem item2, CoffeeItem item3, CoffeeItem item4, CoffeeItem item5, CoffeeItem item6) {
        while (isRunning) {
            System.out.println("==================================");
            System.out.println("      ☕ Welcome to Triple C's ☕");
            System.out.println("==================================");
            System.out.println("Brewing addictions, one cup at a time.");
            System.out.println("--------------------------------------");
            System.out.println("What is your name?\n");
            String custName = scan.next();


            //if custName exists in the array, we'll find and use first occurrence
            boolean exists = false;
            for (Customer cust : myCustomers) {
                if (cust.getName().equals(custName)) {
                    cust1 = cust;
                    exists = true;
                    break;
                }
            }
            if (exists) {
                //customer exists, we already set it, do nothing
            } //otherwise new customer
            else {
                //create new customer
                System.out.println("\n☕ First time at Triple C's? We love new faces!");
                System.out.println("Let’s get you in the system.");
                System.out.print("📱 Enter your phone number: ");

                String phoneNumber;

                while (true) {
                    System.out.print("Enter phone number (xxx-xxx-xxxx): ");
                    phoneNumber = scan.next();

                    if (phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}")) {
                        break; // valid format, exit loop
                    } else {
                        System.out.println("Invalid format. Please use xxx-xxx-xxxx.");
                    }
                }

                cust1 = new Customer(custName, phoneNumber, 0);
                //add customer to our array list
                myCustomers.add(cust1);

            }

            //menu
            System.out.println("\n======================================");
            System.out.println("          ☕ TRIPLE C'S MENU ☕");
            System.out.println("======================================");

            System.out.printf(" 1) %-20s $%5.2f%n", item1.getItemName(), item1.getPrice());
            System.out.printf(" 2) %-20s $%5.2f%n", item2.getItemName(), item2.getPrice());
            System.out.printf(" 3) %-20s $%5.2f%n", item3.getItemName(), item3.getPrice());
            System.out.printf(" 4) %-20s $%5.2f%n", item4.getItemName(), item4.getPrice());
            System.out.printf(" 5) %-20s $%5.2f%n", item5.getItemName(), item5.getPrice());
            System.out.printf(" 6) %-20s $%5.2f%n", item6.getItemName(), item6.getPrice());

            System.out.println("--------------------------------------");
            System.out.println(" 7) Proceed to Checkout and Redeem Points 🛒");
            System.out.println("======================================");

            System.out.print("👉 What would you like to order? ");

            do {
                String userInput = scan.next();
                switch (userInput) {
                    case "1":
                        //CoffeeItem Latte
                        cust1.addToCart(item1);
                        System.out.println("\n✅ Latte added to your cart!");
                        System.out.println("--------------------------------------");
                        System.out.print("➕ Add another item or press 7 to checkout: ");

                        break;
                    case "2":
                        //CoffeeItem Cold Brew
                        cust1.addToCart(item2);
                        System.out.println("\n✅ Cold Brew added to your cart!");
                        System.out.println("--------------------------------------");
                        System.out.print("➕ Add another item or press 7 to checkout: ");
                        break;
                    case "3":

                        cust1.addToCart(item3);
                        System.out.println("\n✅ Hot Chocolate added to your cart!");
                        System.out.println("--------------------------------------");
                        System.out.print("➕ Add another item or press 7 to checkout: ");
                        break;
                    case "4":
                        //CoffeeItem Cappucino
                        cust1.addToCart(item4);
                        System.out.println("\n✅ Cappucino added to your cart!");
                        System.out.println("--------------------------------------");
                        System.out.print("➕ Add another item or press 7 to checkout: ");
                        break;
                    case "5":
                        //CoffeeItem Mocha

                        cust1.addToCart(item5);
                        System.out.println("\n✅ Mocha added to your cart!");
                        System.out.println("--------------------------------------");
                        System.out.print("➕ Add another item or press 7 to checkout: ");
                        break;
                    case "6":
                        //CoffeeItem Egg Roll
                        cust1.addToCart(item6);
                        System.out.println("\n✅ Egg Roll added to your cart!");
                        System.out.println("--------------------------------------");
                        System.out.print("➕ Add another item or press 7 to checkout: ");
                        break;

                    case "7":
                        //checkout

                        Checkout.checkout(cust1, scan, item1, item2, item3, item4, item5, item6);
                        isRunning2 = BuyAgain.buyagain(cust1, scan, item1, item2, item3, item4, item5, item6);
                        break;

                    default:
                        System.out.println("\n☕ Oops! That’s not on the menu.");
                        System.out.print("Please select a valid option: ");
                        break;
                }
            } while (isRunning2);

            boolean isInvalidInput = true;
            while (isInvalidInput) {
                System.out.print("\n🕒 Is the store closing for the day? (y/n): ");
                String userInput = scan.next();
                if (userInput.equalsIgnoreCase("y")) {
                    isRunning = false;
                    isInvalidInput = false;
                } else if (userInput.equalsIgnoreCase("n")) {
                    //keep running so we reset our other loop condition
                    isRunning2 = true;
                    isInvalidInput = false;
                } else {
                    System.out.println("Please enter y or n");
                }
            }

        }
    }
}
