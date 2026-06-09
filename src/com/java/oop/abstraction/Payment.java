package com.java.oop.abstraction;

public class Payment {
    public boolean pay(double amount){
        System.out.println("payment done using cash: " + amount);
        return true;
    }

}
