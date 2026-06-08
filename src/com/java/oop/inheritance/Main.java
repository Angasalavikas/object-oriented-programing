package com.java.oop.inheritance;

public class Main {
    static void main() {
        Products product = new Products();
       // System.out.println("id :" + product.id);
        product.displayDetails();
        Products product2 = new Products(2,"product2",32424,4.5f,3.2f, true);
        product2.displayDetails();
        Laptop laptop = new Laptop();
        System.out.println(laptop.hardDisk);
        System.out.println(laptop.ram);
        System.out.println(laptop.operatingSystem);
        Laptop laptop1 = new Laptop(23,"Mac Book",379373,38f,4.5f,true,130,4,"os");
        laptop1.displayDetails();
        Book book = new Book(14,"vikas",1000,20f,3.4f,false,"kittu",399,"balu");
         book.displayDetails();
         WindowsLaptop wIndowsLaptop = new WindowsLaptop();
         Service service = new Service();
         service.validate(wIndowsLaptop);
         Service service1 = new Service();
         service.validate(laptop);
         wIndowsLaptop.displayDetails("microsoft");
         wIndowsLaptop.displayDetails("microsoft",2026);
         service.displayDetails(laptop1);
    }
}
