package com.java.oop.collection;

import com.java.oop.model.Customer;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CustomerSet {
    static void main() {
        Set<Customer> customers = new LinkedHashSet<>();
        Customer customer1= new Customer();
        customer1.setId(102)
                .setName("customer1")
                .setEmail("customer@2334")
                .setPhoneNO(432525)
                .setAddress("bangalore");
        Customer customer2 = new Customer();
        customer2.setId(103)
                .setName("customer3")
                .setEmail("customer@13245")
                .setPhoneNO(25576)
                .setAddress("hyderabad");
        Customer customer3= new Customer();
        customer3.setId(104)
                .setName("customer3")
                .setEmail("customer@243800334")
                .setPhoneNO(43252565)
                .setAddress("madhapur");
        Customer customer4 = new Customer();
        customer4.setId(105)
                .setName("customer4")
                .setEmail("customer@13887245")
                .setPhoneNO(25576578)
                .setAddress("church street");
        Customer customer5 =  new Customer();
        customer5.setId(105)
                .setName("customer4")
                .setEmail("customer@13887245")
                .setPhoneNO(25576578)
                .setAddress("church street");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        System.out.println(customers);

    }
}
