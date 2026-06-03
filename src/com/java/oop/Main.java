//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.java.oop;
public class Main{
    static void main() {
        products products;
        products = new products();
        products.id = 1;
        products.name = "laptop";
        products.maxRetailPrice = 39899;
        products.discountPercentage = 20.5f;
        products.rating = 4.5F;
        products.isAvailable = true;
        System.out.println("id : " + products.id);
        System.out.println("name : " + products.name);
        System.out.println("MRP : " + products.maxRetailPrice);
        System.out.println("discountPercentage : " + products.discountPercentage);
        System.out.println("rating : " + products.rating);
        System.out.println("isAvailable : " + products.isAvailable);
    }
}