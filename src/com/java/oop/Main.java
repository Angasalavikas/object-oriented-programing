package com.java.oop;
public class Main{
    static void main() {
        products products;
        products = new products(1,"laptop",12000,3.5f,4.4f,true);
//        products.id = 1;
//        products.name = "laptop";
//        products.maxRetailPrice = 39899;
//        products.discountPercentage = 20.5f;
//        products.rating = 4.5F;
//        products.isAvailable = true;
        System.out.println("id : " + products.id);
        System.out.println("name : " + products.name);
        System.out.println("MRP : " + products.maxRetailPrice);
        System.out.println("discountPercentage : " + products.discountPercentage);
        System.out.println("rating : " + products.rating);
        System.out.println("isAvailable : " + products.isAvailable);
        products products1 = new products(2,"car",8475,7.8f,3.4f,false);
        System.out.println("id : " + products.id);
        System.out.println("name : " + products.name);
        System.out.println("MRP : " + products.maxRetailPrice);
        System.out.println("discountPercentage : " + products.discountPercentage);
        System.out.println("rating : " + products.rating);
        System.out.println("isAvailable : " + products.isAvailable);
    }
}