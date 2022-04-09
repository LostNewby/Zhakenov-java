package com.spring.javasp2.repositories;

import com.spring.javasp2.dto.Address;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository {
    public List<Address>  findAddressByCountry(String country);

    public List<Address> findAddressByCity(String city);

    public Address findAddressByStreet(String street);

    public Address insertOrUpdate(Address address);

    public List<Address> findall();

    public int delete(Address address);
}
