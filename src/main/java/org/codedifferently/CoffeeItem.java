package org.codedifferently;

public class CoffeeItem {
    private String itemName;
    private double price;
    private boolean isDrink;
    private int pointCost;

    public CoffeeItem(String itemName, double price, boolean isDrink){
        this.itemName = itemName;
        this.price = price;
        this.isDrink = isDrink;
        this.pointCost = (int) (price/10 * 3.2);
    }

    public boolean isDrink() {
        return isDrink;
    }

    public double getPrice() {
        return price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setDrink(boolean drink) {
        isDrink = drink;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPointCost() {
        return pointCost;
    }

     public void setPointCost(int cost){
        this.pointCost = cost;
     }
}
