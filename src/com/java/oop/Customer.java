package com.java.oop;

public class Customer {
    static int id;
    static String name;
    static String email;
    static int phoneNo;
    static String address;

    public Customer(int id, String name, String email, int phoneNo, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.address = address;
        System.out.println("Customer() is called");
    }
    void displayCustomerDetails(){

        System.out.println("id : " + Customer.id);
        System.out.println("name : " + Customer.name);
        System.out.println("email : " + Customer.email);
        System.out.println("phoneNo : " + Customer.phoneNo);
        System.out.println("address : " + Customer.address);
    }
}