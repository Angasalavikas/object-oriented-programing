package com.java.oop.inheritance;

import com.java.oop.products;

public class Products {
    int id;
    String name;
    double maxRetailPrice;
    float discountPercentage;
    float rating;
    boolean isAvailable;

    public Products() {
        System.out.println("constructor is called ");
    }

    public Products(int id, String name, double maxRetailPrice, float discountPercentage, float rating, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.isAvailable = isAvailable;
    }
    void displayProductsDetails(){
        System.out.println("id :" + id);
        System.out.println("name :" + name);
        System.out.println("MRP :" + maxRetailPrice);
        System.out.println("rating :" + rating);
        System.out.println("isAvailable:" + isAvailable);
    }
    void displayProductDetails(String company){
        System.out.println("company: " + company);
    }
    void displayProductDetails(String company,int year){
        System.out.println("company: " + company + "year:" + year);
    }
}
