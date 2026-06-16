package com.java.oop.anonymous;

public class Main {
    static void main() {
//        GreetingImpl greeting = new GreetingImpl() ;
//        greeting.greet();
//        greeting.greet("hello how are today");
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("hello how are you!" );
            }

            @Override
            public void greet(String msg) {
                System.out.println(msg);
            }
        };
        greeting.greet();
        greeting.greet( "how are you today");
    }
}
