package com.java.oop.streams;

public class Product {
    int id;
    String name;
    int maxRetailedPrice;
    byte discountPercentage;
    boolean isAvailable;
    String company;
    String category;
    int manufacturedYear;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRetailedPrice() {
        return maxRetailedPrice;
    }

    public void setMaxRetailedPrice(int maxRetailedPrice) {
        this.maxRetailedPrice = maxRetailedPrice;
    }

    public byte getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(byte discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maxRetailedPrice=" + maxRetailedPrice +
                ", discountPercentage=" + discountPercentage +
                ", isAvailable=" + isAvailable +
                ", company='" + company + '\'' +
                ", category='" + category + '\'' +
                ", manufacturedYear=" + manufacturedYear +
                '}';
    }
}
