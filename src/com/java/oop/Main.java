package com.java.oop;

import com.java.oop.abstraction.OrderService;

public class Main {
    static void main(String[] args) {
        OrderService orderService = new OrderService();
        if(orderService.processOrder(1000)){
            System.out.println("order done successfully using cash ");
        }
        if(orderService.processOrderCreditCard(4839)){
            System.out.println("order done successfully using credit card:" );
        }
    }
}