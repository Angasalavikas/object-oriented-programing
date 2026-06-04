package com.java.oop;

public class Order {
    static int id;
    static String productName;
    static String address;
    static long phoneNO;
    static String shippingDate;

    public Order(int id, String productName, String address, long phoneNO, String shippingDate) {
        Order.id = id;
        Order.productName = productName;
        Order.address = address;
        Order.phoneNO = phoneNO;
        Order.shippingDate = shippingDate;
        System.out.println("order is called");
    }
    void displayOrderDetails(){
        System.out.println("id:" + Order.id);
        System.out.println("productName:" + Order.productName);
        System.out.println("address:" + Order.address);
        System.out.println("phoneNo:" + Order.phoneNO);
        System.out.println("shippingDate:" + Order.shippingDate);
    }
}
