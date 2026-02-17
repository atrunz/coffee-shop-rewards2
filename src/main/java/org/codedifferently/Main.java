package org.codedifferently;

import java.util.Scanner;

//points are being tracked incorrectly, when we go back to buy more shit we don't lose the points we spent

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //create some customers
        Customer cust1 = new Customer("Alex", "302-314-5204", 0);
        Customer cust2 = new Customer("Bobby", "302-111-1111", 0);
        Customer cust3 = new Customer("Manny", "911-911-9111", 0);


        //create some menu items
        CoffeeItem item1 = new CoffeeItem("Latte", 10, true);
        CoffeeItem item2 = new CoffeeItem("Cold Brew", 10, true);
        CoffeeItem item3 = new CoffeeItem("Hot Chocolate", 10, true);
        CoffeeItem item4 = new CoffeeItem("Cappucino", 10, true);
        CoffeeItem item5 = new CoffeeItem("Mocha", 10, true);
        CoffeeItem item6 = new CoffeeItem("Egg Roll", 10, false);

        //points remaining variable
        int pointsRem = 0;

        //create scanner

        Scanner scan = new Scanner(System.in);

        boolean isRunning = true;
        System.out.println("Hello and welcome to triple C's!");
        System.out.println("What is your name?");
        String custName = scan.next();

        //this is kind of bad but I'm going to do it for now
        int custIndex = 4;
        Customer cust4 = null;


        if (custName.equals(cust1.getName())){
            //customer is alex
            custIndex = 1;
        }else if (custName.equals(cust2.getName())){
            //customer is bobby
            custIndex = 2;
        }else if (custName.equals(cust3.getName())){
            //customer is manny
            custIndex = 3;
        }else{
            //create new customer
            System.out.println("What is your phone number?");
            String phoneNumber = scan.next();

            cust4 = new Customer(custName, phoneNumber, 0);

        }



            System.out.println("We are currently offering:");
            System.out.println("1)." + item1.getItemName() + " for " + item1.getPrice());
            System.out.println("2)." + item2.getItemName() + " for " + item2.getPrice());
            System.out.println("3)." + item3.getItemName() + " for " + item3.getPrice());
            System.out.println("4)." + item4.getItemName() + " for " + item4.getPrice());
            System.out.println("5)." + item5.getItemName() + " for " + item5.getPrice());
            System.out.println("6)." + item6.getItemName() + " for " + item6.getPrice());

            System.out.println("If you are ready to checkout, please enter 7");

            System.out.println("What would you like to purchase?");
        do{
            String userInput = scan.next();
            switch (userInput){
                case "1":
                    //CoffeeItem Latte
                    switch (custIndex){
                        case 1:
                            //customer is alex
                            cust1.addToCart(item1);
                            System.out.println("You added a Latte to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");

                            break;
                        case 2:
                            cust2.addToCart(item1);
                            System.out.println("You added a Latte to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");

                            //customer is bobby
                            break;
                        case 3:
                            cust3.addToCart(item1);
                            System.out.println("You added a Latte to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");

                            //customer is manny
                            break;
                        case 4:
                            //customer is new
                            cust4.addToCart(item1);
                            System.out.println("You added a Latte to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");



                            break;
                    }

                    break;
                case "2":

                    //CoffeeItem Cold Brew
                    switch (custIndex){
                        case 1:
                            //customer is alex
                            cust1.addToCart(item2);
                            System.out.println("You added a Cold Brew to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");

                            break;
                        case 2:
                            cust2.addToCart(item2);
                            System.out.println("You added a Cold Brew to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");



                            //customer is bobby
                            break;
                        case 3:
                            cust3.addToCart(item2);
                            System.out.println("You added a Cold Brew to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");



                            //customer is manny
                            break;
                        case 4:
                            //customer is new
                            cust4.addToCart(item2);
                            System.out.println("You added a Cold Brew to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");



                            break;
                    }

                    break;
                case "3":
                    //CoffeeItem Hot Chocolate
                    switch (custIndex){
                        case 1:
                            //customer is alex
                            cust1.addToCart(item3);
                            System.out.println("You added a Hot Chocolate to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");


                            break;
                        case 2:
                            cust2.addToCart(item3);
                            System.out.println("You added a Hot Chocolate to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");



                            //customer is bobby
                            break;
                        case 3:
                            cust3.addToCart(item3);
                            System.out.println("You added a Hot Chocolate to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");



                            //customer is manny
                            break;
                        case 4:
                            //customer is new
                            cust4.addToCart(item3);
                            System.out.println("You added a Hot Chocolate to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");



                            break;
                    }

                    break;
                case "4":
                    //CoffeeItem Cappucino
                    switch (custIndex){
                        case 1:
                            //customer is alex
                            cust1.addToCart(item4);
                            System.out.println("You added a Cappucino to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");


                            break;
                        case 2:
                            cust2.addToCart(item4);
                            System.out.println("You added a Cappucino to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");



                            //customer is bobby
                            break;
                        case 3:
                            cust3.addToCart(item4);
                            System.out.println("You added a Cappucino to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");



                            //customer is manny
                            break;
                        case 4:
                            //customer is new
                            cust4.addToCart(item4);
                            System.out.println("You added a Cappucino to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");



                            break;
                    }

                    break;
                case "5":
                    //CoffeeItem Mocha
                    switch (custIndex){
                        case 1:
                            //customer is alex
                            cust1.addToCart(item5);
                            System.out.println("You added a Mocha to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");


                            break;
                        case 2:
                            cust2.addToCart(item5);
                            System.out.println("You added a Mocha to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");



                            //customer is bobby
                            break;
                        case 3:
                            cust3.addToCart(item5);
                            System.out.println("You added a Mocha to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");



                            //customer is manny
                            break;
                        case 4:
                            //customer is new
                            cust4.addToCart(item5);
                            System.out.println("You added a Mocha to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");



                            break;
                    }

                    break;
                case "6":
                    //CoffeeItem Egg Roll
                    switch (custIndex){
                        case 1:
                            //customer is alex
                            cust1.addToCart(item6);
                            System.out.println("You added an Egg Roll to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");


                            break;
                        case 2:
                            cust2.addToCart(item6);
                            System.out.println("You added an Egg Roll to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");



                            //customer is bobby
                            break;
                        case 3:
                            cust3.addToCart(item6);
                            System.out.println("You added an Egg Roll to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");



                            //customer is manny
                            break;
                        case 4:
                            //customer is new
                            cust4.addToCart(item6);
                            System.out.println("You added an Egg Roll to your cart");
                            System.out.println("Would you like to add anything else? (7 to checkout)");



                            break;
                    }

                    break;
                case "7":
                    //checkout
                    switch (custIndex){
                        case 1:
                            Checkout.checkout(cust1, scan, item1, item2, item3, item4, item5, item6);
                            cust1.setPoints(pointsRem);

                            isRunning = BuyAgain.buyagain();

                            break;
                        case 2:
                            Checkout.checkout(cust2, scan, item1, item2, item3, item4, item5, item6);
                            cust2.setPoints(pointsRem);

                            isRunning = BuyAgain.buyagain();

                            //customer is bobby
                            break;
                        case 3:
                            Checkout.checkout(cust3, scan, item1, item2, item3, item4, item5, item6);
                            //cust3.setPoints(pointsRem);

                            isRunning = BuyAgain.buyagain();

                            //customer is manny
                            break;
                        case 4:
                            //customer is new

                            Checkout.checkout(cust4, scan, item1, item2, item3, item4, item5, item6);
                            //cust4.setPoints(pointsRem);
                            isRunning = BuyAgain.buyagain();


                            break;


                    }

                    break;
                default:
                    System.out.println("PLEASE ENTER A VALID INPUT");

            }
        }while(isRunning);
    }
}