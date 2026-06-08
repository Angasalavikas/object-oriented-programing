package com.java.oop.polymorphism;

public class Service {
     void validate(Product product) {
         System.out.println("product validate");
     }
         void displayDetails(Product product){
         product.displayDetail();

     }
}
