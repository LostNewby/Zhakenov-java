package com.springdemo.javasp.repository;

import com.springdemo.javasp.dto.Address;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AddressRepositoryImplementation implements AddressRepository{

    public List<Address> getList(){
        return Address.getAddresses();
    }
    public List<Address> findByCountry(String c){
        List<Address> res=new ArrayList<>();
        List<Address> temp=this.getList();
        for(Address i:temp){
            if(i.getCountry()==c){
                res.add(i);
            }
        }
        return res;
    }

    public List<Address> findByCity(String c){
        List<Address> res=new ArrayList<>();
        List<Address> temp=this.getList();
        for(Address i:temp){
            if(i.getCity()==c){
                res.add(i);
            }
        }
        return res;
    }
    public Address findByStreet(String c){
        List<Address> temp=this.getList();
        for(Address i:temp){
            if(i.getStreet()==c){
                return i;
            }
        }
        return null;
    }
}
