package org.codedifferently;

public class Customer {

    private String name;
    private String phoneNumber;
    private int points;

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
}
