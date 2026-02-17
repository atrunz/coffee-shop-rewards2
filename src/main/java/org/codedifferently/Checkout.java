package org.codedifferently;

import java.util.Scanner;

public class Checkout {

    public static void checkout(Customer cust1, Scanner scan, CoffeeItem item1, CoffeeItem item2, CoffeeItem item3, CoffeeItem item4, CoffeeItem item5, CoffeeItem item6){
        //customer is alex checkout
        //for each item in the cart, add points based on total price over 10

        //this should give total number of points within our cart

        //would you like to redeem?

        //if yes, check if enough points,

        //

        cust1.getMyPoints(cust1.getMyCart());
        System.out.println("You have: " + cust1.getPoints() + " points");
        System.out.println("Would you like to redeem some points (y/n)");
        //check yes or no
        String check = scan.next();

        if (check.equals("y")){
            boolean isPointShopping = true;
            do{
                System.out.println("You currently have: " + cust1.getPoints() + " points");
                System.out.println("What would you like to spend points on?");
                System.out.println("1). " + item1.getItemName() + " for " + item1.getPointCost());
                System.out.println("2). " + item2.getItemName() + " for " + item2.getPointCost());
                System.out.println("3). " + item3.getItemName() + " for " + item3.getPointCost());
                System.out.println("4). " + item4.getItemName() + " for " + item4.getPointCost());
                System.out.println("5). " + item5.getItemName() + " for " + item5.getPointCost());
                System.out.println("6). " + item6.getItemName() + " for " + item6.getPointCost());
                System.out.println("7). I'm done spending points.");
                String selection = scan.next();


                switch(selection){
                    case "1":
                        //if user has enough points
                        //spend points on the item and subtract points spent
                        //else say they don't have enough for this item
                        if(cust1.getPoints() > item1.getPointCost()){
                            //spend points on item and subtract points spent
                            System.out.println("Congratulations! You got " + item1.getItemName() + " for " + item1.getPointCost() + " points");
                            //subtract points
                            cust1.reducePoints(cust1.getPoints(), item1.getPointCost());
                        }else{
                            System.out.println("We're sorry, you do not have enough points to purchase this item.");
                        }
                        break;
                    case "2":
                        if(cust1.getPoints() > item2.getPointCost()){
                            //spend points on item and subtract points spent
                            System.out.println("Congratulations! You got " + item2.getItemName() + " for " + item2.getPointCost() + " points");
                            //subtract points
                            cust1.reducePoints(cust1.getPoints(), item2.getPointCost());
                        }else{
                            System.out.println("We're sorry, you do not have enough points to purchase this item.");
                        }
                        break;
                    case "3":
                        if(cust1.getPoints() > item3.getPointCost()){
                            //spend points on item and subtract points spent
                            System.out.println("Congratulations! You got " + item3.getItemName() + " for " + item3.getPointCost() + " points");
                            //subtract points
                            cust1.reducePoints(cust1.getPoints(), item3.getPointCost());
                        }else{
                            System.out.println("We're sorry, you do not have enough points to purchase this item.");
                        }
                        break;
                    case "4":
                        if(cust1.getPoints() > item4.getPointCost()){
                            //spend points on item and subtract points spent
                            System.out.println("Congratulations! You got " + item4.getItemName() + " for " + item4.getPointCost() + " points");
                            //subtract points
                            cust1.reducePoints(cust1.getPoints(), item4.getPointCost());
                        }else{
                            System.out.println("We're sorry, you do not have enough points to purchase this item.");
                        }
                        break;
                    case "5":
                        if(cust1.getPoints() > item5.getPointCost()){
                            //spend points on item and subtract points spent
                            System.out.println("Congratulations! You got " + item5.getItemName() + " for " + item5.getPointCost() + " points");
                            //subtract points
                            cust1.reducePoints(cust1.getPoints(), item5.getPointCost());
                        }else{
                            System.out.println("We're sorry, you do not have enough points to purchase this item.");
                        }
                        break;
                    case "6":
                        if(cust1.getPoints() > item6.getPointCost()){
                            //spend points on item and subtract points spent
                            System.out.println("Congratulations! You got " + item6.getItemName() + " for " + item6.getPointCost() + " points");
                            //subtract points
                            cust1.reducePoints(cust1.getPoints(), item6.getPointCost());
                        }else{
                            System.out.println("We're sorry, you do not have enough points to purchase this item.");
                        }
                        break;
                    case "7":
                        //done point shopping
                        isPointShopping = false;
                        break;
                    default:
                        System.out.println("Please pick a valid choice");
                }
                //menu items and point prices
            }while(isPointShopping);

            //use points
            //ask what they want to redeem for
            //if they have enough, subtract
            //if not, tell them they don't have enough

            cust1.setTier(cust1.getPoints());

            System.out.println("Customer name: " + cust1.getName() + " Customer tier: " + cust1.getTier() + " Customer points: " + cust1.getPoints());


        }else{
            //print final output
            cust1.setTier(cust1.getPoints());

            System.out.println("Customer name: " + cust1.getName() + "Customer tier: " + cust1.getTier() + "Customer points: " + cust1.getPoints());

        }

    }
}
