package com.java.oop.inheritance;

public class Book extends Products{
    String author;
    int pages;
    String publisher;

    public Book(int id, String name, double maxRetailPrice, float discountPercentage, float rating, boolean isAvailable, String author, int pages, String publisher) {
        super(id, name, maxRetailPrice, discountPercentage, rating, isAvailable);
        this.author = author;
        this.pages = pages;
        this.publisher = publisher;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("author:" + author);
        System.out.println("pages :" + pages);
        System.out.println("publisher :" + publisher);
    }
}
