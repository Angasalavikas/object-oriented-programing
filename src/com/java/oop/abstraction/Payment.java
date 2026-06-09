package com.java.oop.abstraction;

public abstract class Payment {
    public abstract boolean pay(double amount);
//    {
//        System.out.println("payment done using cash: " + amount);
//        return true;
//    }
    public  void otpValidate(int otp){
        System.out.println("otp validation done:" + otp);
    }

}
