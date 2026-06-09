package com.java.oop.abstraction;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
//        OrderService orderService = new OrderService();
//        if(orderService.processOrder(1000)){
//            System.out.println("order done successfully using cash");
//        }
//        if(orderService.processOrderCreditCard(4839)){
//            System.out.println("order done successfully using credit card:" );
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("choose the option: ");
        System.out.println("1. cash on Delivery");
        System.out.println("2. credit");
        System.out.println("3. debit");
        System.out.println("4. upi");
        System.out.println("Enter the option");
        int choose = sc.nextInt();
        OrderService orderService;
        double amount;
        Payment payment;
        int otp;
        switch (choose){
            case 1 :
                payment = new CashOnDeliveryPayment();
                orderService = new OrderService(payment);
                System.out.println("Enter value: ");
                amount = sc.nextDouble();
                System.out.println("Enter otp:");
                otp = sc.nextInt();
                payment.otpValidate(otp);
               if(orderService.processOrder(amount)){
                   System.out.println("order processing using cash on delivery");
                   break;
               }
            case 2 :
                payment = new CreditCardPayment();
                orderService = new OrderService(payment);
                System.out.println("Enter value: ");
                amount = sc.nextDouble();
                System.out.println("Enter otp:");
                otp = sc.nextInt();
                payment.otpValidate(otp);
                if(orderService.processOrder(amount)){
                    System.out.println("order processing using Credit card");
                    break;
                }
            case 3 :
                payment = new DebitCard();
                orderService = new OrderService(payment);
                System.out.println("enter value:");
                amount = sc.nextDouble();
                System.out.println("Enter otp:");
                otp = sc.nextInt();
                payment.otpValidate(otp);
                System.out.println("order processing using DebitCard");
                break;
            case 4 :
                payment = new CashOnDeliveryPayment();
                orderService = new OrderService(payment);
                System.out.println("Enter the value: ");
                amount = sc.nextDouble();System.out.println("Enter otp:");
                otp = sc.nextInt();
                payment.otpValidate(otp);
                System.out.println("order process using upi");
                break;
            default:
                System.out.println("invalid");
        }
    }
}