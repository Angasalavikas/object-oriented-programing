package com.java.oop.arrays;

public class Customer {
     static int id;
        static String name;
        static int phoneNo;
        static String email;
        static String address;
        static char gender;

    public Customer(int id, String name, int phoneNo, String email, String address,char gender) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.address = address;
        this.gender = gender;
}
    static void displayCustomerDetails(){
        System.out.println("................customer details.........................");
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("phoneNo: " + phoneNo);
        System.out.println("email: " + email);
        System.out.println("address: " + address);
        System.out.println("gender: " + gender);
    }
}
