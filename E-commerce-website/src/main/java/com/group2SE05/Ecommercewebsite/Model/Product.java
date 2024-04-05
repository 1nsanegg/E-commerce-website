package com.group2SE05.Ecommercewebsite.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String desc;
    private double price;
    private int quantityAvailable;
    private String category;
    private String brand;

    public Product(int id, String name, String desc, double price, int quantityAvailable, String category, String brand) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
        this.category = category;
        this.brand = brand;
    }

    public Product(String name, String desc, double price, int quantityAvailable, String category, String brand) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
        this.category = category;
        this.brand = brand;
    }

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", quantityAvailable=" + quantityAvailable +
                ", category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
