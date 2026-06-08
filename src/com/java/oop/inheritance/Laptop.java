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
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("hardDisk :" + hardDisk);
        System.out.println("ram :" + ram);
        System.out.println("operatingSystem :" + operatingSystem);
    }
    void displayDetails(String company,int year, boolean isAvailable){
        System.out.println("company: " + company);
        System.out.println("year: " + year);
        System.out.println("isAvailable: " + isAvailable);
    }
}
