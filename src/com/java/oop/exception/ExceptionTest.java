package com.java.oop.exception;

import java.util.Scanner;

public class ExceptionTest {
    static void main() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number: ");
            int num = sc.nextInt();
            System.out.println("Enter the number: ");
            int num1 = sc.nextInt();
            int results = num / num1;
            System.out.println("results: " + results);
        }catch (ArithmeticException e){
            System.out.println("number1 cant be zero");
            input();

        }
    }

    private static void input() {

        System.out.println("input continue");
    }
}
