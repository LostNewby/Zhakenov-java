package com.springdemo.javasp.repository;

import com.springdemo.javasp.dto.Consumer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsumerRepository {
    public List<Consumer> getList();

    public Consumer findById(long id);

    public List<Consumer> findByFullName(String f, String s);

    public List<Consumer> findByFirstName(String f);
}
