package org.codedifferently;

import java.util.Scanner;

public class BuyAgain {
//if I want this loop to run, I have to figure out why points aren't getting update properly
    public static boolean buyagain(Customer cust1, Scanner scan, CoffeeItem item1, CoffeeItem item2, CoffeeItem item3, CoffeeItem item4, CoffeeItem item5, CoffeeItem item6) {
        boolean isInvalid = true;
        String check2 = "";
        while (isInvalid) {
            System.out.print("\n🛒 Would you like to order anything else? (y/n): ");
            check2 = scan.next();

            if (check2.equalsIgnoreCase("y")){
                isInvalid = false;
            }else if (check2.equalsIgnoreCase("n")){
                isInvalid = false;
            }else{
                System.out.println("Please enter a valid input! (y/n)");
            }
        }

        if (check2.equals("y")) {
            System.out.println("\n========================================");
            System.out.println("            ☕ TRIPLE C'S MENU ☕");
            System.out.println("========================================");

            System.out.printf(" 1) %-22s $%6.2f%n", item1.getItemName(), item1.getPrice());
            System.out.printf(" 2) %-22s $%6.2f%n", item2.getItemName(), item2.getPrice());
            System.out.printf(" 3) %-22s $%6.2f%n", item3.getItemName(), item3.getPrice());
            System.out.printf(" 4) %-22s $%6.2f%n", item4.getItemName(), item4.getPrice());
            System.out.printf(" 5) %-22s $%6.2f%n", item5.getItemName(), item5.getPrice());
            System.out.printf(" 6) %-22s $%6.2f%n", item6.getItemName(), item6.getPrice());

            System.out.println("----------------------------------------");
            System.out.println(" 7) Proceed to Checkout 🛒");
            System.out.println("========================================");

            System.out.print("👉 Please select an option: ");
            return true;
        } else {
            System.out.println("\n========================================");
            System.out.println(" ☕ Thank you for visiting Triple C's!");
            System.out.println(" We hope to see you again soon.");
            System.out.println(" Have a wonderful day! 🌞");
            System.out.println("========================================\n");
            return false;
        }
    }
}
