package com.java.oop;

public class Customer {
    int id;
    String name;
    String email;
    int phoneNo;
    String address;

    public Customer(int id, String name, String email, int phoneNo, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.address = address;
        System.out.println("Customer() is called");
    }
}