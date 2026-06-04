package com.java.oop;
public class Main{
    static void main() {
        Customer Customer;
        Customer = new Customer(1234, "vikas", "vikas@gmail,com", 47848488, "thallium");
        Customer.displayCustomerDetails();
//       System.out.println("id : " + Customer.id);
//       System.out.println("name : " + Customer.name);
//       System.out.println("MRP : " + Customer.email);
//       System.out.println("discountPercentage : " + Customer.phoneNo);
//       System.out.println("rating : " + Customer.address);
        Customer Customer2 = new Customer(238, "balU", "balu2GMAIL", 4949498, "KKV PARAM");
//        System.out.println("id : " + Customer2.id);
//        System.out.println("name : " + Customer2.name);
//        System.out.println("email : " + Customer2.email);
//        System.out.println("phoneNo : " + Customer2.phoneNo);
//        System.out.println("address: " + Customer2.address);
        Customer2.displayCustomerDetails();
        Customer Customer3 = new Customer(1234,"kittu","kittu@mail",399749434,"eng palli");
        Customer3.displayCustomerDetails();
        Customer.displayCustomerByCompany();
        int customerCount = Customer.getCustomerCount();
            System.out.println("customer count: " + customerCount);
//    }
    }
}