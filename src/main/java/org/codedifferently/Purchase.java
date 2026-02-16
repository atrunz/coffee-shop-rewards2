package org.codedifferently;

public class Purchase {
    private String itemName;
    private double price;
    private boolean isDrink;

    public Purchase(String itemName, double price, boolean isDrink){
        this.itemName = itemName;
        this.price = price;
        this.isDrink = isDrink;
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
}
