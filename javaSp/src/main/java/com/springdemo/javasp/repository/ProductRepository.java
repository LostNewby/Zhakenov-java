package com.springdemo.javasp.repository;

import com.springdemo.javasp.dto.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {
    public List<Product> getList();

    public List<Product> findByPrice(int p);
}
