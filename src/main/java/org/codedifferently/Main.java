package org.codedifferently;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //create some customers
        Customer cust1 = new Customer("Alex", "302-314-5204", 0);
        Customer cust2 = new Customer("Bobby", "302-111-1111", 0);
        Customer cust3 = new Customer("Manny", "911-911-9111", 0);


        //create some menu items
        Purchase item1 = new Purchase("Latte", 10, true);
        Purchase item2 = new Purchase("Cold Brew", 10, true);
        Purchase item3 = new Purchase("Hot Chocolate", 10, true);
        Purchase item4 = new Purchase("Cappucino", 10, true);
        Purchase item5 = new Purchase("Mocha", 10, true);
        Purchase item6 = new Purchase("Egg Roll", 10, false);

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
            System.out.println(item1.getItemName() + " for " + item1.getPrice());
            System.out.println(item2.getItemName() + " for " + item2.getPrice());
            System.out.println(item3.getItemName() + " for " + item3.getPrice());
            System.out.println(item4.getItemName() + " for " + item4.getPrice());
            System.out.println(item5.getItemName() + " for " + item5.getPrice());
            System.out.println(item6.getItemName() + " for " + item6.getPrice());

            System.out.println("If you are ready to checkout, please enter 7");

            System.out.println("What would you like to purchase?");
        do{
            String userInput = scan.next();
            switch (userInput){
                case "1":
                    //purchase Latte
                    switch (custIndex){
                        case 1:
                            //customer is alex
                            cust1.addToCart(item1);
                            break;
                        case 2:
                            cust2.addToCart(item1);

                            //customer is bobby
                            break;
                        case 3:
                            cust3.addToCart(item1);

                            //customer is manny
                            break;
                        case 4:
                            //customer is new
                            cust4.addToCart(item1);

                            break;
                    }

                    break;
                case "2":

                    //purchase Cold Brew
                    switch (custIndex){
                        case 1:
                            //customer is alex
                            cust1.addToCart(item2);
                            break;
                        case 2:
                            cust2.addToCart(item2);

                            //customer is bobby
                            break;
                        case 3:
                            cust3.addToCart(item2);

                            //customer is manny
                            break;
                        case 4:
                            //customer is new
                            cust4.addToCart(item2);

                            break;
                    }

                    break;
                case "3":
                    //purchase Hot Chocolate
                    switch (custIndex){
                        case 1:
                            //customer is alex
                            cust1.addToCart(item3);
                            break;
                        case 2:
                            cust2.addToCart(item3);

                            //customer is bobby
                            break;
                        case 3:
                            cust3.addToCart(item3);

                            //customer is manny
                            break;
                        case 4:
                            //customer is new
                            cust4.addToCart(item3);

                            break;
                    }

                    break;
                case "4":
                    //purchase Cappucino
                    switch (custIndex){
                        case 1:
                            //customer is alex
                            cust1.addToCart(item4);
                            break;
                        case 2:
                            cust2.addToCart(item4);

                            //customer is bobby
                            break;
                        case 3:
                            cust3.addToCart(item4);

                            //customer is manny
                            break;
                        case 4:
                            //customer is new
                            cust4.addToCart(item4);

                            break;
                    }

                    break;
                case "5":
                    //purchase Mocha
                    switch (custIndex){
                        case 1:
                            //customer is alex
                            cust1.addToCart(item5);
                            break;
                        case 2:
                            cust2.addToCart(item5);

                            //customer is bobby
                            break;
                        case 3:
                            cust3.addToCart(item5);

                            //customer is manny
                            break;
                        case 4:
                            //customer is new
                            cust4.addToCart(item5);

                            break;
                    }

                    break;
                case "6":
                    //purchase Egg Roll
                    switch (custIndex){
                        case 1:
                            //customer is alex
                            cust1.addToCart(item6);
                            break;
                        case 2:
                            cust2.addToCart(item6);

                            //customer is bobby
                            break;
                        case 3:
                            cust3.addToCart(item6);

                            //customer is manny
                            break;
                        case 4:
                            //customer is new
                            cust4.addToCart(item6);

                            break;
                    }

                    break;
                case "7":
                    //checkout
                    switch (custIndex){
                        case 1:
                            isRunning = Checkout.checkout(cust1, scan, item1, item2, item3, item4, item5, item6);


                            break;
                        case 2:
                            isRunning = Checkout.checkout(cust2, scan, item1, item2, item3, item4, item5, item6);


                            //customer is bobby
                            break;
                        case 3:
                            isRunning = Checkout.checkout(cust3, scan, item1, item2, item3, item4, item5, item6);


                            //customer is manny
                            break;
                        case 4:
                            //customer is new
                            isRunning = Checkout.checkout(cust4, scan, item1, item2, item3, item4, item5, item6);


                            break;


                    }

                    break;
                default:
                    System.out.println("PLEASE ENTER A VALID INPUT");

            }
        }while(isRunning);
    }
}