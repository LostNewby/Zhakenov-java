package com.spring.javasp3.repository;

import com.spring.javasp3.dto.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {
    public Address findAddressByStreet(String street);
}
