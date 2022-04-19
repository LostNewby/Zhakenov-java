package com.spring.javasp3.service;

import com.spring.javasp3.dto.Address;
import com.spring.javasp3.dto.Costumer;
import com.spring.javasp3.dto.Product;
import com.spring.javasp3.kafka.ProducerMessage;
import com.spring.javasp3.repository.AddressRepository;
import com.spring.javasp3.repository.CostumerRepository;
import com.spring.javasp3.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    AddressRepository addressRepository;
    ProductRepository productRepository;
    CostumerRepository costumerRepository;
    ProducerMessage producerMessage;

    @Autowired
    public Service(AddressRepository addressRepository, ProductRepository productRepository, CostumerRepository costumerRepository, ProducerMessage producerMessage) {
        this.addressRepository = addressRepository;
        this.productRepository = productRepository;
        this.costumerRepository = costumerRepository;
        this.producerMessage = producerMessage;
    }

    public List<Address> findAllAddresses(){
        this.sendMsg("All addresses");
        return addressRepository.findAll();
    }

    public List<Product> findAllProduct() {return productRepository.findAll(); }

    public Address findAddressByStreet(String str){
        return addressRepository.findAddressByStreet(str);
    }

    public Address save(Address address){
        this.sendMsg("Address addition");
        return addressRepository.save(address);
    }

    public Costumer save(Costumer costumer){
        this.sendMsg("Costumer addition");
        return costumerRepository.save(costumer);
    }


    public void deleteAddress(Address address){
        this.sendMsg("Address deletion");
        addressRepository.delete(address);
    }

    public void sendMsg(String msg){
        producerMessage.sendMessage(msg);
    }
}
