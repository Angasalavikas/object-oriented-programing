package com.java.oop;
public class Main{
    static void main() {
        Customer Customer;
        Customer = new Customer(1234,"vikas","vikas@gmail,com",47848488,"thallium");
       System.out.println("id : " + Customer.id);
       System.out.println("name : " + Customer.name);
       System.out.println("MRP : " + Customer.email);
       System.out.println("discountPercentage : " + Customer.phoneNo);
       System.out.println("rating : " + Customer.address);
        Customer Customer2= new Customer(238,"balU","balu2GMAIL",4949498,"KKV PARAM");
        System.out.println("id : " + Customer2.id);
        System.out.println("name : " + Customer2.name);
        System.out.println("MRP : " + Customer2.email);
        System.out.println("discountPercentage : " + Customer2.phoneNo);
        System.out.println("rating : " + Customer2.address);
    }
}