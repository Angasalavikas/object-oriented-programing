package com.java.oop.arrays;

import com.java.oop.arrays.Customer;

public class CustomerArray {
    public static void main(String[] args) {
        Customer[] customers = new Customer[5];
        customers[0] = new Customer(101, "vikas", 327939, "vikas@23", "thanapalli", 'M');
        customers[1] = new Customer(102, "balu", 32793339, "vikas@233", "thallium", 'M');
        customers[2] = new Customer(103, "vamsi", 32787939, "vikas@2333", "palli", 'M');
        customers[3] = new Customer(104, "arun", 32764939, "vikas@23333", "diguvapalli", 'F');
        customers[4] = new Customer(105, "kiran", 327912339, "vikas@233333", "theunapalli", 'F');

        for(Customer customer : customers){
            Customer.displayCustomerDetails();
        }
    }

}







