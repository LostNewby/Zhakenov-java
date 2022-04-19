package com.spring.javasp3;

import com.spring.javasp3.dto.Address;
import com.spring.javasp3.kafka.ProducerMessage;
import com.spring.javasp3.repository.AddressRepository;
import com.spring.javasp3.repository.CostumerRepository;
import com.spring.javasp3.repository.ProductRepository;
import com.spring.javasp3.service.Service;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class JavaSp3ApplicationTests {

    @Mock
    private AddressRepository addressRepository;

    @Mock
    private CostumerRepository costumerRepository;

    @Mock
    private ProductRepository productRepository;

    @Mock
    private ProducerMessage producerMessage;

    @InjectMocks
    private Service service;


    @Test
    void test1() {
        Address address1 = new Address("Africa", "Tanza", "Getto 13");

        Mockito.when(addressRepository.save(address1)).thenReturn(address1);
        Address act=service.save(address1);
        Assert.assertEquals(act,address1);
    }

    @Test
    void test2() {
        Address address1 = new Address("Africa", "Tanza", "Getto 13");
        List<Address> temp=new ArrayList<>();
        temp.add(address1);
        Mockito.when(addressRepository.findAll()).thenReturn(temp);
        List<Address> act=service.findAllAddresses();
        Assert.assertEquals(act,temp);
    }

}
