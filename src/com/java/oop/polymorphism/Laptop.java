package com.java.oop.polymorphism;

public class Laptop extends Product {
    int hardDisk;
    int ram;
    String operatingSystem;

    public Laptop() {
    }

    public Laptop(int id, String name, int maxRetailPrice, float discountPrice, float rating, boolean isAvailable, int hardDisk, int ram, String operatingSystem) {
        super(id, name, maxRetailPrice, discountPrice, rating, isAvailable);
        this.hardDisk = hardDisk;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }
    @Override
    void displayDetail(){
        super.displayDetail();
        System.out.println("hardDisk: " + hardDisk);
        System.out.println("ram: " + ram);
        System.out.println("operating:" + operatingSystem);
    }
}
