package com.springdemo.javasp.dto;

import java.util.Arrays;
import java.util.List;

public class Consumer {
    private long id;
    private String firstName;
    private String secondName;
    private List<Product> productList;
    private Address address;

    public Consumer(){

    }
    public Consumer(long id,String firstName,String secondName, List<Product> productList, Address address){
        this.id=id;
        this.firstName=firstName;
        this.secondName=secondName;
        this.productList=productList;
        this.address=address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static List<Consumer> getConsumers(){

        Consumer c1=new Consumer(2,"Allen", "Franko", Arrays.asList(new Product()), Address.getAddresses().get(1));
        Consumer c2=new Consumer(6,"Barry", "Track", Arrays.asList(new Product()), Address.getAddresses().get(0));
        Consumer c3=new Consumer(9,"Hellen", "Smith", Arrays.asList(new Product()), Address.getAddresses().get(1));
        Consumer c4=new Consumer(21,"Terry", "Fair", Arrays.asList(new Product()), Address.getAddresses().get(0));
        Consumer c5=new Consumer(37,"Honko", "Oonko", Arrays.asList(new Product()), Address.getAddresses().get(2));

        return Arrays.asList(c1,c2,c3,c4,c5);
    }

    @Override
    public String toString() {
        return "Consumer{"+"Name:"+firstName+"/ Surname:"+secondName+"/ Products:" +productList+"/ Address:"+address+"}";
    }
}
