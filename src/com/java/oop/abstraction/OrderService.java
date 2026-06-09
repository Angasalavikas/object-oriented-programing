package com.java.oop.abstraction;

public class OrderService {
    public boolean processOrder(double amount){
        Payment payment = new Payment();
        payment.pay(amount);
        return true;
    }
    public boolean processOrderCreditCard(double amount){
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.pay(amount);
        return true;
    }
}
