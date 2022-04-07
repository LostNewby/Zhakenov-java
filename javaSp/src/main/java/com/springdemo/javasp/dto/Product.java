package com.springdemo.javasp.dto;

import java.util.Arrays;
import java.util.List;

public class Product {

    private long pid;
    private String name;
    private int price;
    private char size;


    public Product() {

    }
    public Product(long pid, String name, int price, char size) {
        this.pid=pid;
        this.name=name;
        this.price=price;
        this.size=size;
    }

    public void setPid(long pid) {
        this.pid=pid;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setPrice(int price) {
        this.price=price;
    }
    public void setSize(char size) {
        this.size=size;
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

    public static List<Product> getProducts(){

        Product p1=new Product(100, "apple", 30, 'm');
        Product p2=new Product(103, "banana", 35, 'm');
        Product p3=new Product(115, "tomato", 40, 's');
        Product p4=new Product(117, "rice", 10, 'b');
        Product p5=new Product(104, "cheese", 90, 'm');

        return Arrays.asList(p1,p2,p3,p4,p5);
    }

    @Override
    public String toString() {
        return "Product{"+"Name:"+name+"/ Price:"+price+"/ Size:"+size+"}";
    }
}
