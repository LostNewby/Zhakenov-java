package com.spring.javasp2.repositories;

import com.spring.javasp2.dto.Address;
import com.spring.javasp2.dto.Costumer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CostumerRepository {

    public List<Costumer> findall();

    public Costumer insertOrUpdate(Costumer costumer);

    public int delete(Costumer costumer);

}
