package org.codedifferently;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //create some customers
        Customer cust1 = new Customer("Alex", "302-314-5204", 0);
        Customer cust2 = new Customer("Bobby", "302-111-1111", 0);
        Customer cust3 = new Customer("Manny", "911-911-9111", 0);
        List<Customer> myCustomers = new ArrayList<>();

        myCustomers.add(cust1);
        myCustomers.add(cust2);
        myCustomers.add(cust3);


        //create some menu items
        CoffeeItem item1 = new CoffeeItem("Latte", 10, true);
        CoffeeItem item2 = new CoffeeItem("Cold Brew", 10, true);
        CoffeeItem item3 = new CoffeeItem("Hot Chocolate", 10, true);
        CoffeeItem item4 = new CoffeeItem("Cappucino", 10, true);
        CoffeeItem item5 = new CoffeeItem("Mocha", 10, true);
        CoffeeItem item6 = new CoffeeItem("Egg Roll", 10, false);


        //create scanner

        Scanner scan = new Scanner(System.in);

        boolean isRunning = true;
        boolean isRunning2 = true;
        //

        while (isRunning) {
            System.out.println("Hello and welcome to triple C's!");
            System.out.println("What is your name?");
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
                System.out.println("What is your phone number?");
                String phoneNumber = scan.next();

                cust1 = new Customer(custName, phoneNumber, 0);
                //add customer to our array list
                myCustomers.add(cust1);

            }

            //menu
            System.out.println("We are currently offering:");
            System.out.println("1)." + item1.getItemName() + " for $" + item1.getPrice());
            System.out.println("2)." + item2.getItemName() + " for $" + item2.getPrice());
            System.out.println("3)." + item3.getItemName() + " for $" + item3.getPrice());
            System.out.println("4)." + item4.getItemName() + " for $" + item4.getPrice());
            System.out.println("5)." + item5.getItemName() + " for $" + item5.getPrice());
            System.out.println("6)." + item6.getItemName() + " for $" + item6.getPrice());

            System.out.println("If you are ready to checkout, please enter 7");

            System.out.println("What would you like to purchase?");

            do{
                String userInput = scan.next();
                switch (userInput){
                    case "1":
                        //CoffeeItem Latte
                        cust1.addToCart(item1);
                        System.out.println("You added a Latte to your cart");
                        System.out.println("Would you like to add anything else? (7 to checkout)");

                        break;
                    case "2":
                        //CoffeeItem Cold Brew
                        cust1.addToCart(item2);
                        System.out.println("You added a Cold Brew to your cart");
                        System.out.println("Would you like to add anything else? (7 to checkout)");
                        break;
                    case "3":

                        cust1.addToCart(item3);
                        System.out.println("You added a Hot Chocolate to your cart");
                        System.out.println("Would you like to add anything else? (7 to checkout)");
                        break;
                    case "4":
                        //CoffeeItem Cappucino
                        cust1.addToCart(item4);
                        System.out.println("You added a Cappucino to your cart");
                        System.out.println("Would you like to add anything else? (7 to checkout)");
                        break;
                    case "5":
                        //CoffeeItem Mocha

                        cust1.addToCart(item5);
                        System.out.println("You added a Mocha to your cart");
                        System.out.println("Would you like to add anything else? (7 to checkout)");
                        break;
                    case "6":
                        //CoffeeItem Egg Roll
                        cust1.addToCart(item6);
                        System.out.println("You added an Egg Roll to your cart");
                        System.out.println("Would you like to add anything else? (7 to checkout)");

                    case "7":
                        //checkout

                        Checkout.checkout(cust1, scan, item1, item2, item3, item4, item5, item6);
                        isRunning2 = BuyAgain.buyagain(cust1, scan, item1, item2, item3, item4, item5, item6);
                        break;

                    default:
                        System.out.println("PLEASE ENTER A VALID INPUT");

                }
            }while(isRunning2);

            System.out.println("Is the store closing (y/n)");
            String userInput = scan.next();
            if (userInput.equalsIgnoreCase("y")){
                isRunning = false;
            }else{
                //keep running so we reset our other loop condition
                isRunning2 = true;
            }


        }
    }
}