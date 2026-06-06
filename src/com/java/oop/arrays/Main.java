package com.java.oop.arrays;

import com.java.oop.Order;

public class Main {
    public static void main(String[] args) {
        int[] price = new int[5];
        price[0] =294833;
        price[1] =298493;
        price[2] =279843;
        price[3] =29743;
        price[4] =589037;
        for(int prices :price){
            System.out.println(prices);
        }
        for(int i = 0;i <price.length;i++ ){
            price[i] += 1200;
        }
        for( int prices : price){
            System.out.println(prices);
        }
    }
}