package com.spring.javasp2.service;

import com.spring.javasp2.dto.Address;
import com.spring.javasp2.dto.Costumer;
import com.spring.javasp2.dto.Product;
import com.spring.javasp2.repositories.AddressRepository;
import com.spring.javasp2.repositories.CostumerRepository;
import com.spring.javasp2.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    CostumerRepository costumerRepository;

    public Address insertOrUpdate(Address address){
        return addressRepository.insertOrUpdate(address);
    };

    public List<Address> findAllAddresses(){
        return addressRepository.findall();
    };

    public int deleteAddress(Address address){
        return addressRepository.delete(address);
    };

    public List<Address>  findAddressByCountry(String country){
        return addressRepository.findAddressByCountry(country);
    };

    public List<Address>  findAddressByCity(String city){
        return addressRepository.findAddressByCity(city);
    };

    public Address findAddressByStreet(String street){
        return addressRepository.findAddressByStreet(street);
    };

    public Product insertOrUpdate(Product product){
        return productRepository.insertOrUpdate(product);
    };

    public List<Product> findAllProducts(){
        return productRepository.findall();
    };

    public int deleteProduct(Product product){
        return productRepository.delete(product);
    };

    public Product findByPid(long pid){
        return productRepository.findByPid(pid);
    };

    public List<Costumer> findAllCostumers(){
        return costumerRepository.findall();
    };

    public Costumer insertOrUpdate(Costumer costumer){
        return costumerRepository.insertOrUpdate(costumer);
    };

    public int deleteCostumer(Costumer costumer){
        return costumerRepository.delete(costumer);
    };

    public List<Product> affProdPrice(int money){
        List<Product> res=new ArrayList<>();
        List<Product> temp = productRepository.findall();
        for(Product i:temp){
            if(money>=i.getPrice())res.add(i);
        }
        return res;
    };

    public List<Product> affProdSize(char size){
        List<Product> res=new ArrayList<>();
        List<Product> temp = productRepository.findall();
        for(Product i:temp){
            if((int)size<=(int)i.getSize())res.add(i);
        }
        return res;
    };
}
