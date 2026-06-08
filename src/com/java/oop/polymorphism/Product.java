package com.java.oop.polymorphism;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    float discountPrice;
    float rating;
    boolean isAvailable;

    public Product() {
        System.out.println("construct is called");
    }

    public Product(int id, String name, int maxRetailPrice, float discountPrice, float rating, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPrice = discountPrice;
        this.rating = rating;
        this.isAvailable = isAvailable;
    }
    void displayDetail(){
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("MRP: " + maxRetailPrice);
        System.out.println("discountPrice: " + discountPrice);
        System.out.println("rating: " + rating);
        System.out.println("isAvailable: " + isAvailable);
    }
}
