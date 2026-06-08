package com.java.oop.polymorphism;

public class Main {
    static void main() {
        Product product = new Product();
        Product product1 = new Product(101,"car",325534,50f,5.7f,false);
        product1.displayDetail();
        Laptop laptop = new Laptop(102,"MacBookPro",200,20f,3.5f,false,130,4,"os");
        laptop.displayDetail();
        Book book = new Book(103,"English Grammar",300,30f,4.5f,true,"vikas",120,"kittu");
        book.displayDetail();
        Service service = new Service();
        service.validate(product);
        service.displayDetails(laptop);
    }
}