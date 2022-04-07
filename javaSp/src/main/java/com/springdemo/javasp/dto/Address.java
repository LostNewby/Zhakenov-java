package com.springdemo.javasp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.List;

public class Address {
    private String country;
    private String city;
    private String street;

    public Address(){

    }

    public Address(String country, String city, String street){
        this.country=country;
        this.city=city;
        this.street=street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public static List<Address> getAddresses(){
        Address add1=new Address("USA", "California", "Walker");
        Address add2=new Address("Turkey", "Ankara", "Kardesler");
        Address add3=new Address("Russia", "Orenburg", "Uskov");

        return Arrays.asList(add1,add2,add3);
    }

    @Override
    public String toString() {
        return "Address{"+"Country:"+country+"/ City:"+city+"/ Street:"+street+"}";
    }
}
