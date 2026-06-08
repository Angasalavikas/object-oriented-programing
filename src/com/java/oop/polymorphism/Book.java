package com.java.oop.polymorphism;

public class Book extends Product {
    String name;
    int pages;
    String publisher;

    public Book() {
    }

    public Book(int id, String name, int maxRetailPrice, float discountPrice, float rating, boolean isAvailable, String name1, int pages, String publisher) {
        super(id, name, maxRetailPrice, discountPrice, rating, isAvailable);
        this.name = name;
        this.pages = pages;
        this.publisher = publisher;
    }
    @Override
    void displayDetail(){
        super.displayDetail();
        System.out.println("name: " + name);
        System.out.println("pages: " + pages);
        System.out.println("publisher: " + publisher);
    }
}
