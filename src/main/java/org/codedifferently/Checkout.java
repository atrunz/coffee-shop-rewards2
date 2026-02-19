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
        System.out.println("\n========================================");
        System.out.printf(" ⭐ Loyalty Points Balance: %d ⭐%n", cust1.getPoints());
        System.out.println("========================================");

        boolean isInvalid = true;
        String check = "";
        while (isInvalid) {
            System.out.print("Redeem points for rewards? (y/n): ");
            check = scan.next();

            if (check.equalsIgnoreCase("y")){
                isInvalid = false;
            }else if (check.equalsIgnoreCase("n")){
                isInvalid = false;
            }else{
                System.out.println("Please enter a valid input! (y/n)");
            }
        }

        if (check.equals("y")){
            boolean isPointShopping = true;
            do{
                System.out.println("\n========================================");
                System.out.println("        ⭐ TRIPLE C'S REWARDS ⭐");
                System.out.println("========================================");

                System.out.printf(" 🎯 Current Points Balance: %d%n%n", cust1.getPoints());

                System.out.printf(" 1) %-22s %6d pts%n", item1.getItemName(), item1.getPointCost());
                System.out.printf(" 2) %-22s %6d pts%n", item2.getItemName(), item2.getPointCost());
                System.out.printf(" 3) %-22s %6d pts%n", item3.getItemName(), item3.getPointCost());
                System.out.printf(" 4) %-22s %6d pts%n", item4.getItemName(), item4.getPointCost());
                System.out.printf(" 5) %-22s %6d pts%n", item5.getItemName(), item5.getPointCost());
                System.out.printf(" 6) %-22s %6d pts%n", item6.getItemName(), item6.getPointCost());

                System.out.println("----------------------------------------");
                System.out.println(" 7) Finish Redeeming");
                System.out.println("========================================");

                System.out.print("👉 Select a reward: ");
                String selection = scan.next();


                switch(selection){
                    case "1":
                        //if user has enough points
                        //spend points on the item and subtract points spent
                        //else say they don't have enough for this item
                        if(cust1.getPoints() > item1.getPointCost()){
                            //spend points on item and subtract points spent
                            System.out.printf("\n🎉 Congratulations! You redeemed %s for %d points.%n",
                                    item1.getItemName(),
                                    item1.getPointCost());                            //subtract points
                            cust1.reducePoints(cust1.getPoints(), item1.getPointCost());
                        }else{
                            System.out.println("\n⚠ We're sorry, you don't have enough points for that reward.");
                            System.out.print("Earn more points or choose another option: ");                        }
                        break;
                    case "2":
                        if(cust1.getPoints() > item2.getPointCost()){
                            //spend points on item and subtract points spent
                            System.out.printf("\n🎉 Congratulations! You redeemed %s for %d points.%n",
                                    item2.getItemName(),
                                    item2.getPointCost());                             //subtract points
                            cust1.reducePoints(cust1.getPoints(), item2.getPointCost());
                        }else{
                            System.out.println("\n⚠ We're sorry, you don't have enough points for that reward.");
                            System.out.print("Earn more points or choose another option: ");
                        }
                        break;
                    case "3":
                        if(cust1.getPoints() > item3.getPointCost()){
                            //spend points on item and subtract points spent
                            System.out.printf("\n🎉 Congratulations! You redeemed %s for %d points.%n",
                                    item3.getItemName(),
                                    item3.getPointCost());                                 //subtract points
                            cust1.reducePoints(cust1.getPoints(), item3.getPointCost());
                        }else{
                            System.out.println("\n⚠ We're sorry, you don't have enough points for that reward.");
                            System.out.print("Earn more points or choose another option: ");
                        }
                        break;
                    case "4":
                        if(cust1.getPoints() > item4.getPointCost()){
                            //spend points on item and subtract points spent
                            System.out.printf("\n🎉 Congratulations! You redeemed %s for %d points.%n",
                                    item4.getItemName(),
                                    item4.getPointCost());                                 //subtract points
                            cust1.reducePoints(cust1.getPoints(), item4.getPointCost());
                        }else{
                            System.out.println("\n⚠ We're sorry, you don't have enough points for that reward.");
                            System.out.print("Earn more points or choose another option: ");
                        }
                        break;
                    case "5":
                        if(cust1.getPoints() > item5.getPointCost()){
                            //spend points on item and subtract points spent
                            System.out.printf("\n🎉 Congratulations! You redeemed %s for %d points.%n",
                                    item5.getItemName(),
                                    item5.getPointCost());                                 //subtract points
                            cust1.reducePoints(cust1.getPoints(), item5.getPointCost());
                        }else{
                            System.out.println("\n⚠ We're sorry, you don't have enough points for that reward.");
                            System.out.print("Earn more points or choose another option: ");
                        }
                        break;
                    case "6":
                        if(cust1.getPoints() > item6.getPointCost()){
                            //spend points on item and subtract points spent
                            System.out.printf("\n🎉 Congratulations! You redeemed %s for %d points.%n",
                                    item6.getItemName(),
                                    item6.getPointCost());                                 //subtract points
                            cust1.reducePoints(cust1.getPoints(), item6.getPointCost());
                        }else{
                            System.out.println("\n⚠ We're sorry, you don't have enough points for that reward.");
                            System.out.print("Earn more points or choose another option: ");
                        }
                        break;
                    case "7":
                        //done point shopping
                        isPointShopping = false;
                        break;
                    default:
                        System.out.println("\n☕ That option isn’t on the menu.");
                        System.out.print("Try selecting one of the listed numbers (1-7): ");
                        break;
                }
                //menu items and point prices
            }while(isPointShopping);

            //use points
            //ask what they want to redeem for
            //if they have enough, subtract
            //if not, tell them they don't have enough

            cust1.setTier(cust1.getPoints());

            System.out.printf("\n👤 Customer: %s | 🏅 Tier: %s | 🎯 Points: %d%n%n",
                    cust1.getName(),
                    cust1.getTier(),
                    cust1.getPoints());

        }else{
            //print final output
            cust1.setTier(cust1.getPoints());

            System.out.printf("\n👤 Customer: %s | 🏅 Tier: %s | 🎯 Points: %d%n%n",
                    cust1.getName(),
                    cust1.getTier(),
                    cust1.getPoints());
        }

    }
}
