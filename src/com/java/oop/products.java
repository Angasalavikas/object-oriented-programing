package com.java.oop;

public class products {
    int id;
    String name;
    double maxRetailPrice;
    float discountPercentage;
    float rating;
    boolean isAvailable;

    public products(int id, String name, double maxRetailPrice, float discountPercentage, float rating, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.isAvailable = isAvailable;
        System.out.println("products() is called :");
    }
}
