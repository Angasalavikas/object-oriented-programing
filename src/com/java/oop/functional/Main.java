package com.java.oop.functional;

public class Main {
    static void main() {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("hi how are you");
            }
        };
    }
}
