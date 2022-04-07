package com.springdemo.javasp.repository;

import com.springdemo.javasp.dto.Address;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository {
    public List<Address> getList();

    public List<Address> findByCountry(String c);

    public List<Address> findByCity(String c);

    public Address findByStreet(String c);
}
