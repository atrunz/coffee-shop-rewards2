package org.codedifferently;
import java.util.ArrayList;
import java.util.List;


public class Customer {


    private String name;
    private String phoneNumber;
    private int points;
    private List<Purchase> myCart = new ArrayList<>();
    private String tier;

    public Customer (){
        this.name = "Bob";
        this.phoneNumber = "302-302-3023";
        this.points = 0;

    }
    public Customer (String name, String phoneNumber, int points){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void addToCart(Purchase item){
        this.myCart.add(item);
    }

    public List<Purchase> getMyCart() {
        return myCart;
    }

    public double getCost(List<Purchase> carts){
        double total = 0;
        for (Purchase cart : carts) {

            total = total + cart.getPrice();

        }
        return total;
    }

    public double getMyPoints(List<Purchase> cart){
        double totalCost = getCost(cart);
        double myPoints = totalCost/10;
        this.points = (int) myPoints;
        return myPoints;
    }

    public void reducePoints(int points){
        this.points = (this.points - points);
    }

    public void setTier(){
        if(this.getPoints() >= 1000){
            this.tier = "Gold";
        }else if (this.getPoints() >= 500){
            this.tier = "Silver";
        }else if (this.getPoints() >= 100){
            this.tier = "Bronze";

        }
    }

    public String getTier(){
        return tier;
    }
}
