package com.spring.javasp2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private long pid;
    private String name;
    private int price;
    private char size;

    public Product() {

    }

    public Product(String name, int price, char size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public long getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public char getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSize(char size) {
        this.size = size;
    }
}
