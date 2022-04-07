package com.springdemo.javasp.repository;

import com.springdemo.javasp.dto.Address;
import com.springdemo.javasp.dto.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImplementation implements ProductRepository{
    public List<Product> getList(){
        return Product.getProducts();
    }

    public List<Product> findByPrice(int p){
        List<Product> res=new ArrayList<>();
        List<Product> temp=this.getList();
        for(Product i:temp){
            if(i.getPrice()==p){
                res.add(i);
            }
        }
        return res;
    }
}
