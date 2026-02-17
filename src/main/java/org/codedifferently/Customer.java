package org.codedifferently;
import java.util.ArrayList;
import java.util.List;


public class Customer {


    private String name;
    private String phoneNumber;
    private int points;
    private List<CoffeeItem> myCart = new ArrayList<>();
    private String tier = "No Tier";

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

    public void addToCart(CoffeeItem item){
        this.myCart.add(item);
    }

    public void clearCart(){this.myCart.clear();}

    public List<CoffeeItem> getMyCart() {
        return myCart;
    }

    public double getCost(List<CoffeeItem> carts){
        double total = 0;
        for (CoffeeItem cart : carts) {

            total = total + cart.getPrice();

        }
        return total;
    }

    public double getMyPoints(List<CoffeeItem> cart){
        double totalCost = getCost(cart);
        double myPoints = totalCost/10;
        this.points = this.points + (int) myPoints;
        this.myCart.clear();
        return myPoints;
    }

    public void reducePoints(int startPoints, int spentPoints){
        this.points = (startPoints - spentPoints);
    }

    public void setTier(int points){
        if(points >= 10){
            this.tier = "Gold";
        }else if (points >= 5){
            this.tier = "Silver";
        }else if (points >= 1){
            this.tier = "Bronze";

        }
    }

    public String getTier(){
        return tier;
    }
}
