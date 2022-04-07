package com.springdemo.javasp.service;


import com.springdemo.javasp.dto.Product;
import com.springdemo.javasp.repository.AddressRepository;
import com.springdemo.javasp.repository.ConsumerRepository;
import com.springdemo.javasp.repository.ProductRepository;
import com.springdemo.javasp.repository.ProductRepositoryImplementation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ConsumerRepository consumerRepository;
    @Autowired
    private ProductRepositoryImplementation productRepository;

    public int prodNum(int money, Product p){
        return money/(p.getPrice());
    }

    public List<Product> prodType(int money){
        List<Product> res=new ArrayList<>();
        List<Product> temp=productRepository.getList();
        for(Product i:temp){
            if(i.getPrice()<money)res.add(i);
        }
        return res;
    }
    public List<Product> getProducts(){
        return productRepository.getList();
    }




}
