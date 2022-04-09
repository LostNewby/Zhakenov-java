package com.spring.javasp2.repositories;

import com.spring.javasp2.dto.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {

    public Product insertOrUpdate(Product product);

    public List<Product> findall();

    public int delete(Product product);

    public Product findByPid(long pid);

}
