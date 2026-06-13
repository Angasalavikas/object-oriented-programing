package com.java.oop.collection;

import com.java.oop.model.Customer;

public class Main {
    static void main() {
        Customer customer = new Customer();
        customer.setId(101)
                .setName("customer1")
                .setEmail("customer@13223")
                .setPhoneNO(574766)
                .setAddress("thanapalli");

        System.out.println("id: " + customer.getId());
        System.out.println("name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("phoneNo: " + customer.getPhoneNO());
        System.out.println("address: " + customer.getAddress());
        System.out.println(customer);
    }
}
