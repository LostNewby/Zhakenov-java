package com.spring.javasp2.dto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Costumer {
    @Id
    @GeneratedValue()
    private long id;
    private String firstName;
    private String secondName;
    private int moneyHave;
    @OneToMany
    private List<Product> productList=new ArrayList<>();
    @OneToOne
    private Address address;

    public Costumer() {

    }

    public Costumer(String firstName, String secondName, int moneyHave, Address address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.moneyHave = moneyHave;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getMoneyHave() {
        return moneyHave;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Address getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setMoneyHave(int moneyHave) {
        this.moneyHave = moneyHave;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
