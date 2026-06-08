package com.java.oop.inheritance;

public class Service {
    void validate(Products product){
        System.out.println("validate product");
    }
//    void validate(Laptop laptop){
//        System.out.println("validate laptop");
//    }
//    void validate(Book book){
//        System.out.println("validate book");
   // }
    void displayDetails(Products product){
        product.displayDetails();
    }
}
