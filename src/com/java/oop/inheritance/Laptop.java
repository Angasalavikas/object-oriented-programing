package com.java.oop.inheritance;

public class Laptop extends Products{
    int hardDisk;
    int ram;
    String operatingSystem;

    public Laptop() {
        System.out.println("laptop constructor called ");
    }
    public Laptop(int id, String name, double maxRetailPrice, float discountPercentage, float rating, boolean isAvailable, int harDisk, int ram, String operatingSystem) {
        super(id, name, maxRetailPrice, discountPercentage, rating, isAvailable);
        this.hardDisk = harDisk;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }
    void displayLaptopDetails(){
        displayProductsDetails();
        System.out.println("hardDisk :" + hardDisk);
        System.out.println("ram :" + ram);
        System.out.println("operatingSystem :" + operatingSystem);
    }
}
