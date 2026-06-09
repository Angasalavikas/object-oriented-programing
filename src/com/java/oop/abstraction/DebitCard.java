package com.java.oop.abstraction;

public class DebitCard extends Payment{
    @Override
    public boolean pay(double amount){
        System.out.println("order process done using debit card");
        return true;
    }


}
