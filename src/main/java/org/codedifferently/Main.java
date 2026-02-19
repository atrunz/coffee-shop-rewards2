package org.codedifferently;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//when i check the cart size, if total cost is over 20 give a bonus point
public class Main {
    public static void main(String[] args) {

        //create some customers
        Customer cust1 = new Customer("Alex", "302-314-5204", 0);
        Customer cust2 = new Customer("Bobby", "302-111-1111", 0);
        Customer cust3 = new Customer("Manny", "911-911-9111", 0);
        ArrayList<Customer> myCustomers = new ArrayList<>();

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

        InputLoop.inputloop(isRunning, isRunning2, scan, myCustomers, cust1, item1, item2, item3, item4, item5, item6);

        }
    }
