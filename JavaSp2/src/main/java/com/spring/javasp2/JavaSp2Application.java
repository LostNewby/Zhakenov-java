package com.spring.javasp2;

import com.spring.javasp2.dto.Address;
import com.spring.javasp2.dto.Costumer;
import com.spring.javasp2.dto.Product;
import com.spring.javasp2.repositories.AddressRepository;
import com.spring.javasp2.repositories.CostumerRepository;
import com.spring.javasp2.repositories.ProductRepository;
import com.spring.javasp2.service.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class JavaSp2Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext=
                SpringApplication.run(JavaSp2Application.class);
        Service service=configurableApplicationContext.getBean(Service.class);

        Address add=new Address("Afgo", "Nono","ter");
        add=service.insertOrUpdate(add);

        service.deleteAddress(add);

    }

}
